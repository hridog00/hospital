package com.example.andorid.hospital.DAO;

import com.example.andorid.hospital.Controllers.MensajeController;
import com.example.andorid.hospital.Medicacion;
import com.example.andorid.hospital.Mensaje;
import com.example.andorid.hospital.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by helena on 20/01/2018.
 */

public class MedicacionDAO {

    public ArrayList<Medicacion> getMedicacionPaciente(int idPaciente)throws Exception{
        ArrayList<Medicacion> medicacion = new ArrayList<>();
        String sql = "SELECT * FROM mydb.Medicacion where idPaciente='"+idPaciente+"';";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sql));
        List res = resultado.get();


        for(int i=0; i<res.size(); i++){
            Medicacion m = new Medicacion();
            List objeto = (List)res.get(i);

            m.setIdMedicacion(Integer.parseInt(objeto.get(0).toString()));
            m.setNombre(objeto.get(1).toString());
            m.setDosis(Integer.parseInt(objeto.get(2).toString()));
            m.setHora(objeto.get(3).toString());
            m.setIdPaciente(Integer.parseInt(objeto.get(4).toString()));
            if(objeto.get(5)!= null)
                m.setEstado(objeto.get(5).toString().charAt(0));
            medicacion.add(m);

        }

        return medicacion;



    }

    public void addMedicacion(Medicacion medicacion, String nombrePacietne) throws ExecutionException, InterruptedException {
        String sqlSentencia = "INSERT INTO `mydb`.`Medicacion` ( `Nombre`, `Dosis`, `Hora`, `idPaciente`) VALUES ( '"+medicacion.getNombre()+"', '"+medicacion.getDosis()+"', '"+medicacion.getHora()+"', '"+medicacion.getIdPaciente()+"');";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sqlSentencia));
        List res = resultado.get();

        Mensaje m = new Mensaje();
        m.setNombreUsuario(Usuario.getInstance().getNombreUsuario());
        m.setTexto("Se ha añadido la medicacion "+medicacion.getNombre()+" al paciente "+nombrePacietne);
        Date dt = new Date();
        m.setFecha(dt);
        m.setDestinatario('E');
        MensajesDAO mensajesDAO = new MensajesDAO();
        mensajesDAO.enviar(m);




    }
    public void cambiarEstado(int idMedicacion, char estado) throws ExecutionException, InterruptedException {
        String sql = "UPDATE `mydb`.`Medicacion` SET `estado`='"+estado+"' WHERE `idMedicacion`='"+idMedicacion+"';\n";
        System.out.println(sql);
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sql));
        List res = resultado.get();

    }

    public void eliminarMedicacion(Medicacion m, int idMedicacion) {


        String sql = "DELETE FROM `mydb`.`Medicacion` WHERE `idMedicacion`='"+idMedicacion+"';";

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sql));





    }
}
