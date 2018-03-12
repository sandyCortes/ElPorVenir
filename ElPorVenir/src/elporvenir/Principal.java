
package elporvenir;


import Paneles.pnVerModificarUsuarios;
import Paneles.PnRegistroProducto;
import Paneles.PnProductos;
import Paneles.pnUsuarios;
import Pedidos.pnPedidos;
import elporvenir.Tienda.Tienda;
import elporvenir.dise.Inicio;
import java.awt.BorderLayout;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proveedores.ModificarDatosProveedor;
import proveedores.ModificarProveedor;
import proveedores.RegistrarProveedore;


public class Principal extends javax.swing.JFrame {


    
    
    public Principal() {
        initComponents();
       pnMenuMercancia.setVisible(false);
        pnMenuVentasReportes.setVisible(false);
        pnMenuUsuarios.setVisible(false);
        pnMenuProveedores.setVisible(false);
        IntroducirPanle(new Inicio(), pnContenido,new Point(0,0));
    }
    
    
     private void IntroducirPanle(JPanel pnNuevo, JPanel pnContenedor,Point punto) {
         pnNuevo.setSize(pnContenedor.getWidth(),pnContenedor.getHeight());
         pnNuevo.setLocation(punto);
         pnContenedor.removeAll();
         pnContenedor.add(pnNuevo);
         pnContenedor.revalidate();
         pnContenedor.repaint();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        pnProveedores = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnMercancia = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnUsuarios = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnContenido = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnMenuProveedores = new javax.swing.JPanel();
        pnRegistrarProveedor = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        pnModificarProveedor = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pnMenuMercancia = new javax.swing.JPanel();
        pnPedidos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnRegistrarProducto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnOpcionInventario = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnMenuUsuarios = new javax.swing.JPanel();
        pnModificarUsuario = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnRegistrarUsuario = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnMenuVentasReportes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(0, 51, 51));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnProveedoresMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Proveedores");

