package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.andorid.hospital.Controllers.EstudianteController;
import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.Usuario;
import com.example.andorid.hospital.Valoracion;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class ValoracionUI extends AppCompatActivity {

    EstudianteController estudianteController = new EstudianteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoracion_ui);

        Bundle datos = this.getIntent().getExtras();

        int idEstudiante = datos.getInt("idEstudiante");

        ArrayList<Valoracion> valoraciones = new ArrayList<Valoracion>();


        try {
            valoraciones = estudianteController.getValoracionEstudiante(idEstudiante);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



       // System.out.println("//////////////////"+valoraciones.get(0).getContenido());

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.contenido);


        for(int i=0;i<valoraciones.size();i++){

            final TextView emisor = new TextView(this);
            emisor.setText(valoraciones.get(i).getNombreEnfermero());
            emisor.setTextColor(Color.BLUE);
            linearLayout.addView(emisor);

            final TextView msg = new TextView(this);
            msg.setText(valoraciones.get(i).getContenido());
            linearLayout.addView(msg);


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
