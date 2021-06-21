
package Controlador;

import Modelo.Administrador;
import java.util.ArrayList;

/**
 * @author Geisel
 */
public final class Administracion {
    
    private ArrayList<Administrador> listaAdmins;

    public Administracion() {
       listaAdmins = new ArrayList();
       Agregar("admin","1234");
    }
    
    public boolean Agregar(String nombre, String contrasena){
        for (int i = 0; i < listaAdmins.size(); i++) {
            Administrador get = listaAdmins.get(i);
            if(get.getNombre() == nombre){
                return false;
            }
        }
        Administrador administrador = new Administrador(nombre,contrasena);
        listaAdmins.add(administrador);
        return true;
    }
    
    public boolean validarLogin(String nombre, String contrasena){
        for (int i = 0; i < listaAdmins.size(); i++){
            Administrador admin = listaAdmins.get(i);
            if (admin.getNombre().equals(nombre) && 
                    admin.getContrasena().equals(contrasena)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Administrador> getListaAdmins() {
        return listaAdmins;
    }
    
}
