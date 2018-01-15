package com.example.andorid.hospital;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends Activity {
    final PrincipalDAO d = new PrincipalDAO();;
    public static final String[] pacientes =new String[12];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button botonLogin = (Button) findViewById(R.id.button);
        botonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent planta  = new Intent(getApplicationContext(), menu.class);
                ArrayList<String>  info = d.getInfo();
               //planta p = new planta();
                //p.rellenar(info);
               // Intent planta  = new Intent(getApplicationContext(), menu.class);
                pacientes[0] = "Helena";
                pacientes[1] = "Sergio";


                planta.putExtra("Paciente",pacientes );
                startActivity(planta);
            }
        });
    }
}
