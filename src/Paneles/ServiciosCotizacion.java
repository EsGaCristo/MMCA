/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.Servicio;
import Clases.tipoServicio;
import Principal.BaseDatos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivanr
 */
public class ServiciosCotizacion extends javax.swing.JFrame {
    public  Connection conexion;
    DefaultTableModel dtm;
    BaseDatos bd= new BaseDatos();
    ArrayList<Servicio> servicios = new ArrayList();

   

    public ServiciosCotizacion() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dtm=(DefaultTableModel) tblServicios.getModel();
       LLenarCombo();
    }

    public void LLenarCombo(){
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            String nom= txtNombreServicio.getText();
            String selectSql = "SELECT * from TIPOSSERVICIO";
            resultado= statement.executeQuery(selectSql);
           while(resultado.next()){
               tipoServicio tiposer = new tipoServicio(resultado.getInt("ID_TIPO"),resultado.getString("NOMBRE") );
               cbxTipoServicio.addItem(tiposer);
           }
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnEncabezados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreServicio = new javax.swing.JTextField();
        btnBuscarServicio = new javax.swing.JButton();
        cbxTipoServicio = new javax.swing.JComboBox<>();
        jspTable = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 229, 218));
        setMinimumSize(new java.awt.Dimension(543, 300));
        setPreferredSize(new java.awt.Dimension(543, 400));
        setSize(new java.awt.Dimension(543, 300));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jPanel1.setBackground(new java.awt.Color(251, 229, 218));
        jPanel1.setForeground(new java.awt.Color(251, 229, 218));
        jPanel1.setLayout(new java.awt.BorderLayout(10, 10));

        jpnEncabezados.setBackground(new java.awt.Color(251, 229, 218));
        jpnEncabezados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnEncabezados.setForeground(new java.awt.Color(251, 229, 218));
        jpnEncabezados.setLayout(new java.awt.GridLayout(2, 2));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar Servicio:");
        jpnEncabezados.add(jLabel1);

        txtNombreServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreServicioActionPerformed(evt);
            }
        });
        txtNombreServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreServicioKeyReleased(evt);
            }
        });
        jpnEncabezados.add(txtNombreServicio);

        btnBuscarServicio.setBackground(new java.awt.Color(241, 172, 133));
        btnBuscarServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarServicio.setText("Buscar");
        btnBuscarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarServicioActionPerformed(evt);
            }
        });
        jpnEncabezados.add(btnBuscarServicio);

        cbxTipoServicio.setBackground(new java.awt.Color(241, 172, 133));
        cbxTipoServicio.setForeground(new java.awt.Color(241, 172, 133));
        cbxTipoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoServicioActionPerformed(evt);
            }
        });
        jpnEncabezados.add(cbxTipoServicio);

        jPanel1.add(jpnEncabezados, java.awt.BorderLayout.PAGE_START);

        jspTable.setBackground(new java.awt.Color(251, 229, 218));
        jspTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jspTable.setForeground(new java.awt.Color(251, 229, 218));

        tblServicios.setBackground(new java.awt.Color(251, 229, 218));
        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO ", "CONCEPTO", "P.U.", "PROVEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblServicios.setToolTipText("");
        tblServicios.setGridColor(new java.awt.Color(251, 229, 218));
        tblServicios.setSelectionBackground(new java.awt.Color(241, 172, 133));
        tblServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServiciosMouseClicked(evt);
            }
        });
        tblServicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblServiciosKeyReleased(evt);
            }
        });
        jspTable.setViewportView(tblServicios);

        jPanel1.add(jspTable, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarServicioActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarServicioActionPerformed

    private void txtNombreServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreServicioActionPerformed

    private void cbxTipoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoServicioActionPerformed
        System.out.println("accion");
    }//GEN-LAST:event_cbxTipoServicioActionPerformed

    private void txtNombreServicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreServicioKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)buscar();
    }//GEN-LAST:event_txtNombreServicioKeyReleased

    private void tblServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServiciosMouseClicked
        if(evt.getClickCount()==2){
            int cod= (int) dtm.getValueAt(tblServicios.getSelectedRow(), 0);
            Servicio servic=obtenerServicio(cod);
            PanelCotizaciones.servicios.add(servic);
            PanelCotizaciones.controlServicio=servic;
            System.out.println("servic = " + servic);
            PanelCotizaciones pn = new  PanelCotizaciones();
            dispose();
        }
    }//GEN-LAST:event_tblServiciosMouseClicked

    private void tblServiciosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblServiciosKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            int cod= (int) dtm.getValueAt(tblServicios.getSelectedRow(), 0);
            Servicio servic=obtenerServicio(cod);
            PanelCotizaciones.servicios.add(servic);
            PanelCotizaciones.controlServicio=servic;
            System.out.println("servic = " + servic);
            PanelCotizaciones pn = new  PanelCotizaciones();
            dispose();
       }
    }//GEN-LAST:event_tblServiciosKeyReleased
    
    private Servicio obtenerServicio(int codd){
        Servicio servicioo=null;
        for (int i = 0; i < servicios.size(); i++) {

            Servicio ser = (Servicio) servicios.get(i); 
            if(codd==ser.getCodServicio())servicioo=ser;
            }
        
        return servicioo;
    }
    
   
    /////////////////////////////////////////////////
        ////////////////////////buscar//////////////////////////////////
     private void buscar() {
        servicios.clear();
        eliminarTb();
         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            String nom= txtNombreServicio.getText();
            tipoServicio nose=(tipoServicio)cbxTipoServicio.getSelectedItem();
            int id=nose.getId_tipoServicio();
            
            String selectSql = "SELECT * from SERVICIOS where CONCEPTO LIKE '%"+nom+"%' AND TIPO_SERVICIO ='"+id+"'";
            resultado= statement.executeQuery(selectSql);
          
            while(resultado.next()){
            Servicio servicis = new Servicio(resultado.getInt("COD_SERVICIO"),resultado.getString("CONCEPTO"),resultado.getBigDecimal("PRECIO_UNITARIO"),
            resultado.getInt("TIPO_SERVICIO"),resultado.getString("PROVEEDOR"));
            //System.out.println(servicis);
            servicios.add(servicis);
            
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            bd.cerrar(statement, resultado);
            llenarTabla();
        }
    }
     
     public void llenarTabla(){
         Object O[]=null;
         for (int i = 0; i < servicios.size(); i++) {
            dtm.addRow(O);
            Servicio ser = (Servicio) servicios.get(i);  
           dtm.setValueAt(ser.getCodServicio(), i, 0);
            dtm.setValueAt(ser.getConsepto(), i, 1);
            dtm.setValueAt(ser.getPrecio(), i, 2);
            dtm.setValueAt(ser.getProvedor(), i, 3);
            }
     }
     
    public void eliminarTb(){
        int a = tblServicios.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        dtm.removeRow(dtm.getRowCount()-1);
        }
        //cargaTicket();
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ServiciosCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiciosCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiciosCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiciosCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiciosCotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarServicio;
    private javax.swing.JComboBox<tipoServicio> cbxTipoServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnEncabezados;
    private javax.swing.JScrollPane jspTable;
    private javax.swing.JTable tblServicios;
    private javax.swing.JTextField txtNombreServicio;
    // End of variables declaration//GEN-END:variables
}
