/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalapp.views;

import autonoma.hospitalapp.models.Empleado;
import autonoma.hospitalapp.models.EmpleadoOperativo;
import autonoma.hospitalapp.models.EmpleadoSalud;
import autonoma.hospitalapp.models.Escritor;
import autonoma.hospitalapp.models.EscritorArchivoTextoPlano;
import autonoma.hospitalapp.models.Hospital;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dsoch
 */
public class ModuloEmpleado extends javax.swing.JDialog {

    private Hospital hospital;
    private VentanaPrincipal ventanaPrincipal;
    private Empleado empleado;
    private Escritor escritor;

    /**
     * Creates new form ModuloEmpleado
     */
    public ModuloEmpleado(java.awt.Frame parent, boolean modal, Hospital hospital, VentanaPrincipal ventana) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/HospitalApp/images/logoH.png")).getImage());
        } catch (Exception e) {

        }
        this.hospital = hospital;
        this.ventanaPrincipal = ventana;
        this.escritor = new EscritorArchivoTextoPlano();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtNombre3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNumeroDocumento = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSalarioBase = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        txtNombre3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/txtEmpleado.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("NOMBRE  ");

        jLabel3.setText("NUMERO DOCUMENTO");

        jLabel4.setText("EDAD");

        jLabel5.setText("SALARIO BASE");

        btnAgregarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpleado.setText("AGREGAR");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("VOLVER");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtNumeroDocumento.setBackground(new java.awt.Color(204, 204, 204));
        txtNumeroDocumento.setForeground(new java.awt.Color(153, 153, 153));

        txtEdad.setBackground(new java.awt.Color(204, 204, 204));
        txtEdad.setForeground(new java.awt.Color(153, 153, 153));

        txtSalarioBase.setBackground(new java.awt.Color(204, 204, 204));
        txtSalarioBase.setForeground(new java.awt.Color(153, 153, 153));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregarEmpleado)
                        .addGap(175, 175, 175)
                        .addComponent(btnSalir))
                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarEmpleado)
                            .addComponent(btnSalir))))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        String nombre = this.txtNombre.getText().trim();
        String numeroDocumento = this.txtNumeroDocumento.getText().trim();
        String edadTexto = this.txtEdad.getText().trim();
        String salarioBaseTexto = this.txtSalarioBase.getText().trim();

        // Validar campos vacíos
        if (nombre.isEmpty() || numeroDocumento.isEmpty() || edadTexto.isEmpty() || salarioBaseTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos antes de continuar");
            return;
        }

        try {
            int edad = Integer.parseInt(edadTexto);
            double salarioBase = Double.parseDouble(salarioBaseTexto);

            // Elegir tipo de empleado
            String[] opciones = {"Operativo", "Salud"};
            int tipoEmpleado = JOptionPane.showOptionDialog(this, "Seleccione el tipo de empleado:",
                    "Tipo de Empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opciones, opciones[0]);

            Empleado empleado;

            if (tipoEmpleado == 0) {
                String areaTrabajo = JOptionPane.showInputDialog(this, "Ingrese el area de trabajo:");
                if (areaTrabajo == null || areaTrabajo.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Area de trabajo no puede estar vacIa");
                    return;
                }
                empleado = new EmpleadoOperativo(areaTrabajo, nombre, numeroDocumento, edad, salarioBase);

            } else if (tipoEmpleado == 1) {
                String especialidad = JOptionPane.showInputDialog(this, "Ingrese la especialidad:");
                if (especialidad == null || especialidad.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Especialidad no puede estar vacia");
                    return;
                }
                String horasTexto = JOptionPane.showInputDialog(this, "Ingrese las horas trabajadas:");
                if (horasTexto == null || horasTexto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar las horas trabajadas");
                    return;
                }

                double horasTrabajadas;
                try {
                    horasTrabajadas = Double.parseDouble(horasTexto);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Ingrese un numero valido para horas trabajadas");
                    return;
                }

                empleado = new EmpleadoSalud(especialidad, horasTrabajadas, nombre, numeroDocumento, edad, salarioBase);

            } else {
                JOptionPane.showMessageDialog(this, "Operacion cancelada");
                return;
            }

            if (this.hospital.agregarEmpleado(empleado)) {
                JOptionPane.showMessageDialog(this, "Empleado " + nombre + " agregado exitosamente");

                // Guardar persistencia
                try {
                    ArrayList<String> datosEmpleados = this.hospital.obtenerDatosEmpleadosComoTexto();
                    this.escritor.escribir(datosEmpleados, "empleados.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar los empleados: " + ex.getMessage());
                }

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar el empleado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Edad o salario deben ser numeros validos");
        }

    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtSalarioBase;
    // End of variables declaration//GEN-END:variables
}
