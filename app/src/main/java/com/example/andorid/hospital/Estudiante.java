package com.example.andorid.hospital;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class Estudiante {

    String nombre;
    String apellido;
    int idEstudiante;



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
}
