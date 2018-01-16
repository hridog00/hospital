package com.example.andorid.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EstudianteUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante_ui);


        Button botonValoraciones = (Button) findViewById(R.id.button5);

        botonValoraciones.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent valoraciones  = new Intent(getApplicationContext(), ValoracionUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(valoraciones);
            }
        });
    }
}
