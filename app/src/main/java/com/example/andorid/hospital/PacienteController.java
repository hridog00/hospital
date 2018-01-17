package com.example.andorid.hospital;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class PacienteController {
    private int idPaciente;

    //De esto no estoy segura
  /*  public PacienteController(int id){
      idPaciente = id;
    }*/
    public ArrayList<String> getInformacion(){
        //hacer llamada a DAO
        ArrayList<String> s = new ArrayList<String>();
        return s;
    }

    public ArrayList<String> getMedicacionPaciente(){
        //hacer llamada a DAO
        ArrayList<String> s = new ArrayList<String>();
        return s;
    }

    public void gestionarMedicacion(){
        //no se si hace falta, crea el controller de medicacion, llama a la factoria de medicacion

    }
    public void addPaciente(ArrayList<String> inf){
        Paciente paciente = new Paciente();
        //settes con toda la informacion
        //llamada a PacienteDAO para añadirlo
    }

    public void eliminarPaciente(){
        //lamada al dao para eliminar el paciente, se le pasa como parametro idPaciente
    }




}
