package com.example.andorid.hospital.Controllers;

import com.example.andorid.hospital.Mensaje;
import com.example.andorid.hospital.DAO.MensajesDAO;

import com.example.andorid.hospital.DAO.MensajesDAO;
import com.example.andorid.hospital.Usuario;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class MensajeController {
    MensajesDAO mensajesDAO = new MensajesDAO();

    public ArrayList<Mensaje> getMensajes(char tipo) throws Exception{
       // ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
        ArrayList<Mensaje> mensajes = mensajesDAO.getMensajes(tipo);

        return mensajes;
    }

    public void escribirMensaje(String texto, char tipo){
        Mensaje mensaje = new Mensaje();
        Date dt = new Date();  // current time

        mensaje.setDestinatario(tipo);
        mensaje.setFecha(dt);
        mensaje.setNombreUsuario(Usuario.getInstance().getNombreUsuario());
        mensaje.setTexto(texto);
        //getter y setter mensajes
        mensajesDAO.enviar(mensaje);

    }
}


