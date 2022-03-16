/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Entidad.ClienteEntidad;
import Entidad.ViandaEntidad;
import Hibernate.ClienteRepository;
import Hibernate.ViandasRepository;
import Logica.ClienteLogica;
import Logica.ViandasLogica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

/**
 * @author facul
 * @company FK-SOFT
 */
public class ViandasInterfaz extends javax.swing.JFrame {

    private static int idVigente;

    /**
     * Constructor: - Creates new form GestionClientes
     */
    public ViandasInterfaz() {
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
        jl_precio = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_precio = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jscrollpane_general = new javax.swing.JScrollPane();
        jtable_viandas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));
        setResizable(false);

        jl_titulo.setBackground(new java.awt.Color(49, 28, 28));
        jl_titulo.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 253, 118));
        jl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_titulo.setText("VIANDAS");
        jl_titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_nombre.setBackground(new java.awt.Color(49, 28, 28));
        jl_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(255, 253, 118));
        jl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_nombre.setText("NOMBRE");
        jl_nombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_precio.setBackground(new java.awt.Color(49, 28, 28));
        jl_precio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_precio.setForeground(new java.awt.Color(255, 253, 118));
        jl_precio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_precio.setText("PRECIO");
        jl_precio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jt_nombre.setBackground(new java.awt.Color(243, 243, 194));
        jt_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorNombre(evt);
            }
        });

        jt_precio.setBackground(new java.awt.Color(243, 243, 194));
        jt_precio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_precio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        btn_actualizar.setBackground(new java.awt.Color(255, 253, 118));
        btn_actualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
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

        btn_modificar.setBackground(new java.awt.Color(255, 253, 118));
        btn_modificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
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
        jscrollpane_general.setViewportView(jtable_viandas);

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
                            .addComponent(jl_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar))
                    .addComponent(jscrollpane_general, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsFacu() {
        getContentPane().setBackground(new Color(49, 28, 28));
        setLocationRelativeTo(null);
        setTitle("Gestion de viandas");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        agregarVianda();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        modificarVianda();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jtable_viandasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_viandasMouseClicked
        int filaSelec = jtable_viandas.rowAtPoint(evt.getPoint());
        jt_nombre.setText(jtable_viandas.getValueAt(filaSelec, 1).toString());
        jt_precio.setText("$ "+jtable_viandas.getValueAt(filaSelec, 2).toString());
        idVigente = (int) jtable_viandas.getValueAt(filaSelec, 0);
    }//GEN-LAST:event_jtable_viandasMouseClicked

    private void buscadorNombre(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorNombre
        addFilter(jtable_viandas, jt_nombre.getText(), 1);
    }//GEN-LAST:event_buscadorNombre

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO: agregar bit de eliminado
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_precio;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JScrollPane jscrollpane_general;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_precio;
    private javax.swing.JTable jtable_viandas;
    // End of variables declaration//GEN-END:variables

    private void modificarVianda() {
        String nombre = "";
        double precio = 0.0;
        if (checkCampos()) {
            nombre = jt_nombre.getText();
            precio = Double.valueOf(jt_precio.getText());
            ViandaEntidad vianda = new ViandaEntidad(nombre, precio);
            boolean flag = ViandasLogica.modificarVianda(vianda);
            if (flag)
                JOptionPane.showMessageDialog(null, "Vianda " + vianda.getNombre() + " agregada con exito");
            else
                JOptionPane.showMessageDialog(null, "Error: al intentar agregar la vianda");
        }
    }

    private void agregarVianda() {
        String nombre = "";
        double precio = 0.0;
        if (checkCampos()) {
            nombre = jt_nombre.getText();
            precio = Double.valueOf(jt_precio.getText());
            ViandaEntidad vianda = new ViandaEntidad(nombre, precio);
            boolean flag = ViandasLogica.agregarVianda(vianda);
            if (flag)
                JOptionPane.showMessageDialog(null, "Vianda " + vianda.getNombre() + " agregada con exito");
            else
                JOptionPane.showMessageDialog(null, "Error: al intentar agregar la vianda");
        }
    }

    /**
     *
     * @return boolean
     * @throws NullPointerException cuando falta completar algun campo
     */
    private boolean checkCampos() { //todo: probar metodo
        try{
            jt_nombre.getText();
            jt_precio.getText();
            if(jl_nombre.getText().equals("") || jt_precio.getText().equals(""))
                return false;
            return true;
        }catch (NullPointerException e){
            return false;
        }
    }

    private void actualizar() {
        llenarTabla();
        limpiarCampos();
    }

    private void llenarTabla() {
        String[] columnas = new String[]{"ID", "Nombre", "Precio"};
        Class[] tipos = {Integer.class, String.class, Double.class};

        ArrayList<ViandaEntidad> viandas = ViandasLogica.getViandas();
        Object[][] objetosArray = new Object[viandas.size()][columnas.length];

        for (int i = 0; i < viandas.size(); i++) {
            objetosArray[i] = new Object[]{
                    viandas.get(i).getId(),
                    viandas.get(i).getNombre(),
                    viandas.get(i).getPrecio()
            };
        }

        jtable_viandas.setModel(new DefaultTableModel(objetosArray, columnas) {
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

    public void addFilter(JTable tbl, String txt, Integer SearchColumnIndex) {

        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        final TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tbl.setRowSorter(sorter);
        if (txt.length() == 0) {
            sortearFecha();
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + txt, SearchColumnIndex));
            } catch (PatternSyntaxException pse) {
                System.out.println("Bad regex pattern");
            }
        }
    }

    private void setDefaultSorter(JTable tabla, int columna, SortOrder sortOrder) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabla.getModel());
        tabla.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(columna, sortOrder));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }

    public void sortearFecha() {
        setDefaultSorter(jtable_viandas, 1, SortOrder.DESCENDING); //revisar columna
    }

    private void limpiarCampos() {
        jt_nombre.setText("");
        jt_precio.setText("");
    }
}
