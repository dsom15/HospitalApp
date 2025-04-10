/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.hospitalapp.views;

import autonoma.hospitalapp.models.Hospital;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Dsoch
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Hospital hospital;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Hospital hospital) {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/HospitalApp/images/logoH.png")).getImage());
        } catch (Exception e) {

        }
        this.hospital = hospital;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEmpleados = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnPacientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnFarmacia = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/cooltext480218835084737.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/moduloEmpleado.png"))); // NOI18N

        javax.swing.GroupLayout btnEmpleadosLayout = new javax.swing.GroupLayout(btnEmpleados);
        btnEmpleados.setLayout(btnEmpleadosLayout);
        btnEmpleadosLayout.setHorizontalGroup(
            btnEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        btnEmpleadosLayout.setVerticalGroup(
            btnEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmpleadosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnPacientes.setBackground(new java.awt.Color(255, 255, 255));
        btnPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPacientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPacientesMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/moduloPaciente.png"))); // NOI18N

        javax.swing.GroupLayout btnPacientesLayout = new javax.swing.GroupLayout(btnPacientes);
        btnPacientes.setLayout(btnPacientesLayout);
        btnPacientesLayout.setHorizontalGroup(
            btnPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPacientesLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        btnPacientesLayout.setVerticalGroup(
            btnPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnFarmacia.setBackground(new java.awt.Color(255, 255, 255));
        btnFarmacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFarmaciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFarmaciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFarmaciaMouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/moduloFarmacia.png"))); // NOI18N

        javax.swing.GroupLayout btnFarmaciaLayout = new javax.swing.GroupLayout(btnFarmacia);
        btnFarmacia.setLayout(btnFarmaciaLayout);
        btnFarmaciaLayout.setHorizontalGroup(
            btnFarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        btnFarmaciaLayout.setVerticalGroup(
            btnFarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFarmaciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        btnInformacion.setBackground(new java.awt.Color(255, 255, 255));
        btnInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInformacionMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/hospital.png"))); // NOI18N

        javax.swing.GroupLayout btnInformacionLayout = new javax.swing.GroupLayout(btnInformacion);
        btnInformacion.setLayout(btnInformacionLayout);
        btnInformacionLayout.setHorizontalGroup(
            btnInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );
        btnInformacionLayout.setVerticalGroup(
            btnInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Modulo Empleados");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Modulo Pacientes");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Modulo Farmacia");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Informacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(63, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseClicked
        ModuloEmpleado moduloEmpleado = new ModuloEmpleado(this, true, this.hospital, this); 
        InicioEmpleado VentanaInicioEmpleado = new InicioEmpleado(this, true, this.hospital, this, moduloEmpleado);
        VentanaInicioEmpleado.setVisible(true);
    }//GEN-LAST:event_btnEmpleadosMouseClicked

    private void btnPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseClicked
        //le toca a rafa 
    }//GEN-LAST:event_btnPacientesMouseClicked

    private void btnFarmaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFarmaciaMouseClicked
        ModuloFarmacia VentanaModuloFarmacia = new ModuloFarmacia(this, true, this.hospital,this);
        VentanaModuloFarmacia.setVisible(true);
    }//GEN-LAST:event_btnFarmaciaMouseClicked

    private void btnInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseClicked
        // a los tres 
    }//GEN-LAST:event_btnInformacionMouseClicked

    private void btnEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseEntered
        this.mouseEntered(btnEmpleados);
    }//GEN-LAST:event_btnEmpleadosMouseEntered

    private void btnEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseExited
        this.mouseExited(btnEmpleados);
    }//GEN-LAST:event_btnEmpleadosMouseExited

    private void btnPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseEntered
        this.mouseEntered(btnPacientes);
    }//GEN-LAST:event_btnPacientesMouseEntered

    private void btnPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseExited
        this.mouseExited(btnPacientes);
    }//GEN-LAST:event_btnPacientesMouseExited

    private void btnFarmaciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFarmaciaMouseEntered
        this.mouseEntered(btnFarmacia);
    }//GEN-LAST:event_btnFarmaciaMouseEntered

    private void btnFarmaciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFarmaciaMouseExited
        this.mouseExited(btnFarmacia);
    }//GEN-LAST:event_btnFarmaciaMouseExited

    private void btnInformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseEntered
        this.mouseEntered(btnInformacion);
    }//GEN-LAST:event_btnInformacionMouseEntered

    private void btnInformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseExited
        this.mouseExited(btnInformacion);
    }//GEN-LAST:event_btnInformacionMouseExited
    private void mouseEntered(JPanel panel) {
        panel.setBackground(new Color(248, 242, 241));
    }

    private void mouseExited(JPanel panel) {
        panel.setBackground(new Color(255, 255, 255));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEmpleados;
    private javax.swing.JPanel btnFarmacia;
    private javax.swing.JPanel btnInformacion;
    private javax.swing.JPanel btnPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
