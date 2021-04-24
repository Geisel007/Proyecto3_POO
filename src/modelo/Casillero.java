
package modelo;

import java.util.ArrayList;

/**
 *
 * @author isamuels2900
 */
public class Casillero {
    
    private static int contador = 100;
    private int numero;
    private int cedulaCliente = -1;
    private ArrayList<Entregable> listaEntregables = new ArrayList();
    
    public Casillero(){
        contador++;
        numero = contador;
    }
    
    public boolean agregarEntregable(Entregable entregable){
        for (int i = 0; i < listaEntregables.size(); i++) {
            Entregable eActual = listaEntregables.get(i);
            if (eActual.equals(entregable)){
                System.out.println("El entregable ingresado ya existe");
                return false;
            }            
        }
        listaEntregables.add(entregable);
        System.out.println("Entregable registrado correctamente");
        return true;
    }
    
    public void mostrarEntregablesPendientes(){
        for (int i = 0; i < listaEntregables.size(); i++){
            Entregable eActual = listaEntregables.get(i);
            if (!eActual.isEstado()){
                System.out.println("Codigo: " + eActual.getCodigo());
                System.out.println("Descripcion: " + eActual.getDescripcion());
            }
        }
    }
    
    public void borrarEntregables(){
        listaEntregables = new ArrayList();
    }
    
    public int getNumero() {
        return numero;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public ArrayList<Entregable> getListaEntregables() {
        return listaEntregables;
    }

    @Override
    public String toString() {
        return "Casillero{" + "numero=" + numero + ", cedulaCliente=" + 
                cedulaCliente + ", listaEntregables=" + listaEntregables + '}';
    }

}
