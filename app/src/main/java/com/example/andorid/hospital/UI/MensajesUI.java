package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.andorid.hospital.Controllers.MensajeController;
import com.example.andorid.hospital.R;

public class MensajesUI extends AppCompatActivity {
    private MensajeController mensajeController = new MensajeController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes_ui);

        Button enviar = (Button) findViewById(R.id.send);
        enviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String texto = ((EditText)findViewById(R.id.editText7)).getText().toString();
                char tipo = 'x';
                if(((RadioButton)findViewById(R.id.rEnfermero)).isChecked()){
                    tipo = 'E';

                }else if(((RadioButton)findViewById(R.id.rMedico)).isChecked()){
                    tipo = 'M';
                }else if(((RadioButton)findViewById(R.id.rPaciente)).isChecked()){
                    tipo = 'P';
                }
                System.out.println(tipo);
                mensajeController.escribirMensaje(texto, tipo);


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
