package com.example.andorid.hospital;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class IniciarSesionUI extends Activity {

    final PrincipalDAO d = new PrincipalDAO();;


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

                ArrayList<String>  info = d.getInfo();
                menu.putExtra("Paciente",info );
                startActivity(menu);
            }
        });
    }
}
