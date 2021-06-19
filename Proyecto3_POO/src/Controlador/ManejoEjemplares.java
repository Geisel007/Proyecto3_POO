
package Controlador;

import Modelo.Aluminio;
import Modelo.CoProcesable;
import Modelo.Ejemplar;
import Modelo.Electronica;
import Modelo.Escombros;
import Modelo.Organica;
import Modelo.Plastico;
import Modelo.Sanitaria;
import Modelo.Semisintetico;
import Modelo.Toxica;
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
            System.out.println("Ejemplar... " + (i+1));
            if(get.getNombre().equals(nombre)){
                System.out.println("Ya existe el ejemplar " + nombre);
                return false; //ya existe el ejemplar
            }
        }
        
        if(Categoria.equals("Aluminio")){
            Aluminio ejemplar = new Aluminio(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Co-Procesable")){
            CoProcesable ejemplar = new CoProcesable(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Plastico")){
            Plastico ejemplar = new Plastico(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Semisintetico")){
            Semisintetico ejemplar = new Semisintetico(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Vidrio")){
            Vidrio ejemplar = new Vidrio(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Organica")){
            Organica ejemplar = new Organica(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Sanitaria")){
            Sanitaria ejemplar = new Sanitaria(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Toxica")){
            Toxica ejemplar = new Toxica(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Escombros")){
            Escombros ejemplar = new Escombros(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        if(Categoria.equals("Electronica")){
            Electronica ejemplar = new Electronica(nombre,tratamiento,tiempoDescomposicion,imagen);
            listaEjemplares.add(ejemplar);
            return true;
        }
        
        return false;
    }
    
    public boolean Eliminar(String nombre){
        
        for (int i = 0; i < listaEjemplares.size(); i++) {
            Ejemplar get = listaEjemplares.get(i);
            if(get.getNombre().equals(nombre)){
                listaEjemplares.remove(get);
                return true;  
            }
        }
   
        return false;
    }
    
    public boolean Modificar(String nombre, String tratamiento, String tiempoDescomposicion, String imagen,
            String Categoria){
        
        for (int i = 0; i < listaEjemplares.size(); i++) {
            Ejemplar get = listaEjemplares.get(i);
            if(get.getNombre().equals(nombre)){
                get.setNombre(nombre);
                get.setImagen(imagen);
                get.setTiempoDescomposicion(tiempoDescomposicion);
                get.setTratamiento(tratamiento);
                return true; 
            }
        }
   
        return false;
    }
    
    
}
