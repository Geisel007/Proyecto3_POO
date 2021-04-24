
package vista;

import control.Controlador;
import static control.Controlador.counter;
import javax.swing.JOptionPane;
import modelo.Counter;

/**
 * @author IanSamuels
 */
public class CrearCounter extends javax.swing.JFrame {
    
    private Controlador CONTROLADOR = new Controlador();
    
  //  public static Counter counter;

    public CrearCounter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelCasilleros = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        fieldCedula = new javax.swing.JTextField();
        fieldDireccion = new javax.swing.JTextField();
        fieldCasilleros = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        lblRetiros = new javax.swing.JLabel();
        fieldRetiros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("Crear Counter");

        labelNombre.setText("Nombre:");

        labelCedula.setText("Cedula Juridica:");

        labelDireccion.setText("Direccion:");

        labelCasilleros.setText("Cantidad de casilleros:");

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        fieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCedulaActionPerformed(evt);
            }
        });

        fieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDireccionActionPerformed(evt);
            }
        });

        botonCrear.setText("Crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        lblRetiros.setText("Cantidad de retiros para avanzar de nivel:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(labelNombre)
                                        .addComponent(labelCedula)
                                        .addComponent(labelDireccion))
                                    .addComponent(labelCasilleros, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCasilleros, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRetiros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(labelTitulo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(botonCrear)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelCasilleros, labelCedula, labelDireccion, labelNombre});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedula)
                    .addComponent(fieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCasilleros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCasilleros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRetiros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCrear)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed

    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedulaActionPerformed
    
    }//GEN-LAST:event_fieldCedulaActionPerformed

    private void fieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDireccionActionPerformed
        
    }//GEN-LAST:event_fieldDireccionActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        String nombre;
        int cedula;
        String direccion;
        int cantidadCasilleros;
        int totalRetiros;
        
        nombre = fieldNombre.getText();
        cedula = Integer.parseInt(fieldCedula.getText());
        direccion = fieldDireccion.getText();
        cantidadCasilleros = Integer.parseInt(fieldCasilleros.getText());
        totalRetiros = Integer.parseInt(fieldRetiros.getText());
        
        //counter = new Counter(nombre, cedula, direccion, cantidadCasilleros);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Direccion: " + direccion);
        System.out.println("Cantidad de casilleros: " + cantidadCasilleros);
        System.out.println("Total de paquetes recibidos para avanzar de nivel: " + totalRetiros);
        JOptionPane.showMessageDialog(null, "Se ha creado el counter",
                "InfoBox: " + "Alerta", JOptionPane.INFORMATION_MESSAGE);
        
        //CONTROLADOR.crearCounter(nombre, cedula, direccion, cantidadCasilleros);
        
        Counter nuevoCounter = new Counter(nombre, cedula, 
                direccion, cantidadCasilleros, totalRetiros);
        
        System.out.println("Casilleros creados: ");
        
        nuevoCounter.crearCasilleros();
        
        counter = nuevoCounter;
        MenuPrincipal ventanaMenu = new MenuPrincipal(CONTROLADOR);
        ventanaMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCrearActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCounter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrear;
    private javax.swing.JTextField fieldCasilleros;
    private javax.swing.JTextField fieldCedula;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldRetiros;
    private javax.swing.JLabel labelCasilleros;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblRetiros;
    // End of variables declaration//GEN-END:variables
}
