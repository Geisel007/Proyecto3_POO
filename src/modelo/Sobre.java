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
public class Sobre extends Entregable {
    
    private String tipo;
    private String contenido;
    private int peso;
    
    public Sobre(){}
    
    public Sobre(String descripcion, Cliente remitente, String pTipo, 
            String pContenido, int pPeso){
        
        super(descripcion, remitente);
        pTipo = tipo;
        pContenido = contenido;
        pPeso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
