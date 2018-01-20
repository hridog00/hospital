package com.example.andorid.hospital;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class Estudiante {

    String nombre;
    String apellido;
    String date;
    String domicilio;
    String datosAcademicos;

    int idEstudiante;
    int planta;

    String dni;



    String fecha;

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }


    public int getIdEstudiante() {
        return idEstudiante;
    }


    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getdni() {
        return dni;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDatosAcademicos() {
        return datosAcademicos;
    }

    public void setDatosAcademicos(String datosAcademicos) {
        this.datosAcademicos = datosAcademicos;
    }

    public String getDni() {
        return dni;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
}
