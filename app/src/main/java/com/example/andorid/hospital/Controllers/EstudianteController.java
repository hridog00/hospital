package com.example.andorid.hospital.Controllers;

import android.widget.TextView;

import com.example.andorid.hospital.DAO.EstudianteDAO;
import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.Mensaje;
import com.example.andorid.hospital.Usuario;
import com.example.andorid.hospital.Valoracion;

import java.util.ArrayList;
import java.util.Date;
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


    public void addEstudiante(ArrayList<String> info) throws Exception {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre(info.get(0));
        estudiante.setApellido(info.get(1));
        estudiante.setDate(info.get(3));
        estudiante.setDni(info.get(2));
        estudiante.setDomicilio(info.get(4));
        estudiante.setDatosAcademicos(info.get(5));
        estudiante.setPlanta(Usuario.getInstance().getnPlanta());

        System.out.println(estudiante.getDate());

        dao.addEstudiante(estudiante);

    }
    public void eliminarEstudiante(int idEstudiante){
        dao.eliminarEstudiante(idEstudiante);

    }

    public void setValoracion(String valoracion, int idEstudiante) {
        Valoracion val = new Valoracion();
        val.setContenido(valoracion);
        val.setIdEstudiante(idEstudiante);
        Date date = new Date();
        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        val.setDate(sdf.format(date));

        dao.guardarValoracion(val);

    }
}
