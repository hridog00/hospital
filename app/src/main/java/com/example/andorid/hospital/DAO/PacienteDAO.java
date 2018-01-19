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

        ExecutorService service1 = Executors.newFixedThreadPool(2);

        String sql = "Select idUsuario FROM Usuario where username='P"+p.getDNI()+"'";
        Future<List> resultado2 = service.submit(new ConexionBD(sql));
        List res2 = resultado2.get();
        System.out.println(res2.size());

        String idUuario = ((List)res2.get(0)).get(0).toString();

        String inserUsuario = "INSERT INTO Paciente ('idPaciente') VALUES('"+idUuario+"')";
        Future<List> resultado3 = service.submit(new ConexionBD("INSERT INTO `mydb`.`Paciente` (`idPaciente`) VALUES ('"+idUuario+"');\n"));


        String sqlHabitacion = "UPDATE `mydb`.`Habitacion` SET `idPacienteH`='"+idUuario+"' WHERE `NumeroHabitacion`='"+p.getHabitacionID()+"' and`PlantaH`='"+p.getPlanta()+"';";
         resultado3 = service.submit(new ConexionBD(sqlHabitacion));

        for(int i=0;i<p.getAlergias().size();i++) {
            String sqlAlergias = "INSERT INTO `mydb`.`Alergias` (`idPaciente`, `Nombre`) VALUES ('" + idUuario + "', '" + p.getAlergias().get(i) + "');\n";
            resultado3 = service.submit(new ConexionBD(sqlAlergias));

        }

        for(int i=0;i<p.getNecesidadesVH().size();i++){
            String sqlVir = "INSERT INTO `mydb`.`NecesidadesVH` (`idPaciente`, `Nombre`) VALUES ('"+idUuario+"', '"+p.getNecesidadesVH().get(i)+"');";
            resultado3 = service.submit(new ConexionBD(sqlVir));

        }









    }
}
