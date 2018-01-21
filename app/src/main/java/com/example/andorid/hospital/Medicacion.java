package com.example.andorid.hospital;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class Medicacion {
    private int idPaciente;
    private int idMedicacion;
    private String nombre;
    private int dosis;
    private String hora;
    private char estado;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedicacion() {
        return idMedicacion;
    }

    public void setIdMedicacion(int idMedicacion) {
        this.idMedicacion = idMedicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

}
