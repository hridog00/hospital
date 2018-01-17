package com.example.andorid.hospital;

import java.util.ArrayList;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class PrincipalController {
    HospitalDAO hospitalDAO = new HospitalDAO();

    public ArrayList<String> getListaPacientes(int planta){
        return hospitalDAO.getListaPacientes(planta);
    }

}