        javax.swing.GroupLayout pnProveedoresLayout = new javax.swing.GroupLayout(pnProveedores);
        pnProveedores.setLayout(pnProveedoresLayout);
        pnProveedoresLayout.setHorizontalGroup(
            pnProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnProveedoresLayout.setVerticalGroup(
            pnProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpMenu.add(pnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 50));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Tienda.png"))); // NOI18N
        jLabel11.setText("Tienda");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpMenu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 70));

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caja.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("Caja");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpMenu.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, 50));

        pnMercancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnMercanciaMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/productos.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Mercancia");

        javax.swing.GroupLayout pnMercanciaLayout = new javax.swing.GroupLayout(pnMercancia);
        pnMercancia.setLayout(pnMercanciaLayout);
        pnMercanciaLayout.setHorizontalGroup(
            pnMercanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMercanciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnMercanciaLayout.setVerticalGroup(
            pnMercanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMercanciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpMenu.add(pnMercancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 50));

        pnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnUsuariosMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Usuarios");

        javax.swing.GroupLayout pnUsuariosLayout = new javax.swing.GroupLayout(pnUsuarios);
        pnUsuarios.setLayout(pnUsuariosLayout);
        pnUsuariosLayout.setHorizontalGroup(
            pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnUsuariosLayout.setVerticalGroup(
            pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpMenu.add(pnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 190, 50));

        jButton1.setText("cerrar secion");
        jpMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 470, 200, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reportes.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel17.setText("ventas y reportes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpMenu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 190, 50));

        getContentPane().add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnContenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout pnContenidoLayout = new javax.swing.GroupLayout(pnContenido);
        pnContenido.setLayout(pnContenidoLayout);
        pnContenidoLayout.setHorizontalGroup(
            pnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnContenidoLayout.setVerticalGroup(
            pnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnRegistrarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnRegistrarProveedorMouseClicked(evt);
            }
        });

        jLabel18.setText("Registrar");

        javax.swing.GroupLayout pnRegistrarProveedorLayout = new javax.swing.GroupLayout(pnRegistrarProveedor);
        pnRegistrarProveedor.setLayout(pnRegistrarProveedorLayout);
        pnRegistrarProveedorLayout.setHorizontalGroup(
            pnRegistrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegistrarProveedorLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18))
        );
        pnRegistrarProveedorLayout.setVerticalGroup(
            pnRegistrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegistrarProveedorLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(21, 21, 21))
        );

        pnModificarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnModificarProveedorMouseClicked(evt);
            }
        });

        jLabel19.setText("Modificar");

        javax.swing.GroupLayout pnModificarProveedorLayout = new javax.swing.GroupLayout(pnModificarProveedor);
        pnModificarProveedor.setLayout(pnModificarProveedorLayout);
        pnModificarProveedorLayout.setHorizontalGroup(
            pnModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnModificarProveedorLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18))
        );
        pnModificarProveedorLayout.setVerticalGroup(
            pnModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnModificarProveedorLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout pnMenuProveedoresLayout = new javax.swing.GroupLayout(pnMenuProveedores);
        pnMenuProveedores.setLayout(pnMenuProveedoresLayout);
        pnMenuProveedoresLayout.setHorizontalGroup(
            pnMenuProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuProveedoresLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(pnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        pnMenuProveedoresLayout.setVerticalGroup(
            pnMenuProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuProveedoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnMenuProveedoresLayout.createSequentialGroup()
                .addComponent(pnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.add(pnMenuProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        pnMenuMercancia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnPedidosMouseClicked(evt);
            }
        });

        jLabel9.setText("pedidos");

        javax.swing.GroupLayout pnPedidosLayout = new javax.swing.GroupLayout(pnPedidos);
        pnPedidos.setLayout(pnPedidosLayout);
        pnPedidosLayout.setHorizontalGroup(
            pnPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPedidosLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18))
        );
        pnPedidosLayout.setVerticalGroup(
            pnPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPedidosLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(21, 21, 21))
        );

        pnMenuMercancia.add(pnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, -1, -1));

        pnRegistrarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnRegistrarProductoMouseClicked(evt);
            }
        });

        jLabel7.setText("registroP");

        javax.swing.GroupLayout pnRegistrarProductoLayout = new javax.swing.GroupLayout(pnRegistrarProducto);
        pnRegistrarProducto.setLayout(pnRegistrarProductoLayout);
        pnRegistrarProductoLayout.setHorizontalGroup(
            pnRegistrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistrarProductoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnRegistrarProductoLayout.setVerticalGroup(
            pnRegistrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistrarProductoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnMenuMercancia.add(pnRegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 0, -1, -1));

        pnOpcionInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnOpcionInventarioMouseClicked(evt);
            }
        });

        jLabel8.setText("inventario");

        javax.swing.GroupLayout pnOpcionInventarioLayout = new javax.swing.GroupLayout(pnOpcionInventario);
        pnOpcionInventario.setLayout(pnOpcionInventarioLayout);
        pnOpcionInventarioLayout.setHorizontalGroup(
            pnOpcionInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOpcionInventarioLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18))
        );
        pnOpcionInventarioLayout.setVerticalGroup(
            pnOpcionInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOpcionInventarioLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(21, 21, 21))
        );

        pnMenuMercancia.add(pnOpcionInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLayeredPane1.add(pnMenuMercancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 600, -1));

        pnMenuUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnModificarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnModificarUsuarioMouseClicked(evt);
            }
        });

        jLabel14.setText("Modificar");

        javax.swing.GroupLayout pnModificarUsuarioLayout = new javax.swing.GroupLayout(pnModificarUsuario);
        pnModificarUsuario.setLayout(pnModificarUsuarioLayout);
        pnModificarUsuarioLayout.setHorizontalGroup(
            pnModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnModificarUsuarioLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18))
        );
        pnModificarUsuarioLayout.setVerticalGroup(
            pnModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnModificarUsuarioLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(21, 21, 21))
        );

        pnMenuUsuarios.add(pnModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        pnRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnRegistrarUsuarioMouseClicked(evt);
            }
        });

        jLabel15.setText("Registrar");

        javax.swing.GroupLayout pnRegistrarUsuarioLayout = new javax.swing.GroupLayout(pnRegistrarUsuario);
        pnRegistrarUsuario.setLayout(pnRegistrarUsuarioLayout);
        pnRegistrarUsuarioLayout.setHorizontalGroup(
            pnRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegistrarUsuarioLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18))
        );
        pnRegistrarUsuarioLayout.setVerticalGroup(
            pnRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegistrarUsuarioLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(21, 21, 21))
        );

        pnMenuUsuarios.add(pnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLayeredPane1.add(pnMenuUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        javax.swing.GroupLayout pnMenuVentasReportesLayout = new javax.swing.GroupLayout(pnMenuVentasReportes);
        pnMenuVentasReportes.setLayout(pnMenuVentasReportesLayout);
        pnMenuVentasReportesLayout.setHorizontalGroup(
            pnMenuVentasReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        pnMenuVentasReportesLayout.setVerticalGroup(
            pnMenuVentasReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        jLayeredPane1.add(pnMenuVentasReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLayeredPane1)
                    .addComponent(pnContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 630, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnRegistrarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnRegistrarProductoMouseClicked
        IntroducirPanle(new PnRegistroProducto(), pnContenido, new Point(0,0));
    }//GEN-LAST:event_pnRegistrarProductoMouseClicked

    private void pnOpcionInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOpcionInventarioMouseClicked
        IntroducirPanle(new PnProductos(), pnContenido, new Point(0, 0));
    }//GEN-LAST:event_pnOpcionInventarioMouseClicked

    private void pnPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPedidosMouseClicked
        IntroducirPanle(new pnPedidos(), pnContenido,new Point(0,0));
    }//GEN-LAST:event_pnPedidosMouseClicked

    private void pnMercanciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMercanciaMouseClicked
        pnMenuMercancia.setVisible(true);
        pnMenuVentasReportes.setVisible(false);
        pnMenuUsuarios.setVisible(false);
        pnMenuProveedores.setVisible(false);
        IntroducirPanle(new PnProductos(), pnContenido, new Point(0, 0));
    }//GEN-LAST:event_pnMercanciaMouseClicked

    private void pnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUsuariosMouseClicked
        pnMenuMercancia.setVisible(false);
        pnMenuVentasReportes.setVisible(false);
        pnMenuUsuarios.setVisible(true);
        pnMenuProveedores.setVisible(false);
        IntroducirPanle(new pnUsuarios(), pnContenido, new Point(0, 0));
    }//GEN-LAST:event_pnUsuariosMouseClicked

    private void pnModificarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnModificarUsuarioMouseClicked
        IntroducirPanle(new pnVerModificarUsuarios(), pnContenido, new Point(0, 0));
    }//GEN-LAST:event_pnModificarUsuarioMouseClicked

    private void pnRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnRegistrarUsuarioMouseClicked
        IntroducirPanle(new pnUsuarios(), pnContenido, new Point(0, 0));
    }//GEN-LAST:event_pnRegistrarUsuarioMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        new Tienda().setVisible(true);
        IntroducirPanle(new Inicio(), pnContenido, new Point(0, 0));
        pnMenuMercancia.setVisible(false);
        pnMenuVentasReportes.setVisible(false);
        pnMenuUsuarios.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
       new Caja.CajaFrame().setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void pnRegistrarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnRegistrarProveedorMouseClicked
        IntroducirPanle(new RegistrarProveedore(), pnContenido, new Point(0, 0));
    }//GEN-LAST:event_pnRegistrarProveedorMouseClicked

    private void pnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnProveedoresMouseClicked
          pnMenuMercancia.setVisible(false);
        pnMenuVentasReportes.setVisible(false);
        pnMenuUsuarios.setVisible(false);
        pnMenuProveedores.setVisible(true);
        IntroducirPanle(new RegistrarProveedore(), pnContenido, new Point(0, 0));
    }//GEN-LAST:event_pnProveedoresMouseClicked

    private void pnModificarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnModificarProveedorMouseClicked
         IntroducirPanle(new ModificarProveedor(), pnContenido, new Point(0, 0));
    }//GEN-LAST:event_pnModificarProveedorMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel pnContenido;
    private javax.swing.JPanel pnMenuMercancia;
    private javax.swing.JPanel pnMenuProveedores;
    private javax.swing.JPanel pnMenuUsuarios;
    private javax.swing.JPanel pnMenuVentasReportes;
    private javax.swing.JPanel pnMercancia;
    private javax.swing.JPanel pnModificarProveedor;
    private javax.swing.JPanel pnModificarUsuario;
    private javax.swing.JPanel pnOpcionInventario;
    private javax.swing.JPanel pnPedidos;
    private javax.swing.JPanel pnProveedores;
    private javax.swing.JPanel pnRegistrarProducto;
    private javax.swing.JPanel pnRegistrarProveedor;
    private javax.swing.JPanel pnRegistrarUsuario;
    private javax.swing.JPanel pnUsuarios;
    // End of variables declaration//GEN-END:variables
   
}
