package dao;

import Modelo.UsuarioModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuariodao extends Conexion{
    
    public UsuarioModelo IniciarSesion(String email, String contra) throws SQLException{
        this.conexion();
        UsuarioModelo usuario = null;
        ResultSet rs;
        try {
            String sql = "SELECT id, nombre, apellido, email, contrasena, estado FROM usuario WHERE email = ? AND  contrasena = ?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, contra);
            rs = ps.executeQuery();
            if(rs.next()){
               usuario = new UsuarioModelo(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("APELLIDO"), rs.getString("EMAIL"), rs.getString("CONTRASENA"), rs.getString("ESTADO"));
            }
            return usuario;
        } catch (SQLException e) {
            System.err.println("Ocurrió un error al iniciar sesión: "+ e.getMessage());
            return null;
        }finally{
            this.desconectar();
        }
    }
}