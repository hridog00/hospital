package com.example.andorid.hospital.DAO;

import com.example.andorid.hospital.Paciente;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class PacienteDAO {

    public void addPaciente(Paciente p){
        String addUsQSL = "INSERT INTO `mydb`.`Usuario` (`Nombre`, `Apellido`, `DNI`, `username`, `contraseña`, `FechaNacimiento`) VALUES ('"+p.getNombre()+"', '"+p.getApellidos()+"', '"+p.getDNI()+"', 'P"+p.getDNI()+"', 'hesefra', '"+p.getFechaNacimiento()+"');\n";




    }
}
