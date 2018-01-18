package com.example.andorid.hospital.DAO;

import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.xml.transform.Result;

/**
 * Created by sergiomerayo on 18/1/18.
 */

public class ConexionBD implements Callable<ResultSet>{

    private String dataBaseURL;
    private String driverName;
    private String user;
    private String pass;
    private String sql;
    private Connection conn = null;
    private  ResultSet rs;
    public String getDataBaseURL() { return dataBaseURL;}

            //........ AQUÍ VAN TODOS LOS GETTERS & SETTERS DE LOS PARÁMETROS DE LA CLAS


    public ConexionBD(String sentencia){
        sql=sentencia;
            }

            public ResultSet call(){

                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    conn = DriverManager.getConnection(
                            "jdbc:mysql://hesefra.ck8fbpftjxut.us-east-2.rds.amazonaws.com/mydb", "Hesefra", "Lopetamos66");
                    System.out.println("CONEXION");
                    PreparedStatement st = conn.prepareStatement(sql);
                    rs = st.executeQuery();
                    while(rs.next()) {
                        System.out.println(rs.getString("Nombre"));
                    }
                    conn.close();

                } catch (SQLException se) {
                    System.out.println("oopsse puede conectar. Error: " + se.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println("oopsse encuentra la clase. Error: " + e.getMessage());
                }


                return rs;
            }







    public ResultSet abrirConexion(String sentencia) throws Exception{
        /*sql = sentencia;

        sqlThread.start();*/
        return rs;
    }


    public Connection getConexion() {
        return conn;
    }

    Thread sqlThread = new Thread() {
        public void run() {
            try {
                Class.forName("com.mysql.jdbc.Driver");

                 conn = DriverManager.getConnection(
                        "jdbc:mysql://hesefra.ck8fbpftjxut.us-east-2.rds.amazonaws.com/mydb", "Hesefra", "Lopetamos66");
                System.out.println("CONEXION");
                PreparedStatement st = conn.prepareStatement(sql);
                rs = st.executeQuery();
                while(rs.next()) {
                    System.out.println(rs.getString("Nombre"));
                }
                conn.close();

            } catch (SQLException se) {
                System.out.println("oopsse puede conectar. Error: " + se.toString());
            } catch (ClassNotFoundException e) {
                System.out.println("oopsse encuentra la clase. Error: " + e.getMessage());
            }
        }
    };
}