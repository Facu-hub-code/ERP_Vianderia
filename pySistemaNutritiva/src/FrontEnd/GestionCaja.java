/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import java.awt.Color;
import BackEnd.MovimientoBackEnd;
import Entidad.MovimientoEntidad;
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
        initComponentsFacu();
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

        jl_titulo = new javax.swing.JLabel();
        jr_ingreso = new javax.swing.JRadioButton();
        jr_efectivo = new javax.swing.JRadioButton();
        jl_Total = new javax.swing.JLabel();
        jl_efectivo = new javax.swing.JLabel();
        jt_monto = new javax.swing.JTextField();
        jt_especificacion = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane_caja = new javax.swing.JScrollPane();
        jtable_caja = new javax.swing.JTable();
        jl_unidades1 = new javax.swing.JLabel();
        jl_unidades2 = new javax.swing.JLabel();
        jl_unidades3 = new javax.swing.JLabel();
        jl_unidades4 = new javax.swing.JLabel();
        jl_unidades5 = new javax.swing.JLabel();
        jl_unidades6 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_borrarRegistros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Caja");
        setBackground(new java.awt.Color(49, 28, 28));
        setResizable(false);

        jl_titulo.setBackground(new java.awt.Color(49, 28, 28));
        jl_titulo.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 253, 118));
        jl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_titulo.setText("CAJA");
        jl_titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jr_ingreso.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jr_ingreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jr_efectivo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jr_efectivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_Total.setBackground(new java.awt.Color(243, 243, 194));
        jl_Total.setForeground(new java.awt.Color(243, 243, 194));

        jl_efectivo.setBackground(new java.awt.Color(243, 243, 194));
        jl_efectivo.setForeground(new java.awt.Color(243, 243, 194));

        jt_monto.setBackground(new java.awt.Color(243, 243, 194));
        jt_monto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_monto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_montoKeyTyped(evt);
            }
        });

        jt_especificacion.setBackground(new java.awt.Color(243, 243, 194));
        jt_especificacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_especificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_especificacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        btn_agregar.setBackground(new java.awt.Color(255, 253, 118));
        btn_agregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(255, 253, 118));
        btn_eliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
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
        jScrollPane_caja.setViewportView(jtable_caja);

        jl_unidades1.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_unidades1.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades1.setText("Ingreso:");

        jl_unidades2.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_unidades2.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades2.setText("Monto:");

        jl_unidades3.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_unidades3.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades3.setText("Especificacion:");

        jl_unidades4.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_unidades4.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades4.setText("Efectivo:");

        jl_unidades5.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_unidades5.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades5.setText("Efectivo:");

        jl_unidades6.setBackground(new java.awt.Color(243, 243, 194));
        jl_unidades6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_unidades6.setForeground(new java.awt.Color(243, 243, 194));
        jl_unidades6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_unidades6.setText("Total:");

        btn_limpiar.setBackground(new java.awt.Color(255, 253, 118));
        btn_limpiar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_borrarRegistros.setBackground(new java.awt.Color(255, 253, 118));
        btn_borrarRegistros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_borrarRegistros.setText("Borrar registros de caja");
        btn_borrarRegistros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_borrarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarRegistrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jl_unidades4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_titulo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jl_unidades2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jl_unidades3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jl_unidades1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jl_unidades5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jl_unidades6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jr_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(jr_efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_Total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jt_monto)
                                .addComponent(jt_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_caja, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_borrarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_unidades3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jr_ingreso)
                            .addComponent(jl_unidades1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jr_efectivo)
                            .addComponent(jl_unidades5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_unidades6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_unidades4)
                            .addComponent(jl_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_limpiar)
                            .addComponent(btn_borrarRegistros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_caja, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsFacu(){        
        this.getContentPane().setBackground(new Color(49,28,28));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Caja");
    }
    
    private boolean checkCampos(){
        return !(jt_monto.getText().equalsIgnoreCase(""));
    }
    
    private void calcularSaldos(){
        jl_Total.setText(MovimientoBackEnd.calcularTotal() + " $");
        jl_efectivo.setText(MovimientoBackEnd.calcularEfectivo() + " $");   
    }
    
    private void limpiarCampos(){
        jt_monto.setText("");
        jt_especificacion.setText("");
        jr_ingreso.setSelected(false);
        jr_efectivo.setSelected(false);
    }
    
    //Metodo que actualiza los valores de la tabla segun la base de datos
    private void actualizarTabla(){
        jtable_caja.setModel(MovimientoBackEnd.actualizarTabla());
        calcularSaldos();
    }
    
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if(checkCampos()){
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            MovimientoEntidad movimiento = new MovimientoEntidad(Float.valueOf(jt_monto.getText()),jt_especificacion.getText(), 
                jr_ingreso.isSelected(), jr_efectivo.isSelected(), simpleDateFormat.format(date));
            if(MovimientoBackEnd.agregarMovimiento(movimiento))
                JOptionPane.showMessageDialog(null, "Movimiento agregado con exito");
            else
                JOptionPane.showMessageDialog(null, "Error: al intentar agregar el movimiento");
            actualizarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "El monto es un campo obligatorio.");   
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (checkCampos()) {
            int row = jtable_caja.getSelectedRow(); 
            int id = Integer.valueOf(jtable_caja.getValueAt(row, 0).toString());
            if(MovimientoBackEnd.eliminarMovimiento(id))
                JOptionPane.showMessageDialog(null, "Venta eliminada con exito");
            else
                JOptionPane.showMessageDialog(null, "Error: al intentar eliminar la venta");
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "El monto es un campo obligatorio");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (checkCampos()) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            MovimientoEntidad movimiento = new MovimientoEntidad(Float.valueOf(jt_monto.getText()),
                    jt_especificacion.getText(), jr_ingreso.isSelected()
                    ,jr_efectivo.isSelected(), simpleDateFormat.format(date));
            int row = jtable_caja.getSelectedRow();
            int id = Integer.valueOf(jtable_caja.getValueAt(row, 0).toString());
            
            if(MovimientoBackEnd.modificarMovimiento(movimiento, id))
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            else
                JOptionPane.showMessageDialog(null, "Error: al intentar modificar el movimiento seleccionado");
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "El monto es un campo obligatorio");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jtable_cajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_cajaMouseClicked
        int filaSelec = jtable_caja.rowAtPoint(evt.getPoint());
        jt_monto.setText(jtable_caja.getValueAt(filaSelec, 1).toString());
        jt_especificacion.setText(jtable_caja.getValueAt(filaSelec, 2).toString());
        jr_ingreso.setSelected(jtable_caja.getValueAt(filaSelec, 3).toString().equals("Ingreso"));
        jr_efectivo.setSelected(jtable_caja.getValueAt(filaSelec, 4).toString().equals("Efectivo"));
    }//GEN-LAST:event_jtable_cajaMouseClicked

    private void jt_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_montoKeyTyped
        char c = evt.getKeyChar();
        if ( (c != '.') && (c < '0' || c > '9'))
            evt.consume();
    }//GEN-LAST:event_jt_montoKeyTyped

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_borrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarRegistrosActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Confirmar");
        if (result == JOptionPane.YES_OPTION) {
            if(MovimientoBackEnd.eliminarRegistros())
                JOptionPane.showMessageDialog(null, "Se borraron los registros hasta la fecha");
        }
        actualizarTabla();
    }//GEN-LAST:event_btn_borrarRegistrosActionPerformed

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
    private javax.swing.JButton btn_borrarRegistros;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JScrollPane jScrollPane_caja;
    private javax.swing.JLabel jl_Total;
    private javax.swing.JLabel jl_efectivo;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_unidades1;
    private javax.swing.JLabel jl_unidades2;
    private javax.swing.JLabel jl_unidades3;
    private javax.swing.JLabel jl_unidades4;
    private javax.swing.JLabel jl_unidades5;
    private javax.swing.JLabel jl_unidades6;
    private javax.swing.JRadioButton jr_efectivo;
    private javax.swing.JRadioButton jr_ingreso;
    private javax.swing.JTextField jt_especificacion;
    private javax.swing.JTextField jt_monto;
    private javax.swing.JTable jtable_caja;
    // End of variables declaration//GEN-END:variables
}
