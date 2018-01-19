package com.example.andorid.hospital.DAO;

import com.example.andorid.hospital.Paciente;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class PacienteDAO {

    public void addPaciente(Paciente p) throws Exception{


        String addUsQSL = "INSERT INTO `mydb`.`Usuario` (`Nombre`, `Apellido`, `DNI`, `username`, `contraseña`, `FechaNacimiento`, `Tipo`) VALUES ('"+p.getNombre()+"', '"+p.getApellidos()+"', '"+p.getDNI()+"', 'P"+p.getDNI()+"', 'hesefra', '"+p.getFechaNacimiento()+"','P');\n";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(addUsQSL));
        List res = resultado.get();




    }
}
