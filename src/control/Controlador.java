
package control;

import java.util.ArrayList;
import java.util.Date;
import modelo.Cliente;
import modelo.Counter;
import modelo.Entregable;

/**
 * @author Geisel Montoya
 */
public class Controlador {
    
    public static Counter counter;
    
    private AdmClientes admClientes = new AdmClientes();

    public void crearCounter(String pNombre, int pCedulaJuridica, String pDireccion, 
            int pCantidadDeCasilleros){
        
        Counter nuevoCounter = new Counter(pNombre, pCedulaJuridica, 
                pDireccion, pCantidadDeCasilleros);
        
        counter = nuevoCounter;
    }
    
    public boolean agregarCliente(int identificacion, String nombre, 
            String correo, int telefono, String direccion, String sexo, 
                        Date fechaDeNacimiento){
        
        return admClientes.agregar(identificacion, nombre, correo, 
                telefono, direccion, sexo, fechaDeNacimiento);//agregar registro dentro del counter
    }
    
    public void registrarCliente(int identificacion, String nombre, 
            String correo, int telefono, String direccion, String sexo, 
                        Date fechaDeNacimiento){
        
        counter.registrarCliente(identificacion, nombre, correo,telefono, 
                direccion, sexo, fechaDeNacimiento);//agregar registro dentro del counter
    }
    
    public boolean modificarCliente(Cliente cliente){
        return admClientes.modificar(cliente);
    }
    
    public boolean eliminarCliente(Cliente cliente){
        return admClientes.eliminar(cliente);
    }
    
    public Cliente consultarCliente(int identificacion){
        return admClientes.consultar(identificacion);
    }
    
    public boolean agregarEntregable(int numCasillero, int id, String descripcion, int peso, String tipo, 
            String contenido){

        System.out.println("Sobre");
    
        //counter.getListaCasilleros.agregarEntregable(entregable);
        return true;
    }
    
    public boolean agregarEntregable(int numCasillero, int id, String nombre, String descripcion, boolean catalogo, 
            String tema){
        
        System.out.println("Revista");
  
        //counter.getListaCasilleros.agregarEntregable(entregable);
        return true;
    }
    
    public boolean agregarEntregable(int numCasillero, int id, int peso, String tipo, boolean electronico, 
            boolean fragil){
        
        System.out.println("Paquete");
  
        //counter.getListaCasilleros.agregarEntregable(entregable);
        return true;
    }
    

    public ArrayList<Cliente> getClientes() {
        return admClientes.getListaClientes();
    }
       
}
