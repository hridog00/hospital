package com.example.andorid.hospital.Controllers;

import com.example.andorid.hospital.Medicacion;
import com.example.andorid.hospital.DAO.PacienteDAO;

import com.example.andorid.hospital.DAO.PacienteDAO;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class MedicacionController {
    private int idPaciente ;
    private PacienteDAO pacienteDAO = new PacienteDAO();

    public MedicacionController(int id){
        idPaciente = id;
    }

    public void addMedicacion(ArrayList<String> medicacion){
        Medicacion m = new Medicacion();
        //setter medicacion
       // return pacienteDAO.addMedicacion(idPaciente, m);

    }
    public void eliminarMedicacion(Medicacion m){
        //llamada a la DAO

    }

    public void cambiarEstado(Medicacion m, int estado){
        //llamada a la DAO
    }
}
