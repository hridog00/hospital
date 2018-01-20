package com.example.andorid.hospital.UI;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.andorid.hospital.Paciente;
import com.example.andorid.hospital.R;

import java.util.ArrayList;

public class PrincipalUI extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planta);




        Button hab1 = (Button) findViewById(R.id.hab1);

        hab1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);
                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab2 = (Button) findViewById(R.id.hab2);

        hab2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab3 = (Button) findViewById(R.id.hab3);

        hab3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab4 = (Button) findViewById(R.id.hab4);

        hab4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab5 = (Button) findViewById(R.id.hab5);

        hab5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab6 = (Button) findViewById(R.id.hab6);

        hab6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        }); Button hab7 = (Button) findViewById(R.id.hab7);

        hab7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab8 = (Button) findViewById(R.id.hab8);

        hab8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab9 = (Button) findViewById(R.id.hab9);

        hab9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab10 = (Button) findViewById(R.id.hab10);

        hab10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab11 = (Button) findViewById(R.id.hab11);

        hab11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
            }
        });
        Button hab12 = (Button) findViewById(R.id.hab12);

        hab12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(paciente);
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
    public void rellenar(ArrayList<Paciente> info){


        Button boton1  = (Button) findViewById(R.id.hab1);
        if(info.get(0).getNombre()!= null) {
            boton1.setText(info.get(0).getNombre() +" "+info.get(0).getApellidos());
        }
        if(info.get(1).getNombre()!= null) {
            Button boton2 = (Button) findViewById(R.id.hab2);
            boton2.setText(info.get(1).getNombre()+" "+info.get(1).getApellidos());
        }
        if(info.get(2).getNombre()!= null){
            Button boton3  = (Button) findViewById(R.id.hab3);
            boton3.setText(info.get(2).getNombre()+" "+info.get(2).getApellidos());

        }
        if(info.get(3).getNombre()!= null) {
            Button boton4 = (Button) findViewById(R.id.hab4);
            boton4.setText(info.get(3).getNombre()+" "+info.get(3).getApellidos());

        }
        if(info.get(4).getNombre()!= null) {
            Button boton5 = (Button) findViewById(R.id.hab5);
            boton5.setText(info.get(4).getNombre()+" "+info.get(4).getApellidos());
        }
        if(info.get(5).getNombre()!= null) {
            Button boton6 = (Button) findViewById(R.id.hab6);
            boton6.setText(info.get(5).getNombre()+" "+info.get(5).getApellidos());
        }
        if(info.get(6).getNombre()!= null) {
            Button boton7 = (Button) findViewById(R.id.hab7);
            boton7.setText(info.get(6).getNombre()+" "+info.get(6).getApellidos());
        }
        if(info.get(7).getNombre()!= null) {
            Button boton8 = (Button) findViewById(R.id.hab8);
            boton8.setText(info.get(7).getNombre()+" "+info.get(7).getApellidos());
        }
        if(info.get(8).getNombre()!= null) {
            Button boton9 = (Button) findViewById(R.id.hab9);
            boton9.setText(info.get(8).getNombre()+" "+info.get(8).getApellidos());


        }
        if(info.get(9).getNombre()!= null) {
            Button boton10 = (Button) findViewById(R.id.hab10);
            boton10.setText(info.get(9).getNombre()+" "+info.get(9).getApellidos());
            boton10.setBackgroundColor(Color.CYAN);

        }
        if(info.get(10).getNombre()!= null) {
            Button boton11 = (Button) findViewById(R.id.hab11);
            boton11.setText(info.get(10).getNombre()+" "+info.get(10).getApellidos());
            boton11.setBackgroundColor(Color.CYAN);

        }
        if(info.get(11).getNombre()!= null) {
            Button boton12 = (Button) findViewById(R.id.hab12);
            boton12.setText(info.get(11).getNombre()+" "+info.get(11).getApellidos());
            boton12.setBackgroundColor(Color.CYAN);
        }




    }



}
