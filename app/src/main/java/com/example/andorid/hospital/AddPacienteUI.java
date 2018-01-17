package com.example.andorid.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class AddPacienteUI extends AppCompatActivity {
    final PrincipalDAO d = new PrincipalDAO();
    final PrincipalController principalController = new PrincipalController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_paciente_ui);

        Button botonLogin = (Button) findViewById(R.id.btnEnviar);
        botonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent menu  = new Intent(getApplicationContext(), menuUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                ArrayList<String> info = principalController.getListaPacientes(Usuario.getInstance().getnPlanta());
                menu.putExtra("Paciente",info );
                startActivity(menu);
            }
        });
    }
}
