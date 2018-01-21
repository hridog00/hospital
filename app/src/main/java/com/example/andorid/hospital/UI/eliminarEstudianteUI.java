package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andorid.hospital.Controllers.EstudianteController;
import com.example.andorid.hospital.R;

public class eliminarEstudianteUI extends AppCompatActivity {
    EstudianteController estudianteController = new EstudianteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar_estudiante);

        Button aceptar = (Button) findViewById(R.id.aceptar);

        Bundle datos = this.getIntent().getExtras();

        final int idEstudinate = datos.getInt("idEstudiante");

        Button eliminar = (Button) findViewById(R.id.cancelar);

        aceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                estudianteController.eliminarEstudiante(idEstudinate);

                Intent planta =  new Intent(getApplicationContext(), menuUI.class);
                startActivity(planta);
            }

        });
        eliminar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent planta =  new Intent(getApplicationContext(), menuUI.class);
                startActivity(planta);

            }

        });


    }
}
