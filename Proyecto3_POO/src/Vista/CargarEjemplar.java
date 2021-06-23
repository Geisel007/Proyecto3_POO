
package Vista;

import Controlador.Controlador;
import java.awt.Color;
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
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(204, 255, 204));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textoEjemplar = new javax.swing.JTextField();
        botonCargar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(textoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCargar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(24, 24, 24))
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
               //System.out.println("linea: " + linea); 
               j++;
               switch(j){
                   case 1: nombre = linea; break;
                   case 2: categoria = linea; break;
                   case 3: tiempo = linea; break;
                   case 4: imagen = linea; break;
                   default: tratamiento += linea; break;
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

