package com.example.andorid.hospital;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class Usuario {
    private static final Usuario ourInstance = new Usuario();

    public static Usuario getInstance() {
        return ourInstance;
    }

    private Usuario() {
    }
}
