/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexion.Conexion;
import Logica.Cliente;
import Logica.Movimiento;
import Logica.Vianda;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
        actualizarTabla();
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
        jt_monto.setBorder(javax.swing.BorderFactory.createBevelBorder(null, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_monto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_montoMouseClicked(evt);
            }
        });

        jt_especificacion.setBackground(new java.awt.Color(243, 243, 194));
        jt_especificacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jt_especificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_especificacion.setText("Especificacion:");
        jt_especificacion.setBorder(javax.swing.BorderFactory.createBevelBorder(null, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_especificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_especificacionMouseClicked(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(255, 253, 118));
        btn_agregar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(null, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(255, 253, 118));
        btn_eliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(null, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(255, 253, 118));
        btn_modificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createBevelBorder(null, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
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
        jScrollPane1.setViewportView(jtable_caja);

        jr_ingreso.setText("Ingreso");

        jr_efectivo.setText("Efectivo");

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jt_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jr_ingreso)
                                .addComponent(jr_efectivo))))
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
        jr_ingreso.setSelected(false);//todo: revisar
    }
    //Metodo que chequea que ningun campo de texto este vacio.
    private boolean checkCampos(){
        boolean flag = (jt_monto.getText().equalsIgnoreCase("") ||
                jt_especificacion.getText().equalsIgnoreCase("") );
        return flag;
    }
    
    //Metodo que actualiza los valores de la tabla segun la base de datos
    private void actualizarTabla(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Monto");
        tabla.addColumn("Especificacion");
        tabla.addColumn("Ingreso/Egreso");
        tabla.addColumn("Efectivo/Banco");
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
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }else{
            Movimiento movimiento = new Movimiento(Double.valueOf(jt_monto.getText()), jt_especificacion.getText()
            , jr_ingreso.isSelected(), jr_efectivo.isSelected());
            Movimiento.agregarMovimiento(movimiento);
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if(checkCampos()){
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }else{
            Movimiento movimiento = new Movimiento();
            int filaSelec = jtable_caja.getSelectedRow(); 
            Movimiento.eliminarMovimiento(movimiento, filaSelec);
           
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (checkCampos()) {
            JOptionPane.showMessageDialog(null, "Puede que falte completar algun campo");
        }else{
            Movimiento movimiento = new Movimiento(Double.valueOf(jt_monto.getText()), jt_especificacion.getText()
            , jr_ingreso.isSelected(), jr_efectivo.isSelected());
            int filaSelec = jtable_caja.getSelectedRow(); 
            Movimiento.modificarMovimiento(movimiento, filaSelec);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

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
