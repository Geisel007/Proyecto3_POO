
package Vista;

import Controlador.Controlador;
import Modelo.Ejemplar;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    private Controlador CONTROLADOR;
    
    public MenuPrincipal(Controlador CONTROLADOR) {
        initComponents();
        this.CONTROLADOR = CONTROLADOR;
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(204, 255, 204));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonCargar = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        botonSeccion = new javax.swing.JButton();
        botonAdmin = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu Principal");

        botonCargar.setText("Cargar Ejemplar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        botonIngresar.setText("Ingresar Ejemplar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonSeccion.setText("Sección Informativa");
        botonSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeccionActionPerformed(evt);
            }
        });

        botonAdmin.setText("Administración");
        botonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdminActionPerformed(evt);
            }
        });

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
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(botonCargar)
                    .addComponent(botonIngresar)
                    .addComponent(botonSeccion)
                    .addComponent(botonAdmin))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonAdmin, botonCargar, botonIngresar, botonSeccion});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSeccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
       CargarEjemplar ventanaCargar = new CargarEjemplar(CONTROLADOR);
       ventanaCargar.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
       IngresarEjemplar ventanaIngresar = new IngresarEjemplar(CONTROLADOR);
       ventanaIngresar.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        //Guardar array list
        ArrayList<Ejemplar> listaEjemplares = CONTROLADOR.getListEjeplares();
       // ArrayList<Ejemplar> listaEjemplares2;
         try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. ");

            ObjectOutputStream escribiendoFichero = new ObjectOutputStream( 
            new FileOutputStream("objetos.dat"));
            escribiendoFichero.writeObject(listaEjemplares);
            escribiendoFichero.close();

            System.out.println("ok!");
//            System.out.print("Leyendo ArrayList del fichero objetos.dat.. ");
//
//            ObjectInputStream leyendoFichero = new ObjectInputStream( 
//            new FileInputStream("objetos.dat") );
//            listaEjemplares2 = ( ArrayList <Ejemplar> )leyendoFichero.readObject();
//            leyendoFichero.close();
//
//            System.out.println("ok!");
//            System.out.println("Datos leídos del fichero:");
//            
//            for(int i = 0; i < listaEjemplares2.size(); i++) {
//                System.out.println( "arrayList2[" + i + "] = " + listaEjemplares2.get(i) );
//            }
            
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
         
        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdminActionPerformed
        IniciarSesion ventanaIniciarSesion = new IniciarSesion(CONTROLADOR);
        ventanaIniciarSesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAdminActionPerformed

    private void botonSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeccionActionPerformed
        TipoDeFiltro ventanaTipoDeFiltro = new TipoDeFiltro(CONTROLADOR);
        ventanaTipoDeFiltro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSeccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSeccion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
