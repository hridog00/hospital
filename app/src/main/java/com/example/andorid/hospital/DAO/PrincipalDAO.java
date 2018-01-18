package com.example.andorid.hospital.DAO;

import java.util.ArrayList;

/**
 * Created by helena on 15/01/2018.
 */

    public class PrincipalDAO {
        private ArrayList<String> info;
        public ArrayList<String> getInfo(){
            info = new ArrayList<String>();
            info.add("Helena");
            info.add("Sergio");
            return info;
        }
}
