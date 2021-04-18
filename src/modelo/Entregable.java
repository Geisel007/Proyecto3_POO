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
    static int contador = 1000;
    private boolean estado = false;
    private String descripcion;
    private int remitente;
    
    public Entregable(){
        
    }
    
    public Entregable(String pDescripcion, 
            int pRemitente){
        pDescripcion = descripcion;
        pRemitente = remitente;
        contador++;
        codigo = contador;
        
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

    public void setRemitente(int remitente) {
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

    public int getRemitente() {
        return remitente;
    }
    
    
    
}
