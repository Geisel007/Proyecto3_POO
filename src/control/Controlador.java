
package control;

import java.util.ArrayList;
import java.util.Date;
import modelo.Cliente;

/**
 * @author Geisel Montoya
 */
public class Controlador {
    
    private AdmClientes admClientes = new AdmClientes();
    private AdmCounter admCounter = new AdmCounter();

    public boolean crearCounter(String pNombre, int pCedulaJuridica, String pDireccion, 
            int pCantidadDeCasilleros){
        return admCounter.agregar(pNombre, pCedulaJuridica, pDireccion, pCantidadDeCasilleros);
    }
    
    public boolean agregarCliente(int identificacion, String nombre, String correo, int telefono, String direccion, String sexo, 
                        Date fechaDeNacimiento){
        return admClientes.agregar(identificacion, nombre, correo, telefono, direccion, sexo, fechaDeNacimiento);//agregar registro dentro del counter
    }
    
    public boolean eliminarCliente(Cliente cliente){
        return admClientes.eliminar(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return admClientes.getListaClientes();
    }

    public AdmCounter getAdmCounter() {
        return admCounter;
    }
       
}
