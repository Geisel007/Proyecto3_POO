
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

    public String getNombre() {
        return nombre;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public String getTiempoDescomposicion() {
        return tiempoDescomposicion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setTiempoDescomposicion(String tiempoDescomposicion) {
        this.tiempoDescomposicion = tiempoDescomposicion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
