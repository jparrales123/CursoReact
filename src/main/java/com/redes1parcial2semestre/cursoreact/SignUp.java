/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redes1parcial2semestre.cursoreact;


import com.redes.conexion.Conexion;
import com.redes.verificacion.Imagenes;
import com.redes.verificacion.Verificacion;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author JIMAZO
 */

public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    String imagenPath;
    public SignUp() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public ImageIcon redimensionPicture(String imagenPath){
        ImageIcon imagen=new ImageIcon(imagenPath);
        Image imagenRedimension=imagen.getImage().getScaledInstance(jBImagen.getWidth(), jBImagen.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinal=new ImageIcon(imagenRedimension);
        return imagenFinal;
        
    }
    public boolean verificarDatos(){
        boolean bandera=true;
        if(jBNombre.getText().equals("") || jBApellido.getText().equals("") || jBUsuario.getText().equals("")
                || jBContrasena.getText().equals("") || jBConfContrasena.getText().equals("")){
            JOptionPane.showMessageDialog(null, "CAMPOS IMCOMPLETOS");
            bandera=false;
        }else if(!jBContrasena.getText().equals(jBConfContrasena.getText())){
            JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO COINCIDEN");
            bandera=false;
        }else if (imagenPath == null){
            JOptionPane.showMessageDialog(null, "SUBIR UNA IMAGEN");
            bandera=false;
        }
        return bandera;
    }
    public boolean usuarioExiste (){
        boolean bandera=false;
        Conexion conexion=new Conexion();
        try {
            Connection conn=conexion.getConnection();
            PreparedStatement stmt=conn.prepareStatement("SELECT * FROM usuarios WHERE usuario=?");
            stmt.setString(1,jBUsuario.getText());
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                bandera=true;
            }else{
                bandera=false;

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return bandera;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jNombre = new javax.swing.JLabel();
        jApellido = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jBApellido = new javax.swing.JTextPane();
        jBCancelar = new javax.swing.JButton();
        ver = new javax.swing.JCheckBox();
        JBBuscar = new javax.swing.JButton();
        jIniciarSesión = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jBNombre = new javax.swing.JTextPane();
        jUsuarioR = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jBUsuario = new javax.swing.JTextPane();
        jContraseña2 = new javax.swing.JLabel();
        jConfirmarContraseña = new javax.swing.JLabel();
        jBImagen = new javax.swing.JLabel();
        jUsuarioR1 = new javax.swing.JLabel();
        jBContrasena = new javax.swing.JPasswordField();
        jBConfContrasena = new javax.swing.JPasswordField();
        jRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(253, 227, 167));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(8, 14, 44));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 14, 44));
        jLabel1.setText("Registrarse");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 18, 270, 50));

        minimizar.setText("-");
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        jPanel2.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 0, 11, -1));

        Cerrar.setText("x");
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel2.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 540, -1));

        jPanel3.setBackground(new java.awt.Color(108, 122, 137));
        jPanel3.setForeground(new java.awt.Color(8, 14, 44));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jNombre.setText("Nombre:");
        jPanel3.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jApellido.setText("Apellido:");
        jPanel3.add(jApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 20));

        jBApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBApellidoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jBApellido);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 149, -1));

        jBCancelar.setBackground(new java.awt.Color(0, 0, 0));
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 100, -1));

        ver.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        ver.setText("Ver");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel3.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 60, 20));

        JBBuscar.setBackground(new java.awt.Color(247, 210, 130));
        JBBuscar.setForeground(new java.awt.Color(0, 0, 0));
        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(JBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 90, 30));

        jIniciarSesión.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jIniciarSesión.setForeground(new java.awt.Color(255, 255, 255));
        jIniciarSesión.setText("¿Ya está registrado? Iniciar sesión aquí");
        jIniciarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jIniciarSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIniciarSesiónMouseClicked(evt);
            }
        });
        jPanel3.add(jIniciarSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 260, 20));

        jBNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBNombreKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jBNombre);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 149, -1));

        jUsuarioR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jUsuarioR.setText("Imagen:");
        jPanel3.add(jUsuarioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 20));

        jBUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBUsuarioKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(jBUsuario);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 149, -1));

        jContraseña2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jContraseña2.setText("Contraseña:");
        jPanel3.add(jContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 20));

        jConfirmarContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jConfirmarContraseña.setText("Confirmar Contraseña:");
        jPanel3.add(jConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jBImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jBImagen.setOpaque(true);
        jPanel3.add(jBImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 150, 130));

        jUsuarioR1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jUsuarioR1.setText("Usuario:");
        jPanel3.add(jUsuarioR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jBContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContrasenaActionPerformed(evt);
            }
        });
        jPanel3.add(jBContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 149, 30));

        jBConfContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfContrasenaActionPerformed(evt);
            }
        });
        jPanel3.add(jBConfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 149, 30));

        jRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        jRegistrar.setText("Registrar");
        jRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(jRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 540, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked

        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // ODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
        if(ver.isSelected() ){
            jBContrasena.setEchoChar ((char)0);
        }else{
            jBContrasena.setEchoChar (('*'));
        }
        if(ver.isSelected() ){
            jBConfContrasena.setEchoChar ((char)0);
        }else{
            jBConfContrasena.setEchoChar (('*'));
        }
    }//GEN-LAST:event_verActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        // TODO add your handling code here:
        Imagenes img=new Imagenes();
        imagenPath=img.buscarImagen(jBImagen);
        
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void jIniciarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIniciarSesiónMouseClicked
        // TODO add your handling code here:
        SignupForm login=new SignupForm();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jIniciarSesiónMouseClicked

    private void jBContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContrasenaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jBContrasenaActionPerformed

    private void jBConfContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBConfContrasenaActionPerformed

    private void jRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrarActionPerformed
        // TODO add your handling code here:
        
        if(verificarDatos()==true){
            Conexion conexion=new Conexion();
            try {
                Connection conn=conexion.getConnection();
                PreparedStatement stmt=conn.prepareStatement("INSERT INTO usuarios(nombre, apellido, usuario, contraseña, imagen) VALUES (?,?,?,SHA1(?),?)");
                stmt.setString(1, jBNombre.getText());
                stmt.setString(2, jBApellido.getText());
                stmt.setString(3, jBUsuario.getText());
                stmt.setString(4, jBContrasena.getText());
                
                InputStream img=new FileInputStream(new File(imagenPath));
                stmt.setBlob(5, img);
                if (usuarioExiste()==true){
                    JOptionPane.showMessageDialog(null, "Usuario ya existe - Prueba con otro ");
                }else{
                    if(stmt.executeUpdate()!=0) {
                        JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                    }else{
                        JOptionPane.showMessageDialog(null, "ERROR NO SE PUDO REGISTRAR");
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            }
        }    
    }//GEN-LAST:event_jRegistrarActionPerformed

    private void jBNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNombreKeyTyped
        // TODO add your handling code here:
        Verificacion vrf=new Verificacion();
        vrf.validarLetras(evt);
        
    }//GEN-LAST:event_jBNombreKeyTyped

    private void jBApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBApellidoKeyTyped
        // TODO add your handling code here:
        Verificacion vrf=new Verificacion();
        vrf.validarLetras(evt);
    }//GEN-LAST:event_jBApellidoKeyTyped

    private void jBUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBUsuarioKeyTyped
        // TODO add your handling code here:
        Verificacion vrf=new Verificacion();
        vrf.validarLetrasNumeros(evt);
    }//GEN-LAST:event_jBUsuarioKeyTyped

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton JBBuscar;
    private javax.swing.JLabel jApellido;
    private javax.swing.JTextPane jBApellido;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JPasswordField jBConfContrasena;
    private javax.swing.JPasswordField jBContrasena;
    private javax.swing.JLabel jBImagen;
    private javax.swing.JTextPane jBNombre;
    private javax.swing.JTextPane jBUsuario;
    private javax.swing.JLabel jConfirmarContraseña;
    private javax.swing.JLabel jContraseña2;
    private javax.swing.JLabel jIniciarSesión;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jRegistrar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jUsuarioR;
    private javax.swing.JLabel jUsuarioR1;
    private javax.swing.JLabel minimizar;
    private javax.swing.JCheckBox ver;
    // End of variables declaration//GEN-END:variables
}
