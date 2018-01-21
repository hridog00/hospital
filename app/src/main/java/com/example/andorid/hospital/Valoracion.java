package com.example.andorid.hospital;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class Valoracion {

String nombreEnfermero;
String contenido;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String date;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    int idEstudiante;
    public void setNombreEnfermero(String nombreEnfermero) {
        this.nombreEnfermero = nombreEnfermero;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNombreEnfermero() {
        return nombreEnfermero;
    }

    public String getContenido() {
        return contenido;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
}
