/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Counter;



/**
 *
 * @author IanSamuels
 */
public class CrearCounter extends javax.swing.JFrame {
    
    public static Counter counter;
    /**
     * Creates new form CrearCounter
     */
    public CrearCounter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(labelNombre)
                            .addComponent(labelCedula)
                            .addComponent(labelDireccion)
                            .addComponent(labelCasilleros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCrear)
                            .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCasilleros, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(labelTitulo)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelCasilleros, labelCedula, labelDireccion, labelNombre});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelTitulo)
                .addGap(31, 31, 31)
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
                    .addComponent(labelCasilleros)
                    .addComponent(fieldCasilleros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(botonCrear)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedulaActionPerformed

    private void fieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDireccionActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        String nombre;
        int cedula;
        String direccion;
        int cantidadCasilleros;
        
        nombre = fieldNombre.getText();
        cedula = Integer.parseInt(fieldCedula.getText());
        direccion = fieldDireccion.getText();
        cantidadCasilleros = Integer.parseInt(fieldCasilleros.getText());
        
        counter = new Counter(nombre, cedula, direccion, cantidadCasilleros);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Direccion: " + direccion);
        System.out.println("Cantidad de casilleros: " + cantidadCasilleros);
        JOptionPane.showMessageDialog(null, "Se ha creado el counter",
                "InfoBox: " + "Alerta", JOptionPane.INFORMATION_MESSAGE);
        
        MenuPrincipal ventanaMenu = new MenuPrincipal();
        ventanaMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCrearActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JLabel labelCasilleros;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
