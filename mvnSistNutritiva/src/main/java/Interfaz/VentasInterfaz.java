/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Entidad.*;
import Logica.CajaLogica;
import Logica.PedidoLogica;
import Logica.VentasLogica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

/**
 * @author facul
 * @company FK-SOFT
 */
public class VentasInterfaz extends javax.swing.JFrame {

    private static int idPedidoVigente;
    private static int idVentaVigente;

    /**
     * Constructor: - Creates new form GestionClientes
     */
    public VentasInterfaz() {
        initComponents();
        setUp();
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
        jl_fecha = new javax.swing.JLabel();
        jl_cliente = new javax.swing.JLabel();
        jdate_fecha = new com.toedter.calendar.JDateChooser();
        btn_buscarPorFecha = new javax.swing.JButton();
        jt_cliente = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jTabbedPane_general = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_pedidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_ventas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 28, 28));
        setResizable(false);

        jl_titulo.setBackground(new java.awt.Color(49, 28, 28));
        jl_titulo.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 253, 118));
        jl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_titulo.setText("VENTAS");
        jl_titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_fecha.setBackground(new java.awt.Color(49, 28, 28));
        jl_fecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_fecha.setForeground(new java.awt.Color(255, 253, 118));
        jl_fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_fecha.setText("FECHA");
        jl_fecha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jl_cliente.setBackground(new java.awt.Color(49, 28, 28));
        jl_cliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jl_cliente.setForeground(new java.awt.Color(255, 253, 118));
        jl_cliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_cliente.setText("CLIENTE");
        jl_cliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btn_buscarPorFecha.setBackground(new java.awt.Color(255, 253, 118));
        btn_buscarPorFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_buscarPorFecha.setText("Buscar");
        btn_buscarPorFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btn_buscarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPorFechaActionPerformed(evt);
            }
        });

        jt_cliente.setBackground(new java.awt.Color(243, 243, 194));
        jt_cliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_cliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jt_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorClientes(evt);
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

        jtable_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtable_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_pedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_pedidos);

        jTabbedPane_general.addTab("Pedidos", jScrollPane1);

        jtable_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtable_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_ventasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_ventas);

        jTabbedPane_general.addTab("Ventas", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdate_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_buscarPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane_general, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                            .addComponent(jt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdate_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscarPorFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar))
                    .addComponent(jTabbedPane_general, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUp() {
        getContentPane().setBackground(new Color(49, 28, 28));
        setLocationRelativeTo(null);
        setTitle("Gestion de ventas");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if(idPedidoVigente < 0)
            JOptionPane.showMessageDialog(null, "Debe seleccionar algun pedido");
        else{
            agregarVenta();
            agregarMovimiento(PedidoLogica.getPedido(idPedidoVigente));
        }


    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO: agregar el bit de anulado
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void buscadorClientes(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorClientes
        addFilter(jtable_pedidos, jt_cliente.getText(), 3);
    }//GEN-LAST:event_buscadorClientes

    private void jtable_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_pedidosMouseClicked
        int filaSelec = jtable_pedidos.rowAtPoint(evt.getPoint());
        jt_cliente.setText(jtable_pedidos.getValueAt(filaSelec, 3).toString());
        idPedidoVigente = (int) jtable_pedidos.getValueAt(filaSelec, 0);
    }//GEN-LAST:event_jtable_pedidosMouseClicked

    private void jtable_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_ventasMouseClicked
        int filaSelec = jtable_ventas.rowAtPoint(evt.getPoint());
        jt_cliente.setText(jtable_ventas.getValueAt(filaSelec, 1).toString());
        idVentaVigente = (int) jtable_ventas.getValueAt(filaSelec, 0);
    }//GEN-LAST:event_jtable_ventasMouseClicked

    private void btn_buscarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPorFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarPorFechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscarPorFecha;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane_general;
    private com.toedter.calendar.JDateChooser jdate_fecha;
    private javax.swing.JLabel jl_cliente;
    private javax.swing.JLabel jl_fecha;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JTextField jt_cliente;
    private javax.swing.JTable jtable_pedidos;
    private javax.swing.JTable jtable_ventas;
    // End of variables declaration//GEN-END:variables

    private void agregarMovimiento(PedidoEntidad pedido) {
        MovimientoEntidad movimientoEntidad = crearMovimiento(pedido);
        CajaLogica.agregarMovimiento(movimientoEntidad);
    }

    private MovimientoEntidad crearMovimiento(PedidoEntidad pedido) {
        MovimientoEntidad movimientoEntidad = new MovimientoEntidad();
        movimientoEntidad.setFecha(new java.sql.Date(new java.util.Date().getTime()));
        movimientoEntidad.setMonto(pedido.getVianda().getPrecio());
        String observacion ="Cliente: " + pedido.getCliente().getNombre()+" "+pedido.getCliente().getApellido()
                +"\nVianda: "+pedido.getVianda().getNombre();
        movimientoEntidad.setObservacion(observacion);
        movimientoEntidad.setAnulado(false);
        return movimientoEntidad;
    }


    /**
     * Creo una venta y la persisto en el sistema
     */
    private void agregarVenta() {
        Date fecha = new java.sql.Date(jdate_fecha.getDate().getTime());
        PedidoEntidad pedido = PedidoLogica.getPedido(idPedidoVigente);
        double monto = pedido.getVianda().getPrecio();
        VentaEntidad venta = new VentaEntidad(monto, fecha, pedido);
        if (VentasLogica.agregar(venta)){
            JOptionPane.showMessageDialog(null, "Venta de " + pedido.getCliente().getNombre() + " agregado con exito");
            PedidoLogica.delete(pedido);
        }
        else
            JOptionPane.showMessageDialog(null, "Error: al intentar agregar la venta");
    }


    //todo: ver

    private void modificarVenta() {
        double monto = 0.0;
        Date fecha = null;
        PedidoEntidad pedido = null;
        if (idVentaVigente < 0) {
            try {
                //monto = Double.valueOf(jt_monto.getText());
                fecha = new java.sql.Date(jdate_fecha.getDate().getTime());
                pedido = PedidoLogica.getPedido(idPedidoVigente);
            } catch (NullPointerException e) {
                System.out.println("puede haber algun campo nulo");
                e.printStackTrace();
            }
            VentaEntidad venta = new VentaEntidad(monto, fecha, pedido);
            boolean flag = VentasLogica.modificarVenta(venta);
            if (flag)
                JOptionPane.showMessageDialog(null, "Venta de " + pedido.getCliente().getNombre() + " agregado con exito");
            else
                JOptionPane.showMessageDialog(null, "Error: al intentar agregar la venta");
        }
    }

    private void update() {
        limpiarCampos();
        llenarTablaPedidos();
        llenarTablaVentas();
        idPedidoVigente = -1;
        idVentaVigente = -1;
    }

    private void limpiarCampos() {
        jdate_fecha.setDate(new java.util.Date());
        jt_cliente.setText("");
        idPedidoVigente = -1;
        idVentaVigente = -1;
    }

    private void llenarTablaVentas() {
        String[] columnas = new String[]{"ID", "Cliente", "Vianda", "Fecha", "Tipo", "Monto"};
        Class[] tipos = {Integer.class, String.class, String.class, Date.class, String.class, Double.class};

        ArrayList<VentaEntidad> ventas = VentasLogica.getVentas();
        Object[][] objetosArray = new Object[ventas.size()][columnas.length];

        for (int i = 0; i < ventas.size(); i++) {
            String tipo;
            if (ventas.get(i).getPedido().getTipo().equals("almuerzo"))
                tipo = "almuerzo";
            else
                tipo = "cena";

            objetosArray[i] = new Object[]{
                    ventas.get(i).getId(),
                    ventas.get(i).getPedido().getCliente().getNombre(),
                    ventas.get(i).getPedido().getVianda().getNombre(),
                    ventas.get(i).getFecha(),
                    tipo,
                    ventas.get(i).getMonto()
            };
        }

        jtable_ventas.setModel(new DefaultTableModel(objetosArray, columnas) {
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

    private void llenarTablaPedidos() {
        String[] columnas = new String[]{"ID", "Fecha", "Tipo", "Cliente", "Vianda"};
        Class[] tipos = {Integer.class, Date.class, String.class, String.class, String.class};

        ArrayList<PedidoEntidad> pedidos = PedidoLogica.getPedidos();
        Object[][] objetosArray = new Object[pedidos.size()][columnas.length];

        for (int i = 0; i < pedidos.size(); i++) {
            String tipo;
            if (pedidos.get(i).getTipo().equals("almuerzo"))
                tipo = "almuerzo";
            else
                tipo = "cena";

            objetosArray[i] = new Object[]{
                    pedidos.get(i).getId(),
                    pedidos.get(i).getFecha(),
                    pedidos.get(i).getTipo(),
                    pedidos.get(i).getCliente().getNombre(),
                    pedidos.get(i).getVianda().getNombre()
            };
        }

        jtable_pedidos.setModel(new DefaultTableModel(objetosArray, columnas) {
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
            sortearFechaVentas();
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

    public void sortearFechaVentas() {
        setDefaultSorter(jtable_ventas, 1, SortOrder.DESCENDING); //revisar columna
    }

}
