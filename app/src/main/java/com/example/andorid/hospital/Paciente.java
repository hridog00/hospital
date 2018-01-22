package com.example.andorid.hospital;

import com.example.andorid.hospital.UI.ParientePaciente;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class Paciente {
    private String nombre;
    private String Apellidos;
    private String DNI;
    private String fechaNacimiento;
    private int habitacionID;
    private int planta;
    private String Diagnóstico;
    private ArrayList<String> intervenciones;
    private ArrayList<String> alergias;
    private ArrayList<String> necesidadesVH;
    private ArrayList<String> hToxicosPasados;
    private ArrayList<String> hToxicosPresentes;
    private ArrayList <String> antecedentes;
    private ParientePaciente parientePaciente;
    private int idPaciente;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getHabitacionID() {
        return habitacionID;
    }

    public void setHabitacionID(int habitacionID) {
        this.habitacionID = habitacionID;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getDiagnóstico() {
        return Diagnóstico;
    }

    public void setDiagnóstico(String diagnóstico) {
        Diagnóstico = diagnóstico;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<String> getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(ArrayList<String> intervenciones) {
        this.intervenciones = intervenciones;
    }

    public ArrayList<String> getNecesidadesVH() {
        return necesidadesVH;
    }

    public void setNecesidadesVH(ArrayList<String> necesidadesVH) {
        this.necesidadesVH = necesidadesVH;
    }

    public ArrayList<String> gethToxicosPasados() {
        return hToxicosPasados;
    }

    public void sethToxicosPasados(ArrayList<String> hToxicosPasados) {
        this.hToxicosPasados = hToxicosPasados;
    }

    public ArrayList<String> gethToxicosPresentes() {
        return hToxicosPresentes;
    }

    public void sethToxicosPresentes(ArrayList<String> gethToxicosPresentes) {
        this.hToxicosPresentes = gethToxicosPresentes;
    }

    public ArrayList<String> getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(ArrayList<String> antecedentes) {
        this.antecedentes = antecedentes;
    }

    public ParientePaciente getParientePaciente() {
        return parientePaciente;
    }

    public void setParientePaciente(ArrayList<String> parientePaciente) {
        ParientePaciente p = new ParientePaciente(parientePaciente.get(0),parientePaciente.get(1),parientePaciente.get(2));
        this.parientePaciente = p;
    }

    public int getIdPaciente()
    {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente=idPaciente;
    }
}
