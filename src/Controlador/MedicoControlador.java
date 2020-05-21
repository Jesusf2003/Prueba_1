package Controlador;

import Modelo.MedicoModelo;
import dao.Medicodao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MedicoControlador {
    
    Medicodao dao = new Medicodao();
    ArrayList<MedicoModelo> listaMedico = new ArrayList<>();
    
    public boolean agregarMedico(String nombre, String apellido, String direc, String fecha_nac, String dni, String cell, String espec, String sexo){
        try {
            dao.agregarMedico(new MedicoModelo(0, nombre, apellido, direc, fecha_nac, dni, cell, espec, sexo));
            return true;
        } catch (SQLException e) {
            System.err.println("Error en el controlador de agregar Medico");
            return false;
        }
    }
    
    public DefaultTableModel listarMedico() {
        String[] columnas = {"id", "Nombre", "Apellido", "Direccion", "Fecha Nacimiento", "Dni", "Celular", "Especialidad", "Sexo"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        Object[] registros = new Object[9];
        try {
            listaMedico = dao.listaMedico();
            for(int i=0; i<listaMedico.size(); i++){
                registros[0] = listaMedico.get(i).getId();
                registros[1] = listaMedico.get(i).getNombre_med();
                registros[2] = listaMedico.get(i).getApellido_med();
                registros[3] = listaMedico.get(i).getDireccion_med();
                registros[4] = listaMedico.get(i).getFecha_nac_med();
                registros[5] = listaMedico.get(i).getDni_med();
                registros[6] = listaMedico.get(i).getCelular_med();
                registros[7] = listaMedico.get(i).getEspecialidad();
                registros[8] = listaMedico.get(i).getSexo_med();
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            System.err.println("Error al listar pacientes");
            return null;
        }
        
    }
}
