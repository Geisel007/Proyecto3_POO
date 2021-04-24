
package modelo;

import java.util.Date;

/**
 * @author IanSamuels
 */
public class Entregable {
    
    protected int codigo;
    protected static int contador = 1000;
    protected boolean estado = false;
    protected String descripcion;
    protected int destinatario;
    protected Date fechaEntregado;
    protected Date fechaRecibido;
    
    public Entregable(){
        
    }
    
    public Entregable(String descripcion,int destinatario) {
        this.descripcion = descripcion;
        this.destinatario = destinatario;
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

    public void setRemitente(int destinatario) {
        this.destinatario = destinatario;
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
        return destinatario;
    }   

    public Date getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(Date fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }
    
    

    @Override
    public String toString() {
        return "Entregable." + "Código: " + codigo + ", Estado: " + estado + ", Descripción: " + descripcion 
                + ", Destinatario: " + destinatario + '.';
    }
    
}
