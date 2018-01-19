package com.example.andorid.hospital.DAO;

import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.Mensaje;
import com.example.andorid.hospital.Valoracion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class EstudianteDAO {
    public ArrayList<Estudiante> getLista() throws ExecutionException, InterruptedException {

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        String sentencia = "SELECT * FROM mydb.Usuario WHERE Tipo='S'";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sentencia));
        List res = resultado.get();

        for(int i=0; i<res.size(); i++)
        {
            // System.out.println(res.get(i));
            Estudiante est = new Estudiante();
            List objeto = (List)res.get(i);
            est.setNombre(objeto.get(1).toString());
            est.setApellido(objeto.get(2).toString());
            est.setIdEstudiante(Integer.parseInt(objeto.get(0).toString()));

            listaEstudiantes.add(est);

        }
        return listaEstudiantes;
    }

    public Estudiante getEstudiante(int idEstudiante) throws ExecutionException, InterruptedException {



        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        String sentencia = "SELECT * FROM mydb.Usuario WHERE idUsuario='"+idEstudiante+"'";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sentencia));
        List res = resultado.get();
        Estudiante est = new Estudiante();
        List objeto = (List)res.get(0);
        est.setNombre(objeto.get(1).toString());
        est.setApellido(objeto.get(2).toString());
        est.setDni(objeto.get(3).toString());
        est.setFecha((String) objeto.get(6).toString());

        return est;

    }

    public Valoracion getValoracionEstudiante(int idEstudiante) throws ExecutionException, InterruptedException {


        ArrayList<Valoracion> listaEstudiantes = new ArrayList<>();
        String sentencia = "SELECT * FROM mydb.Valoracion WHERE idEstudiante='"+idEstudiante+"'";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sentencia));
        List res = resultado.get();
        Valoracion valoracion = new Valoracion();
        List objeto = (List)res.get(0);

        valoracion.setNombreEnfermero(objeto.get(5).toString());

        valoracion.setContenido(objeto.get(4).toString());
        est.setidEstudiante(objeto.get(3).toString());
        est.setFecha((String) objeto.get(6).toString());


    }
}
