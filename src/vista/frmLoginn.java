/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Modelo.Conexion;
import dto.UsuariosDto;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zapallo
 */
public class frmLoginn extends javax.swing.JFrame {

    /**
     * Creates new form frmInventario
     */
    public frmLoginn() {
        initComponents();
        setSize(400, 600);
        setLayout(null);
        setResizable(false);
        setTitle("Login....");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCooreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(0, 153, 153));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblTitulo.setText("Inventario Herramientas:");
        pnlFondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 30));

        lblCooreo.setText("Correo Electronico:");
        pnlFondo.add(lblCooreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 20));
        pnlFondo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, -1));

        lblPass.setText("Contraseña:");
        pnlFondo.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));
        pnlFondo.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 30));

        jPanel1.add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        List<UsuariosDto> listaUsuarios = new ArrayList<>();

        try {
            Conexion objConexion = new Conexion();
            Statement datosUsuario = objConexion.establecerConexion().createStatement();
            ResultSet dtoUser = datosUsuario.executeQuery("SELECT * FROM usuarios;");

            while (dtoUser.next()) {

                UsuariosDto usr = new UsuariosDto();
                usr.setUsuario(dtoUser.getString("usu_usuario"));
                usr.setContraseña(dtoUser.getString("usu_contraseña"));
                usr.setRol(dtoUser.getString("usu_rol"));
                usr.setActividad(dtoUser.getString("usu_actividad"));

                listaUsuarios.add(usr);

            }
            dtoUser.close();
            datosUsuario.close();
            objConexion.cerrarConexion();

        } catch (Exception e) {
        }
        boolean credencialesValidas = false;
        for (UsuariosDto usuario : listaUsuarios) {
            if (txtCorreo.getText().equals(usuario.getUsuario()) && txtPass.getText().equals(usuario.getContraseña())) {
                credencialesValidas = true;
                break;
            }
        }

        if (credencialesValidas) {
            frmMenu objMenu = new frmMenu();
            objMenu.setVisible(true);
            this.dispose(); // Cierra el formulario actual
        } else {
            JOptionPane.showMessageDialog(this, "CREDENCIALES INVALIDAS");
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCooreo;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
