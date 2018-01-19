package com.example.andorid.hospital.DAO;

import com.example.andorid.hospital.Mensaje;
import com.example.andorid.hospital.Usuario;

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
}
