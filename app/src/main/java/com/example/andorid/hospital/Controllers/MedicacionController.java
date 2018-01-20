package com.example.andorid.hospital.Controllers;

import com.example.andorid.hospital.DAO.MedicacionDAO;
import com.example.andorid.hospital.Medicacion;
import com.example.andorid.hospital.DAO.PacienteDAO;

import com.example.andorid.hospital.DAO.PacienteDAO;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class MedicacionController {
    private int idPaciente ;
    private PacienteDAO pacienteDAO = new PacienteDAO();
    private MedicacionDAO medicacionDAO = new MedicacionDAO();

    public MedicacionController(){

    }

    public void addMedicacion(ArrayList<String> medicacion, int idPaciente) throws ExecutionException, InterruptedException {
        Medicacion m = new Medicacion();
        m.setNombre(medicacion.get(0));
        m.setDosis(Integer.parseInt(medicacion.get(1)));
        m.setHora(medicacion.get(2));
        m.setIdPaciente(idPaciente);
        medicacionDAO.addMedicacion(m);
        //setter medicacion
       // return pacienteDAO.addMedicacion(idPaciente, m);

    }
    public void eliminarMedicacion(Medicacion m){
        //llamada a la DAO

    }

    public void cambiarEstado(int idMedicacion, char estado){
        try {
            medicacionDAO.cambiarEstado(idMedicacion,estado);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //llamada a la DAO
    }
    public ArrayList<Medicacion> getMedicacion(int idPaciente) throws Exception{

            return medicacionDAO.getMedicacionPaciente(idPaciente);

    }
}
