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

/**
 *
 * @author neira
 */
public class frmMenu extends javax.swing.JFrame {

    private UsuariosDto objUsuarioActual;

    public frmMenu(UsuariosDto usuarioActivo) {

        initComponents();
        setSize(700, 500);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        
        setTitle("Ventana Menu..");

        objUsuarioActual = usuarioActivo;
        cargarDatosUsuario();

    }

    public frmMenu() {
        this(new UsuariosDto());
    }

    private void cargarDatosUsuario() {
        if (objUsuarioActual != null) {
            txtUsuario.setText(objUsuarioActual.getUsuario());
            txtActividad.setText(objUsuarioActual.getActividad());
            txtRol.setText(objUsuarioActual.getRol());

        }

    }
     Conexion objConexion = new Conexion();
    
    public int agregarProd(String consulta){
    int datoAfectado = 0;
    Connection conexion = null;
    PreparedStatement sentencia = null;
        try {
            conexion = objConexion.establecerConexion();
            sentencia = conexion.prepareStatement(null);
            datoAfectado = sentencia.executeUpdate(consulta);
            
        } catch (Exception e) {
        }
    return datoAfectado;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloMenu = new javax.swing.JLabel();
        lblNombreUsu = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblActividad = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnListaProducto = new javax.swing.JButton();
        btnModificarProcto = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtActividad = new javax.swing.JTextField();
        txtRol = new javax.swing.JTextField();
        btnAgregarProducto1 = new javax.swing.JButton();
        btnQuitarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloMenu.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        lblTituloMenu.setText("\"Bienvenido al Inventario\"");
        jPanel1.add(lblTituloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 450, 50));

        lblNombreUsu.setText("Nombre Usuario:");
        jPanel1.add(lblNombreUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblRol.setText("Rol:");
        jPanel1.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));

        lblActividad.setText("Actividad:");
        jPanel1.add(lblActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnCerrarSesion.setText("Cerrar sesion.");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 180, 50));

        btnListaProducto.setText("Lista de Productos.");
        btnListaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 180, 50));

        btnModificarProcto.setText("Modificar Producto.");
        btnModificarProcto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarProctoMouseClicked(evt);
            }
        });
        btnModificarProcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProctoActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarProcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 180, 50));

        txtUsuario.setEnabled(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        txtActividad.setEnabled(false);
        jPanel1.add(txtActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        txtRol.setEnabled(false);
        jPanel1.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, -1));

        btnAgregarProducto1.setText("Agregar Producto.");
        btnAgregarProducto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProducto1MouseClicked(evt);
            }
        });
        btnAgregarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProducto1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 180, 50));

        btnQuitarProducto.setText("Quitar Producto.");
        btnQuitarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitarProductoMouseClicked(evt);
            }
        });
        btnQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuitarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 690, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarProctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProctoActionPerformed

    }//GEN-LAST:event_btnModificarProctoActionPerformed

    private void btnModificarProctoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProctoMouseClicked
        frmModificar objModifi = new frmModificar();
        objModifi.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnModificarProctoMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        List<UsuariosDto> listaUsuarios = new ArrayList<>();

        try {
            Conexion objConexion = new Conexion();
            Statement datosUsuario = objConexion.establecerConexion().createStatement();
            ResultSet dtoUser = datosUsuario.executeQuery("SELECT usu_usuarios FROM usuarios ;");

            while (dtoUser.next()) {

                UsuariosDto usr = new UsuariosDto();
                usr.setUsuario(dtoUser.getString("usu_usuario"));
                listaUsuarios.add(usr);

            }
            dtoUser.close();
            datosUsuario.close();
            objConexion.cerrarConexion();

        } catch (Exception e) {
            System.out.println("Usuario desconocido...");
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnAgregarProducto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProducto1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProducto1MouseClicked

    private void btnAgregarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProducto1ActionPerformed
        frmAgregarProd objAgregarProd = new frmAgregarProd();
        objAgregarProd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarProducto1ActionPerformed

    private void btnQuitarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitarProductoMouseClicked

    private void btnQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoActionPerformed
        frmQuitar objQuitar = new frmQuitar();
        objQuitar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuitarProductoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        frmLoginn objLog = new frmLoginn();
        objLog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnListaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProductoActionPerformed
        frmListado objLista = new frmListado();
        objLista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaProductoActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto1;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnListaProducto;
    private javax.swing.JButton btnModificarProcto;
    private javax.swing.JButton btnQuitarProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JLabel lblNombreUsu;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTituloMenu;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
