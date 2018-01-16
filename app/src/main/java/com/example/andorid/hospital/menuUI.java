package com.example.andorid.hospital;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

public class menuUI extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //jajajajajajajajajajajajajajajajaja


        Intent intent = getIntent();
        ArrayList<String> message = new ArrayList<String>();

        message = intent.getExtras().getStringArrayList("Paciente");

        System.out.println("fndjkfhdshoidHFDAHADHJADJADF  "+message.get(0));

        rellenar(message);

        Button botonAnadirPaciente = (Button) findViewById(R.id.button2);

        botonAnadirPaciente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  addPac  = new Intent(getApplicationContext(), AddPacienteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(addPac);
            }
        });

        Button botonAnadirEstudiante = (Button) findViewById(R.id.button10);

        botonAnadirEstudiante.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  addEst  = new Intent(getApplicationContext(), AddEstudianteUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(addEst);
            }
        });


        FloatingActionButton botonMensajes = (FloatingActionButton) findViewById(R.id.fab);

        botonMensajes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent  addMensaje  = new Intent(getApplicationContext(), MensajesUI.class);

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                startActivity(addMensaje);
            }
        });
//hacer for con los pacientes

        Button botonPaciente = (Button) findViewById(R.id.hab1);

        botonPaciente.setOnClickListener(new View.OnClickListener() {

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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menuUI; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

            Intent  medicacion_enfermero  = new Intent(getApplicationContext(), MedicacionEnfermeroUI.class);
            startActivity(medicacion_enfermero);


        } else if (id == R.id.nav_slideshow) {

            Intent  estudiante  = new Intent(getApplicationContext(), EstudianteUI.class);
            startActivity(estudiante);

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void rellenar(ArrayList<String> info){


        Button boton1  = (Button) findViewById(R.id.hab1);
        boton1.setText(info.get(0));



    }
}
