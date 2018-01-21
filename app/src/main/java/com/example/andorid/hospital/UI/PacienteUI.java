package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.andorid.hospital.Controllers.PacienteController;
import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.FactoriaInterfaz;
import com.example.andorid.hospital.Paciente;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.Usuario;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class PacienteUI extends AppCompatActivity {

    PacienteController pacienteController = new PacienteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_ui);


        ArrayList<Estudiante> listaEstudiantes= null;
        try {
            //listaEstudiantes = estudianteController.getEstudiante();
        } catch (Exception e) {
            e.printStackTrace();
        }



        Bundle datos = this.getIntent().getExtras();

        int idPaciente = datos.getInt("idPaciente");


        Paciente paciente = null;
        try {
            paciente = pacienteController.getPaciente(idPaciente);

        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TextView titulo = findViewById(R.id.titulo);
      //  titulo.setText("HABITACION "+paciente.getHabitacionID());
        titulo.setTextColor(Color.BLUE);

        TextView nombretxt = findViewById(R.id.nombretxt);
        nombretxt.setText("Nombre:    "+paciente.getNombre());


        TextView apellidotxt = findViewById(R.id.apellidostxt);
        apellidotxt.setText("Apellido:    "+paciente.getApellidos());


        TextView dnitxt = findViewById(R.id.dnitxt);
        dnitxt.setText("DNI:    "+paciente.getDNI());

        TextView fechatxt = findViewById(R.id.fechatxt);
        fechatxt.setText("Fecha de Nacimiento:    "+paciente.getFechaNacimiento());





        Button medicacion = (Button) findViewById(R.id.button5);

        final int idP = idPaciente;
        medicacion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //llamar a factoria
               /* Intent med  = new Intent(getApplicationContext(), MedicacionEnfermeroUI.class);
                med.putExtra("idPaciente",idP);
                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(med);*/
                FactoriaInterfaz factoria = FactoriaInterfaz.getInstance();
                factoria.mostrarUIMedicacion(Usuario.getInstance().getTipo(),getApplicationContext(), idP);


            }

        });

        Button eliminar = (Button) findViewById(R.id.eliminar);
        eliminar.setVisibility(View.INVISIBLE);
        if(Usuario.getInstance().getTipo()=='E'){
            eliminar.setVisibility(View.VISIBLE);
        }

        eliminar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //llamar a factoria
                Intent eliminar  = new Intent(getApplicationContext(), EliminarPacienteUI.class);
                eliminar.putExtra("idPaciente",idP);
                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(eliminar);



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
