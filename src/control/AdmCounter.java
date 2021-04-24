/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Date;
import modelo.Cliente;
import modelo.Counter;
import modelo.Casillero;

/**
 *
 * @author isamuels2900
 */
public class AdmCounter {
    
    private ArrayList<Counter> listaCounters;
    
    public AdmCounter(){
        listaCounters = new ArrayList<>();
    }
    
    public Counter consultar(int cedula){
        for(int i = 0; i < listaCounters.size(); i++){
            Counter counter = listaCounters.get(i);
            if (counter.getCedulaJuridica() == cedula){
                return counter;
            }
        }
        System.out.println("La cedula juridica ingresada no existe");
        return null;
    }
    
    public boolean agregar(String pNombre, int pCedulaJuridica, String pDireccion, 
            int pCantidadDeCasilleros, int pTotalRetiros){
        
        Counter counter = new Counter(pNombre, pCedulaJuridica, pDireccion, 
                pCantidadDeCasilleros, pTotalRetiros);
        if (!counter.existe(counter.getCedulaJuridica(), listaCounters)){
            listaCounters.add(counter);
            System.out.println("Se agrego correctamente el counter");
            return true;
        } else {
            System.out.println("Ya existe ese counter");
            return false;
        }
    }
    
    public void eliminar(Counter counter){
        if (counter.existe(counter.getCedulaJuridica(), listaCounters)){
            listaCounters.remove(counter);
            System.out.println("Se elimino correctamente el counter");
        } else {
            System.out.println("No existe ese counter");
        }
    }
    
    public void modificar(Counter counter){
        for (int i = 0; i < listaCounters.size(); i++){
            Counter counterActual = listaCounters.get(i);
            if (counterActual.getCedulaJuridica() == counter.getCedulaJuridica()){
                listaCounters.set(i, counter);
                System.out.println("Se modifico correctamente el counter");
            }
        }
        System.out.println("No existe el counter ingresado");
    }
    
    public void registrarCliente(int cedulaJuridica, int identificacion, String nombre, 
            String correo, int telefono, String direccion, 
            String sexo, Date fechaDeNacimiento){
        
        Counter counter = consultar(cedulaJuridica);
        ArrayList listaClientes = counter.getListaClientes();
        ArrayList listaCasilleros = counter.getListaCasilleros();
        
        if (!clienteExiste(listaClientes, identificacion)){
           
            if (buscarCasilleroLibre(listaCasilleros)){
                
                Cliente cliente = new Cliente(identificacion, nombre, correo, 
                        telefono, direccion, sexo, fechaDeNacimiento);
                
                setCasilleroLibre(listaCasilleros, cliente);
                
            } else {
                System.out.println("No se encontró ningún casillero libre");
            }
        } else {
            System.out.println("La cedula identificacion ingresada ya existe");
        }
    }
    
    public boolean clienteExiste(ArrayList listaClientes, int identificacion){
        for (int i = 0; i < listaClientes.size(); i++){
            Cliente cActual = (Cliente) listaClientes.get(i);
            if (cActual.getIdentificacion() == identificacion){
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarCasilleroLibre(ArrayList listaCasilleros){
        for (int i = 0; i < listaCasilleros.size(); i++){
            Casillero cActual = (Casillero) listaCasilleros.get(i);
            if (cActual.getCedulaCliente() == -1){
                return true;
            }
        }
        return false;
    }
    
    public void setCasilleroLibre(ArrayList listaCasilleros, Cliente cliente){
        for (int i = 0; i < listaCasilleros.size(); i++){
            Casillero cActual = (Casillero) listaCasilleros.get(i);
            
            if (cActual.getCedulaCliente() == -1){
                
                cActual.setCedulaCliente(cliente.getIdentificacion());
                cliente.setNumeroCasillero(cActual.getNumero());
                System.out.println("Numero de casillero asignado: "
                        + cActual.getNumero());
            }
        }
        System.out.println("No hay casilleros disponibles");
    }
    
    public void retirarArticulo(int cedulaJuridica, int identificacion){
        Counter counter = consultar(cedulaJuridica);
        ArrayList listaClientes = counter.getListaClientes();
        ArrayList listaCasilleros = counter.getListaCasilleros();
        
        for (int i = 0; i < listaClientes.size(); i++){
            Cliente clienteActual = (Cliente) listaClientes.get(i);
            if (clienteActual.getIdentificacion() == identificacion){
                
                int numCasillero = clienteActual.getNumeroCasillero();
                for (int j = 0; j < listaCasilleros.size(); j++){
                    Casillero casilleroActual = (Casillero) listaCasilleros.get(i);
                    if (casilleroActual.getNumero() == numCasillero){
                        casilleroActual.mostrarEntregablesPendientes();
                    }
                }
            }
            
        }
    }
    
    @Override
    public String toString() {
        return "Counters Registrados:\n" + listaCounters ;
    }

    public ArrayList<Counter> getListaCounters() {
        return listaCounters;
    }    
}
