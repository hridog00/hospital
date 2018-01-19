package com.example.andorid.hospital.Controllers;

import com.example.andorid.hospital.DAO.EstudianteDAO;
import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.Mensaje;
import com.example.andorid.hospital.Valoracion;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by sergiomerayo on 16/1/18.
 */



public class EstudianteController {

    EstudianteDAO dao = new EstudianteDAO();


    public ArrayList<Estudiante> getLista() throws Exception{

        ArrayList<Estudiante> listaEstudiantes = dao.getLista();

        return listaEstudiantes;
    }

    public Estudiante getEstudiante(int idEstudiante) throws ExecutionException, InterruptedException {
        return dao.getEstudiante(idEstudiante);
    }

    public ArrayList<Valoracion> getValoracionEstudiante(int idEstudiante) throws ExecutionException, InterruptedException {


        return dao.getValoracionEstudiante(idEstudiante);
    }
}
