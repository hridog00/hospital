package com.example.andorid.hospital.DAO;

import com.example.andorid.hospital.Estudiante;
import com.example.andorid.hospital.Paciente;
import com.example.andorid.hospital.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
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


    public Paciente getPaciente(int idPaciente) throws ExecutionException, InterruptedException {



        //ArrayList<Paciente> listaEstudiantes = new ArrayList<Paciente>();
        String sentencia = "SELECT * FROM mydb.Usuario WHERE idUsuario='"+idPaciente +"'";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sentencia));
        List res = resultado.get();
        Paciente pac = new Paciente();
        List objeto = (List)res.get(0);

        pac.setNombre(objeto.get(1).toString());
        pac.setApellidos(objeto.get(2).toString());
        pac.setDNI(objeto.get(3).toString());
        pac.setFechaNacimiento((String) objeto.get(6).toString());


        String sentencia2 = "SELECT * FROM mydb.NecesidadesVH WHERE idPaciente='"+idPaciente +"'";
        ExecutorService service2 = Executors.newFixedThreadPool(2);
        Future<List> resultado2 = service.submit(new ConexionBD(sentencia2));
        List res2 = resultado.get();
        ArrayList<String> necesidades = new ArrayList<String>();

        for(int i=0; i<res2.size(); i++)
        {
            List objeto2 = (List)res2.get(i);
            necesidades.add(objeto.get(2).toString());
        }
        pac.setNecesidadesVH(necesidades);

        return pac;

    }

    public ArrayList<Paciente> getLista() throws ExecutionException, InterruptedException {

        int planta = Usuario.getInstance().getnPlanta();

        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        String sentencia = "SELECT * FROM mydb.Habitacion WHERE PlantaH='"+planta+"'";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sentencia));
        List res = resultado.get();

        for(int i=0; i<res.size(); i++)
        {
            // System.out.println(res.get(i));
            Paciente pac = new Paciente();
            List objeto = (List)res.get(i);
            pac.setNombre(objeto.get(3).toString());
            pac.setApellidos(objeto.get(4).toString());
            //est.set(Integer.parseInt(objeto.get(0).toString()));

            pac.setIdPaciente(Integer.parseInt(objeto.get(2).toString()));


            listaPacientes.add(pac);

        }
        return listaPacientes;
    }
}
