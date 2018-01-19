package com.example.andorid.hospital.DAO;

import android.content.Intent;

import com.example.andorid.hospital.Usuario;

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

        if(res.size()==0){
            return false;
        }
        for(int i=0; i<res.size(); i++)
        {
            // System.out.println(res.get(i));
            List objeto = (List)res.get(i);
            for(int j=0;j<objeto.size();j++){
                System.out.println(objeto.get(j));
            }

        }

        return true;
    }


    public void crearUsuario(String idUsuario) throws Exception
    {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD("SELECT * FROM Usuario WHERE username='"+idUsuario+"' \n"));
        List result = resultado.get();
        List res =(List)result.get(0);




        Usuario usuario = Usuario.getInstance();

       /* usuario.setIdUsuario(Integer.parseInt(res.get(0).toString()));
       // usuario.setnPlanta(info.get(1));
        String nombreCompleto = res.get(1).toString() +" "+res.get(2).toString();
        usuario.setNombreUsuario(nombreCompleto);
        usuario.setTipo(res.get(4).toString().charAt(0));*/

    }
}
