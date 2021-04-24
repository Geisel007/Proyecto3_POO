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
    
    public Paquete(String pDescripcion, int pDestinatario, String tipo, boolean contenidoElectronico, 
            boolean fragil, int peso ) {
        super(pDescripcion, pDestinatario);
        this.tipo = tipo;
        this.contenidoElectronico = contenidoElectronico;
        this.fragil = fragil;
        this.peso = peso;
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

    @Override
    public String toString() {
        if(contenidoElectronico && fragil){
            return "Paquete " +  " Código: " + super.codigo + ", Tipo: " + tipo + ", Descripción: " + super.descripcion  +
                ", Destinatario: " + super.destinatario +", Contenido Electronico: Sí" + ", Frágil: Sí" + 
                ", Peso: " + peso + '.' +"\n";
        } if(contenidoElectronico && (fragil == false)){
            return "Paquete " +  " Código: " + super.codigo + ", Tipo: " + tipo + ", Descripción: " + super.descripcion  +
                ", Destinatario: " + super.destinatario +", Contenido Electronico: Sí" + ", Frágil: No" + 
                ", Peso: " + peso + '.' +"\n";
        } if( fragil && (contenidoElectronico == false)){
            return "Paquete " +  " Código: " + super.codigo + ", Tipo: " + tipo + ", Descripción: " + super.descripcion  +
                ", Destinatario: " + super.destinatario +", Contenido Electronico: No" + ", Frágil: Sí" + 
                ", Peso: " + peso + '.' +"\n";
        } 
        return "Paquete " +  " Código: " + super.codigo + ", Tipo: " + tipo + ", Descripción: " + super.descripcion  +
                ", Destinatario: " + super.destinatario +", Contenido Electronico: No" + ", Frágil: No" + 
                ", Peso: " + peso + '.' +"\n";  
    }

    
}
