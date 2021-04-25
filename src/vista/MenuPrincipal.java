
package vista;

import control.Controlador;
import modelo.Counter;

/**
 * @author PC
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    public Controlador CONTROLADOR;
    
    public MenuPrincipal(Controlador CONTROLADOR) {
        initComponents();
        this.CONTROLADOR = CONTROLADOR;
    }
    
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAdmClientes = new javax.swing.JButton();
        botonRecepcion = new javax.swing.JButton();
        botonRetiro = new javax.swing.JButton();
        botonAdmEntregables = new javax.swing.JButton();
        botonTipoDeCambio = new javax.swing.JButton();
        botonPendientes = new javax.swing.JButton();
        botonReporte = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAdmClientes.setText("Administracion de clientes");
        botonAdmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdmClientesActionPerformed(evt);
            }
        });

        botonRecepcion.setText("Recepción de articulos");
        botonRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecepcionActionPerformed(evt);
            }
        });

        botonRetiro.setText("Retiro de articulos");
        botonRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetiroActionPerformed(evt);
            }
        });

        botonAdmEntregables.setText("Administración de entregalbes");
        botonAdmEntregables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdmEntregablesActionPerformed(evt);
            }
        });

        botonTipoDeCambio.setText("Consultar tipo de cambio/venta de divisa extranjera");
        botonTipoDeCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTipoDeCambioActionPerformed(evt);
            }
        });

        botonPendientes.setText("Clientes con paquetes pendientes");
        botonPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPendientesActionPerformed(evt);
            }
        });

        botonReporte.setText("Reporte de resumen contable");
        botonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteActionPerformed(evt);
            }
        });

        labelTitulo.setText("Menu Principal");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonTipoDeCambio)
                    .addComponent(botonPendientes)
                    .addComponent(botonReporte)
                    .addComponent(botonAdmClientes)
                    .addComponent(botonRecepcion)
                    .addComponent(botonRetiro)
                    .addComponent(botonAdmEntregables)
                    .addComponent(labelTitulo)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonAdmClientes, botonAdmEntregables, botonPendientes, botonRecepcion, botonReporte, botonRetiro, botonTipoDeCambio});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(botonAdmClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRecepcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRetiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAdmEntregables)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonTipoDeCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPendientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAdmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdmClientesActionPerformed
        AdminClientes ventanaAdmClientes = new AdminClientes(CONTROLADOR);
        ventanaAdmClientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAdmClientesActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecepcionActionPerformed
        RecepcionArticulo ventanaRecepcion = new RecepcionArticulo(CONTROLADOR);
        ventanaRecepcion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRecepcionActionPerformed

    private void botonRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetiroActionPerformed
        RetirarEntregables ventanaRetirar = new RetirarEntregables(CONTROLADOR);
        ventanaRetirar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRetiroActionPerformed

    private void botonAdmEntregablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdmEntregablesActionPerformed
        AdminEntregables ventanaAdminEntregables = new AdminEntregables(CONTROLADOR);
        ventanaAdminEntregables.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAdmEntregablesActionPerformed

    private void botonTipoDeCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTipoDeCambioActionPerformed
        CambioVenta ventanaCambioVenta = new CambioVenta(CONTROLADOR);
        ventanaCambioVenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonTipoDeCambioActionPerformed

    private void botonPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPendientesActionPerformed
        PaquetesPendientes ventanaPaquetesPendientes= new PaquetesPendientes(CONTROLADOR);
        ventanaPaquetesPendientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPendientesActionPerformed

    private void botonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteActionPerformed
        RegistroContable ventanaRegistroContable= new RegistroContable(CONTROLADOR);
        ventanaRegistroContable.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonReporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdmClientes;
    private javax.swing.JButton botonAdmEntregables;
    private javax.swing.JButton botonPendientes;
    private javax.swing.JButton botonRecepcion;
    private javax.swing.JButton botonReporte;
    private javax.swing.JButton botonRetiro;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonTipoDeCambio;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
