package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andorid.hospital.R;
import com.example.andorid.hospital.UI.MedicacionEnfermeroUI;

public class PacienteUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_ui);
        Button medicacion = (Button) findViewById(R.id.button5);

        medicacion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //llamar a factoria
                Intent med  = new Intent(getApplicationContext(), MedicacionEnfermeroUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(med);

            }

        });
    }
}
