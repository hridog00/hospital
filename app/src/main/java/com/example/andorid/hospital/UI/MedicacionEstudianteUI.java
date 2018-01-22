package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.andorid.hospital.Controllers.MedicacionController;
import com.example.andorid.hospital.Medicacion;
import com.example.andorid.hospital.R;

import java.util.ArrayList;

public class MedicacionEstudianteUI extends AppCompatActivity {

    MedicacionController medicacionController = new MedicacionController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicacion_estudiante_ui);

        Bundle datos = this.getIntent().getExtras();

        final int idPaciente = datos.getInt("idPaciente");

        TextView nombre = (TextView) findViewById(R.id.nombreP) ;
        nombre.setText(datos.getString("nombrePaciente"));

        ArrayList<Medicacion> medicacions = new ArrayList<>();


        try {
            medicacions = medicacionController.getMedicacion(idPaciente);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<TextView> textviews = new ArrayList<>();
        GridLayout grid = (GridLayout) findViewById(R.id.grid);

        for (int i = 0; i < medicacions.size(); i++) {
            // create a new textview
            final TextView textv = new TextView(this);

            // set some properties of rowTextView or something
            textv.setText("Nombre: " + medicacions.get(i).getNombre() + " Dosis: " + medicacions.get(i).getDosis() + " Hora: " + medicacions.get(i).getHora());

            // add the textview to the linearlayout

            grid.addView(textv);

            // save a reference to the textview for later
            textviews.add(textv);
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
