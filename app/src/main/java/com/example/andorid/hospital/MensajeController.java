package com.example.andorid.hospital;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class MensajeController {
    MensajesDAO mensajesDAO = new MensajesDAO();

    public ArrayList<Mensaje> getMensajes(char tipo){
        ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
        //ArrayList<Mensaje> mensajes = mensajesDAO.getMensajes(tipo)

        return mensajes;
    }

    public void escribirMensaje(String texto, char tipo){
        Mensaje mensaje = new Mensaje();
        //getter y setter mensajes
        //mensajesDAO.add(mensaje);

    }
}


