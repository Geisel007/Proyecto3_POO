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
    private String tema;
    
    public Revista(){}
    
    public Revista(String descripcion, int remitente, String pNombre, 
            boolean pCatalogo, String pTema){
        
        super(descripcion, remitente);
        pNombre = nombre;
        pCatalogo = catalago;
        pTema = tema;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
 
    
    
}
