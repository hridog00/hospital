
package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andorid.hospital.Controllers.PacienteController;
import com.example.andorid.hospital.FactoriaInterfaz;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.Usuario;

public class EliminarPacienteUI extends AppCompatActivity {
    final PacienteController pacienteController = new PacienteController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar_paciente);

        Button aceptar = (Button) findViewById(R.id.enviar);

        Bundle datos = this.getIntent().getExtras();

        final int idPaciente = datos.getInt("idPaciente");

        Button eliminar = (Button) findViewById(R.id.cancelar);

        aceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                pacienteController.eliminarPaciente(idPaciente);

                FactoriaInterfaz.getInstance().mostrarInterfaz(Usuario.getInstance().getTipo(),getApplicationContext());

            }

        });
        eliminar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                FactoriaInterfaz.getInstance().mostrarInterfaz(Usuario.getInstance().getTipo(),getApplicationContext());

            }

        });





    }
}
