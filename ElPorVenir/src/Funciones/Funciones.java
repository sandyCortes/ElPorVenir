
package Funciones;

import java.awt.Component;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Funciones {
    
    public static int GenerarPass(){
        return new Random().nextInt();
    }
    
    
        public static void AgragaCompania(String descripcion ){
        Connection conexion=Conexion.ObtenerConexion();
        if(conexion !=null){
            try {
                CallableStatement cs = conexion.prepareCall("{Call dbo.AgregaCompania(?)}");
                cs.setString(1, descripcion);
                cs.execute();
               } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error:"+e.getMessage());
            }
         }
    }
    
    public static void AgregarProveedor(String marca,String telefono, String compania){
        Connection conexion=Conexion.ObtenerConexion();
        if(conexion !=null){
            try{
                CallableStatement cs=conexion.prepareCall("{Call dbo.AgregaProveedor(?,?,?,?)}");
                cs.setString(1,marca);
                cs.setString(2,telefono);
                cs.setString(3,compania);
                cs.registerOutParameter(4,Types.VARCHAR);
                cs.execute();
                JOptionPane.showMessageDialog(null,cs.getString(4));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
            }
        }
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
    
    public static Integer obtenerID(String nombre, String apPaterno, String apMaterno, String correo){
        Integer id = null;
        Connection c = Conexion.ObtenerConexion();
        if(c != null)
            try{
                String idQuery = "Select idUsuario from Usuarios where"
                        + " nombreUse ='"+nombre+"'AND aPpUser = '"+apPaterno+"' AND"
                        + " aPmUser = '"+apMaterno+"'AND \n" +
                        " correo = '"+correo+"' ";
                Statement stObtenerID = c.createStatement();
                ResultSet rs = stObtenerID.executeQuery(idQuery);
                if(rs.next())
                    id = rs.getInt(1);
                   
            }catch(Exception e){
                System.out.println("Error de conexion" + e.getMessage());
        }
        return id;
    }
    
    public static DefaultTableModel LlenadoDeTablas(String query){
        Connection c = Conexion.ObtenerConexion();
        DefaultTableModel model = null;
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
                   model = new DefaultTableModel(datos, titulos);
               }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return model;
    }
}
