package com.example.andorid.hospital.UI;

/**
 * Created by helena on 19/01/2018.
 */

public class ParientePaciente {
    private String nombreCompleto;
    private String telefono;
    private String parentesco;

    public ParientePaciente(String nombreCompleto, String telefono, String parentesco) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.parentesco = parentesco;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
