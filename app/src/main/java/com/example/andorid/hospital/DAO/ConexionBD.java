package com.example.andorid.hospital.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by sergiomerayo on 18/1/18.
 */

public class ConexionBD implements Callable<List>{

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

            public List call(){
                List list = new ArrayList();

                try {

                    Class.forName("com.mysql.jdbc.Driver");

                    conn = DriverManager.getConnection(
                            "jdbc:mysql://hesefra.ck8fbpftjxut.us-east-2.rds.amazonaws.com/mydb", "Hesefra", "Lopetamos66");
                    System.out.println("CONEXION");
                    PreparedStatement st = conn.prepareStatement(sql);
                    rs = st.executeQuery();
                    int numeroDeColumnas = rs.getMetaData().getColumnCount();
                   while(rs.next()) {
                       for(int i=1; i<=numeroDeColumnas; i++) {
                           //System.out.println(rs.getString("Nombre"));
                           list.add(rs.getString(i));
                       }
                   }
                   conn.close();

                } catch (SQLException se) {
                    System.out.println("oopsse puede conectar. Error: " + se.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println("oopsse encuentra la clase. Error: " + e.getMessage());
                }


                return list;
            }
}