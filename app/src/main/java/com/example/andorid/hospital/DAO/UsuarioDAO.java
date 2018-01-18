package com.example.andorid.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class UsuarioDAO {

    //ConexionBD BD = new ConexionBD();
    public boolean comprobar(String username, String password) throws Exception{

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD("SELECT * FROM Usuario WHERE username='"+username+"' AND contraseña='"+password+ "'\n"));
        List res = resultado.get();

        for(int i=0; i<res.size(); i++)
        {
            System.out.println(res.get(i));
           /* List objeto = (List)res.get(i);
            for(int j=0;j<objeto.size();j++){
                System.out.println(objeto.get(j));
            }*/

        }

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
