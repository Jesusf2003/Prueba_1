package Controlador;

import Modelo.ConsultaModelo;
import dao.Consultadao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ConsultaControlador {
    
    Consultadao dao = new Consultadao();
    ArrayList<ConsultaModelo> listaConsulta = new ArrayList<>();
    
    public boolean agregarConsulta(int id_medico, int id_paciente, String fecha, String descripcion){
        try {
            dao.agregarConsulta(new ConsultaModelo(0, id_medico, id_paciente, fecha, descripcion));
            return true;
        } catch (SQLException e) {
            System.err.println("Ocurrió un error en el controlador consulta: ");
            return false;
        }
    }
    
    public boolean actualizarConsulta(int id, int id_medico, int id_paciente, String fecha, String descripcion){
        try {
            dao.agregarConsulta(new ConsultaModelo(id, id_medico, id_paciente, fecha, descripcion));
            return true;
        } catch (SQLException e) {
            System.err.println("Ocurrió un error en el controlador consulta: ");
            return false;
        }
    }
    
    public DefaultTableModel listarConsulta(){
        String[] columnas = {" Id Consulta "," Id Medico "," Id Paciente "," Fecha "," Descripcion "};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        Object[] registros = new Object[5];
        try {
            listaConsulta = dao.listaConsulta();
            for(int i=0; i<listaConsulta.size(); i++){
                registros[0] = listaConsulta.get(i).getId_consulta();
                registros[1] = listaConsulta.get(i).getId_medico();
                registros[2] = listaConsulta.get(i).getId_paciente();
                registros[3] = listaConsulta.get(i).getFecha_consulta();
                registros[4] = listaConsulta.get(i).getDescripcion();
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            System.err.println("Error al listar consulta");
            return null ;
        }
    }

    public void agregarConsulta(int SOMEBITS, String paciente, String fecha, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarConsulta(String medico, String paciente, String fecha, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarConsulta(String consulta, String medico, String paciente, String fecha, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean actualizarConsulta(int parseInt, int parseInt0, String fecha, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean actualizarConsulta(String idConsulta, int ALLBITS, String idMedico, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean actualizarConsulta(String idConsulta, String idMedico, String idPaciente, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean actualizarConsulta(String idConsulta, String idMedico, String idPaciente, String fechaConsulta, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
