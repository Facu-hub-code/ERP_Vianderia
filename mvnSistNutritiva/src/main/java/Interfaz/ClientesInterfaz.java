/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Entidad.ClienteEntidad;
import Logica.ClienteLogica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

/**
 * @company FK-SOFT
 * @author facul
 */
public class ClientesInterfaz extends javax.swing.JFrame {

    private static int idVigente;

    public ClientesInterfaz() {
        initComponents();
        initComponentsFacu();
        setVisible(true);
        update();
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
        jl_email = new javax.swing.JLabel();
        jl_dni = new javax.swing.JLabel();
        jl_mail = new javax.swing.JLabel();
        jl_telefono = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_apellido = new javax.swing.JTextField();
        jt_email = new javax.swing.JTextField();
        jt_telefono = new javax.swing.JTextField();
        jt_direccion = new javax.swing.JTextField();
        jt_dni = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
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

        jl_email.setBackground(new java.awt.Color(49, 28, 28));
        jl_email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_email.setForeground(new java.awt.Color(255, 253, 118));
        jl_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_email.setText("EMAIL");
        jl_email.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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
        jl_mail.setText("DIRECCION");
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

        jt_email.setBackground(new java.awt.Color(243, 243, 194));
        jt_email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jt_telefono.setBackground(new java.awt.Color(243, 243, 194));
        jt_telefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jt_direccion.setBackground(new java.awt.Color(243, 243, 194));
        jt_direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jt_dni.setBackground(new java.awt.Color(243, 243, 194));
        jt_dni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_dni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

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

        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {},
                        {},
                        {},
                        {}
                },
                new String[]{

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jl_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jt_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                                        .addComponent(jt_nombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                        .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jl_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jl_mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jl_dni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jl_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jt_dni)
                                                        .addComponent(jt_direccion)
                                                        .addComponent(jt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                        .addComponent(jt_email))))
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
                                                        .addComponent(jt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jl_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jl_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setTitle("Gestion de clientes");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        addCliente();
        update();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        updateCliente();
        update();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jtable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_clientesMouseClicked
        int filaSelec = jtable_clientes.rowAtPoint(evt.getPoint());
        idVigente = (int) jtable_clientes.getValueAt(filaSelec, 0);
        jt_nombre.setText(jtable_clientes.getValueAt(filaSelec, 1).toString());
        jt_apellido.setText(jtable_clientes.getValueAt(filaSelec, 2).toString());
        jt_dni.setText(jtable_clientes.getValueAt(filaSelec, 3).toString());
        jt_direccion.setText(jtable_clientes.getValueAt(filaSelec, 4).toString());
        jt_telefono.setText(jtable_clientes.getValueAt(filaSelec, 5).toString());
    }//GEN-LAST:event_jtable_clientesMouseClicked

    private void buscadorNombre(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorNombre
        addFilter(jtable_clientes, jt_nombre.getText(), 1);
    }//GEN-LAST:event_buscadorNombre

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        update();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        deleteCliente();
        update();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jl_apellido;
    private javax.swing.JLabel jl_dni;
    private javax.swing.JLabel jl_email;
    private javax.swing.JLabel jl_mail;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_telefono;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JScrollPane jscrollpane_general;
    private javax.swing.JTextField jt_apellido;
    private javax.swing.JTextField jt_direccion;
    private javax.swing.JTextField jt_dni;
    private javax.swing.JTextField jt_email;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_telefono;
    public javax.swing.JTable jtable_clientes;
    // End of variables declaration//GEN-END:variables

    private void update() {
        limpiarCampos();
        llenarTabla();
        idVigente = -1;
    }

    private boolean llenarTabla() {
        String[] columnas = new String[]{"ID", "Nombre", "Apellido", "DNI", "Email", "Telefono", "Direccion"};
        Class[] tipos = {Integer.class, String.class, String.class, String.class, String.class, String.class, String.class};

        ArrayList<ClienteEntidad> clientes = ClienteLogica.getClientes();
        Object[][] objetosArray = new Object[clientes.size()][columnas.length];

        if (clientes.size() == 0)
            return false;

        for (int i = 0; i < clientes.size(); i++) {
            objetosArray[i] = new Object[]{
                    clientes.get(i).getId(),
                    clientes.get(i).getNombre(),
                    clientes.get(i).getApellido(),
                    clientes.get(i).getDni(),
                    clientes.get(i).getEmail(),
                    clientes.get(i).getTelefono(),
                    clientes.get(i).getDireccion()
            };
        }

        jtable_clientes.setModel(new DefaultTableModel(objetosArray, columnas) {
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
        return true;
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
        setDefaultSorter(jtable_clientes, 1, SortOrder.DESCENDING); //revisar columna
    }

    private void limpiarCampos() {
        jt_nombre.setText("");
        jt_apellido.setText("");
        jt_direccion.setText("");
        jt_dni.setText("");
        jt_telefono.setText("");
        jt_email.setText("");
    }

    public boolean addCliente() {
        String nombre = jt_nombre.getText(), apellido = "", direccion = "", dni = "", telefono = "", email = "";
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        apellido = jt_apellido.getText();
        direccion = jt_dni.getText();
        dni = jt_dni.getText();
        telefono = jt_telefono.getText();
        email = jt_email.getText();
        ClienteEntidad cliente = new ClienteEntidad(nombre, apellido, dni, email, telefono, direccion);
        if (ClienteLogica.addClient(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente " + cliente.getNombre() + " agregado con exito");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    protected boolean updateCliente() {
        String nombre = jt_nombre.getText(), apellido = "", direccion = "", dni = "", telefono = "", email = "";
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (idVigente < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar algun cliente", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        apellido = jt_apellido.getText();
        direccion = jt_dni.getText();
        dni = jt_dni.getText();
        telefono = jt_telefono.getText();
        email = jt_email.getText();

        ClienteEntidad cliente = new ClienteEntidad(nombre, apellido, dni, email, telefono, direccion);
        if (ClienteLogica.addClient(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente " + cliente.getNombre() + " agregado con exito");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean deleteCliente() {
        if (idVigente < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar algun cliente");
            return false;
        }
        ClienteEntidad cliente = ClienteLogica.getCliente(idVigente);
        if (ClienteLogica.delete(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente: " + cliente.getNombre() + " eliminado con exito");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Al intentar eliminar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Codigo para testing">
    public void setNombre(String nombre) {
        jt_nombre.setText(nombre);
    }

    public void setIdVigente(int idVigente) {
        ClientesInterfaz.idVigente = idVigente;
    }
    // </editor-fold>
}

