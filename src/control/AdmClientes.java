
package control;

import java.util.ArrayList;
import java.util.Date;
import modelo.Cliente;

/**
 * @author Geisel Montoya Solano
 */
public class AdmClientes {
    
    private ArrayList<Cliente> listaClientes;

    public AdmClientes() {
        listaClientes = new ArrayList<>();
    }
    
    public Cliente consultar (int id) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente get = listaClientes.get(i);
            if (get.getIdentificacion() == id){
                return get;
            }
        }      
        return null;
    }
    
    public boolean agregar (int identificacion, String nombre, String correo, int telefono, String direccion, String sexo, 
                        Date fechaDeNacimiento ){ 
        Cliente cliente = new Cliente(identificacion,nombre, correo, telefono, direccion, sexo, fechaDeNacimiento);
        if (cliente.existe(cliente.getIdentificacion(), listaClientes) == -1){
            listaClientes.add(cliente);
            return true;
        }
        return false;
    }
    
    public boolean eliminar ( Cliente cliente ){
       if (cliente.existe(cliente.getIdentificacion(), listaClientes) != -1){
            listaClientes.remove(cliente);
            return true;
        }
        return false;
    }
    
    public boolean modificar( Cliente cliente ){
       int index = cliente.existe(cliente.getIdentificacion(), listaClientes);
       if (index != -1){
           listaClientes.set(index, cliente);
           return true;
        }
        return false; 
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    @Override
    public String toString() {
        return "Clientes Registrados:\n" + listaClientes ;
    }

}
