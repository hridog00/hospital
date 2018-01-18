package com.example.andorid.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class UsuarioDAO {

    //ConexionBD BD = new ConexionBD();
    public boolean comprobar(String username, String password) throws Exception{

       //ResultSet rs  = BD.abrirConexion("SELECT * FROM Usuario WHERE username='"+username+"' AND contraseña='"+password+ "'\n");

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<ResultSet> resultado = service.submit(new ConexionBD("SELECT * FROM Usuario WHERE username='"+username+"' AND contraseña='"+password+ "'\n"));
        resultado.get();



      //  BD.cerrarConexion();


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
