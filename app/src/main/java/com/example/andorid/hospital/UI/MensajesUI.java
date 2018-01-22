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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.andorid.hospital.Controllers.MensajeController;
import com.example.andorid.hospital.Mensaje;
import com.example.andorid.hospital.R;
import com.example.andorid.hospital.Usuario;

import java.security.Principal;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Enumeration;

public class MensajesUI extends AppCompatActivity {
    private MensajeController mensajeController = new MensajeController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes_ui);
        ArrayList<Mensaje> mensajes = new ArrayList<>();
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linearMSG);
        try{
              mensajes = mensajeController.getMensajes(Usuario.getInstance().getTipo());
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(int i=0;i<mensajes.size();i++){
            final TextView emisor = new TextView(this);
            emisor.setText(mensajes.get(i).getNombreUsuario());
            emisor.setTextColor(Color.BLUE);
            linearLayout.addView(emisor);

            final TextView msg = new TextView(this);
            msg.setText(mensajes.get(i).getTexto());
            linearLayout.addView(msg);


        }



        Button enviar = (Button) findViewById(R.id.send);
        enviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String texto = ((EditText)findViewById(R.id.editText7)).getText().toString();
                char tipo = 'X';
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

        Button recargar = (Button) findViewById(R.id.recargar);
        recargar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              //Intent recargar = new Intent(getApplicationContext(),MensajesUI.class);
             // startActivity(recargar);

                ArrayList<Mensaje> mensajes = new ArrayList<>();
                LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linearMSG);

                linearLayout.removeAllViews();
                try{
                    mensajes = mensajeController.getMensajes(Usuario.getInstance().getTipo());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                for(int i=0;i<mensajes.size();i++){
                    final TextView emisor = new TextView(getApplicationContext());
                    emisor.setText(mensajes.get(i).getNombreUsuario());
                    emisor.setTextColor(Color.BLUE);
                    linearLayout.addView(emisor);

                    final TextView msg = new TextView(getApplicationContext());
                    msg.setText(mensajes.get(i).getTexto());
                    linearLayout.addView(msg);


                }



            }
        });


        final Button rMedico = (Button) findViewById(R.id.rMedico);
        final Button rEnfermero = (Button) findViewById(R.id.rEnfermero);
        final Button rPaciente = (Button) findViewById(R.id.rPaciente);




       /* rMedico.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                    rEnfermero.setActivated(false);
                    rPaciente.setActivated(false);
            }
        });

        rEnfermero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                rMedico.setActivated(false);
                rPaciente.setActivated(false);
            }
        });

        rPaciente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                rEnfermero.setActivated(false);
                rMedico.setActivated(false);
            }
        });
*/

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
