/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author David
 */
public class Revista extends Entregable {
    
    private String nombre;
    private boolean catalago;
    //private tema temal;
    
    public Revista(){}
    
    public Revista(int codigo, boolean estado, String descripcion, 
            Cliente remitente, String pNombre, boolean pCatalogo){
        
        super(codigo, estado, descripcion, remitente);
        pNombre = nombre;
        pCatalogo = catalago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCatalago() {
        return catalago;
    }

    public void setCatalago(boolean catalago) {
        this.catalago = catalago;
    }

    /*public tema getTemal() {
        return temal;
    }

    public void setTemal(tema temal) {
        this.temal = temal;
    }*/
    
    
}
