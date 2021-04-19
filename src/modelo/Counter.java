/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author IanSamuels
 */
public class Counter {
    private String nombre;
    private int cedulaJuridica;
    private String dirreccion;
    private int cantidadDeCasilleros;
    private static ArrayList<Casillero> listaCasilleros = new ArrayList();
    private static ArrayList<Cliente> listaClientes = new ArrayList();
    
    public Counter(){
    }
    
    public Counter(String pNombre, int pCedulaJuridica, String pDirreccion, int pCantidadDeCasilleros){
        nombre = pNombre;
        cedulaJuridica = pCedulaJuridica;
        dirreccion = pDirreccion;
        cantidadDeCasilleros = pCantidadDeCasilleros;
    }
    
    public boolean existe(int cedula, ArrayList<Counter> listaCounters){
        for (int i = 0; i < listaCounters.size(); i++) {
            Counter counter = listaCounters.get(i);
            if (counter.getCedulaJuridica() == cedula){
                return true;
            }
        }  
        return false; 
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public int getCantidadDeCasilleros() {
        return cantidadDeCasilleros;
    }

    public void setCantidadDeCasilleros(int cantidadDeCasilleros) {
        this.cantidadDeCasilleros = cantidadDeCasilleros;
    }

    public static ArrayList<Casillero> getListaCasilleros() {
        return listaCasilleros;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public void agregarCliente(Cliente cliente){
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cActual = listaClientes.get(i);
            if (cActual.equals(cliente)){
                System.out.println("El cliente ingresado ya existe");
            }            
        }
        listaClientes.add(cliente);
        System.out.println("Cliente registrado correctamente");
    }
    
    public void registrarCliente(int identificacion, String nombre, 
            String correo, int telefono, String direccion, 
            String sexo, Date fechaDeNacimiento){
        
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
    
    public void retirarArticulo(int identificacion){
        
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
        return "Counter{" + "nombre=" + nombre + ", cedulaJuridica=" + cedulaJuridica + 
                ", dirreccion=" + dirreccion + ", cantidadDeCasilleros=" + 
                cantidadDeCasilleros + ", listaCasilleros=" + listaCasilleros + 
                ", listaClientes=" + listaClientes + '}';
    }

    
    
}
