
package Funciones;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public static Connection ObtenerConexion(){
        Connection c = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "databaseName=PorVenir","sa","shura");
            
        } catch (Exception e) {
            
            System.err.println("error " + e.getMessage());
        }
        
        return c;
    }
    
    
}
