package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andorid.hospital.Controllers.PrincipalController;
import com.example.andorid.hospital.DAO.PrincipalDAO;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.Usuario;

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
