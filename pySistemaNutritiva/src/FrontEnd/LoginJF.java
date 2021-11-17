/*
 * todo: Hacer el borde circular a la imagen del logo del login + todos sus 
 * detalles
 */
package FrontEnd;

import BackEnd.Login;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author facul
 */
public class LoginJF extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginJF() {
        initComponents();
        initFacuComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_login = new javax.swing.JLabel();
        jt_usuario = new javax.swing.JTextField();
        jt_pass = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        img_logo_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        img_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Login.png"))); // NOI18N
        img_login.setAlignmentX(12.0F);
        img_login.setAlignmentY(196.0F);

        jt_usuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_usuario.setText("Usuario");
        jt_usuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_usuarioMouseClicked(evt);
            }
        });

        jt_pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_pass.setText("Contraseña");
        jt_pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_passMouseClicked(evt);
            }
        });
        jt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_passKeyPressed(evt);
            }
        });

        btn_ingresar.setBackground(new java.awt.Color(255, 253, 118));
        btn_ingresar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        img_logo_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo_login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(img_login, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(img_logo_icon)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(img_logo_icon)
                .addGap(59, 59, 59)
                .addComponent(jt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(img_login, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_passMouseClicked
        jt_pass.setText("");
    }//GEN-LAST:event_jt_passMouseClicked

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        System.out.println(jt_pass.getText());
        if (Login.validar(jt_usuario.getText(), jt_pass.getText())) {
            SistemaPrincipal sistemaPrincipal = new SistemaPrincipal();
            sistemaPrincipal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales de acceso incorrecta."
                    + "Por favor vuelva a intentar");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void jt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_passKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Login.validar(jt_usuario.getText(), jt_pass.getText())) {
                SistemaPrincipal sistemaPrincipal = new SistemaPrincipal();
                sistemaPrincipal.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales de acceso incorrecta."
                        + "Por favor vuelva a intentar");
            }
        }
    }//GEN-LAST:event_jt_passKeyPressed

    private void jt_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_usuarioMouseClicked
        jt_usuario.setText("");
    }//GEN-LAST:event_jt_usuarioMouseClicked

    private void initFacuComponents() {

        Color bkgnd_frame = new Color(49, 28, 28);
        Color bkgnd_text_field = new Color(229, 229, 229);
        Color yellow_nutritiva = new Color(255, 253, 118);
        Dimension text_field = new Dimension(294, 48);

        this.setPreferredSize(new Dimension(1024, 768));
        this.getContentPane().setBackground(bkgnd_frame);

        //this.setLocation(null);
        this.setResizable(false);
        this.setTitle("Acceso al Sistema Nutritiva");

        jt_usuario.setPreferredSize(text_field);
        jt_usuario.setBackground(bkgnd_text_field);
        btn_ingresar.setBackground(yellow_nutritiva); //Todo: poner el boton amarillo

    }

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
            java.util.logging.Logger.getLogger(LoginJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginJF().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel img_login;
    private javax.swing.JLabel img_logo_icon;
    private javax.swing.JPasswordField jt_pass;
    private javax.swing.JTextField jt_usuario;
    // End of variables declaration//GEN-END:variables
}
