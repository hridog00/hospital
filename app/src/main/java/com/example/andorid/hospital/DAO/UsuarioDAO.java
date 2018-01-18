package com.example.andorid.hospital.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class UsuarioDAO {

    ConexionBD BD = new ConexionBD();
    public boolean comprobar() throws Exception{

        BD.abrirConexion();
        BD.cerrarConexion();


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
