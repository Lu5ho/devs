/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis
 */
public class Conexion {
    
    String bd = "";
    String url = "";
    String usr = "";
    String pass = "";
    
    Connection estadoConexion = null;
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            estadoConexion = DriverManager.getConnection(url,usr,pass);
            System.out.println("Conexión exitada: " + bd);
        } catch (ClassNotFoundException | SQLException error) {
            System.err.println("Error :" + error.getMessage());
        }
        return estadoConexion;
    }       
}
