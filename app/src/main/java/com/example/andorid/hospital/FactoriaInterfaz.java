package com.example.andorid.hospital;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */


public class FactoriaInterfaz {


    private static final SesionController sesionController = new SesionController();
    private static final FactoriaInterfaz ourInstance = new FactoriaInterfaz();

    public static FactoriaInterfaz getInstance() {
        return ourInstance;
    }

    public FactoriaInterfaz() {

    }



    public void mostrarInterfaz(char tipo, Context applicationContext)
    {

        ArrayList<String> info = sesionController.getListaPacientes();

        Intent intent = new Intent(applicationContext, menuUI.class);
        intent.putExtra("Paciente",info );
        applicationContext.startActivity(intent);

    }
}
