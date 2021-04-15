/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author isamuels2900
 */
public class Casillero {
    
    private static int contador = 0;
    private int numero;
    private int cedulaCliente = -1;
    private ArrayList<Entregable> listaEntregables = new ArrayList();
    
    public Casillero(){
        contador++;
        numero = contador;
    }

    public int getNumero() {
        return numero;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public ArrayList<Entregable> getListaEntregables() {
        return listaEntregables;
    }
    
    public void agregarEntregable(Entregable entregable){
        for (int i = 0; i < listaEntregables.size(); i++) {
            Entregable eActual = listaEntregables.get(i);
            if (eActual.equals(entregable)){
                System.out.println("El entregable ingresado ya existe");;
            }            
        }
        listaEntregables.add(entregable);
        System.out.println("Entregable registrado correctamente");;
    }

    @Override
    public String toString() {
        return "Casillero{" + "numero=" + numero + ", cedulaCliente=" + 
                cedulaCliente + ", listaEntregables=" + listaEntregables + '}';
    }
    
    
    
}
