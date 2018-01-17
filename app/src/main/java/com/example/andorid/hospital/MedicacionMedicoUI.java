package com.example.andorid.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MedicacionMedicoUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicacion_medico_ui);


        final int N = 10; // total number of textviews to add

        final Button[] button = new Button[N]; // create an empty array;
        final TextView[] textviews = new TextView[N];

        GridLayout grid = (GridLayout) findViewById(R.id.gridLayout);
        for (int i = 0; i < N; i++) {
            // create a new textview
            final Button boton = new Button(this);
            final TextView textv = new TextView(this);
            // set some properties of rowTextView or something
            boton.setText("This is row #" + i);
            textv.setText("i");
            // add the textview to the linearlayout
            grid.addView(boton);
            grid.addView(textv);
            // save a reference to the textview for later
            button[i] = boton;
            textviews[i]=textv;

            boton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent prueba  = new Intent(getApplicationContext(), EstudianteUI.class);

                    startActivity(prueba);
                }
            });
        }
    }
}
