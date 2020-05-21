/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PacienteControlador;
import javax.swing.JOptionPane;

/**
 *
 * @author FernandoCanales
 */
public class DlgNuevoPaciente extends javax.swing.JDialog {

    PacienteControlador controlador = new PacienteControlador();

    /**
     * Creates new form DlgNuevoPaciente
     */
    public DlgNuevoPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
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
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblFecha_nac = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFecha_nac = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Nuevo Paciente");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellido.setText("Apellidos:");

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDireccion.setText("Dirección:");

        lblFecha_nac.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFecha_nac.setText("Fecha de Nacimiento:");

        lblDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDni.setText("Nº de DNI:");

        lblCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCelular.setText("Nº de Celular:");

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtFecha_nac.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtCelular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDni)
                        .addGap(18, 18, 18)
                        .addComponent(txtDni))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFecha_nac)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha_nac, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCelular)
                        .addGap(18, 18, 18)
                        .addComponent(txtCelular))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(69, 69, 69)
                .addComponent(btnCancelar)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha_nac)
                    .addComponent(txtFecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String direc = txtDireccion.getText();
        String fechaNac = txtFecha_nac.getText();
        String dni = txtDni.getText();
        String celular = txtCelular.getText();
        boolean esCorrecto = controlador.agregarPaciente(nombre, apellido, direc, fechaNac, dni, celular);
        if (esCorrecto) {
            JOptionPane.showMessageDialog(null, "Se agregó el paciente correctamente", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar", "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFecha_nac;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha_nac;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
