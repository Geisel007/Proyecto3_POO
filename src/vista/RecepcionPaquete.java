
package vista;

import control.Controlador;
import static control.Controlador.counter;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author PC
 */
public class RecepcionPaquete extends javax.swing.JFrame {

    private Controlador CONTROLADOR;

    public RecepcionPaquete(Controlador CONTROLADOR) {
        this.CONTROLADOR = CONTROLADOR;
        initComponents();
    }

    public RecepcionPaquete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboCaja = new javax.swing.JComboBox<>();
        fieldPeso = new javax.swing.JTextField();
        fieldCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboElectronico = new javax.swing.JComboBox<>();
        combofragil = new javax.swing.JComboBox<>();
        lblDescripcion = new javax.swing.JLabel();
        txfDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Peso:");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Fragil:");

        jLabel1.setText("Recepción de paquete");

        jLabel2.setText("Tipo:");

        jLabel3.setText("Contenido electronico:");

        comboCaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caja", "Bolsa" }));

        jLabel6.setText("Identificación cliente:");

        comboElectronico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        comboElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboElectronicoActionPerformed(evt);
            }
        });

        combofragil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        lblDescripcion.setText("Descripción:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(lblDescripcion)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldPeso)
                                    .addComponent(comboElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combofragil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addComponent(fieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistrar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboCaja, fieldPeso});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combofragil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        RecepcionArticulo ventanaRecepcion = new RecepcionArticulo(CONTROLADOR);
        ventanaRecepcion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        
        int id;
        String descripcion;
        int peso;
        boolean electronico;
        boolean fragil;
        String tipo;
        
        try {
            id = Integer.parseInt(fieldCliente.getText());
            descripcion = txfDescripcion.getText();
            peso = Integer.parseInt(fieldPeso.getText());
            tipo = (String)comboCaja.getSelectedItem();
            String temp = (String)comboElectronico.getSelectedItem();
            electronico =  temp.equals("Si");
            temp = (String)combofragil.getSelectedItem();
            fragil = temp.equals("Si");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Datos incorrectos.", "Error",JOptionPane.WARNING_MESSAGE);
            return;
        }

        Cliente cliente = counter.consultar(id);
        if(cliente != null){
            boolean temp2 = CONTROLADOR.agregarEntregable(cliente, peso, tipo, electronico, fragil,descripcion);
            if(temp2){
               JOptionPane.showMessageDialog(null, "Paquete enviado con éxito.");
               CONTROLADOR.ascenderCliente(cliente);
            } else {
                JOptionPane.showMessageDialog(null,"Error al enviar el paquete.", "Error",JOptionPane.WARNING_MESSAGE); 
            }
            
       } else {
            JOptionPane.showMessageDialog(null,"El cliente no existe", "Error",JOptionPane.WARNING_MESSAGE);
        }
         
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void comboElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboElectronicoActionPerformed
      
    }//GEN-LAST:event_comboElectronicoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecepcionPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> comboCaja;
    private javax.swing.JComboBox<String> comboElectronico;
    private javax.swing.JComboBox<String> combofragil;
    private javax.swing.JTextField fieldCliente;
    private javax.swing.JTextField fieldPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JTextField txfDescripcion;
    // End of variables declaration//GEN-END:variables
}
