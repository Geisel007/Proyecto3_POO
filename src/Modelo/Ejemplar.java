
package Modelo;

/**
 * @author Geisel
 */
public abstract class Ejemplar {
    
    protected String nombre;
    protected String tratamiento;
    protected String tiempoDescomposicion;
    protected String imagen;

    public Ejemplar() { }

    public Ejemplar(String nombre, String tratamiento, String tiempoDescomposicion, String imagen) {
        this.nombre = nombre;
        this.tratamiento = tratamiento;
        this.tiempoDescomposicion = tiempoDescomposicion;
        this.imagen = imagen;
    }
    
}
