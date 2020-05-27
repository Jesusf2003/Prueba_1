/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PacienteControlador;
import java.awt.Frame;

/**
 *
 * @author FernandoCanales
 */
public class DlgVistaPaciente extends javax.swing.JDialog {
    
    Frame parentFrame;
    PacienteControlador controlador = new PacienteControlador();

    /**
     * Creates new form DlgVistaPaciente
     */
    public DlgVistaPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        parentFrame = parent;
        initComponents();
        this.setLocationRelativeTo(null);
        cargarListaPAcientes();
    }
    
    public void cargarListaPAcientes(){
        try {
            tblPaciente.setModel(controlador.listarPacientes());
        } catch (Exception e) {
        }
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
        srcPaciente = new javax.swing.JScrollPane();
        tblPaciente = new javax.swing.JTable();
        btnNuevoPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Pacientes");

        tblPaciente.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacienteMouseClicked(evt);
            }
        });
        srcPaciente.setViewportView(tblPaciente);

        btnNuevoPaciente.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnNuevoPaciente.setText("Nuevo Paciente");
        btnNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(srcPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoPaciente))
                .addGap(18, 18, 18)
                .addComponent(srcPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacienteActionPerformed
        DlgNuevoPaciente dlgnuevopaciente = new DlgNuevoPaciente(parentFrame, true);
        dlgnuevopaciente.setVisible(true);
        cargarListaPAcientes();
    }//GEN-LAST:event_btnNuevoPacienteActionPerformed

    private void tblPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacienteMouseClicked
        int filaseleccionada = tblPaciente.getSelectedRow();
        
        Dlgeditarpaciente dlgeditarpaciente = new Dlgeditarpaciente(parentFrame, true);
        dlgeditarpaciente.idPaciente = tblPaciente.getModel().getValueAt(filaseleccionada, 0).toString();
        dlgeditarpaciente.nombrePaciente = tblPaciente.getModel().getValueAt(filaseleccionada, 1).toString();
        dlgeditarpaciente.apellidoPaciente = tblPaciente.getModel().getValueAt(filaseleccionada, 2).toString();
        dlgeditarpaciente.direccionPaciente = tblPaciente.getModel().getValueAt(filaseleccionada, 3).toString();
        dlgeditarpaciente.fecha_nacPaciente = tblPaciente.getModel().getValueAt(filaseleccionada, 4).toString();
        dlgeditarpaciente.dniPaciente = tblPaciente.getModel().getValueAt(filaseleccionada, 5).toString();
        dlgeditarpaciente.celularPaciente = tblPaciente.getModel().getValueAt(filaseleccionada, 6).toString();
        
        dlgeditarpaciente.setVisible(true);
        cargarListaPAcientes();
    }//GEN-LAST:event_tblPacienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane srcPaciente;
    private javax.swing.JTable tblPaciente;
    // End of variables declaration//GEN-END:variables
}
