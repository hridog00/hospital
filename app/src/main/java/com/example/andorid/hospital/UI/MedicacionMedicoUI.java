package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.andorid.hospital.Controllers.MedicacionController;
import com.example.andorid.hospital.Medicacion;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.UI.AddMUI;
import com.example.andorid.hospital.UI.EstudianteUI;

import java.util.ArrayList;

public class MedicacionMedicoUI extends AppCompatActivity {
    final MedicacionController medicacionController = new MedicacionController();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicacion_medico_ui);


        final int N = 10; // total number of textviews to add

        final Button[] button = new Button[N]; // create an empty array;
        final TextView[] textviews = new TextView[N];

        Bundle datos = this.getIntent().getExtras();

        final int idPaciente = datos.getInt("idPaciente");

        TextView nombre = (TextView) findViewById(R.id.nombreP) ;
        nombre.setText(datos.getString("nombrePaciente"));
        final String nombrePaciente = datos.getString("nombrePaciente");
        ArrayList<Medicacion> medicacions = new ArrayList<>();
        try {
            medicacions = medicacionController.getMedicacion(idPaciente);
        } catch (Exception e) {
            e.printStackTrace();
        }

        GridLayout grid = (GridLayout) findViewById(R.id.gridLayout);
        for (int i = 0; i < medicacions.size(); i++) {
            // create a new textview
            final Button boton = new Button(this);
            final TextView textv = new TextView(this);
           // final Button btnEliminar = new Button(this);
            final int idMedicacion = medicacions.get(i).getIdMedicacion();


            // set some properties of rowTextView or something
            boton.setText("Eliminar");
            textv.setText("Nombre: "+medicacions.get(i).getNombre()+" Dosis: "+medicacions.get(i).getDosis()+" Hora: "+medicacions.get(i).getHora());

            //boton.setBackground(this.getResources().getDrawable(R.drawable.ic_menu_manage));
            // add the textview to the linearlayout

            grid.addView(textv);

            grid.addView(boton);
            // save a reference to the textview for later
            button[i] = boton;
            textviews[i]=textv;

            /*boton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent prueba  = new Intent(getApplicationContext(), EstudianteUI.class);

                    startActivity(prueba);
                }
            });*/


            final Medicacion medicacionActual = medicacions.get(i);
            boton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                   // System.out.println("IDMEDICACION........"+idMedicacion);
                    medicacionController.eliminarMedicacion(medicacionActual, idMedicacion);
                    finish();
                }
            });

        }

        Button btnAnadir = (Button) findViewById(R.id.button5);

        btnAnadir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent addM  = new Intent(getApplicationContext(), AddMUI.class);
                addM.putExtra("idPaciente",idPaciente);
                addM.putExtra("nombrePaciente", nombrePaciente);
                startActivity(addM);
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
