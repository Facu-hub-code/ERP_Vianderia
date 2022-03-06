/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
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
        initComponentsFacu();
        actualizar();
    }

    private void initComponentsFacu() { //todo: revisar        
        getContentPane().setBackground(new Color(49, 28, 28));
        setLocationRelativeTo(null);
        setTitle("Viandas");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lj_TITULO = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jl_precio = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_precio = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane_general = new javax.swing.JScrollPane();
        jtable_viandas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));
        setResizable(false);

        lj_TITULO.setBackground(new java.awt.Color(49, 28, 28));
        lj_TITULO.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        lj_TITULO.setForeground(new java.awt.Color(255, 253, 118));
        lj_TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lj_TITULO.setText("VIANDAS");
        lj_TITULO.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_nombre.setBackground(new java.awt.Color(243, 243, 194));
        jl_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(243, 243, 194));
        jl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_nombre.setText("Nombre:");

        jl_precio.setBackground(new java.awt.Color(243, 243, 194));
        jl_precio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_precio.setForeground(new java.awt.Color(243, 243, 194));
        jl_precio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_precio.setText("Precio: $");

        jt_nombre.setBackground(new java.awt.Color(243, 243, 194));
        jt_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_nombreKeyReleased(evt);
            }
        });

        jt_precio.setBackground(new java.awt.Color(243, 243, 194));
        jt_precio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_precio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_precioKeyTyped(evt);
            }
        });

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
        btn_modificar.setText("Modificar Precio");
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
        jScrollPane_general.setViewportView(jtable_viandas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lj_TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_precio)
                                    .addComponent(jl_nombre))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_nombre)
                                    .addComponent(jt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane_general, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(jScrollPane_general, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lj_TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_nombre)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_precio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarNombre(String nombre) {
    }

    //Metodo que chequea que ningun campo de texto este vacio.
    private boolean checkCampos() { //todo: revisar
        return !(jt_nombre.getText().equalsIgnoreCase("")
                || jt_precio.getText().equalsIgnoreCase(""));
    }

    //Metodo que actualiza los valores de la tabla segun la base de datos
    private void actualizar() {
        //todo: add your handling code here
       
    }

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jtable_viandasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_viandasMouseClicked
        int filaSelec = jtable_viandas.rowAtPoint(evt.getPoint());
        jt_nombre.setText(jtable_viandas.getValueAt(filaSelec, 1).toString());
        jt_precio.setText(jtable_viandas.getValueAt(filaSelec, 2).toString());
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
    private javax.swing.JScrollPane jScrollPane_general;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_precio;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_precio;
    private javax.swing.JTable jtable_viandas;
    private javax.swing.JLabel lj_TITULO;
    // End of variables declaration//GEN-END:variables
}
