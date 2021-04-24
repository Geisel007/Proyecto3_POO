
package modelo;

/**
 * @author David
 */
public class Sobre extends Entregable {
    
    private String tipo;
    private String contenido;
    private int peso;
    
    public Sobre(){}
    
    public Sobre(String pDescripcion, int pDestinatario, String tipo, String contenido, int peso ) {
        super(pDescripcion, pDestinatario);
        this.tipo = tipo;
        this.contenido = contenido;
        this.peso = peso;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public boolean isEstado() {
        return estado;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public int getDestinatario() {
        return destinatario;
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

    @Override
    public String toString() {
        return "Sobre " + " Código: " + super.codigo + ", Tipo: " + getTipo() + 
                ", Descripción: " + super.descripcion  + ", Destinatario: " + super.destinatario +
                ", Contenido: " + getContenido()  + ", Peso: " + getPeso() + '.'+"\n";
    }
    
}
