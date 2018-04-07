
package Paneles;

import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import javax.swing.JOptionPane;

public class pnVerModificarUsuarios extends javax.swing.JPanel implements EnvioUsuario{

    public pnVerModificarUsuarios() {
        initComponents();
        //jscUsuarios.setViewportView(Funciones.Funciones.LlenadoDeTablas(
        //        "select * from VerUsuarios"));
        GroupUsuarios.add(rbtnEliminar);
        GroupUsuarios.add(rbtnModificar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupUsuarios = new javax.swing.ButtonGroup();
        jscUsuarios = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        rbtnModificar = new javax.swing.JRadioButton();
        rbtnEliminar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(620, 420));

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        jscUsuarios.setViewportView(tbUsuarios);

        rbtnModificar.setText("Modificar");

        rbtnEliminar.setText("Eliminar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Modificaciones y consultas");

        jLabel2.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jscUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addGap(26, 26, 26)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnModificar)
                    .addComponent(rbtnEliminar)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jscUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       if(!txtBuscar.getText().equals(""))
            jscUsuarios.setViewportView(Funciones.Funciones.LlenadoDeTablas(
                "select * from VerUsuarios where nombreUse='"+txtBuscar.getText()+"'"));
       else
           JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        if(rbtnEliminar.isSelected())
             Eliminar(evt);
        else if(rbtnModificar.isSelected())
            Modificar(evt);
        
    }//GEN-LAST:event_tbUsuariosMouseClicked

    
    private void Eliminar(java.awt.event.MouseEvent evt){
    int res = JOptionPane.showConfirmDialog(null,"Estas seguro de borrar a"
        + "este usuario","borrar usuario",JOptionPane.YES_NO_OPTION);
        if(res == JOptionPane.YES_OPTION){
           
        }
        else{
            
            
        }
    
    }
    
    private void EliminarUsuario(String nombre, String apPaterno, String apMaterno, String correo){
        Connection c = Funciones.Conexion.ObtenerConexion();
        if(c != null)
            try{
                String queryEliminar = "{Call dbo.EliminarUsuario(?,?,?,?, ?)}";
                CallableStatement csEliminar = c.prepareCall(queryEliminar);
                csEliminar.setString(1, nombre);
                csEliminar.setString(2, apPaterno);
                csEliminar.setString(3, apMaterno);
                csEliminar.setString(4, correo);
                csEliminar.registerOutParameter(5,Types.VARCHAR);
                csEliminar.execute();
                JOptionPane.showMessageDialog(null,csEliminar.getString(5));
            } 
            catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error; "+e.getMessage());
            }
        else
            JOptionPane.showMessageDialog(null,"error de conexion");
    }
    
    private void Modificar(MouseEvent evt) {
     
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupUsuarios;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jscUsuarios;
    private javax.swing.JRadioButton rbtnEliminar;
    private javax.swing.JRadioButton rbtnModificar;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void datosUsuarios(String nombre, String apPaterno, String apMaterno, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
