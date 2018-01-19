package com.example.andorid.hospital.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class HospitalDAO {

    public ArrayList<String> getListaPacientes(int planta){
        ArrayList<String> pacientes =new ArrayList<String>();
        pacientes.add("Helena");
        return pacientes;

    }

    public int getHabitacionLibre(int planta)throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(2);
        String sql = "select NumeroHabitacion From Habitacion where PlantaH='"+planta+"' AND idPacienteH is null;";
        Future<List> resultado = service.submit(new ConexionBD(sql));
        List res = resultado.get();
        return Integer.parseInt(((List)res.get(0)).get(0).toString());



    }
}
