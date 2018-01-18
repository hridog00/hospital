package com.example.andorid.hospital.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import com.example.andorid.hospital.R;

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


}
