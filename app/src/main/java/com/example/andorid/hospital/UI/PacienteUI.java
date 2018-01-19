package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.andorid.hospital.Controllers.EstudianteController;
import com.example.andorid.hospital.Controllers.PacienteController;
import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.UI.MedicacionEnfermeroUI;

import java.util.ArrayList;

public class PacienteUI extends AppCompatActivity {

    EstudianteController estudianteController = new EstudianteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_ui);


        ArrayList<Estudiante> listaEstudiantes= null;
        try {
            //listaEstudiantes = estudianteController.getEstudiante();
        } catch (Exception e) {
            e.printStackTrace();
        }



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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                Intent cerrar = new Intent(getApplicationContext(), IniciarSesionUI.class);
                startActivity(cerrar);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
