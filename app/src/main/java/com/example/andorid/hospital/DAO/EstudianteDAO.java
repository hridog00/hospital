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

    public ArrayList<Valoracion> getValoracionEstudiante(int idEstudiante) throws ExecutionException, InterruptedException {


        ArrayList<Valoracion> valoraciones = new ArrayList<Valoracion>();
        String sentencia = "SELECT * FROM mydb.Valoraciones WHERE idEstudiante='"+idEstudiante+"'";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sentencia));
        List res = resultado.get();

        //System.out.println("//////////////////////// Id estudiante: "+idEstudiante+" Cotenido: "+));
        for(int i=0; i<res.size();i++)
        {
            Valoracion valoracion = new Valoracion();
            List objeto = (List)res.get(i);

            valoracion.setNombreEnfermero(objeto.get(5).toString());

            valoracion.setContenido(objeto.get(4).toString());
            valoraciones.add(valoracion);

        }

return valoraciones;

    }
    public void addEstudiante(Estudiante estudiante) throws Exception{
        String addUsQSL = "INSERT INTO `mydb`.`Usuario` (`Nombre`, `Apellido`, `DNI`, `username`, `contraseña`, `FechaNacimiento`, `Tipo`) VALUES ('"+estudiante.getNombre()+"', '"+estudiante.getApellido()+"', '"+estudiante.getDni()+"', 'S"+estudiante.getDni()+"', 'hesefra', '"+estudiante.getDate()+"','S');\n";

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(addUsQSL));
        List res = resultado.get();

        ExecutorService service1 = Executors.newFixedThreadPool(2);

        String sql = "Select idUsuario FROM Usuario where username='S"+estudiante.getDni()+"'";
        Future<List> resultado2 = service.submit(new ConexionBD(sql));
        List res2 = resultado2.get();

        String idUuario = ((List)res2.get(0)).get(0).toString();

        String inserUsuario = "INSERT INTO `mydb`.`Estudiante` (`idEstudiante`, `Planta`) VALUES ('"+idUuario+"','"+estudiante.getPlanta()+"')";
        Future<List> resultado3 = service.submit(new ConexionBD(inserUsuario));

       // String datosAcad = "INSERT INTO `mydb`.`DatosAcademicos` (`idEstudiante`, `Optativas`, `Curso`, `NotaMedia`) VALUES ('"+idUuario+"', 'Infantil', '2', '8.5');\n";





    }
}
