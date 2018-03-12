
package Funciones;

import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Funciones {

    public static int GenerarPass(){
        return new Random().nextInt();
    }
    
        
    public static JComboBox LLenaCombo(String query,JComboBox jComboBox){
        Connection c = Conexion.ObtenerConexion();
        jComboBox.removeAllItems();
        if(c!=null)
            try {
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                    jComboBox.addItem(rs.getString(1));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return jComboBox;
    }
    
    
    public static JTable LlenadoDeTablas(String query){
        Connection c = Conexion.ObtenerConexion();
        JTable jtTablas = null;
        if(c!=null)
            try {
               Statement st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                ResultSet.CONCUR_READ_ONLY);
               ResultSet rs = st.executeQuery(query);
               if(rs.next()){
                   int columnas = rs.getMetaData().getColumnCount();
                   rs.last();
                   int filas = rs.getRow();
                   String [] titulos = new String[columnas];
                   String [][] datos = new String[filas][columnas];
                   for(int i = 0;i<columnas;i++)
                        titulos[i] = rs.getMetaData().getColumnName(i+1);
                   rs.first();
                   for(int i = 0;i<filas;i++,rs.next())
                       for(int j = 0;j<columnas;j++)
                           datos[i][j] = rs.getString(j+1);
                      
                   jtTablas = new JTable(datos,titulos);
               }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return jtTablas;
    }
}
