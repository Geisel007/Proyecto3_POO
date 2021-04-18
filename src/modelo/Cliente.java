
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

/**
 * @author Geisel Montoya Solano
 */
public class Cliente {
    
    private int identificacion;
    private String nombre;
    private String correo;
    private int telefono;
    private String direccion;
    private String sexo;
    private String tipo;
    private Date fechaDeNacimiento;
    private int numeroCasillero;

    public Cliente(int identificacion, String nombre, String correo, int telefono, String direccion, String sexo, 
                        Date fechaDeNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.tipo = "Normal";
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public int existe(int id, ArrayList<Cliente> listaClientes){
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente get = listaClientes.get(i);
            if (get.getIdentificacion() == id){
                return i;
            }
        }  
        return -1; 
    } 

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getNumeroCasillero() {
        return numeroCasillero;
    }

    public void setNumeroCasillero(int numeroCasillero) {
        this.numeroCasillero = numeroCasillero;
    }
    
    public void registrarSobre(String descripcion, int remitente, 
            String pTipo, String pContenido, int pPeso){
        
        if (tipo.equals("aereo") || tipo.equals("manila")){
            
            if (pPeso > 0){
                
                ArrayList listaCasilleros = Counter.getListaCasilleros();
                for (int i = 0; i < listaCasilleros.size(); i++){
                    Casillero cActual = (Casillero) listaCasilleros.get(i);
                    
                    if (cActual.getNumero() == numeroCasillero){
                        
                        Sobre nuevoSobre = new Sobre(descripcion, remitente, 
                                pTipo, pContenido, pPeso);
                        
                        cActual.agregarEntregable(nuevoSobre);
                        System.out.println("Sobre registrado correctamente");
                    }
                }
            } else {
            System.out.println("Peso ingresado invalido");
            } 
        } else {
            System.out.println("Tipo ingresado invalido");
        } 
    }
    
    public void registrarRevista(String descripcion, int remitente, String pNombre, 
            boolean pCatalogo, String pTema){
        
        ArrayList listaCasilleros = Counter.getListaCasilleros();
        for (int i = 0; i < listaCasilleros.size(); i++){
            Casillero cActual = (Casillero) listaCasilleros.get(i);
                    
            if (cActual.getNumero() == numeroCasillero){
                        
            Revista nuevaRevista = new Revista(descripcion,remitente, pNombre, 
                    pCatalogo, pTema);
                        
            cActual.agregarEntregable(nuevaRevista);
            System.out.println("Revista registrada correctamente");
                        
            }
        }
    }
    
    public void registrarPaquete(String descripcion, int remitente, String pTipo, 
            boolean pContenidoElectronico, boolean pFragil, int pPeso){
        
        ArrayList listaCasilleros = Counter.getListaCasilleros();
        for (int i = 0; i < listaCasilleros.size(); i++){
            Casillero cActual = (Casillero) listaCasilleros.get(i);
                    
            if (cActual.getNumero() == numeroCasillero){
                        
            Paquete nuevoPaquete = new Paquete(descripcion,remitente, pTipo, 
                    pContenidoElectronico, pFragil, pPeso);
                        
            cActual.agregarEntregable(nuevoPaquete);
            System.out.println("Paquete registrado correctamente");
                        
            }
        }
    }
    
}
