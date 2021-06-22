
package Vista;

import Controlador.Controlador;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class CargarEjemplar extends javax.swing.JFrame {
    
    private Controlador CONTROLADOR;

    public CargarEjemplar(Controlador CONTROLADOR) {
        initComponents();
        this.CONTROLADOR = CONTROLADOR;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textoEjemplar = new javax.swing.JTextField();
        botonCargar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cargar Ejemplar");

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCargar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonVolver)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
       String archivo;
        try {
            archivo = textoEjemplar.getText();
            //boolean cargarArchivo = cargarArchivo("src\\ArchivosExternos\\botella_de_plastico.txt");
            //src\ArchivosExternos\botella_de_plastico.txt
            boolean cargarArchivo = cargarArchivo(archivo);
            if(cargarArchivo){
               JOptionPane.showMessageDialog(null, "Ejemplar cargado desde el archivo correctamente.");
            }            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CargarEjemplar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }//GEN-LAST:event_botonCargarActionPerformed

    private boolean cargarArchivo(String archivo) throws FileNotFoundException{
        String nombre = "", tratamiento = "", tiempo = "", imagen = "", categoria = "";
        FileReader fr = null;
        BufferedReader br = null; 
         try {
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea;          
            int j = 0;
            while((linea=br.readLine())!=null){
               System.out.println("linea: " + linea); 
               j++;
               switch(j){
                   case 1: nombre = linea;
                   case 2: categoria = linea;
                   case 3: tratamiento = linea;
                   case 4: tiempo = linea;
                   case 5: imagen = linea;
               }
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("\nNo existe el archivo " + archivo + '.');
            JOptionPane.showMessageDialog(null, "No existe el archivo.", "InfoBox: " + 
                        "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        catch (IOException ex) {
            System.out.println("\nError al leer el archivo " + archivo + '.');
            JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "InfoBox: " + 
                        "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } 
        finally {
            try {
                if (fr != null && br != null){
                    fr.close();
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println("\nError al cerrar el archivo " + archivo + '.');
                JOptionPane.showMessageDialog(null, "Error al cerrar el archivo.", "InfoBox: " + 
                        "Alerta", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        
        if(nombre.equals("") || tratamiento.equals("") || tiempo.equals("") || imagen.equals("") 
                || categoria.equals("")){
           JOptionPane.showMessageDialog(null, "Error: Los datos ingresados desde el archivo son invalidos",
                    "InfoBox: " + "Alerta", JOptionPane.INFORMATION_MESSAGE);
           return false;
       } 
        if(categoria.equals("Organica") || categoria.equals("Sanitaria")  || categoria.equals("Toxica") 
                || categoria.equals("Escombros") || categoria.equals("Electronica")  || categoria.equals("Plastico") 
                || categoria.equals("Vidrio") || categoria.equals("Aluminio") || categoria.equals("Semisintetico")
                || categoria.equals("Co-procesables")){
            
        } else {
            JOptionPane.showMessageDialog(null, "Error: La categoría " + categoria + " no existe.",
                "InfoBox: " + "Alerta", JOptionPane.INFORMATION_MESSAGE);
           return false;
        }

        if(CONTROLADOR.nuevoEjemplar(nombre, tratamiento, tiempo, imagen, categoria)){  
               return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe un ejemplar con ese nombre.");
        }
        return false;
    }
    
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal(CONTROLADOR);
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textoEjemplar;
    // End of variables declaration//GEN-END:variables
}
