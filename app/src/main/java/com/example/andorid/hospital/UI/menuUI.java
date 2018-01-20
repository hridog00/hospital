package com.example.andorid.hospital.UI;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.MenuInflater;
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

import com.example.andorid.hospital.Controllers.PacienteController;
import com.example.andorid.hospital.Paciente;
import com.example.andorid.hospital.R;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class menuUI extends AppCompatActivity


        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        PacienteController pacienteController = new PacienteController();

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


        ArrayList<Paciente> listaPacientes=null;

        try {
            listaPacientes = pacienteController.getlistaPacientes();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        rellenar(listaPacientes);

        //rellenar("Helena");


//los put extra en cada boton

        final ArrayList<Paciente> pacientes = listaPacientes;

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

        Button hab1 = (Button) findViewById(R.id.hab1);

        hab1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(0)!=null){
                    Intent  paciente  = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(0).getIdPaciente());

                    startActivity(paciente);

                }

                //PrincipalUI p = new PrincipalUI();
                //p.rellenar(info);
                // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

            }
        });
        Button hab2 = (Button) findViewById(R.id.hab2);

        hab2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(1)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(1).getIdPaciente());

                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab3 = (Button) findViewById(R.id.hab3);

        hab3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(2)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(2).getIdPaciente());


                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab4 = (Button) findViewById(R.id.hab4);

        hab4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(3)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(3).getIdPaciente());


                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab5 = (Button) findViewById(R.id.hab5);

        hab5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(4)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(4).getIdPaciente());

                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab6 = (Button) findViewById(R.id.hab6);

        hab6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(5)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(5).getIdPaciente());

                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        }); Button hab7 = (Button) findViewById(R.id.hab7);

        hab7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(6)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(6).getIdPaciente());


                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab8 = (Button) findViewById(R.id.hab8);

        hab8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(7)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(7).getIdPaciente());


                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab9 = (Button) findViewById(R.id.hab9);

        hab9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(8)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(8).getIdPaciente());


                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab10 = (Button) findViewById(R.id.hab10);

        hab10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(9)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(9).getIdPaciente());


                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab11 = (Button) findViewById(R.id.hab11);

        hab11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(10)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(10).getIdPaciente());


                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
            }
        });
        Button hab12 = (Button) findViewById(R.id.hab12);

        hab12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pacientes.get(11)!=null) {

                    Intent paciente = new Intent(getApplicationContext(), PacienteUI.class);
                    paciente.putExtra("idPaciente",pacientes.get(11).getIdPaciente());


                    //PrincipalUI p = new PrincipalUI();
                    //p.rellenar(info);
                    // Intent PrincipalUI  = new Intent(getApplicationContext(), menuUI.class);

                    startActivity(paciente);
                }
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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
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
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

       if (id == R.id.nav_anadirEstudiante) {

            Intent  medicacion_enfermero  = new Intent(getApplicationContext(), AddEstudianteUI.class);
            startActivity(medicacion_enfermero);


        } else if (id == R.id.nav_lista) {

            Intent  estudiante  = new Intent(getApplicationContext(), ListaEstudiantesUI.class);

            startActivity(estudiante);

        } else if (id == R.id.nav_anadirPaciente) {


            Intent  medico  = new Intent(getApplicationContext(), AddPacienteUI.class);
            startActivity(medico);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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
