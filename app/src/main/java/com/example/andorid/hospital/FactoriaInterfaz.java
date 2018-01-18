package com.example.andorid.hospital;

import android.content.Context;
import android.content.Intent;

import com.example.andorid.hospital.Controllers.PrincipalController;
import com.example.andorid.hospital.Controllers.SesionController;
import com.example.andorid.hospital.UI.MedicacionEnfermeroUI;
import com.example.andorid.hospital.UI.MedicacionEstudianteUI;
import com.example.andorid.hospital.UI.MedicacionMedicoUI;
import com.example.andorid.hospital.UI.MensajesUI;
import com.example.andorid.hospital.UI.PrincipalUI;
import com.example.andorid.hospital.UI.menuUI;
import com.example.andorid.hospital.UI.menu_M_UI;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */


public class FactoriaInterfaz {


    private static final SesionController sesionController = new SesionController();
    private static final FactoriaInterfaz ourInstance = new FactoriaInterfaz();
    private static final PrincipalController principalController = new PrincipalController();

    public static FactoriaInterfaz getInstance() {
        return ourInstance;
    }

    public FactoriaInterfaz() {

    }



    public void mostrarInterfaz(char tipo, Context applicationContext)
    {

        if(tipo=='E')
        {
            ArrayList<String> info = sesionController.getListaPacientes();
            Intent intent = new Intent(applicationContext, menuUI.class);
            intent.putExtra("Paciente",info );
            applicationContext.startActivity(intent);
        }
        else if(tipo=='M')
        {
            ArrayList<String> info = sesionController.getListaPacientes();
            Intent intent = new Intent(applicationContext, menu_M_UI.class);
            intent.putExtra("Paciente",info );
            applicationContext.startActivity(intent);
        }
        else if(tipo=='S')
        {
            ArrayList<String> info = sesionController.getListaPacientes();
            Intent intent = new Intent(applicationContext, PrincipalUI.class);
            intent.putExtra("Paciente",info );
            applicationContext.startActivity(intent);
        }
        else if(tipo=='P')
        {

            Intent intent = new Intent(applicationContext, MensajesUI.class);
            applicationContext.startActivity(intent);
        }


    }


    public void mostrarUIMedicacion(char tipo, Context applicationContext)
    {
        if(tipo=='E')
        {
            ArrayList<String> info = sesionController.getListaPacientes();
            Intent intent = new Intent(applicationContext, MedicacionEnfermeroUI.class);
            intent.putExtra("Paciente",info );
            applicationContext.startActivity(intent);
        }
        else if(tipo=='M')
        {
            ArrayList<String> info = sesionController.getListaPacientes();
            Intent intent = new Intent(applicationContext, MedicacionMedicoUI.class);
            intent.putExtra("Paciente",info );
            applicationContext.startActivity(intent);
        }
        else if(tipo=='S')
        {
            ArrayList<String> info = sesionController.getListaPacientes();
            Intent intent = new Intent(applicationContext, MedicacionEstudianteUI.class);

            intent.putExtra("Paciente",info );
            applicationContext.startActivity(intent);
        }


    }
}
