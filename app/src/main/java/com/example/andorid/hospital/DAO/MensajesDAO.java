package com.example.andorid.hospital.DAO;

import com.example.andorid.hospital.Mensaje;
import com.example.andorid.hospital.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class MensajesDAO {

    public void enviar (Mensaje msg){


        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String currentTime = sdf.format(msg.getFecha());
        ExecutorService service = Executors.newFixedThreadPool(2);
        String sentencia = "INSERT INTO `mydb`.`Mensaje` (`idEmisor`, `Fecha`, `Destinatario`, `Contenido`, `NombreEmisor`) VALUES ('"+ Usuario.getInstance().getIdUsuario()+"', '"+currentTime+"', '"+ msg.getDestinatario()+"', '"+msg.getTexto()+"', '"+msg.getNombreUsuario()+"');\n";
        Future<List> resultado = service.submit(new ConexionBD(sentencia));
    }

    public ArrayList<Mensaje> getMensajes(char tipo) throws Exception{

        ArrayList<Mensaje> mensajes = new ArrayList<>();
        String sentencia = "SELECT * FROM mydb.Mensaje WHERE Destinatario='"+tipo+"' OR Destinatario='"+'X'+"'";
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List> resultado = service.submit(new ConexionBD(sentencia));
        List res = resultado.get();

        for(int i=0; i<res.size(); i++)
        {
            // System.out.println(res.get(i));
            Mensaje msg = new Mensaje();
            List objeto = (List)res.get(i);
                msg.setTexto(objeto.get(4).toString());
                msg.setNombreUsuario(objeto.get(5).toString());
            java.text.SimpleDateFormat sdf =
                    new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(objeto.get(2).toString());
             mensajes.add(msg);

        }
        return mensajes;

    }
}
