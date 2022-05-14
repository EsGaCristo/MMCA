/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Pagos;
import Paneles.*;
import Clases.Servicio;
import Clases.tipoServicio;
import static Paneles.PanelCotizaciones.controlServicio;
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
public class PagosF extends javax.swing.JFrame {
    public  Connection conexion;
    DefaultTableModel dtm;
    BaseDatos bd= new BaseDatos();
    ArrayList<Pagos> listpagos = new ArrayList();
    private  int idCotizacion;

   
    /**
    * Constructor de la clase PagosF
    * inicializa el objeto de la clase
    * se usa al querer mostrar la ventana de pagos
    * @param idCot id de la cotizacion
    */
    public PagosF(int idCot) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dtm=(DefaultTableModel) tblPagos.getModel();
        this.idCotizacion=idCot;
        buscar();
      
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnEncabezados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnAgregarPago = new javax.swing.JButton();
        jspTable = new javax.swing.JScrollPane();
        tblPagos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 229, 218));
        setMinimumSize(new java.awt.Dimension(543, 300));
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
        jLabel1.setText("Agregue el monto de pago:");
        jpnEncabezados.add(jLabel1);

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoKeyReleased(evt);
            }
        });
        jpnEncabezados.add(txtMonto);

        btnAgregarPago.setBackground(new java.awt.Color(241, 172, 133));
        btnAgregarPago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarPago.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPago.setText("Agregar Pago");
        btnAgregarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPagoActionPerformed(evt);
            }
        });
        jpnEncabezados.add(btnAgregarPago);

        jPanel1.add(jpnEncabezados, java.awt.BorderLayout.PAGE_START);

        jspTable.setBackground(new java.awt.Color(251, 229, 218));
        jspTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jspTable.setForeground(new java.awt.Color(251, 229, 218));

        tblPagos.setBackground(new java.awt.Color(251, 229, 218));
        tblPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA ", "MONTO", "RESTANTE."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPagos.setToolTipText("");
        tblPagos.setGridColor(new java.awt.Color(251, 229, 218));
        tblPagos.setSelectionBackground(new java.awt.Color(241, 172, 133));
        tblPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPagosMouseClicked(evt);
            }
        });
        tblPagos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPagosKeyReleased(evt);
            }
        });
        jspTable.setViewportView(tblPagos);

        jPanel1.add(jspTable, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtMontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyReleased
        
    }//GEN-LAST:event_txtMontoKeyReleased

    private void tblPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPagosMouseClicked
        if(evt.getClickCount()==2){

        }
    }//GEN-LAST:event_tblPagosMouseClicked

    private void tblPagosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPagosKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
 
       }
    }//GEN-LAST:event_tblPagosKeyReleased

    private void btnAgregarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPagoActionPerformed
            insertar();
    }//GEN-LAST:event_btnAgregarPagoActionPerformed
    
    /**
    * Funcion de busqueda en la base de datos
    * realiza una bosqueda en la tabla pagos de la cotizacion de dicha clase
    * se utuliza para obtener informaion sobre los pagos realizados
    *@SQLException en qué caso de que no este disponible la bd o los datos sean incorrectos
    */
    
     private void buscar() {
        listpagos.clear();
        eliminarTb();
         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();

            
            String selectSql = "SELECT * from PAGOS where ID_COTIZACION  ='"+idCotizacion+"'";
            resultado= statement.executeQuery(selectSql);
          
            while(resultado.next()){
            Pagos servicis = new Pagos(resultado.getBigDecimal("MONTO"),resultado.getBigDecimal("RESTANTE"),resultado.getDate("FECHA"));
            //System.out.println(servicis);
            listpagos.add(servicis);
            
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            bd.cerrar(statement, resultado);
            llenarTabla();
        }
    }
     
    /**
    * realizacion de llenado de tabla
    * Realiza llenado de la tabla de pagos con un arraylist pagos
    * se llama cada que se realice una demostracion de la tabla o se le haga cambio
    */
    
     public void llenarTabla(){
         Object O[]=null;
         for (int i = 0; i < listpagos.size(); i++) {
            dtm.addRow(O);
            Pagos ser = (Pagos) listpagos.get(i);  
           dtm.setValueAt(ser.getFecha(), i, 0);
            dtm.setValueAt(ser.getMonto(), i, 1);
            dtm.setValueAt(ser.getRestante(), i, 2);
            }
     }
     
     
    /**
    * Reseteo de la tabla
    * realiza un reseteo de la tabla para poder actualizarla con campos nuevos
    * se utiliza al realizar una actualizacion den la tabla
    */
    
     public void eliminarTb(){
        int a = tblPagos.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        dtm.removeRow(dtm.getRowCount()-1);
        }
        //cargaTicket();
    }
     
     /**
    * insercion de pago en la bd
    * Realiza la insersion de pagos en la base de datos
    * se llama cada que se realice un pago
    *@SQLException en qué caso de que no este disponible la bd o los datos sean incorrectos
    */
    
    private void insertar() {


         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
       
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            BigDecimal cant = new BigDecimal(txtMonto.getText());
            String selectSql = "{call sp_pagos_insertar ("+idCotizacion+","+cant+")}";
            resultado= statement.executeQuery(selectSql);
        } catch (Exception ex) {
            //ex.printStackTrace();
        }finally{
            buscar();
        }

    }
    
     
   
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
            java.util.logging.Logger.getLogger(PagosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagosF(13).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnEncabezados;
    private javax.swing.JScrollPane jspTable;
    private javax.swing.JTable tblPagos;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
