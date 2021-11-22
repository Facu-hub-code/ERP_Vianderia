/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import java.awt.Color;
import BackEnd.ViandaBackEnd;
import Entidad.ViandaEntidad;
import javax.swing.JOptionPane;

/**
 *
 * @author facul
 */
public class ViandasJF extends javax.swing.JFrame {

    /**
     * Constructor: - Creates new form GestionClientes
     */
    public ViandasJF() {
        initComponents();
        this.getContentPane().setBackground(new Color(49,28,28));
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
        jt_dias = new javax.swing.JTextField();
        jt_nombre = new javax.swing.JTextField();
        jt_precio = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_viandas = new javax.swing.JTable();
        jl_unidades1 = new javax.swing.JLabel();
        jl_unidades2 = new javax.swing.JLabel();
        jl_unidades3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));

        jLabel1.setBackground(new java.awt.Color(49, 28, 28));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 253, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIANDAS");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jt_dias.setBackground(new java.awt.Color(243, 243, 194));
        jt_dias.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_dias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_dias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jt_nombre.setBackground(new java.awt.Color(243, 243, 194));
        jt_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_nombreKeyReleased(evt);
            }
        });

        jt_precio.setBackground(new java.awt.Color(243, 243, 194));
        jt_precio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_precio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_precioKeyTyped(evt);
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

        jtable_viandas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtable_viandas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_viandasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_viandas);

        jl_unidades1.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades1.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades1.setText("Nombre:");

        jl_unidades2.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades2.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades2.setText("Dias:");

        jl_unidades3.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_unidades3.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades3.setText("Precio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_unidades1)
                                    .addComponent(jl_unidades3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_unidades2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_dias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(jt_precio, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jt_nombre, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarNombre(String nombre){
        jtable_viandas.setModel(ViandaBackEnd.filtrarNombre(nombre));
    }

    //Metodo que chequea que ningun campo de texto este vacio.
    private boolean checkCampos(){
        return !(jt_nombre.getText().equalsIgnoreCase("") || 
                jt_precio.getText().equalsIgnoreCase("") ||
                jt_dias.getText().equalsIgnoreCase(""));
    }
    
    
    //Metodo que actualiza los valores de la tabla segun la base de datos
    private void actualizarTabla(){
        jtable_viandas.setModel(ViandaBackEnd.actualizarTabla());
    }
    
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if(checkCampos()){
            ViandaEntidad vianda = new ViandaEntidad(jt_nombre.getText(), Float.valueOf(jt_precio.getText()), jt_dias.getText());
            ViandaBackEnd.agregarVianda(vianda);
            actualizarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "Faltan campos de completar");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (checkCampos()) {
            int row = jtable_viandas.getSelectedRow();
            int id = Integer.valueOf(jtable_viandas.getValueAt(row, 0).toString());
            ViandaBackEnd.eliminarVianda(id);
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (checkCampos()) {
            ViandaEntidad vianda = new ViandaEntidad(jt_nombre.getText(), Float.valueOf(jt_precio.getText()), jt_dias.getText());
            int row = jtable_viandas.getSelectedRow();
            int id = Integer.valueOf(jtable_viandas.getValueAt(row, 0).toString());
            ViandaBackEnd.modificarVianda(vianda, id);
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jtable_viandasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_viandasMouseClicked
        int filaSelec = jtable_viandas.rowAtPoint(evt.getPoint());
        jt_nombre.setText(jtable_viandas.getValueAt(filaSelec, 1).toString());
        jt_precio.setText(jtable_viandas.getValueAt(filaSelec, 2).toString() + "$");
        jt_dias.setText(jtable_viandas.getValueAt(filaSelec, 3).toString());
    }//GEN-LAST:event_jtable_viandasMouseClicked

    private void jt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_precioKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_jt_precioKeyTyped

    private void jt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyReleased
        this.filtrarNombre(jt_nombre.getText());
    }//GEN-LAST:event_jt_nombreKeyReleased

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
            java.util.logging.Logger.getLogger(ViandasJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViandasJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViandasJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViandasJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViandasJF().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_unidades1;
    private javax.swing.JLabel jl_unidades2;
    private javax.swing.JLabel jl_unidades3;
    private javax.swing.JTextField jt_dias;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_precio;
    private javax.swing.JTable jtable_viandas;
    // End of variables declaration//GEN-END:variables
}
