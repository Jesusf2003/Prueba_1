package dao;

import Modelo.ConsultaModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultadao extends Conexion{
    
    //Metodo para agregar consulta
    public void agregarConsulta(ConsultaModelo consulta) throws SQLException{
        try {
            this.conexion();
            String sql = "insert into consulta values(null,?, ?, str_to_date(?,'%d/%m/%Y'), ?), DESCRIPCION=?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, consulta.getId_medico());
            ps.setInt(2, consulta.getId_paciente());
            ps.setString(3, consulta.getFecha_consulta());
            ps.setString(4, consulta.getDescripcion());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Ocurrió un error al agregar consulta: "+ e.getMessage());
        } finally{
            this.desconectar();
        }
    }
    
    public void actualizarcConsulta(ConsultaModelo consulta) throws SQLException{
        try {
            this.conexion();
            String sql = "UPDATE CONSULTA  SET ID=?, ID_MEDICO=?, ID_PACIENTE=?, FECHA_CONSULTA=str_to_date(?,'%d/%m/%Y') WHERE ID =?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, consulta.getId_medico());
            ps.setInt(2, consulta.getId_paciente());
            ps.setString(3, consulta.getFecha_consulta());
            ps.setString(4, consulta.getDescripcion());
            ps.setInt(5, consulta.getId_consulta());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Ocurrió un error al agregar consulta: "+ e.getMessage());
        } finally{
            this.desconectar();
        }
    }
    
    //Metodo para listar consulta
    public ArrayList<ConsultaModelo> listaConsulta() throws SQLException{
        this.conexion();
        ResultSet rs;
        ArrayList<ConsultaModelo> lista;
        try {
            //Para ver todos los registros Select * From (nombre de tabla)
            String sql = "SELECT ID, ID_MEDICO, ID_PACIENTE, FECHA_CONSULTA, DESCRIPCION FROM CONSULTA";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            rs = ps.executeQuery();
            lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                        new ConsultaModelo(
                                rs.getInt("ID"),
                                rs.getInt("Id_medico"),
                                rs.getInt("Id_paciente"),
                                rs.getString("Fecha_CONSULTA"),
                                rs.getString("Descripcion")
                        )
                );
            }
            return lista;
        } catch (SQLException e) {
            System.err.println("Ocurrió un error al listar consultas: "+ e.getMessage());
            return null;
        } finally{
            this.desconectar();
        }
    }
}
