package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.andorid.hospital.Controllers.MedicacionController;
import com.example.andorid.hospital.FactoriaInterfaz;
import com.example.andorid.hospital.Medicacion;
import com.example.andorid.hospital.R;

import java.util.ArrayList;

public class MedicacionEnfermeroUI extends AppCompatActivity {
    final MedicacionController medicacionController = new MedicacionController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicacion_enfermero_ui);

        final int N = 10; // total number of textviews to add

        final ArrayList <TextView> myTextViews = new ArrayList<>();// create an empty array;
        final ArrayList <CheckBox> checkDarMedicacion = new ArrayList<>();
        final ArrayList <CheckBox> checkNoDarMedicacion = new ArrayList<>();

        GridLayout grid = (GridLayout) findViewById(R.id.grid);

        final TextView rowTextViewInicial = new TextView(this);
        final TextView  darTitulo  = new TextView(this);
        final TextView noDarTitulo = new TextView(this);

        rowTextViewInicial.setText("Medicación           ");
        darTitulo.setText("Dada        ");
        noDarTitulo.setText("No dada");
        grid.addView(rowTextViewInicial);
        grid.addView(darTitulo);
        grid.addView(noDarTitulo);

        Bundle datos = this.getIntent().getExtras();

        int idPaciente = datos.getInt("idPaciente");
         ArrayList<Medicacion> medicacions = new ArrayList<>();
        try {
            medicacions = medicacionController.getMedicacion(idPaciente);
        } catch (Exception e) {
            e.printStackTrace();
        }


        for (int i = 0; i < medicacions.size(); i++) {
            // create a new textview
            final TextView rowTextView = new TextView(this);
            final CheckBox  dar  = new CheckBox(this);
            final CheckBox noDar = new CheckBox(this);

            // set some properties of rowTextView or something
            rowTextView.setText("Nombre: "+medicacions.get(i).getNombre()+" Dosis: "+medicacions.get(i).getDosis()+" Hora: "+medicacions.get(i).getHora());

            // add the textview to the linearlayout
            if(medicacions.get(i).getEstado()=='D'){
                dar.setChecked(true);
            }else if(medicacions.get(i).getEstado()=='X'){
                noDar.setChecked(true);
            }
            grid.addView(rowTextView);
            grid.addView(dar);
            grid.addView(noDar);
            //grid.addView(noDar);


            // save a reference to the textview for later
            myTextViews.add(rowTextView);
            checkDarMedicacion.add(dar);
            checkNoDarMedicacion.add(noDar);




            final int d = i;
            final ArrayList<Medicacion> medicacionArrayList = medicacions;
            dar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                noDar.setChecked(false);
                    medicacionController.cambiarEstado(medicacionArrayList.get(d).getIdMedicacion(), 'D');

                }
            });
            noDar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    medicacionController.cambiarEstado(medicacionArrayList.get(d).getIdMedicacion(), 'X');
                    dar.setChecked(false);
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
