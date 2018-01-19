package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.andorid.hospital.Controllers.EstudianteController;
import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.UI.EstudianteUI;

import java.util.ArrayList;

public class ListaEstudiantesUI extends AppCompatActivity {

    EstudianteController estudianteController = new EstudianteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        ArrayList<Estudiante> listaEstudiantes= null;
        try {
           listaEstudiantes = estudianteController.getLista();
        } catch (Exception e) {
            e.printStackTrace();
        }



        final int N = listaEstudiantes.size(); // total number of textviews to add

        final Button[] button = new Button[N]; // create an empty array;
        LinearLayout linear = (LinearLayout) findViewById(R.id.linearLayout);
        int i;
        for (i = 0; i < N; i++) {
            // create a new textview
            final Button boton = new Button(this);

            // set some properties of rowTextView or something
            boton.setText(listaEstudiantes.get(i).getNombre()+" "+listaEstudiantes.get(i).getApellido());

            // add the textview to the linearlayout
            linear.addView(boton);
            // save a reference to the textview for later
            button[i] = boton;

            final int j=i;
            final int idEst = listaEstudiantes.get(j).getIdEstudiante();
            boton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent prueba  = new Intent(getApplicationContext(), EstudianteUI.class);
                    prueba.putExtra("id", idEst);
                    startActivity(prueba);
                }
            });
        }
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
