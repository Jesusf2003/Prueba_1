package dao;

//Concectado con base de datos

import Modelo.ConsultaModelo;
import Modelo.MedicoModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Medicodao extends Conexion{
    
    //Metodo para agregar Medicos
    public boolean agregarMedico(MedicoModelo medico) throws SQLException{
        try {
        this.conexion();
        String sql = "insert into medico values(null, ?, ?, ?, str_to_date(?, '%d/%m/%Y'), ?, ?, ?, ?, 'A')";
        PreparedStatement ps = this.getCn().prepareStatement(sql);
        ps.setString(1, medico.getNombre_med());
        ps.setString(2, medico.getApellido_med());
        ps.setString(3, medico.getDireccion_med());
        ps.setString(4, medico.getFecha_nac_med());
        ps.setString(5, medico.getDni_med());
        ps.setString(6, medico.getCelular_med());
        ps.setString(7, medico.getEspecialidad());
        ps.setString(8, medico.getSexo_med());
        ps.executeUpdate();
        return true;
        } catch (SQLException e) {
            System.err.println("Ocurrió un error al agregar médico: "+ e.getMessage());
            return false;
        }finally{
            this.desconectar();
        }
    }
    
    //Metodo para actualizar lista
    public boolean actualizarMedico(MedicoModelo medico) throws SQLException{
        try {
        this.conexion();
        String sql = "UPDATE MEDICO SET NOMBRE=?, APELLIDO=?, DIRECCION=?, FECHA_NAC=str_to_date(?, '%d/%m/%Y'), DNI=?,CELULAR=?, ESPECIALIDAD=?, SEXO=? WHERE ID=?";
        PreparedStatement ps = this.getCn().prepareStatement(sql);
        ps.setString(1, medico.getNombre_med());
        ps.setString(2, medico.getApellido_med());
        ps.setString(3, medico.getDireccion_med());
        ps.setString(4, medico.getFecha_nac_med());
        ps.setString(5, medico.getDni_med());
        ps.setString(6, medico.getCelular_med());
        ps.setString(7, medico.getEspecialidad());
        ps.setString(8, medico.getSexo_med());
        ps.setInt(9, medico.getId());
        ps.executeUpdate();
        return true;
        } catch (SQLException e) {
            System.err.println("Ocurrió un error al agregar paciente: "+ e.getMessage());
            return false;
        }finally{
            this.desconectar();
        }
    }
    
    public boolean inactivarMedico(Integer id) throws SQLException{
        try {
            this.conexion();
            String sql = "UPDATE MEDICO SET  ESTADO='I' where id=?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Ocurrió un error al inactivar el medico: "+ e.getMessage());
            return false;
        } finally{
            this.desconectar();
        }
    }
    
    //Metodo para listar Medico
    public ArrayList<MedicoModelo> listaMedico() throws SQLException{
        this.conexion();
        ResultSet rs;
        ArrayList<MedicoModelo> lista;
        try {
            String sql = "SELECT * FROM MEDICO where ESTADO='A'";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            rs = ps.executeQuery();
            lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                        new MedicoModelo(
                                rs.getInt("ID"),
                                rs.getString("Nombre"),
                                rs.getString("Apellido"),
                                rs.getString("Direccion"),
                                rs.getString("fecha_nac"),
                                rs.getString("Dni"),
                                rs.getString("Celular"),
                                rs.getString("Especialidad"),
                                rs.getString("Sexo")
                        )
                );
            }
            return lista;
        } catch (SQLException e) {
            System.err.println("Ocure un error al listar medico: "+ e.getMessage());
            return null;
        }finally{
            this.desconectar();
        }
    }
}
