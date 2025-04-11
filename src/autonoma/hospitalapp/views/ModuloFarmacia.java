/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalapp.views;

import autonoma.hospitalapp.models.Hospital;
import autonoma.hospitalapp.models.Medicamento;
import autonoma.hospitalapp.models.MedicamentoGenerico;
import autonoma.hospitalapp.models.MedicamentoMarca;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Juan Esteban Vera Velez
 */
public class ModuloFarmacia extends javax.swing.JDialog {

    private VentanaPrincipal ventanaPrincipal;
    private JComboBox<String> comboTipo;
    private Hospital hospital;
    private List<Medicamento> listaMedicamentos = new ArrayList<>();

    /**
     * Creates new form ModuloFarmacia
     */
    public ModuloFarmacia(Frame parent, boolean modal, Hospital hospital, VentanaPrincipal ventanaPrincipal) {

        super(parent, modal);
        initComponents();
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/HospitalApp/images/logoH.png")).getImage());
        } catch (Exception e) {

        }

        this.ventanaPrincipal = ventanaPrincipal;
        this.hospital = hospital;
        this.listaMedicamentos = hospital.getInventarioFarmacia().getMedicamentos();
        llenarTablaMedicamentos();

    }

    private void configurarComboTipo() {
        comboTipo = new JComboBox<>();
        comboTipo.addItem("Seleccione tipo de medicamento");
        comboTipo.addItem("Generico");
        comboTipo.addItem("Marca");
        comboTipo.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMedicamentos = new javax.swing.JTable();
        btnAgregarMedicamento = new javax.swing.JButton();
        btnModificarMedicamento = new javax.swing.JButton();
        btnEliminarMedicamento = new javax.swing.JButton();
        btnVenderMedicamento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMedicamentos.setDoubleBuffered(true);
        jScrollPane1.setViewportView(TablaMedicamentos);

        btnAgregarMedicamento.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarMedicamento.setText("Agregar");
        btnAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicamentoActionPerformed(evt);
            }
        });

        btnModificarMedicamento.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarMedicamento.setText("Modificar");
        btnModificarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMedicamentoActionPerformed(evt);
            }
        });

        btnEliminarMedicamento.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarMedicamento.setText("Eliminar");
        btnEliminarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMedicamentoActionPerformed(evt);
            }
        });

        btnVenderMedicamento.setBackground(new java.awt.Color(204, 204, 204));
        btnVenderMedicamento.setText("Vender");
        btnVenderMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderMedicamentoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/txtFarmacia.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Medicamento");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Descripción: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Costo : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Precio de Venta : ");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tipo  : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo de medicamento", "Generico", "Marca" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModificarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnVenderMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(txtDescripcion))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addComponent(txtPrecioVenta))
                            .addGap(8, 8, 8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnAgregarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnModificarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEliminarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnVenderMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

     int filaSeleccionada = jTable2.getSelectedRow();

    if (filaSeleccionada >= 0) {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();

        String nombre = (String) modelo.getValueAt(filaSeleccionada, 0);
        modelo.removeRow(filaSeleccionada);

        // Limpiar campos
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtCosto.setText("");
        jComboBox1.setSelectedIndex(0);

        JOptionPane.showMessageDialog(this, "Medicamento eliminado correctamente: " + nombre);
    } else {
        // Verifica si los campos están llenos, pero no se seleccionó ninguna fila
        boolean camposLlenos = !txtNombre.getText().trim().isEmpty()
                            || !txtDescripcion.getText().trim().isEmpty()
                            || !txtCosto.getText().trim().isEmpty()
                            || jComboBox1.getSelectedIndex() != 0;


        if (camposLlenos) {
            JOptionPane.showMessageDialog(this,
                "Para eliminar un medicamento debe seleccionarlo directamente desde la tabla.\n"
              + "Llenar los campos no es suficiente.");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un medicamento desde la tabla para eliminar.");
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoActionPerformed
        String nombre = txtNombre.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
        String tipo = (String) jComboBox1.getSelectedItem();
        String costoStr = txtCosto.getText().trim();

        if (nombre.isEmpty() || descripcion.isEmpty() || costoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        if ("Seleccione tipo de medicamento".equals(tipo)) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de medicamento válido.");
            return;
        }

        double costo;
        try {
            costo = Double.parseDouble(costoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El costo debe ser un número válido.");
            return;
        }

        Medicamento medicamento;

        if ("Generico".equals(tipo)) {
            medicamento = new MedicamentoGenerico(nombre, descripcion, costo);
        } else if ("Marca".equals(tipo)) {
            String fabricante = JOptionPane.showInputDialog(this, "Ingrese el nombre del fabricante:");
            if (fabricante == null || fabricante.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar el fabricante del medicamento.");
                return;
            }
            medicamento = new MedicamentoMarca(nombre, descripcion, costo, fabricante);
        } else {
            JOptionPane.showMessageDialog(this, "Tipo de medicamento no reconocido.");
            return;
        }

        // ventanaPrincipal.agregarMedicamento(medicamento);
        JOptionPane.showMessageDialog(this, "Medicamento agregado correctamente.\nPrecio de venta: $" + medicamento.getPrecioVenta());
        listaMedicamentos.add(medicamento);
        llenarTablaMedicamentos();

    }//GEN-LAST:event_btnAgregarMedicamentoActionPerformed
    public void llenarTablaMedicamentos() {
        String[] columnas = {"Nombre", "Descripcion", "Costo"};
        List<Medicamento> lista = hospital.getInventarioFarmacia().getMedicamentos();

        DefaultTableModel modelDefault = new DefaultTableModel(columnas, lista.size());
        this.TablaMedicamentos.setModel(modelDefault);

        TableModel dataModel = TablaMedicamentos.getModel();
        for (int i = 0; i < lista.size(); i++) {
            Medicamento medicamento = lista.get(i);
            dataModel.setValueAt(medicamento.getNombre(), i, 0);
            dataModel.setValueAt(medicamento.getDescripcion(), i, 1);
            dataModel.setValueAt(medicamento.getCosto(), i, 2);
        }
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void btnModificarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMedicamentoActionPerformed
        int filaSeleccionada = TablaMedicamentos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String nombre = txtNombre.getText().trim();
            String descripcion = txtDescripcion.getText().trim();
            String tipo = (String) jComboBox1.getSelectedItem();
            String costoStr = txtCosto.getText().trim();

            if (nombre.isEmpty() || descripcion.isEmpty() || costoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            if ("Seleccione tipo de medicamento".equals(tipo)) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo válido.");
                return;
            }

            double costo;
            try {
                costo = Double.parseDouble(costoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El costo debe ser un número válido.");
                return;
            }

            // Actualizar valores en la tabla (solo columnas existentes: 0, 1, 2)
            DefaultTableModel modelo = (DefaultTableModel) TablaMedicamentos.getModel();
            modelo.setValueAt(nombre, filaSeleccionada, 0);
            modelo.setValueAt(descripcion, filaSeleccionada, 1);
            modelo.setValueAt(costo, filaSeleccionada, 2);

            // Limpiar campos
            txtNombre.setText("");
            txtDescripcion.setText("");
            txtCosto.setText("");
            txtPrecioVenta.setText("");
            jComboBox1.setSelectedIndex(0);

            JOptionPane.showMessageDialog(this, "Medicamento modificado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
        }

    }//GEN-LAST:event_btnModificarMedicamentoActionPerformed

    private void btnVenderMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderMedicamentoActionPerformed
        int filaSeleccionada = TablaMedicamentos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) TablaMedicamentos.getModel();

            String nombre = modelo.getValueAt(filaSeleccionada, 0).toString();
            String descripcion = modelo.getValueAt(filaSeleccionada, 1).toString();
            double costo = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 2).toString());

            // Si no tienes columna de tipo, puedes asumir un tipo por defecto
            String tipo = "Genérico"; // o "Marca" si quieres

            double precioVenta;
            if ("Genérico".equalsIgnoreCase(tipo)) {
                precioVenta = costo * 1.10;
            } else if ("Marca".equalsIgnoreCase(tipo)) {
                precioVenta = costo * 1.25;
            } else {
                JOptionPane.showMessageDialog(this, "Tipo de medicamento no reconocido.");
                return;
            }

            // Eliminar del inventario central (Hospital)
            List<Medicamento> medicamentos = hospital.getInventarioFarmacia().getMedicamentos();
            Medicamento medAEliminar = null;
            for (Medicamento m : medicamentos) {
                if (m.getNombre().equals(nombre) && m.getDescripcion().equals(descripcion)) {
                    medAEliminar = m;
                    break;
                }
            }

            if (medAEliminar != null) {
                medicamentos.remove(medAEliminar);
            }

            // Actualizar tabla
            llenarTablaMedicamentos();

            // Limpiar campos
            txtNombre.setText("");
            txtDescripcion.setText("");
            txtCosto.setText("");
            jComboBox1.setSelectedIndex(0);

            JOptionPane.showMessageDialog(this, "Venta realizada. \n"
                    + "Medicamento: " + nombre + "\n"
                    + "Tipo: " + tipo + "\n"
                    + "Precio de venta: $" + String.format("%.2f", precioVenta));
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un medicamento para vender.");
        }
    }//GEN-LAST:event_btnVenderMedicamentoActionPerformed

    private void btnEliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedicamentoActionPerformed
        int filaSeleccionada = TablaMedicamentos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un medicamento para eliminar.");
            return;
        }

        String nombreMedicamento = TablaMedicamentos.getValueAt(filaSeleccionada, 0).toString();

        // Buscar y eliminar el medicamento del inventario del hospital
        List<Medicamento> medicamentos = hospital.getInventarioFarmacia().getMedicamentos();

        Medicamento medicamentoAEliminar = null;
        for (Medicamento m : medicamentos) {
            if (m.getNombre().equals(nombreMedicamento)) {
                medicamentoAEliminar = m;
                break;
            }
        }

        if (medicamentoAEliminar != null) {
            medicamentos.remove(medicamentoAEliminar);
            JOptionPane.showMessageDialog(this, "Medicamento eliminado correctamente.");
            llenarTablaMedicamentos();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el medicamento en el inventario.");
        }
    }//GEN-LAST:event_btnEliminarMedicamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMedicamentos;
    private javax.swing.JButton btnAgregarMedicamento;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarMedicamento;
    private javax.swing.JButton btnModificarMedicamento;
    private javax.swing.JButton btnVenderMedicamento;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
