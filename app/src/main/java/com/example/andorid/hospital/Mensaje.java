package com.example.andorid.hospital;

import java.util.Date;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class Mensaje {

    private String nombreUsuario;
    private char destinatario;
    private Date fecha;
    private String texto;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public char getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(char destinatario) {
        this.destinatario = destinatario;
    }




}
