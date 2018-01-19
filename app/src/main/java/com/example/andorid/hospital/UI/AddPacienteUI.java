package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.andorid.hospital.Controllers.PacienteController;
import com.example.andorid.hospital.Controllers.PrincipalController;
import com.example.andorid.hospital.DAO.PrincipalDAO;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.Usuario;

import java.util.ArrayList;

public class AddPacienteUI extends AppCompatActivity {
    final PrincipalDAO d = new PrincipalDAO();
    final PrincipalController principalController = new PrincipalController();
    final PacienteController pacienteController = new PacienteController();
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


                ArrayList<String> info = new ArrayList<>();
                info.add(((EditText)findViewById(R.id.nombre)).getText().toString());

                info.add(((EditText)findViewById(R.id.apellidos)).getText().toString());
                info.add(((EditText)findViewById(R.id.dni)).getText().toString());
                info.add(((EditText)findViewById(R.id.fecha)).getText().toString());
                info.add(((EditText)findViewById(R.id.diagnostico)).getText().toString());
                info.add(((EditText)findViewById(R.id.alergias)).getText().toString());
                info.add(((EditText)findViewById(R.id.intervenciones)).getText().toString());
                info.add(getNecesidadesVH());
                info.add(((EditText)findViewById(R.id.habitosPasados)).getText().toString());
                info.add(((EditText)findViewById(R.id.habitosPresentes)).getText().toString());
                info.add(((EditText)findViewById(R.id.antecedentesP)).getText().toString());
                info.add(getParienteInfo());
                try{
                    pacienteController.addPaciente(info);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                ArrayList<String> infoP = principalController.getListaPacientes(Usuario.getInstance().getnPlanta());
                menu.putExtra("Paciente",infoP );
                startActivity(menu);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public String getNecesidadesVH(){
        String necesidades = "";
        if(((RadioButton)findViewById(R.id.n1)).isChecked()){
            necesidades = necesidades + "Respirar Correctamente;";
        }
        if(((RadioButton)findViewById(R.id.n2)).isChecked()){
            necesidades = necesidades + "Comer y beber de forma adecuada;";
        }
        if(((RadioButton)findViewById(R.id.n3)).isChecked()){
            necesidades = necesidades + " Eliminar los desechos corporales;";
        }
        if(((RadioButton)findViewById(R.id.n4)).isChecked()){
            necesidades = necesidades + "Moverse y mantener una postura adecuada;";
        }
        if(((RadioButton)findViewById(R.id.n5)).isChecked()){
            necesidades = necesidades + " Dormir y descansar;";
        }
        if(((RadioButton)findViewById(R.id.n6)).isChecked()){
            necesidades = necesidades + "Elegir la ropa adecuada;";
        }
        if(((RadioButton)findViewById(R.id.n7)).isChecked()){
            necesidades = necesidades + "Mantener la temperatura corporal;";
        }
        if(((RadioButton)findViewById(R.id.n8)).isChecked()){
            necesidades = necesidades + "Mantener la higiene corporal;";
        }
        if(((RadioButton)findViewById(R.id.n9)).isChecked()){
            necesidades = necesidades + "Evitar los peligros del entorno;";
        }
        if(((RadioButton)findViewById(R.id.n10)).isChecked()){
            necesidades = necesidades + "Comunicarse con los otros;";
        }
        if(((RadioButton)findViewById(R.id.n11)).isChecked()){
            necesidades = necesidades + " Actuar con arreglo a la propia fé;";
        }
        if(((RadioButton)findViewById(R.id.n12)).isChecked()){
            necesidades = necesidades + "Trabajar para sentirse realizado;";
        }
        if(((RadioButton)findViewById(R.id.n13)).isChecked()){
            necesidades = necesidades + "Participar en diversas formas de entretenimiento;";
        }
        if(((RadioButton)findViewById(R.id.n14)).isChecked()){
            necesidades = necesidades + "Aprender, descubrir o satisfacer la curiosidad;";
        }
        return necesidades;
    }

    public String getParienteInfo(){
        String pariente = "";
        pariente = pariente + (((EditText)findViewById(R.id.nombrePariente)).getText().toString()) +";";
        pariente = pariente + (((EditText)findViewById(R.id.parentesco)).getText().toString()) +";";
        pariente = pariente + (((EditText)findViewById(R.id.telefono)).getText().toString()) +";";

        return pariente;

    }


}
