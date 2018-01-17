package com.example.andorid.hospital;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListaEstudiantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);


       final int N = 10; // total number of textviews to add

        final Button[] button = new Button[N]; // create an empty array;
        LinearLayout linear = (LinearLayout) findViewById(R.id.linearLayout);
        for (int i = 0; i < N; i++) {
            // create a new textview
            final Button boton = new Button(this);

            // set some properties of rowTextView or something
            boton.setText("This is row #" + i);

            // add the textview to the linearlayout
            linear.addView(boton);
            // save a reference to the textview for later
            button[i] = boton;

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
