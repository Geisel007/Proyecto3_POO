
package vista;

import control.AdmClientes;
import java.util.Date;
import modelo.Cliente;

/**
 *
 * @author Geisel Montoya Solano
 */
public class PruebaCliente {
    
    static AdmClientes admClientes = new AdmClientes();

    public static void main(String[] args) {

        Cliente cliente1, cliente2, cliente3;
        Date fecha1, fecha2, fecha3;
        fecha1 = new Date(01/04/1999);
        cliente1 = new Cliente(1234,"Josh", "josh@gmail.com", 87324433, "Cartago", "Masculino", fecha1); 
        fecha2 = new Date(21/11/2001);
        cliente2 = new Cliente(1235,"Vistimo", "xd@gmail.com", 86738833, "Alajuela", "Otro", fecha2); 
        fecha3 = new Date(26/05/2001);
        cliente3 = new Cliente(1277,"Geisel", "gei@gmail.com", 87324433, "San Lorenzo", "Femenino", fecha3); 
        
        System.out.println("Cliente 1: " + cliente1.toString());
        System.out.println("Cliente 2: " + cliente2.toString());
        System.out.println("Cliente 3: " + cliente3.toString());
        
//        admClientes.agregar(cliente1);
//        admClientes.agregar(cliente2);
//        admClientes.agregar(cliente3);
//        System.out.println(admClientes.toString());
        
        admClientes.eliminar(cliente3);
        System.out.println(admClientes.toString());
         
        cliente3 = admClientes.consultar(1277);
        if (cliente3 != null){
            System.out.println("Cliente: " + cliente3.toString());
        } else {
            System.out.println("El cliente no existe");
        }
        
        cliente3 = admClientes.consultar(1234);
        if (cliente3 != null){
            System.out.println("Cliente: " + cliente3.toString());
        } else {
            System.out.println("El cliente no existe");
        }
        
        cliente2.setCorreo("holaa@gmail.com");
        admClientes.modificar(cliente2);
        System.out.println("Cliente 2: " + cliente2.toString());
        
    }
    
}
