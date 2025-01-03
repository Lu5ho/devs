/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Modelo.Conexion;
import dto.UsuariosDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author neira
 */
public class frmAgregarProd extends javax.swing.JFrame {

    /**
     * Creates new form frmAgregarProd
     */
    public frmAgregarProd() {
        initComponents();
        setSize(600,500);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setTitle("Ventana de productos...");
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProductos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTituloProducto = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnAgregarBd = new javax.swing.JButton();
        pnlDetalle = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidadProd = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtMarcaProducto = new javax.swing.JTextField();
        lblIdProducto = new javax.swing.JLabel();
        lblMarcaProducto = new javax.swing.JLabel();
        lblLoteProductos = new javax.swing.JLabel();
        txtLoteProducto = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTotalProd = new javax.swing.JTextField();

        pnlProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Dispo"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloProducto.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        lblTituloProducto.setText("Agregar Productos:");
        jPanel1.add(lblTituloProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 350, 50));

        btnVolver.setText("Volver al Menu");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 140, 40));

        btnAgregarBd.setText("Agregar producto");
        btnAgregarBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBdActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarBd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 140, 40));

        pnlDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de producto"));
        pnlDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCantidad.setText("Cantidad:");
        pnlDetalle.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 100, 20));
        pnlDetalle.add(txtCantidadProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 100, -1));
        pnlDetalle.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, -1));
        pnlDetalle.add(txtMarcaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 110, -1));

        lblIdProducto.setText("Id Producto: ");
        pnlDetalle.add(lblIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 30));

        lblMarcaProducto.setText("Nombre Producto:");
        pnlDetalle.add(lblMarcaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 120, 20));

        lblLoteProductos.setText("Lote Productos: ");
        pnlDetalle.add(lblLoteProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 20));
        pnlDetalle.add(txtLoteProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, -1));
        pnlDetalle.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, -1));

        lblFecha.setText("Fecha:");
        pnlDetalle.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 80, -1));

        jPanel1.add(pnlDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 540, 250));

        lblTotal.setText("Total en bodega:");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 100, 30));
        jPanel1.add(txtTotalProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenu objMenu  = new frmMenu();
        objMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBdActionPerformed
       
       
        
       String IdProd = txtIdProducto.getText();
       String marca = txtMarcaProducto.getText();
       String cantidad = txtCantidadProd.getText();
       String lote = txtLoteProducto.getText();
       String fecha = txtFecha.getText();
       String totalVeh = txtTotalProd.getText();
       
       if ((IdProd.length() == 0)|| (marca.length() == 0)|| (cantidad.length() == 0) || 
               (lote.length() == 0  || (fecha.length() == 0) || (totalVeh.length() == 0))){
           JOptionPane.showMessageDialog(null, "Faltan datos...");
       }else {
           frmMenu agregarProd = "insert into vehiculos (veh_IDvehiculo,veh_marca,veh_cantidad,veh_lote,veh_fecha,veh_totalvehiculo) values (´"+IdProd+"´,´"+marca+"´,´"+cantidad"´,´"+lote+"´,´"+fecha+"´,´"+totalVeh+"´)";
           Conexion objConexion = new Conexion();
           objConexion.
                   
       
       
       }
       
    }//GEN-LAST:event_btnAgregarBdActionPerformed

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
            java.util.logging.Logger.getLogger(frmAgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgregarProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBd;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblLoteProductos;
    private javax.swing.JLabel lblMarcaProducto;
    private javax.swing.JLabel lblTituloProducto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlDetalle;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JTextField txtCantidadProd;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtLoteProducto;
    private javax.swing.JTextField txtMarcaProducto;
    private javax.swing.JTextField txtTotalProd;
    // End of variables declaration//GEN-END:variables
}
