
package vista;

import control.Controlador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Entregable;
import modelo.Sobre;

/**
 * @author Geisel Montoya Solano
 */
public class ArticulosDisponibles extends javax.swing.JFrame {
    
    private Controlador CONTROLADOR;
    private Cliente cliente;
    ArrayList<Entregable> factura = new ArrayList();;
    
    public ArticulosDisponibles(Controlador CONTROLADOR, Cliente cliente) {
        initComponents();
        this.CONTROLADOR = CONTROLADOR;
        this.cliente = cliente;
        cargarLista();
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblArticulosDisponibles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listArticulos = new javax.swing.JList<>();
        btnRetirar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblFactura = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listFactura = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblArticulosDisponibles.setText("Artículos Disponibles");

        jScrollPane1.setViewportView(listArticulos);

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnVolver.setText("Salir");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblFactura.setText("Factura");

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        listFactura.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listFactura.setEnabled(false);
        jScrollPane3.setViewportView(listFactura);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFactura)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblArticulosDisponibles)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblArticulosDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetirar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFactura)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnPagar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btnVolver)
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cargarLista(){
        ArrayList<Entregable> entregables = CONTROLADOR.consultarEntregables(cliente.getNumeroCasillero()); 
        System.out.println("Entregables: "+ entregables);
        String[] strings = new String[entregables.size()];
        for (int i = 0; i < entregables.size(); i++) {
            Entregable get = entregables.get(i);
            if(get.isEstado() == false){ // Aquí solo se muestran los artículos que aún no se entregan
                strings[i] = get.toString();
            }
        }
        editarList(strings,listArticulos);
    }
    
    private void editarList(String[] strings, javax.swing.JList<String> list){

        list.setModel(new javax.swing.AbstractListModel<String>() {
            @Override
            public int getSize() { return strings.length; }
            @Override
            public String getElementAt(int i) { return strings[i]; }
        });
    
    }

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed

        ArrayList<String> temp = (ArrayList<String>) listArticulos.getSelectedValuesList();
        String get = ""; 
        for (int i = 0; i < temp.size(); i++) {
            get = temp.get(i);
            System.out.println("Artículos Seleccionados: " + get);//solo escoge uno :(
        }
        
        ArrayList<Entregable> entregables = CONTROLADOR.consultarEntregables(cliente.getNumeroCasillero()); 
        for (int i = 0; i < entregables.size(); i++) {
            Entregable get2 = entregables.get(i);
            String temp2 = get2.toString();
            if(temp2.equals(get)){
               get2.setEstado(true);
               factura.add(get2);
               System.out.println("Factura: " +factura.toString());
               JOptionPane.showMessageDialog(null, "Artículo agregado a la factura.");
               cargarLista();
               return;
            }
        }
        JOptionPane.showMessageDialog(null,"Error al retirar el Artículo", "Error",JOptionPane.WARNING_MESSAGE);       
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal ventanaMenu = new MenuPrincipal(CONTROLADOR);
        ventanaMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        int totalFinal = 0;
        String[] strings = new String[factura.size() + 1];
        
        for (int i = 0; i < factura.size(); i++) {
            Entregable get = factura.get(i);
            int precio = CONTROLADOR.obternerMontoFactura();
            strings[i] = "Artículo " + (i+1) + ": "+ get.toString() +  "Precio: " + precio + ".";
            totalFinal +=precio;            
        }
        
        strings[factura.size()] = "Total: " + totalFinal + ".\n";
        editarList(strings,listFactura);        
        
    }//GEN-LAST:event_btnPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblArticulosDisponibles;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JList<String> listArticulos;
    private javax.swing.JList<String> listFactura;
    // End of variables declaration//GEN-END:variables
}
