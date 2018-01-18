package com.example.andorid.hospital.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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


        public void addPaciente()
        {
            //ExecutorService service = Executors.newFixedThreadPool(2);
           // Future<List> resultado = service.submit(new ConexionBD("SELECT * FROM Usuario WHERE username='"+username+"' AND contraseña='"+password+ "'\n"));

        }
}
