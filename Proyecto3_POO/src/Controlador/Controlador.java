
package Controlador;

/**
 * @author Geisel
 */
public class Controlador {
    
    private Administracion Administracion = new Administracion();
    private ManejoEjemplares manejoEjemplares = new ManejoEjemplares();
    
    public boolean nuevoEjemplar(String nombre, String tratamiento, String tiempoDescomposicion, String imagen,
            String Categoria){
        return manejoEjemplares.Agregar(nombre, tratamiento, tiempoDescomposicion, imagen, Categoria);
    }
    
    public boolean eliminarEjemplar(String nombre){
        return manejoEjemplares.Eliminar(nombre);
    }
    
    public boolean modificarEjemplar(String nombre, String tratamiento, String tiempoDescomposicion, String imagen,
            String Categoria){
        return manejoEjemplares.Modificar(nombre, tratamiento, tiempoDescomposicion, imagen, Categoria);
    }
    
    public boolean nuevoAdmin(String nombre, int cedula, String contrasena){
        return Administracion.Agregar(nombre, cedula, contrasena);
    }
    
    public boolean verificarLogin(String nombre, String contrasena){
        return Administracion.validarLogin(nombre, contrasena);
    }
    
}
