
package Modelo;

/**
 * @author Geisel
 */
public abstract class Reciclable extends Ejemplar {

    public Reciclable() {
    }

    public Reciclable(String nombre, String tratamiento, String tiempoDescomposicion, String imagen) {
        super(nombre, tratamiento, tiempoDescomposicion, imagen);
    } 
 
}
