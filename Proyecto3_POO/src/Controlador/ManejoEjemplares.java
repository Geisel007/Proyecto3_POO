
package Controlador;

import Modelo.Aluminio;
import Modelo.CoProcesable;
import Modelo.Ejemplar;
import Modelo.Plastico;
import Modelo.Vidrio;
import java.util.ArrayList;

/**
 * @author Geisel
 */
public class ManejoEjemplares {
    
    private ArrayList<Ejemplar> listaEjemplares;

    public ManejoEjemplares() {
        listaEjemplares = new ArrayList();
    }
    
    public boolean Agregar(String nombre, String tratamiento, String tiempoDescomposicion, String imagen,
            String Categoria){
        
        for (int i = 0; i < listaEjemplares.size(); i++) {
            Ejemplar get = listaEjemplares.get(i);
            if(get.getNombre().equals(nombre)){
                return false; //ya existe el ejemplar
            }
        }
        
        if(Categoria.equals("Aluminio")){
            Aluminio ejemplar = new Aluminio(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("CoProcesable")){
            CoProcesable ejemplar = new CoProcesable(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Plástico")){
            Plastico ejemplar = new Plastico(nombre,tratamiento,tiempoDescomposicion,imagen) {};
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Semisintetico")){
            CoProcesable ejemplar = new CoProcesable(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Vidrio")){
            Vidrio ejemplar = new Vidrio(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
        }
        
        return true;
    }
    
    
    
}
