package com.example.andorid.hospital.Controllers;

import com.example.andorid.hospital.HospitalDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class PrincipalController {
    private HospitalDAO hospitalDAO = new HospitalDAO();
    private int numeroPlanta;
    private ArrayList<String> ListaPacientes;


    private Map<Integer , String> pacientes = new HashMap<Integer, String>();

    //Seria util tener un objeto Nombre-id. Quiza el propio paciente
   /* public PrincipalController (int n){
        numeroPlanta = n;
    }
*/
    public ArrayList<String> getListaPacientes(int planta){
        return hospitalDAO.getListaPacientes(planta);
    }

    public void mostrarMensajes(){
        //esto sirve para algo(?????????) llamada a mensajesController y que nos devuelva los mensajes
        //hacer esto aqui o en el  contructor de mensajes
    }

    public void mostrarEstudiantes(){

    }
    public void getPaciente(int habitacion){
//llamada a la Dao para saber que paciente esta en esa habitacion de esa planta
    }



}
