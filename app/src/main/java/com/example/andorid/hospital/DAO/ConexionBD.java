package com.example.andorid.hospital.DAO;

import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by sergiomerayo on 18/1/18.
 */

public class ConexionBD{

    private String dataBaseURL;
    private String driverName;
    private String user;
    private String pass;
    private Connection con = null;
    public String getDataBaseURL() { return dataBaseURL;}

            //........ AQUÍ VAN TODOS LOS GETTERS & SETTERS DE LOS PARÁMETROS DE LA CLASE
    public ConexionBD(){
            this.dataBaseURL = "jdbc:mysql://hesefra.ck8fbpftjxut.us-east-2.rds.amazonaws.com/mydb";
            this.driverName = "com.mysql.jdbc.Driver";
            this.user = "Hesefra";
            this.pass = "Lopetamos66";
            }
    public void abrirConexion() throws Exception{

         try{

             Class.forName("com.mysql.jdbc.Driver").newInstance();
          con = DriverManager.getConnection("jdbc:mysql://hesefra.ck8fbpftjxut.us-east-2.rds.amazonaws.com:3306/mydb", "Hesefra", "Lopetamos66");
         } catch (Exception e) {


         System.out.println("Al abrir la base de datos " + e.getMessage());
     }
    }




    public void cerrarConexion() throws Exception { try {

            System.out.println ("Cierre correcto de la conexión con la base de datos"); }
            catch (Exception e){
            throw new Exception("Al cerrar la conexión de la base de datos. " + e.getMessage());
            }
    }

    public Connection getConexion() {
        return con;
    }
}