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
public class Entregable {
    
    private int codigo;
    private boolean estado;
    private String descripcion;
    private Cliente remitente;
    
    public Entregable(){
        
    }
    
    public Entregable(int pCodigo, boolean pEstado, String pDescripcion, 
            Cliente pRemitente){
        pCodigo = codigo;
        pEstado = estado;
        pDescripcion = descripcion;
        pRemitente = remitente;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRemitente(Cliente remitente) {
        this.remitente = remitente;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getRemitente() {
        return remitente;
    }
    
    
    
}
