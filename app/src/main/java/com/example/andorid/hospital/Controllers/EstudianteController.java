package com.example.andorid.hospital.Controllers;

import com.example.andorid.hospital.DAO.EstudianteDAO;
import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.Mensaje;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */



public class EstudianteController {

    EstudianteDAO dao = new EstudianteDAO();


    public ArrayList<Estudiante> getLista() throws Exception{

        ArrayList<Estudiante> listaEstudiantes = dao.getLista();

        return listaEstudiantes;
    }

}
