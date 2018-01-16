package com.example.andorid.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

public class MedicacionEnfermeroUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicacion_enfermero_ui);

        final int N = 10; // total number of textviews to add

        final TextView[] myTextViews = new TextView[N]; // create an empty array;
        GridLayout grid = (GridLayout) findViewById(R.id.grid);
        for (int i = 0; i < N; i++) {
            // create a new textview
            final TextView rowTextView = new TextView(this);

            // set some properties of rowTextView or something
            rowTextView.setText("This is row #" + i);

            // add the textview to the linearlayout
            grid.addView(rowTextView);
            // save a reference to the textview for later
            myTextViews[i] = rowTextView;
        }

    }
}
