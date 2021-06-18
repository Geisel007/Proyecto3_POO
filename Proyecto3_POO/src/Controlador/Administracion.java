
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
       Agregar("admin",123456789,"1234");
    }
    
    public boolean Agregar(String nombre, int cedula, String contrasena){
        for (int i = 0; i < listaAdmins.size(); i++) {
            Administrador get = listaAdmins.get(i);
            if(get.getCedula() == cedula){
                return false;
            }
        }
        Administrador administrador = new Administrador(nombre,cedula,contrasena);
        listaAdmins.add(administrador);
        return true;
    }

    public ArrayList<Administrador> getListaAdmins() {
        return listaAdmins;
    }
    
}
