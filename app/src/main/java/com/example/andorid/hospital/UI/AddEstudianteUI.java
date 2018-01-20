package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.andorid.hospital.Controllers.EstudianteController;
import com.example.andorid.hospital.Controllers.PacienteController;
import com.example.andorid.hospital.Paciente;
import com.example.andorid.hospital.R;

import java.util.ArrayList;

public class AddEstudianteUI extends AppCompatActivity {
    final EstudianteController estudianteController = new EstudianteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_estudiante_ui);



        Button btnSend = (Button) findViewById(R.id.send);
        btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ArrayList<String> info = new ArrayList<>();
                info.add(((EditText)findViewById(R.id.nombre)).getText().toString());
                info.add(((EditText)findViewById(R.id.apellidos)).getText().toString());
                info.add(((EditText)findViewById(R.id.dni)).getText().toString());
                info.add(((EditText)findViewById(R.id.fecha)).getText().toString());
                info.add(((EditText)findViewById(R.id.domicilio)).getText().toString());
                info.add(((EditText)findViewById(R.id.datos_academicos)).getText().toString());
                try {
                    estudianteController.addEstudiante(info);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                finish();

            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);




        return super.onCreateOptionsMenu(menu);
    }
}
