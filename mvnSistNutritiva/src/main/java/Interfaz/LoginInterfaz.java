package Interfaz;

import Logica.LoginLogica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author facul
 */
public class LoginInterfaz extends javax.swing.JFrame {

    public LoginInterfaz() {
        initComponents();
        initFacuComponents();
        setVisible(true);
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
        jl_user = new javax.swing.JLabel();
        jl_pass = new javax.swing.JLabel();
        jt_usuario = new javax.swing.JTextField();
        jt_pass = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        img_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        img_login.setAlignmentX(12.0F);
        img_login.setAlignmentY(196.0F);

        jl_user.setBackground(new java.awt.Color(49, 28, 28));
        jl_user.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_user.setForeground(new java.awt.Color(255, 253, 118));
        jl_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_user.setText("USUARIO");
        jl_user.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_pass.setBackground(new java.awt.Color(49, 28, 28));
        jl_pass.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_pass.setForeground(new java.awt.Color(255, 253, 118));
        jl_pass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_pass.setText("CONTRASE�A");
        jl_pass.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jt_usuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_usuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jt_pass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        btn_ingresar.setBackground(new java.awt.Color(255, 253, 118));
        btn_ingresar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(img_login, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jt_pass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jl_pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jt_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(img_login, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btn_ingresar)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String user = jt_usuario.getText(), password = jt_pass.getText();
        boolean acceso = LoginLogica.validarIngreso(user, password);
        if (acceso){
            SistemaPrincipalInterfaz sistemaPrincipal = new SistemaPrincipalInterfaz();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales de acceso incorrecta.\n"
                    + "Por favor vuelva a intentar");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    /*
    Funcion para terminar detalles del FrontEnd.
    */
    private void initFacuComponents() {

        this.setLocationRelativeTo(null);
        Color bkgnd_frame = new Color(49, 28, 28);
        Color bkgnd_text_field = new Color(229, 229, 229);
        Color yellow_nutritiva = new Color(255, 253, 118);
        Dimension text_field = new Dimension(294, 48);

        this.setPreferredSize(new Dimension(1024, 768));
        this.getContentPane().setBackground(bkgnd_frame);

        //this.setLocation(null);
        this.setResizable(false);
        this.setTitle("Login");

        jt_usuario.setPreferredSize(text_field);
        jt_usuario.setBackground(bkgnd_text_field);
        btn_ingresar.setBackground(yellow_nutritiva);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel img_login;
    private javax.swing.JLabel jl_pass;
    private javax.swing.JLabel jl_user;
    private javax.swing.JPasswordField jt_pass;
    private javax.swing.JTextField jt_usuario;
    // End of variables declaration//GEN-END:variables
}