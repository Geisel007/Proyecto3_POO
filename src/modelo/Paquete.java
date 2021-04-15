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
public class Paquete extends Entregable {
    
    private String tipo;
    private boolean contenidoElectronico;
    private boolean fragil;
    private int peso;
    
    public Paquete(){}
    
    public Paquete(String descripcion, 
            Cliente remitente, String pTipo, boolean pContenidoElectronico, 
            boolean pFragil, int pPeso){
        
        super(descripcion, remitente);
        pTipo = tipo;
        pContenidoElectronico = contenidoElectronico;
        pFragil = fragil;
        pPeso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isContenidoElectronico() {
        return contenidoElectronico;
    }

    public void setContenidoElectronico(boolean contenidoElectronico) {
        this.contenidoElectronico = contenidoElectronico;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
