
package Vista;

import Controlador.Controlador;

/**
 *
 * @author Geisel
 */
public class Main {
    
    private static Controlador CONTROLADOR = new Controlador();

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal(CONTROLADOR);
        menuPrincipal.setVisible(true);
    }
    
}
