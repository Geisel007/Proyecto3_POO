
package modelo;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author IanSamuels
 */
public class Counter {
    private String nombre;
    private int cedulaJuridica;
    private String dirreccion;
    private int cantidadDeCasilleros;
    private int totalRecibidos;
    private static ArrayList<Casillero> listaCasilleros = new ArrayList();
    private static ArrayList<Cliente> listaClientes = new ArrayList();
    
    public Counter(){
    }
    
    public Counter(String pNombre, int pCedulaJuridica, String pDirreccion, int pCantidadDeCasilleros,
             int pTotalRecibidos){
        nombre = pNombre;
        cedulaJuridica = pCedulaJuridica;
        dirreccion = pDirreccion;
        cantidadDeCasilleros = pCantidadDeCasilleros;
        totalRecibidos = pTotalRecibidos;
    }
    
    public boolean existe(int cedula, ArrayList<Counter> listaCounters){
        for (int i = 0; i < listaCounters.size(); i++) {
            Counter counter = listaCounters.get(i);
            if (counter.getCedulaJuridica() == cedula){
                return true;
            }
        }  
        return false; 
    } 
    
    public void agregarCliente(int identificacion, String nombre, 
            String correo, int telefono, String direccion, 
            String sexo, Date fechaDeNacimiento){
        
        boolean existe = false;
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cActual = listaClientes.get(i);
            if (cActual.getIdentificacion() == (identificacion)){
                existe = true;
            }            
        } if (!existe){
            Cliente cliente = new Cliente(identificacion, nombre, correo, 
                            telefono, direccion, sexo, fechaDeNacimiento);

            boolean temp = registrarCliente(cliente);

            if(temp){
                JOptionPane.showMessageDialog(null, "Cliente registrado "
                + "correctamente", "InfoBox: " + "Alerta",JOptionPane.INFORMATION_MESSAGE);
                listaClientes.add(cliente);
                mostrarClientes();
            } else {
                JOptionPane.showMessageDialog(null, "No hay casilleros disponibles",
                        "InfoBox: " + "Alerta",JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Error. El cliente ya se" + 
                        "encuentra registrado.");
        }
    }
    
    public boolean registrarCliente(Cliente cliente){
        if (buscarCasilleroLibre(listaCasilleros) && setCasilleroLibre(listaCasilleros, cliente)){
            return true; 
        } else {
            return false;
        }
    }
    
    public boolean clienteExiste(ArrayList listaClientes, int identificacion){
        for (int i = 0; i < listaClientes.size(); i++){
            Cliente cActual = (Cliente) listaClientes.get(i);
            if (cActual.getIdentificacion() == identificacion){
                return true;
            }
        }
        return false;
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
    
    public boolean buscarCasilleroLibre(ArrayList listaCasilleros){
        for (int i = 0; i < listaCasilleros.size(); i++){
            Casillero cActual = (Casillero) listaCasilleros.get(i);
            if (cActual.getCedulaCliente() == -1){
                return true;
            }
        }
        return false;
    }
    
    public Casillero consultarCasillero(int id){
        for (int i = 0; i < listaCasilleros.size(); i++){
            Casillero cActual = (Casillero) listaCasilleros.get(i);
            if (cActual.getNumero() == id){
                return cActual;
            }
        }
        return null;
    }
    
    public boolean setCasilleroLibre(ArrayList listaCasilleros, Cliente cliente){
        for (int i = 0; i < listaCasilleros.size(); i++){
            Casillero cActual = (Casillero) listaCasilleros.get(i);
            
            if (cActual.getCedulaCliente() == -1){
                
                cActual.setCedulaCliente(cliente.getIdentificacion());
                cliente.setNumeroCasillero(cActual.getNumero());
                System.out.println("Numero de casillero asignado: "
                        + cActual.getNumero());
                return true;
            }
        }
        return false;
    }
    
    public void retirarArticulo(int identificacion){
        
        for (int i = 0; i < listaClientes.size(); i++){
            Cliente clienteActual = (Cliente) listaClientes.get(i);
            if (clienteActual.getIdentificacion() == identificacion){
                
                int numCasillero = clienteActual.getNumeroCasillero();
                for (int j = 0; j < listaCasilleros.size(); j++){
                    Casillero casilleroActual = (Casillero) listaCasilleros.get(i);
                    if (casilleroActual.getNumero() == numCasillero){
                        casilleroActual.mostrarEntregablesPendientes();
                    }
                }
            }
            
        }
    }
    
    public void crearCasilleros(){
        for (int i = 0; i < cantidadDeCasilleros; i++){
            Casillero nuevoCasillero = new Casillero();
            System.out.println(nuevoCasillero.getNumero());
            listaCasilleros.add(nuevoCasillero);
        }
    }
    
    public void mostrarClientes(){
        for (int i = 0; i < listaClientes.size(); i++){
            Cliente cActual = (Cliente) listaClientes.get(i);
            System.out.println("ID: " + cActual.getIdentificacion());
            System.out.println("Nombre: " + cActual.getNombre());
            System.out.println("Correo: " + cActual.getCorreo());
            System.out.println("Telefono: " + cActual.getTelefono());
            System.out.println("Numero casillero: " + cActual.getNumeroCasillero());
        }
    }
    
    public void eliminarCliente(int id){
        boolean existe = false;
        for (int i = 0; i < listaClientes.size(); i++){
            Cliente cliente = (Cliente) listaClientes.get(i);
            if (cliente.getIdentificacion() == id){
                existe = true;
                
                for (int j = 0; j < listaCasilleros.size(); j++){
                    Casillero casillero = (Casillero) listaCasilleros.get(i);
                    if (casillero.getCedulaCliente() == id){
                        casillero.setCedulaCliente(-1);
                        casillero.borrarEntregables();
                        listaClientes.remove(cliente);
                        break;
                    }
                }
            }
        } if (existe){
            JOptionPane.showMessageDialog(null,"Cliente eliminado correctamente");
            mostrarClientes();
        } else {
            JOptionPane.showMessageDialog(null,"Error: EL cliente no se pudo encontrar");
        }
    }
    
    public int getTotalRecibidos() {
        return totalRecibidos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public int getCantidadDeCasilleros() {
        return cantidadDeCasilleros;
    }

    public void setCantidadDeCasilleros(int cantidadDeCasilleros) {
        this.cantidadDeCasilleros = cantidadDeCasilleros;
    }

    public static ArrayList<Casillero> getListaCasilleros() {
        return listaCasilleros;
    }
    
    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        return "Counter{" + "nombre=" + nombre + ", cedulaJuridica=" + cedulaJuridica + 
                ", dirreccion=" + dirreccion + ", cantidadDeCasilleros=" + 
                cantidadDeCasilleros + ", listaCasilleros=" + listaCasilleros + 
                ", listaClientes=" + listaClientes + '}';
    }

}
