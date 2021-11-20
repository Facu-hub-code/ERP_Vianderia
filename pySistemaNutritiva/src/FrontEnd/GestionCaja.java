/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Cliente;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import BackEnd.Movimiento;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author facul
 */
public class GestionCaja extends javax.swing.JFrame {
    /**
     * Constructor: - Creates new form GestionClientes
     */
    public GestionCaja() {
        initComponents();
        this.getContentPane().setBackground(new Color(49,28,28));
        actualizar();
        calcularSaldos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jt_monto = new javax.swing.JTextField();
        jt_especificacion = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_caja = new javax.swing.JTable();
        jr_ingreso = new javax.swing.JRadioButton();
        jr_efectivo = new javax.swing.JRadioButton();
        jl_Total = new javax.swing.JLabel();
        jl_efectivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));

        jLabel1.setBackground(new java.awt.Color(49, 28, 28));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 253, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAJA");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jt_monto.setBackground(new java.awt.Color(243, 243, 194));
        jt_monto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_monto.setText("Monto:");
        jt_monto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_monto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_montoMouseClicked(evt);
            }
        });
        jt_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_montoKeyTyped(evt);
            }
        });

        jt_especificacion.setBackground(new java.awt.Color(243, 243, 194));
        jt_especificacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_especificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_especificacion.setText("Especificacion:");
        jt_especificacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_especificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_especificacionMouseClicked(evt);
            }
        });
        jt_especificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_especificacionKeyReleased(evt);
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

        jtable_caja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtable_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_cajaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_caja);

        jr_ingreso.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jr_ingreso.setText("Ingreso");
        jr_ingreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jr_efectivo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jr_efectivo.setText("Efectivo");
        jr_efectivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_Total.setText("Total:");

        jl_efectivo.setText("Efectivo: ");

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jt_monto, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(jt_especificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(jr_efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jr_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jt_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jr_ingreso)
                        .addGap(18, 18, 18)
                        .addComponent(jr_efectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void calcularSaldos(){
        jl_Total.setText("Total: " + Movimiento.calcularTotal() + " $");
        jl_efectivo.setText("Efectivo: " + Movimiento.calcularEfectivo() + " $");   
    }
    
    //Metodo que limpia los valores de los campos de texto
    private void limpiarCampos(){
        jt_monto.setText("Monto:");
        jt_especificacion.setText("Especificacion");
        jr_efectivo.setSelected(false);
        jr_ingreso.setSelected(false); //todo: revisar
    }
    //Metodo que chequea que ningun campo de texto este vacio.
    private boolean checkCampos(){
        return !(jt_monto.getText().equalsIgnoreCase("") );
    }
    
    //Metodo que actualiza los valores de la tabla segun la base de datos
    private void actualizar(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Monto");
        tabla.addColumn("Especificacion");
        tabla.addColumn("Ingreso/Egreso");
        tabla.addColumn("Efectivo/Banco");
        tabla.addColumn("Fecha");
        jtable_caja.setModel(tabla);
        jtable_caja.setModel(Movimiento.actualizarTabla(tabla));
    }
    
    private void jt_montoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_montoMouseClicked
        jt_monto.setText("");
    }//GEN-LAST:event_jt_montoMouseClicked

    private void jt_especificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_especificacionMouseClicked
        jt_especificacion.setText("");
    }//GEN-LAST:event_jt_especificacionMouseClicked

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if(checkCampos()){
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");     
            Movimiento movimiento; 
            movimiento = new Movimiento(Float.valueOf(jt_monto.getText()),jt_especificacion.getText(), 
                    simpleDateFormat.format(date), jr_ingreso.isSelected(), jr_efectivo.isSelected());
            Movimiento.agregarMovimiento(movimiento);
            actualizar();
        }else{
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");   
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (checkCampos()) {
            int row = jtable_caja.getSelectedRow(); 
            int id = Integer.valueOf(jtable_caja.getValueAt(row, 0).toString());
            Movimiento.eliminarMovimiento(id);
            actualizar();
        } else {
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (checkCampos()) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Movimiento movimiento = new Movimiento(Float.valueOf(jt_monto.getText()),
                    jt_especificacion.getText(), simpleDateFormat.format(date), jr_ingreso.isSelected()
                    ,jr_efectivo.isSelected());
            int row = jtable_caja.getSelectedRow();
            int id = Integer.valueOf(jtable_caja.getValueAt(row, 0).toString());
            Movimiento.modificarMovimiento(movimiento, id);
            actualizar();
        } else {
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jtable_cajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_cajaMouseClicked
        int filaSelec = jtable_caja.rowAtPoint(evt.getPoint());
        jt_monto.setText(jtable_caja.getValueAt(filaSelec, 1).toString());
        jt_especificacion.setText(jtable_caja.getValueAt(filaSelec, 2).toString());
        jr_ingreso.setSelected(jtable_caja.getValueAt(filaSelec, 3).toString().equals("Ingreso"));
        jr_efectivo.setSelected(jtable_caja.getValueAt(filaSelec, 4).toString().equals("Efectivo"));
    }//GEN-LAST:event_jtable_cajaMouseClicked

    private void jt_especificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_especificacionKeyReleased
        //this.filtrarEspecificacion(jt_especificacion.getText());
        
    }//GEN-LAST:event_jt_especificacionKeyReleased

    private void jt_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_montoKeyTyped
        char c = evt.getKeyChar();
        if ( (c != '.') && (c < '0' || c > '9'))
            evt.consume();
    }//GEN-LAST:event_jt_montoKeyTyped

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
            java.util.logging.Logger.getLogger(GestionCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GestionCaja().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_Total;
    private javax.swing.JLabel jl_efectivo;
    private javax.swing.JRadioButton jr_efectivo;
    private javax.swing.JRadioButton jr_ingreso;
    private javax.swing.JTextField jt_especificacion;
    private javax.swing.JTextField jt_monto;
    private javax.swing.JTable jtable_caja;
    // End of variables declaration//GEN-END:variables
}
