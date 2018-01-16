package com.example.andorid.hospital;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class FactoriaInterfaz {
    private static final FactoriaInterfaz ourInstance = new FactoriaInterfaz();

    public static FactoriaInterfaz getInstance() {
        return ourInstance;
    }

    private FactoriaInterfaz() {
    }
}
