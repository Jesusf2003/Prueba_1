package Controlador;

import Modelo.UsuarioModelo;
import dao.Usuariodao;
import java.sql.SQLException;

public class UsuarioControlador {
    
    Usuariodao dao = new Usuariodao();
    
    public boolean iniciarSesion(String email, String contra){
        UsuarioModelo usuario = new UsuarioModelo();
        try {
            usuario = dao.IniciarSesion(email, contra);
            return usuario != null;
        } catch (SQLException e) {
            System.err.println("Ocurrio un error en el controlador de  iniciar sesión: "+ e.getMessage());
            return false;
        }
    }
}
