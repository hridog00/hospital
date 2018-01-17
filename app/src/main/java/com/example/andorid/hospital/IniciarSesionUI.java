package com.example.andorid.hospital;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class IniciarSesionUI extends Activity {

    final SesionController sesionController = new SesionController();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button botonLogin = (Button) findViewById(R.id.button);
        botonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               Intent  menu  = new Intent(getApplicationContext(), menuUI.class);

               //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
               // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);
                if(sesionController.iniciarSesion()){
                    ArrayList<String>  info = sesionController.getListaPacientes();
                    menu.putExtra("Paciente",info );
                    startActivity(menu);
                }else{
                    //mensaje de error
                }

            }
        });
    }
}
