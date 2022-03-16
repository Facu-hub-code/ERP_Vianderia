/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Entidad.CierreCajaEntidad;
import Entidad.MovimientoEntidad;
import Logica.CajaLogica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;

/**
 * @company FK-SOFT
 * @author facul
 */
public class CajaInterfaz extends javax.swing.JFrame {

    private static int idMovmientoVigente;

    /**
     * Constructor: - Creates new form GestionClientes
     */
    public CajaInterfaz() {
        initComponents();
        setUp();
        setVisible(true);
        update(0,0);
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
        jl_monto = new javax.swing.JLabel();
        jl_modoPago = new javax.swing.JLabel();
        jl_fecha = new javax.swing.JLabel();
        jt_monto = new javax.swing.JTextField();
        jcbBox_modoPago = new javax.swing.JComboBox<>();
        jdate_fecha = new com.toedter.calendar.JDateChooser();
        btn_buscarPorFecha = new javax.swing.JButton();
        jl_observaciones = new javax.swing.JLabel();
        jt_observaciones = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jTabbedPane_general = new javax.swing.JTabbedPane();
        jScrollPane_movimientos = new javax.swing.JScrollPane();
        jtable_movimientos = new javax.swing.JTable();
        jScrollPane_cierresDeCaja = new javax.swing.JScrollPane();
        jtable_cierresDeCaja = new javax.swing.JTable();
        jl_total = new javax.swing.JLabel();
        jl_efectivo = new javax.swing.JLabel();
        jl_banco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));
        setResizable(false);

        jl_titulo.setBackground(new java.awt.Color(49, 28, 28));
        jl_titulo.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 253, 118));
        jl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_titulo.setText("CAJA");
        jl_titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_monto.setBackground(new java.awt.Color(49, 28, 28));
        jl_monto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_monto.setForeground(new java.awt.Color(255, 253, 118));
        jl_monto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_monto.setText("MONTO");
        jl_monto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_modoPago.setBackground(new java.awt.Color(49, 28, 28));
        jl_modoPago.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_modoPago.setForeground(new java.awt.Color(255, 253, 118));
        jl_modoPago.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_modoPago.setText("MODO PAGO");
        jl_modoPago.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_fecha.setBackground(new java.awt.Color(49, 28, 28));
        jl_fecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_fecha.setForeground(new java.awt.Color(255, 253, 118));
        jl_fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_fecha.setText("FECHA");
        jl_fecha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jt_monto.setBackground(new java.awt.Color(243, 243, 194));
        jt_monto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_monto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jcbBox_modoPago.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jcbBox_modoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Banco" }));
        jcbBox_modoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBox_modoPagoActionPerformed(evt);
            }
        });

        btn_buscarPorFecha.setBackground(new java.awt.Color(255, 253, 118));
        btn_buscarPorFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_buscarPorFecha.setText("Buscar");
        btn_buscarPorFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_buscarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPorFechaActionPerformed(evt);
            }
        });

        jl_observaciones.setBackground(new java.awt.Color(49, 28, 28));
        jl_observaciones.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_observaciones.setForeground(new java.awt.Color(255, 253, 118));
        jl_observaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_observaciones.setText("OBSERVACIONES");
        jl_observaciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jt_observaciones.setBackground(new java.awt.Color(243, 243, 194));
        jt_observaciones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_observaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_observaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

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

        jtable_movimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane_movimientos.setViewportView(jtable_movimientos);

        jTabbedPane_general.addTab("Movimientos", jScrollPane_movimientos);

        jtable_cierresDeCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane_cierresDeCaja.setViewportView(jtable_cierresDeCaja);

        jTabbedPane_general.addTab("Cierres de caja", jScrollPane_cierresDeCaja);

        jl_total.setBackground(new java.awt.Color(49, 28, 28));
        jl_total.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_total.setForeground(new java.awt.Color(255, 253, 118));
        jl_total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_total.setText("TOTAL:");
        jl_total.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_efectivo.setBackground(new java.awt.Color(49, 28, 28));
        jl_efectivo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_efectivo.setForeground(new java.awt.Color(255, 253, 118));
        jl_efectivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_efectivo.setText("EFECTIVO:");
        jl_efectivo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_banco.setBackground(new java.awt.Color(49, 28, 28));
        jl_banco.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_banco.setForeground(new java.awt.Color(255, 253, 118));
        jl_banco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_banco.setText("BANCO:");
        jl_banco.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_modoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_monto)
                            .addComponent(jcbBox_modoPago, 0, 155, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdate_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_buscarPorFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jl_observaciones)
                                        .addGap(149, 149, 149))
                                    .addComponent(jt_observaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane_general, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbBox_modoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_modoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdate_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscarPorFecha)
                        .addGap(220, 220, 220)
                        .addComponent(jl_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTabbedPane_general, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUp(){
        getContentPane().setBackground(new Color(49, 28, 28));
        setLocationRelativeTo(null);
        setTitle("Gestion de caja");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        agregarMovimiento();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminarMovimiento();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void jcbBox_modoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBox_modoPagoActionPerformed
        //addFilter(jtable_movimientosDiarios, jcbBox_modoPago.getSelectedItem().toString(), 3);
    }//GEN-LAST:event_jcbBox_modoPagoActionPerformed

    private void btn_buscarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPorFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarPorFechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscarPorFecha;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JScrollPane jScrollPane_cierresDeCaja;
    private javax.swing.JScrollPane jScrollPane_movimientos;
    private javax.swing.JTabbedPane jTabbedPane_general;
    private javax.swing.JComboBox<String> jcbBox_modoPago;
    private com.toedter.calendar.JDateChooser jdate_fecha;
    private javax.swing.JLabel jl_banco;
    private javax.swing.JLabel jl_efectivo;
    private javax.swing.JLabel jl_fecha;
    private javax.swing.JLabel jl_modoPago;
    private javax.swing.JLabel jl_monto;
    private javax.swing.JLabel jl_observaciones;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_total;
    private javax.swing.JTextField jt_monto;
    private javax.swing.JTextField jt_observaciones;
    private javax.swing.JTable jtable_cierresDeCaja;
    private javax.swing.JTable jtable_movimientos;
    // End of variables declaration//GEN-END:variables

    private void eliminarMovimiento() {
        if (checkCampos()){
            MovimientoEntidad movimientoEntidad = CajaLogica.getMovimiento(idMovmientoVigente);
            if (CajaLogica.eliminarMovimiento(movimientoEntidad)){
                JOptionPane.showMessageDialog(null, "Movimiento anulado con exito");
            }else
                JOptionPane.showMessageDialog(null, "Error: al intentar eliminar el movimiento");
        }
    }

    private void modificarMovimiento() {
        if(checkCampos()){
            MovimientoEntidad movimientoEntidad = CajaLogica.getMovimiento(idMovmientoVigente);
            movimientoEntidad.setMonto(Double.valueOf(jt_monto.getText()));
            if(CajaLogica.modificarMovimiento(movimientoEntidad))
                JOptionPane.showMessageDialog(null, "Movimiento agregado con exito");
            else
                JOptionPane.showMessageDialog(null, "Error: al intentar agregar el movimiento");
        }else
            JOptionPane.showMessageDialog(null, "Hay campos obligatorios que debes completar");
    }

    private void agregarMovimiento() {
        if(checkCampos()){
            MovimientoEntidad movimientoEntidad = new MovimientoEntidad(
                    Double.valueOf(jt_monto.getText()),
                    jt_observaciones.getText(),
                    new Date(new java.util.Date().getTime()),
                    false //todo: cambiar desde la interfaz
            );
            if(CajaLogica.agregarMovimiento(movimientoEntidad))
                JOptionPane.showMessageDialog(null, "Movimiento agregado con exito");
            else
                JOptionPane.showMessageDialog(null, "Error: al intentar agregar el movimiento");
        }else
            JOptionPane.showMessageDialog(null, "Hay campos obligatorios que debes completar");
    }

    private boolean checkCampos() {
        return !(idMovmientoVigente<0);
    }

    private void update(double efectivo, double banco) {
        CajaLogica.actualizarCierreCaja(efectivo, banco);
        escribirSaldos();
        llenarTablaMovimientos();
        limpiarCampos();
    }

    private void escribirSaldos() {
        double efectivo = 0, banco = 0, total = 0;
        CierreCajaEntidad cierrecajaEntidad = CajaLogica.getUltimoCierreCaja();
        if(cierrecajaEntidad != null) {
            efectivo = cierrecajaEntidad.getEfectivo();
            banco = cierrecajaEntidad.getBanco();
            total = efectivo + banco;
        }
        jl_efectivo.setText("Efectivo: $" + efectivo);
        jl_banco.setText("Banco: $" + banco);
        jl_total.setText("Total: $" + total);
    }

    private void limpiarCampos() {
        jt_monto.setText("");
        idMovmientoVigente = -1;
    }

    private void llenarTablaMovimientos() {
        String[] columnas = new String[]{"ID", "Monto", "Fecha", "Observacion"};
        Class[] tipos = {Integer.class, Double.class, Date.class, String.class};

        ArrayList<MovimientoEntidad> movimientos = CajaLogica.getMovimientos();
        Object[][] objetosArray = new Object[movimientos.size()][columnas.length];

        for (int i = 0; i < movimientos.size(); i++) {
            objetosArray[i] = new Object[]{
                    movimientos.get(i).getId(),
                    movimientos.get(i).getMonto(),
                    movimientos.get(i).getFecha(),
                    movimientos.get(i).getObservacion()
            };
        }

        jtable_movimientos.setModel(new DefaultTableModel(objetosArray, columnas) {
            Class[] types = tipos;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int columnindex) {
                return this.types[columnindex];
            }
        });
    }
}
