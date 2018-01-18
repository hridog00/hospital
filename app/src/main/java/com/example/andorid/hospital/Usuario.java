package com.example.andorid.hospital;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class Usuario {
    private static final Usuario ourInstance = new Usuario();
    private String idUsuario;
    private int nPlanta;
    private String nombreUsuario;
    private char tipo;

    public static Usuario getInstance() {
        return ourInstance;
    }




    private Usuario() {
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getnPlanta() {
        return nPlanta;
    }

    public void setnPlanta(int nPlanta) {
        this.nPlanta = nPlanta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }




}
