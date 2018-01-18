package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import com.example.andorid.hospital.Controllers.PacienteController;
import com.example.andorid.hospital.R;

public class AddEstudianteUI extends AppCompatActivity {
    final PacienteController sesionController = new PacienteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_estudiante_ui);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        /*
        Button btnSend = (Button) findViewById(R.id.send);
         btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



            }
        });*/
        return super.onCreateOptionsMenu(menu);
    }
}
