package com.example.andorid.hospital.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.andorid.hospital.Controllers.MedicacionController;
import com.example.andorid.hospital.R;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class AddMUI extends AppCompatActivity {
    MedicacionController medicacionController = new MedicacionController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mui);
        Bundle datos = this.getIntent().getExtras();

        final int idPaciente = datos.getInt("idPaciente");
        Button enviar = (Button) findViewById(R.id.btnEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              ArrayList<String> info = new ArrayList<>();
              info.add(((EditText)findViewById(R.id.nombreP)).getText().toString());
              info.add(((EditText)findViewById(R.id.dosis)).getText().toString());
              info.add(((EditText)findViewById(R.id.hora)).getText().toString());
                try {
                    medicacionController.addMedicacion(info,idPaciente);
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finish();

            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
