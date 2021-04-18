/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

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

    @Override
    public String toString() {
        return "Counter{" + "nombre=" + nombre + ", cedulaJuridica=" + cedulaJuridica + 
                ", dirreccion=" + dirreccion + ", cantidadDeCasilleros=" + 
                cantidadDeCasilleros + ", listaCasilleros=" + listaCasilleros + 
                ", listaClientes=" + listaClientes + '}';
    }

    
    
}
