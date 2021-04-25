
package modelo;

/**
 * @author David
 */
public class Revista extends Entregable {
    
    private String nombre;
    private boolean catalogo;
    private String tema;
    
    public Revista(){}
    
    public Revista(String pDescripcion, int pDestinatario, String nombre, boolean catalogo, String tema ) {
        super(pDescripcion, pDestinatario);
        this.nombre = nombre;
        this.catalogo = catalogo;
        this.tema = tema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCatalogo() {
        return catalogo;
    }

    public void setCatalago(boolean catalago) {
        this.catalogo = catalago;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        if(catalogo){
            return "Revista " +  " Código: " + super.codigo + ", Nombre: " + ", Descripción: " + super.descripcion  
                + ", Destinatario: " + super.destinatario +nombre + ", Catálogo: Sí" + ", Tema: " 
                + tema + '.' +"\n";
        }
         return "Revista " +  " Código: " + super.codigo + ", Nombre: " + ", Descripción: " + super.descripcion  
                + ", Destinatario: " + super.destinatario +nombre + ", Catálogo: No"  + ", Tema: " 
                + tema + '.' +"\n";
    }
    
}
