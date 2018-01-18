package com.example.andorid.hospital.DAO;

import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sergiomerayo on 18/1/18.
 */

public class ConexionBD {

    private String dataBaseURL;
    private String driverName;
    private String user;
    private String pass;
    private String sql;
    private Connection conn = null;
    private  ResultSet rs;
    public String getDataBaseURL() { return dataBaseURL;}

            //........ AQUÍ VAN TODOS LOS GETTERS & SETTERS DE LOS PARÁMETROS DE LA CLASE
    public ConexionBD(){
            this.dataBaseURL = "jdbc:mysql://hesefra.ck8fbpftjxut.us-east-2.rds.amazonaws.com/mydb";
            this.driverName = "com.mysql.jdbc.Driver";
            this.user = "Hesefra";
            this.pass = "Lopetamos66";
            }

    public ResultSet abrirConexion(String sentencia) throws Exception{
        sql = sentencia;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        // "jdbc:mysql://IP:PUERTO/DB", "USER", "PASSWORD");
        // Si estás utilizando el emulador de android y tenes el mysql en tu misma PC no utilizar 127.0.0.1 o localhost como IP, utilizar 10.0.2.2
        System.out.println("START");

        conn = DriverManager.getConnection(
                "jdbc:mysql://hesefra.ck8fbpftjxut.us-east-2.rds.amazonaws.com/mydb", "Hesefra", "Lopetamos66");
        //En el stsql se puede agregar cualquier consulta SQL deseada.
        System.out.println("CONEXION");
        //PreparedStatement st = conn.prepareStatement("SELECT * FROM Usuario WHERE username='E71475642Z' AND contraseña='hesefra'\n");
        PreparedStatement st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        while(rs.next()){

            System.out.println(rs.getString("Nombre"));

        }
     //   sqlThread.start();
        return rs;
    }




    public void cerrarConexion() throws Exception { try {
        conn.close();

        System.out.println ("Cierre correcto de la conexión con la base de datos"); }
    catch (Exception e){
        throw new Exception("Al cerrar la conexión de la base de datos. " + e.getMessage());
    }
    }

    public Connection getConexion() {
        return conn;
    }

    Thread sqlThread = new Thread() {
        public void run() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // "jdbc:mysql://IP:PUERTO/DB", "USER", "PASSWORD");
                // Si estás utilizando el emulador de android y tenes el mysql en tu misma PC no utilizar 127.0.0.1 o localhost como IP, utilizar 10.0.2.2
                System.out.println("START");

                 conn = DriverManager.getConnection(
                        "jdbc:mysql://hesefra.ck8fbpftjxut.us-east-2.rds.amazonaws.com/mydb", "Hesefra", "Lopetamos66");
                //En el stsql se puede agregar cualquier consulta SQL deseada.
                System.out.println("CONEXION");
                //PreparedStatement st = conn.prepareStatement("SELECT * FROM Usuario WHERE username='E71475642Z' AND contraseña='hesefra'\n");
                PreparedStatement st = conn.prepareStatement(sql);
                rs = st.executeQuery();
                while(rs.next()){

                    System.out.println(rs.getString("Nombre"));

                }



                //  String stsql = "INSERT INTO Peliculas (idPeliculas, Nombre, Duracion)\n" +"VALUES (1115, 'hola3', '333')";
                // Statement st = conn.createStatement();
                //st.executeUpdate(stsql);


                //rs.next();
                //System.out.println( rs.getString(1) );
                conn.close();
            } catch (SQLException se) {
                System.out.println("oopsse puede conectar. Error: " + se.toString());
            } catch (ClassNotFoundException e) {
                System.out.println("oopsse encuentra la clase. Error: " + e.getMessage());
            }
        }
    };
}