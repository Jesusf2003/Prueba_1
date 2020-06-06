/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ConsultaControlador;
import javax.swing.JOptionPane;

/**
 *
 * @author FernandoCanales
 */
public class DlgNuevaConsulta extends javax.swing.JDialog {

    ConsultaControlador controlador = new ConsultaControlador();

    /**
     * Creates new form DlgNuevaConsulta
     */
    public DlgNuevaConsulta(java.awt.Frame parent, boolean modal) {
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

        lblTituloNuevaConsulta = new javax.swing.JLabel();
        lblidconsulta = new javax.swing.JLabel();
        lblidmedico = new javax.swing.JLabel();
        lblidpaciente = new javax.swing.JLabel();
        lblfechaconsulta = new javax.swing.JLabel();
        lbldescripcion = new javax.swing.JLabel();
        txtidmedico = new javax.swing.JTextField();
        txtidpaciente = new javax.swing.JTextField();
        txtfechaconsulta = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtIdConsulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTituloNuevaConsulta.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTituloNuevaConsulta.setText("Nueva Consulta");

        lblidconsulta.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblidconsulta.setText("ID Consulta:");

        lblidmedico.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblidmedico.setText("ID Médico:");

        lblidpaciente.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblidpaciente.setText("ID Paciente:");

        lblfechaconsulta.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblfechaconsulta.setText("Fecha de la Consulta:");

        lbldescripcion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbldescripcion.setText("Descripción:");

        txtidmedico.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtidpaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtfechaconsulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtIdConsulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblfechaconsulta)
                        .addGap(18, 18, 18)
                        .addComponent(txtfechaconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblidpaciente)
                        .addGap(18, 18, 18)
                        .addComponent(txtidpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTituloNuevaConsulta)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblidconsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblidmedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTituloNuevaConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidconsulta)
                    .addComponent(txtIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidmedico)
                    .addComponent(txtidmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidpaciente)
                    .addComponent(txtidpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfechaconsulta)
                    .addComponent(txtfechaconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String medico = txtidmedico.getText();
        String paciente = txtidpaciente.getText();
        String fecha = txtfechaconsulta.getText();
        String descripcion = txtDescripcion.getText();
        boolean esCorrecto = controlador.agregarConsulta(Integer.parseInt(medico), Integer.parseInt(paciente), fecha, descripcion);
        if (esCorrecto) {
            JOptionPane.showMessageDialog(null, "Se agregó el paciente correctamente", "Mensaje del sistema: ", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "No se agregó el paciente correctamente", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblTituloNuevaConsulta;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JLabel lblfechaconsulta;
    private javax.swing.JLabel lblidconsulta;
    private javax.swing.JLabel lblidmedico;
    private javax.swing.JLabel lblidpaciente;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdConsulta;
    private javax.swing.JTextField txtfechaconsulta;
    private javax.swing.JTextField txtidmedico;
    private javax.swing.JTextField txtidpaciente;
    // End of variables declaration//GEN-END:variables
}
