package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.andorid.hospital.FactoriaInterfaz;
import com.example.andorid.hospital.R;

public class MedicacionEnfermeroUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicacion_enfermero_ui);

        final int N = 10; // total number of textviews to add

        final TextView[] myTextViews = new TextView[N]; // create an empty array;
        final CheckBox[] checkDarMedicacion = new CheckBox[N];
        final CheckBox[] checkNoDarMedicacion = new CheckBox[N];

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


        for (int i = 0; i < N; i++) {
            // create a new textview
            final TextView rowTextView = new TextView(this);
            final CheckBox  dar  = new CheckBox(this);
            final CheckBox noDar = new CheckBox(this);

            // set some properties of rowTextView or something
            rowTextView.setText("This is row #" + i);

            // add the textview to the linearlayout
            grid.addView(rowTextView);
            grid.addView(dar);
            grid.addView(noDar);
            //grid.addView(noDar);


            // save a reference to the textview for later
            myTextViews[i] = rowTextView;
            checkDarMedicacion[i]=dar;
            checkNoDarMedicacion[i]=noDar;





            dar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                noDar.setChecked(false);

                }
            });

            noDar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

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
}
