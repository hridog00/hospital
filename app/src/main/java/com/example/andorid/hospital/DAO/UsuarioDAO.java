package com.example.andorid.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class UsuarioDAO {

    ConexionBD BD = new ConexionBD();
    public boolean comprobar(String username, String password) throws Exception{

        BD.abrirConexion();

        Connection con = BD.getConexion();
      /*  PreparedStatement st = con.prepareStatement("SELECT * FROM Usuario WHERE username='"+username+"' AND contraseña='"+password+ "'\n");
        ResultSet rs = st.executeQuery();
        while(rs.next()){

            System.out.println(rs.getString("Nombre"));

        }

        BD.cerrarConexion();*/


        return true;
    }


    public void crearUsuario(String idUsuario)
    {



      /*  Usuario usuario = Usuario.getInstance();
        usuario.setIdUsuario(info.get(0));
        usuario.setnPlanta(info.get(1));
        usuario.setNombreUsuario(info.get(2));
        usuario.setTipo(info.get(3));*/

    }
}
