
package Modelo;

/**
 * @author Geisel
 */
public class Administrador {
    
    private String nombre;
    private int cedula;
    private String contrasena;

    public Administrador(String nombre, int cedula, String contrasena) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
