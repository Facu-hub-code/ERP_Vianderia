/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import java.awt.Color;
import BackEnd.ClienteBackEnd;
import Entidad.ClienteEntidad;
import javax.swing.JOptionPane;

/**
 * @company FK-SOFT
 * @author facul
 */
public class GestionClientes extends javax.swing.JFrame {

    /**
     * Constructor: - Creates new form GestionClientes
     */
    public GestionClientes() {
        initComponents();
        initComponentsFacu();
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jt_telefono = new javax.swing.JTextField();
        jt_nombre = new javax.swing.JTextField();
        jt_apellido = new javax.swing.JTextField();
        jt_direccion = new javax.swing.JTextField();
        jt_dni = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();
        jl_unidades1 = new javax.swing.JLabel();
        jl_unidades2 = new javax.swing.JLabel();
        jl_unidades3 = new javax.swing.JLabel();
        jl_unidades4 = new javax.swing.JLabel();
        jl_unidades5 = new javax.swing.JLabel();
        btn_agregar1 = new javax.swing.JButton();
        jl_unidades6 = new javax.swing.JLabel();
        jt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));

        jLabel1.setBackground(new java.awt.Color(49, 28, 28));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 253, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTES");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jt_telefono.setBackground(new java.awt.Color(243, 243, 194));
        jt_telefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_telefonoKeyTyped(evt);
            }
        });

        jt_nombre.setBackground(new java.awt.Color(243, 243, 194));
        jt_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_nombreKeyReleased(evt);
            }
        });

        jt_apellido.setBackground(new java.awt.Color(243, 243, 194));
        jt_apellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_apellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_apellidoKeyReleased(evt);
            }
        });

        jt_direccion.setBackground(new java.awt.Color(243, 243, 194));
        jt_direccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jt_dni.setBackground(new java.awt.Color(243, 243, 194));
        jt_dni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_dni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_dniKeyTyped(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(255, 253, 118));
        btn_agregar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(255, 253, 118));
        btn_eliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(255, 253, 118));
        btn_modificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
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
        jScrollPane1.setViewportView(jtable_clientes);

        jl_unidades1.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades1.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades1.setText("Nombre:");

        jl_unidades2.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades2.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades2.setText("Direccion:");

        jl_unidades3.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades3.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades3.setText("Apellido:");

        jl_unidades4.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades4.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades4.setText("DNI:");

        jl_unidades5.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades5.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades5.setText("Telefono:");

        btn_agregar1.setBackground(new java.awt.Color(255, 253, 118));
        btn_agregar1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_agregar1.setText("Limpiar");
        btn_agregar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar1ActionPerformed(evt);
            }
        });

        jl_unidades6.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades6.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades6.setText("ID:");

        jt_id.setEditable(false);
        jt_id.setBackground(new java.awt.Color(243, 243, 194));
        jt_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_unidades2)
                                    .addComponent(jl_unidades5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_unidades3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_unidades1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_unidades4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_unidades6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(jt_apellido)
                                    .addComponent(jt_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jt_direccion)
                                    .addComponent(jt_dni)
                                    .addComponent(jt_id, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_unidades6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agregar1)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsFacu(){
        this.getContentPane().setBackground(new Color(49, 28, 28));
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private void limpiarCampos(){
        jt_nombre.setText("");
        jt_apellido.setText("");
        jt_dni.setText("");
        jt_direccion.setText("");
        jt_telefono.setText("");
        jt_id.setText("");
        actualizarTabla();
    }
    
    private void filtrarNombre(String valor) {
        jtable_clientes.setModel(ClienteBackEnd.filtrarNombre(valor));
    }

    private void filtrarApellido(String valor) {
        jtable_clientes.setModel(ClienteBackEnd.filtrarApellido(valor));
    }
    
    private boolean checkCampos() {
        return !( jt_nombre.getText().equalsIgnoreCase("") || 
                jt_apellido.getText().equalsIgnoreCase("") || 
                jt_dni.getText().equalsIgnoreCase("") ||
                jt_direccion.getText().equalsIgnoreCase("") ||
                jt_telefono.getText().equalsIgnoreCase("")  ); 
    }

    private void actualizarTabla() {
        jtable_clientes.setModel(ClienteBackEnd.actualizarTabla());
    }

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if(checkCampos()){
            ClienteEntidad cliente = new ClienteEntidad(jt_nombre.getText(), jt_apellido.getText(), Integer.valueOf(jt_dni.getText()),
                    jt_direccion.getText(), Long.valueOf(jt_telefono.getText()));
            if(ClienteBackEnd.agregarCliente(cliente))
                JOptionPane.showMessageDialog(null, "Se agrego el cliente: "+cliente.getNombre()+" " +cliente.getApellido());
            else
                JOptionPane.showMessageDialog(null, "Error al agregar el cliente"+cliente.getNombre()+" " +cliente.getApellido());
            actualizarTabla();
        }else
            JOptionPane.showMessageDialog(null, "Faltan campos de completar");
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (checkCampos()) {
            int row = jtable_clientes.getSelectedRow();
            int id = Integer.valueOf(jtable_clientes.getValueAt(row, 0).toString());
            if(ClienteBackEnd.eliminarCliente(id))
                JOptionPane.showMessageDialog(null, "Se elimino el cliente correctamente el cliente: "
                        +jt_nombre.getText()+ " "+jt_apellido.getText());
            else
                JOptionPane.showMessageDialog(null, "No se pudo eliminar al cliente"
                        +jt_nombre.getText()+ " "+jt_apellido.getText());
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (checkCampos()) {
            int rowSelected = jtable_clientes.getSelectedRow();
            int id = Integer.valueOf(jtable_clientes.getValueAt(rowSelected, 0).toString());
            ClienteEntidad cliente = new ClienteEntidad(jt_nombre.getText(), jt_apellido.getText(),
                     Integer.valueOf(jt_dni.getText()), jt_direccion.getText(), Long.valueOf(jt_telefono.getText()));
            if(ClienteBackEnd.modificarCliente(cliente, id))
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            else
                JOptionPane.showMessageDialog(null, "Error al intentar modificar el cliente");
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jtable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_clientesMouseClicked
        int filaSelec = jtable_clientes.rowAtPoint(evt.getPoint());
        jt_id.setText(jtable_clientes.getValueAt(filaSelec, 0).toString());
        jt_nombre.setText(jtable_clientes.getValueAt(filaSelec, 1).toString());
        jt_apellido.setText(jtable_clientes.getValueAt(filaSelec, 2).toString());
        jt_dni.setText(jtable_clientes.getValueAt(filaSelec, 3).toString());
        jt_direccion.setText(jtable_clientes.getValueAt(filaSelec, 4).toString());
        jt_telefono.setText(jtable_clientes.getValueAt(filaSelec, 5).toString());

    }//GEN-LAST:event_jtable_clientesMouseClicked

    private void jt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyReleased
        this.filtrarNombre(jt_nombre.getText());
    }//GEN-LAST:event_jt_nombreKeyReleased

    private void jt_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_apellidoKeyReleased
        this.filtrarApellido(jt_apellido.getText());
    }//GEN-LAST:event_jt_apellidoKeyReleased

    private void jt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_dniKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_jt_dniKeyTyped

    private void jt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_telefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_jt_telefonoKeyTyped

    private void btn_agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar1ActionPerformed
        limpiarCampos();
        actualizarTabla();
    }//GEN-LAST:event_btn_agregar1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GestionClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_agregar1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_unidades1;
    private javax.swing.JLabel jl_unidades2;
    private javax.swing.JLabel jl_unidades3;
    private javax.swing.JLabel jl_unidades4;
    private javax.swing.JLabel jl_unidades5;
    private javax.swing.JLabel jl_unidades6;
    private javax.swing.JTextField jt_apellido;
    private javax.swing.JTextField jt_direccion;
    private javax.swing.JTextField jt_dni;
    private javax.swing.JTextField jt_id;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_telefono;
    private javax.swing.JTable jtable_clientes;
    // End of variables declaration//GEN-END:variables
}
