package Principal;


import Paneles.*;
import java.awt.Color;
import javax.swing.JPanel;

////////sql////////////////////
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
    public  Connection conexion;
    BaseDatos bd= new BaseDatos();
    JPanel jpnClientes = new Panelclientes(); 
    JPanel jpnProyectos = new PanelProyectos(); 
    JPanel jpnCotizaciones = new PanelCotizaciones();
    JPanel jpnProductos = new PanelProductos();
    JPanel jpnPersonal = new PanelPersonal();
    int rango;

    public Ventana(int rango) {
        initComponents();
        this.setLocationRelativeTo(this);
        bd.conectar();
        jpnPaneles.add(jpnClientes);
        this.rango = rango;
        desactivar();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnSur1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpnPrincipal = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnlogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpnItems = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnCotizaciones = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnProyectos = new javax.swing.JButton();
        btnPersonal = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jpnCentral = new javax.swing.JPanel();
        jpnTitulo = new javax.swing.JPanel();
        jpnPaneles = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 172, 133));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setSize(new java.awt.Dimension(1200, 600));

        jpnSur1.setBackground(new java.awt.Color(251, 229, 218));
        jpnSur1.setForeground(new java.awt.Color(0, 153, 204));
        jpnSur1.setPreferredSize(new java.awt.Dimension(954, 40));
        jpnSur1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel2.setBackground(new java.awt.Color(241, 172, 133));
        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 172, 133));
        jLabel2.setText("MARINA MEZA COMPANION APP");
        jpnSur1.add(jLabel2);

        getContentPane().add(jpnSur1, java.awt.BorderLayout.SOUTH);

        jpnPrincipal.setLayout(new java.awt.BorderLayout());

        jpnMenu.setMinimumSize(new java.awt.Dimension(63, 80));
        jpnMenu.setPreferredSize(new java.awt.Dimension(200, 300));
        jpnMenu.setLayout(new java.awt.BorderLayout());

        jpnlogo.setBackground(new java.awt.Color(251, 229, 218));
        jpnlogo.setForeground(new java.awt.Color(255, 255, 255));
        jpnlogo.setPreferredSize(new java.awt.Dimension(100, 150));
        jpnlogo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo marina meza.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 100));
        jpnlogo.add(jLabel3);

        jpnMenu.add(jpnlogo, java.awt.BorderLayout.NORTH);

        jpnItems.setBackground(new java.awt.Color(251, 229, 218));
        jpnItems.setLayout(new java.awt.GridLayout(6, 1));

        btnCliente.setBackground(new java.awt.Color(241, 172, 133));
        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("CLIENTES");
        btnCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jpnItems.add(btnCliente);

        btnCotizaciones.setBackground(new java.awt.Color(241, 172, 133));
        btnCotizaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCotizaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCotizaciones.setText("COTIZACIONES");
        btnCotizaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCotizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCotizaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnCotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizacionesActionPerformed(evt);
            }
        });
        jpnItems.add(btnCotizaciones);

        btnServicios.setBackground(new java.awt.Color(241, 172, 133));
        btnServicios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setText("SERVICIOS");
        btnServicios.setToolTipText("");
        btnServicios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        jpnItems.add(btnServicios);

        btnProyectos.setBackground(new java.awt.Color(241, 172, 133));
        btnProyectos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProyectos.setForeground(new java.awt.Color(255, 255, 255));
        btnProyectos.setText("EVENTOS");
        btnProyectos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnProyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectosActionPerformed(evt);
            }
        });
        jpnItems.add(btnProyectos);

        btnPersonal.setBackground(new java.awt.Color(241, 172, 133));
        btnPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnPersonal.setText("PERSONAL");
        btnPersonal.setToolTipText("");
        btnPersonal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalActionPerformed(evt);
            }
        });
        jpnItems.add(btnPersonal);

        btnCerrarSesion.setBackground(new java.awt.Color(241, 172, 133));
        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.setToolTipText("");
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jpnItems.add(btnCerrarSesion);

        jpnMenu.add(jpnItems, java.awt.BorderLayout.CENTER);

        jpnPrincipal.add(jpnMenu, java.awt.BorderLayout.WEST);

        jpnCentral.setBackground(new java.awt.Color(227, 238, 245));
        jpnCentral.setLayout(new java.awt.BorderLayout());

        jpnTitulo.setBackground(new java.awt.Color(251, 229, 218));
        jpnTitulo.setPreferredSize(new java.awt.Dimension(854, 40));
        jpnCentral.add(jpnTitulo, java.awt.BorderLayout.NORTH);

        jpnPaneles.setBackground(new java.awt.Color(251, 229, 218));
        jpnPaneles.setToolTipText("");
        jpnPaneles.setLayout(new java.awt.BorderLayout());
        jpnCentral.add(jpnPaneles, java.awt.BorderLayout.CENTER);

        jpnPrincipal.add(jpnCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpnPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
     //////////////////conectar/////////////////////
    private void conectar() {

        String URL = "jdbc:sqlserver://sql5107.site4now.net:1433;"
                    +"database=db_a84ab7_mmca;"
                    +"user=db_a84ab7_mmca_admin;"
                    +"password=MMCA2022;"
                    +"loginTimeout=30;";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL);
            //System.out.println("conexion exitosa BD MMCA");
        } catch (SQLException ex) {
            //System.out.println(ex.toString());
            //System.exit(0);
        }
    }
    
   
    
    
    
    ///////////////acciones botones ect ///////////////////////////
    private void botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseEntered
       evt.getComponent().setBackground(new Color(170,133,111));
        
    }//GEN-LAST:event_botonMouseEntered

    private void botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseExited
        evt.getComponent().setBackground(new Color(241,172,133));
    }//GEN-LAST:event_botonMouseExited
    
    
    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
         
        jpnClientes.setVisible(true); 
         jpnPersonal.setVisible(false);
         jpnProyectos.setVisible(false);
         jpnCotizaciones.setVisible(false);
         jpnProductos.setVisible(false);
         jpnPaneles.add(jpnClientes);
         jpnPaneles.validate();
        
        
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnCotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizacionesActionPerformed
        
        jpnCotizaciones.setVisible(true);
         jpnPersonal.setVisible(false);
         jpnClientes.setVisible(false);
         jpnProyectos.setVisible(false);
         jpnProductos.setVisible(false);
         jpnPaneles.add(jpnCotizaciones);
         jpnPaneles.validate();
    }//GEN-LAST:event_btnCotizacionesActionPerformed

    private void btnProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectosActionPerformed
         jpnProyectos.setVisible(true);
         jpnPersonal.setVisible(false);
         jpnClientes.setVisible(false);
         jpnCotizaciones.setVisible(false);
         jpnProductos.setVisible(false);
         jpnPaneles.add(jpnProyectos);
         jpnPaneles.validate();
    }//GEN-LAST:event_btnProyectosActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
         jpnProductos.setVisible(true);
         
         jpnProyectos.setVisible(false);
         jpnClientes.setVisible(false);
         jpnPersonal.setVisible(false);
         jpnCotizaciones.setVisible(false);
         jpnPaneles.add(jpnProductos);
         jpnPaneles.validate() ; 
        
        
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        new login().setVisible(true);
        this.dispose();
        /*Statement statement=null;
        PreparedStatement updateSql = null;
        Connection connection=null;
        ResultSet resultado=null;
        try{
        connection = bd.getConexion();
        statement = connection.createStatement();
        
        String url = "select * from Personal where estado = 1";        
        resultado= statement.executeQuery(url);
            if (resultado.next()) {

                updateSql = connection.prepareStatement("UPDATE PERSONAL SET ESTADO = 0 WHERE NOMBRE_USUARIO = '"+
                        resultado.getString("NOMBRE_USUARIO")+"'");
                updateSql.executeUpdate();
                new login().setVisible(true);  
                this.setVisible(false);
                
            }
        }catch(Exception ex){
                ex.printStackTrace();
        }finally{
        bd.cerrar(statement, resultado);
        } */ 
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
         jpnPersonal.setVisible(true);
         jpnProyectos.setVisible(false);
         jpnClientes.setVisible(false);
         jpnCotizaciones.setVisible(false);
         jpnProductos.setVisible(false);
         jpnPaneles.add(jpnPersonal);
         jpnPaneles.validate();
    }//GEN-LAST:event_btnPersonalActionPerformed


     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCotizaciones;
    private javax.swing.JButton btnPersonal;
    private javax.swing.JButton btnProyectos;
    private javax.swing.JButton btnServicios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpnCentral;
    private javax.swing.JPanel jpnItems;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnPaneles;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JPanel jpnSur1;
    private javax.swing.JPanel jpnTitulo;
    private javax.swing.JPanel jpnlogo;
    // End of variables declaration//GEN-END:variables

    private void desactivar() {
    if(rango >=3){
        btnCotizaciones.setEnabled(false);
        btnServicios.setEnabled(false);
        btnPersonal.setEnabled(false);
    } 
    else if (rango == 2) {
            btnPersonal.setEnabled(false);
    }
    
    }

    
}
