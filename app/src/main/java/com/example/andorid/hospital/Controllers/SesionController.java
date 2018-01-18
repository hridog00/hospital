package com.example.andorid.hospital.Controllers;

import com.example.andorid.hospital.DAO.PrincipalDAO;
import com.example.andorid.hospital.DAO.UsuarioDAO;

import com.example.andorid.hospital.DAO.PrincipalDAO;
import com.example.andorid.hospital.DAO.UsuarioDAO;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class SesionController {
    final PrincipalDAO d = new PrincipalDAO();
    final UsuarioDAO usuarioDAO = new UsuarioDAO();


    public ArrayList<String>  getListaPacientes(){


        //PrincipalUI p = new PrincipalUI();
        //p.rellenar(info);
        // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

        ArrayList<String> info = d.getInfo();
        return  info;
    }

    public boolean iniciarSesion(String username, String password) throws Exception{
        return usuarioDAO.comprobar(username, password);
    }


    public void crearUsuario(String id){
       usuarioDAO.crearUsuario(id);

    }

    public void cerrarSesion(){

    }
}
