
package control;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import modelo.Casillero;
import modelo.Cliente;
import modelo.Counter;
import modelo.Entregable;
import modelo.Mailer;
import modelo.Paquete;
import modelo.Revista;
import modelo.Sobre;
import modelo.TiqueteRetiro;

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
    
     public boolean agregarEntregable(Cliente cliente, String descripcion, int peso, String contenido, 
            String tipo){

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
    
    public double obternerMontoFactura(Entregable articulo){
        System.out.println(articulo.toString());
        if(articulo instanceof Sobre sobre){
           if(sobre.getTipo().equals("Manila")){
               System.out.println("sobre de manila");
               if(sobre.getContenido().equals("Documentacion")){
                   System.out.println("Documentacion");
                   return 1;
               } else {
                   System.out.println("Otros");
                   return 2;
               }
           } else {
               System.out.println("sobre aereo");
               if(sobre.getContenido().equals("Documentacion")){
                   System.out.println("Documentacion");
                   return 0;
               } else {
                   System.out.println("Otros");
                   return 1;
               }
           }
        } if(articulo instanceof Paquete paquete){
            if(paquete.isFragil()){
                System.out.println("paquete fragil/electronico");
                if(paquete.isContenidoElectronico()){
                    return (paquete.getPeso() * 0.02) + 4;
                }
                return (paquete.getPeso() * 0.02) + 2; 
            } if(paquete.isContenidoElectronico()){
                System.out.println("paquete fragil/electronico");
                if(paquete.isFragil()){
                    return (paquete.getPeso() * 0.02) + 4;
                }
                return (paquete.getPeso() * 0.02) + 2; 
            }
            System.out.println("paquete");
             return paquete.getPeso() * 0.02; 
        } if(articulo instanceof Revista revista){
            if(revista.isCatalogo()){
                System.out.println("catálogo");
                return 0;
            }
            System.out.println("revista");
            return 1;
        }
       return 0; 
    }
    
    public double calcularDescuesto(double total, Cliente cliente){
        if(cliente.getTipo().equals("Oro")){
            JOptionPane.showMessageDialog(null, "Se aplicó un descuento de cliente tipo Oro");
            return total * 0.10;
        } if(cliente.getTipo().equals("Plata")){
            JOptionPane.showMessageDialog(null, "Se aplicó un descuento de cliente tipo Plata");
            return total * 0.05;
        } 
        return 0;        
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

    public ArrayList<TiqueteRetiro> getContablidad() {
        return counter.getContablidad();
    }
    
    public void AgregarRegistroContable(Entregable entregable, double monto, double descuento, Cliente cliente){
        java.util.Date fechaActual = new Date();
        TiqueteRetiro tiquete = new TiqueteRetiro(fechaActual,entregable.getCodigo(), monto, descuento,
                    cliente.getNumeroCasillero());
        counter.getContablidad().add(tiquete);
        System.out.println("Tiquete de Compra: " + tiquete.toString());
    }
       
}
