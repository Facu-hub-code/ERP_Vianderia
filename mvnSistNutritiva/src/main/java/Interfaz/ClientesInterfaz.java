/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;

/**
 * @company FK-SOFT
 * @author facul
 */
public class ClientesInterfaz extends javax.swing.JFrame {

    public ClientesInterfaz() {
        initComponents();
        initComponentsFacu();
        setVisible(true);
        actualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_titulo = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jl_apellido = new javax.swing.JLabel();
        jl_dni = new javax.swing.JLabel();
        jl_mail = new javax.swing.JLabel();
        jl_telefono = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_apellido = new javax.swing.JTextField();
        jt_telefono = new javax.swing.JTextField();
        jt_email = new javax.swing.JTextField();
        jt_dni = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jscrollpane_general = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));
        setResizable(false);

        jl_titulo.setBackground(new java.awt.Color(49, 28, 28));
        jl_titulo.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 253, 118));
        jl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_titulo.setText("CLIENTES");
        jl_titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_nombre.setBackground(new java.awt.Color(49, 28, 28));
        jl_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(255, 253, 118));
        jl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_nombre.setText("NOMBRE");
        jl_nombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_apellido.setBackground(new java.awt.Color(49, 28, 28));
        jl_apellido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_apellido.setForeground(new java.awt.Color(255, 253, 118));
        jl_apellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_apellido.setText("APELLIDO");
        jl_apellido.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_dni.setBackground(new java.awt.Color(49, 28, 28));
        jl_dni.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_dni.setForeground(new java.awt.Color(255, 253, 118));
        jl_dni.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_dni.setText("DNI");
        jl_dni.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_mail.setBackground(new java.awt.Color(49, 28, 28));
        jl_mail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_mail.setForeground(new java.awt.Color(255, 253, 118));
        jl_mail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_mail.setText("MAIL");
        jl_mail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_telefono.setBackground(new java.awt.Color(49, 28, 28));
        jl_telefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_telefono.setForeground(new java.awt.Color(255, 253, 118));
        jl_telefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_telefono.setText("TELEFONO");
        jl_telefono.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jt_nombre.setBackground(new java.awt.Color(243, 243, 194));
        jt_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorNombre(evt);
            }
        });

        jt_apellido.setBackground(new java.awt.Color(243, 243, 194));
        jt_apellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_apellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jt_telefono.setBackground(new java.awt.Color(243, 243, 194));
        jt_telefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jt_email.setBackground(new java.awt.Color(243, 243, 194));
        jt_email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jt_dni.setBackground(new java.awt.Color(243, 243, 194));
        jt_dni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_dni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        btn_agregar.setBackground(new java.awt.Color(255, 253, 118));
        btn_agregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(255, 253, 118));
        btn_modificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtable_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_clientesMouseClicked(evt);
            }
        });
        jscrollpane_general.setViewportView(jtable_clientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_dni)
                            .addComponent(jt_apellido)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_email)
                            .addComponent(jt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jscrollpane_general, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar))
                    .addComponent(jscrollpane_general, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsFacu(){ //todo: revisar
        getContentPane().setBackground(new Color(49, 28, 28));
        setLocationRelativeTo(null);
        setTitle("Gestion de clientes");       
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        //Todo: implementar
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        //Todo: implementar
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jtable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_clientesMouseClicked
        int filaSelec = jtable_clientes.rowAtPoint(evt.getPoint());
        jt_nombre.setText(jtable_clientes.getValueAt(filaSelec, 1).toString());
        jt_apellido.setText(jtable_clientes.getValueAt(filaSelec, 2).toString());
        jt_telefono.setText(jtable_clientes.getValueAt(filaSelec, 3).toString());
        jt_email.setText(jtable_clientes.getValueAt(filaSelec, 4).toString());
        jt_dni.setText(jtable_clientes.getValueAt(filaSelec, 5).toString()); //Todo: revisar filas
    }//GEN-LAST:event_jtable_clientesMouseClicked

    private void buscadorNombre(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorNombre
        //Todo: buscar metodo addFilter
    }//GEN-LAST:event_buscadorNombre

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jl_apellido;
    private javax.swing.JLabel jl_dni;
    private javax.swing.JLabel jl_mail;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_telefono;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JScrollPane jscrollpane_general;
    private javax.swing.JTextField jt_apellido;
    private javax.swing.JTextField jt_dni;
    private javax.swing.JTextField jt_email;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_telefono;
    private javax.swing.JTable jtable_clientes;
    // End of variables declaration//GEN-END:variables

    private void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
