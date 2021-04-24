
package control;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Casillero;
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
            int pCantidadDeCasilleros, int totalRecibidos){
        
        Counter nuevoCounter = new Counter(pNombre, pCedulaJuridica, 
                pDireccion, pCantidadDeCasilleros, totalRecibidos);
        
        System.out.println("Casilleros creados: ");
        
        nuevoCounter.crearCasilleros();
        
        counter = nuevoCounter;
        
    }
    
    public void agregarCliente(int identificacion, String nombre, String correo, int telefono, String direccion, String sexo, 
                        Date fechaDeNacimiento){
        
        counter.agregarCliente(identificacion, nombre, correo, telefono, 
                direccion, sexo, fechaDeNacimiento);//se agrega a la lista de clientes del counter
        counter.mostrarClientes();
    }
    
    public void eliminarCliente(int id){
        counter.eliminarCliente(id);
    }
    
    public Cliente consultarCliente(int identificacion){
        return admClientes.consultar(identificacion);
    }
    
     public boolean agregarEntregable(Cliente cliente, String descripcion, int peso, String tipo, 
            String contenido){

        System.out.println("Agregando sobre...");
        
        return cliente.registrarSobre(descripcion, cliente.getIdentificacion(), tipo, contenido, peso);
    }
    
    public boolean agregarEntregable(Cliente cliente, String nombre, String descripcion, boolean catalogo, 
            String tema){
        
        System.out.println("Agregando revista...");

        return cliente.registrarRevista(descripcion,  cliente.getIdentificacion(), nombre, catalogo, tema);
    }
    
    public boolean agregarEntregable(Cliente cliente, int peso, String tipo, boolean electronico, 
            boolean fragil, String descripcion){
        
        System.out.println("Agregando paquete...");
        
        return cliente.registrarPaquete(descripcion,  cliente.getIdentificacion(), tipo, electronico, fragil, peso);
    }
    
    public ArrayList<Entregable> consultarEntregables(int idCasillero){
        Casillero casillero = counter.consultarCasillero(idCasillero);
        if(casillero == null){
            return null;
        }
        return casillero.getListaEntregables();
    }
    
    public void ascenderCliente(Cliente cliente){
        
        int num= consultarEntregables(cliente.getNumeroCasillero()).size();
        if(num>=counter.getTotalRecibidos()){
            if((num )>=(counter.getTotalRecibidos() * 2) && (cliente.getTipo().equals("Plata"))){
               System.out.println("El cliente ascendió a Oro:" +num);
               JOptionPane.showMessageDialog(null, "El cliente ascendió a Oro.");
               cliente.setTipo("Oro");
            } else {
                if(cliente.getTipo().equals("Normal")) {
                    System.out.println("El cliente ascendió a Plata:" +num);
                    JOptionPane.showMessageDialog(null, "El cliente ascendió a Plata.");
                    cliente.setTipo("Plata");
                }        
            }
        }
         System.out.println("El cliente es tipo : " + cliente.getTipo());
        
    }
    
    public int obternerMontoFactura(){
        int total = 0;
        
        
        return total;
    }
    

    public ArrayList<Cliente> getClientes() {
        return counter.getListaClientes();
    }
    
    public ArrayList<Casillero> getCasilleros() {
        return counter.getListaCasilleros();
    }

    public Counter getCounter() {
        return counter;
    }
       
}
