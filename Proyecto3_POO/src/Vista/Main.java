
package Vista;

import Controlador.Controlador;
import Modelo.Ejemplar;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
//import Objeto;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;

/**
 *
 * @author Geisel
 */
public class Main {
    
    private static Controlador CONTROLADOR = new Controlador();

    public static void main(String[] args) {      
         ArrayList<Ejemplar> listaEjemplares2 = CONTROLADOR.getListEjeplares();
         try {
           
            System.out.println("ok!");
            System.out.print("Leyendo ArrayList del fichero objetos.dat.. ");

            ObjectInputStream leyendoFichero = new ObjectInputStream( 
            new FileInputStream("objetos.dat") );
            listaEjemplares2 = ( ArrayList <Ejemplar> )leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero:");
            
            for(int i = 0; i < listaEjemplares2.size(); i++) {
                System.out.println( "arrayList2[" + i + "] = " + listaEjemplares2.get(i) );
            }
            
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
         
        MenuPrincipal menuPrincipal = new MenuPrincipal(CONTROLADOR);
        menuPrincipal.setVisible(true);
    }
    
}
