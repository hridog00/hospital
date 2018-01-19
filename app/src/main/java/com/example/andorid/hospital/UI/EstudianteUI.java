package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.andorid.hospital.Controllers.EstudianteController;
import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.Valoracion;

import java.util.concurrent.ExecutionException;

public class EstudianteUI extends AppCompatActivity {

    EstudianteController estudianteController = new EstudianteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante_ui);

        Bundle datos = this.getIntent().getExtras();

        int idEstudiante = datos.getInt("id");
        Estudiante estudiante = null;
        try {
            estudiante = estudianteController.getEstudiante(idEstudiante);

        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        TextView nombretxt = findViewById(R.id.nombretxt);
        nombretxt.setText("Nombre:    "+estudiante.getNombre());


        TextView apellidotxt = findViewById(R.id.apellidostxt);
        apellidotxt.setText("Apellido:    "+estudiante.getApellido());


        TextView dnitxt = findViewById(R.id.dnitxt);
        dnitxt.setText("DNI:    "+estudiante.getdni());

        TextView fechatxt = findViewById(R.id.fechatxt);
        fechatxt.setText("Fecha de Nacimiento:    "+estudiante.getFecha());



        final int idEst = idEstudiante;


        Button botonValoraciones = (Button) findViewById(R.id.button5);

        botonValoraciones.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent valoraciones  = new Intent(getApplicationContext(), ValoracionUI.class);
                valoraciones.putExtra("isEstudiante", idEst);


                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(valoraciones);
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
                Intent  cerrar  = new Intent(getApplicationContext(), IniciarSesionUI.class);
                startActivity(cerrar);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
