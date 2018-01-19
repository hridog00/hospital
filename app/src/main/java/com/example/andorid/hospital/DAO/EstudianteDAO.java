package com.example.andorid.hospital.DAO;

import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.Mensaje;

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

}
