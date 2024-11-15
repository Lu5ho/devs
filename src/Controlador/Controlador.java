
package Controlador;
import Modelo.Conexion;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class Controlador {
    
    public Statement sentencia;
    public ResultSet Resultado;
    
    Conexion objConexion = new Conexion();
    
    public int guardar(String sql){
    
        int filaAfectada = 0;
        Connection conexion  = null;
        Statement sentencia = null;
        
        try {
          conexion = objConexion.establecerConexion();
          sentencia = conexion.createStatement();
          filaAfectada = sentencia.executeUpdate(sql);
        } catch (Exception e) {
        }
    return filaAfectada;
    }
    
    
    
    
    
}
