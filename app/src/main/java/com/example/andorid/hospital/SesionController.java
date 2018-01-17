package com.example.andorid.hospital;

import android.content.Intent;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class SesionController {
    final PrincipalDAO d = new PrincipalDAO();
    final UsuarioDAO usuario = new UsuarioDAO();


    public ArrayList<String>  getListaPacientes(){


        //PrincipalUI p = new PrincipalUI();
        //p.rellenar(info);
        // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

        ArrayList<String> info = d.getInfo();
        return  info;
    }

    public boolean iniciarSesion(){
        return usuario.comprobar();
    }
}
