package dao;

import Modelo.PacienteModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDao extends Conexion {
    
    //Método para listar pacientes
    public void agregarPaciente(PacienteModelo paciente) throws SQLException{
        try {
            this.conexion();
            String sql = "insert into paciente values (null, ?, ?, ?, str_to_date(?, '%d/%m/%Y'), ?, ?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDireccion());
            ps.setString(4, paciente.getFecha_nac());
            ps.setString(5, paciente.getDni());
            ps.setString(6, paciente.getCelular());
            //Transacciones
            ps.executeUpdate();
        } catch (Exception e) {
            //Ejecuta el mansaje con el error
            System.err.println("Ocurrió un error alagregar paciente: "+ e.getMessage());
        }finally{
            this.desconectar();
        }
    }
    
    public ArrayList<PacienteModelo> listaPacientes() throws SQLException{
        this.conexion();
        ResultSet rs;
        ArrayList<PacienteModelo> lista;
        try {
            String sql = "SELECT * FROM PACIENTE";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            //Consultas que modifican datos en la database y se guarda en "rs"
            rs = ps.executeQuery();
            lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                        new PacienteModelo(
                                rs.getInt("id"),
                                rs.getString("Nombre"),
                                rs.getString("Apellido"),
                                rs.getString("Direccion"),
                                rs.getString("Fecha_nac"),
                                rs.getString("Dni"),
                                rs.getString("Celular")
                        )
                );
            }
            return lista;
        } catch (SQLException e) {
            System.err.println("Ocurrió un error al listar pacientes: "+ e.getMessage());
            return null;
        }finally{
            this.desconectar();
        }
    }
}
