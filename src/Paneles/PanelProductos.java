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
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author p_a_u
 */
public class PanelProductos extends javax.swing.JPanel {
     public  Connection conexion;
     BaseDatos bd= new BaseDatos();
     ArrayList<Servicio> servicios = new ArrayList();
      DefaultTableModel dtm;
      tipoServicio servicio;
    //paul
    public PanelProductos() {
        initComponents();
        dtm=(DefaultTableModel) tbl1.getModel();
        LLenarCombo();
        buscar();
        llenarTabla();
    }
  private void insertar() {

        int resultado;
        String str = txtPU.getText();
        BigDecimal num = new BigDecimal(str);
        
         tipoServicio nose=(tipoServicio)cmbTipo.getSelectedItem();
            int tipo=nose.getId_tipoServicio();
        
        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("INSERT INTO SERVICIOS(CONCEPTO,PRECIO_UNITARIO,"
                    + "TIPO_SERVICIO,PROVEEDOR) values (?,?,?,?)");
            
            
            enunciado.setString(1, txtConcepto.getText());
            enunciado.setBigDecimal(2,num);
            enunciado.setInt(3,tipo);
            enunciado.setString(4,txtProveedor.getText());

            resultado = enunciado.executeUpdate();
            if (resultado > 0) {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/insertado.png"));
                JOptionPane.showMessageDialog(null,"Cliente Insertado Correctamente ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            } else {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/error.png"));
                JOptionPane.showMessageDialog(null,"Error ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
  
    public void actualizar(){        
        for (int i = 0; i >=dtm.getRowCount()-1 ; i++) {
            dtm.removeRow(i);
        }
        dtm.setRowCount(0);
    servicios.clear();
    buscar();
    llenarTabla();
    }

    public void LLenarCombo(){
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            String selectSql = "SELECT * from TIPOSSERVICIO";
            resultado= statement.executeQuery(selectSql);
           while(resultado.next()){
               tipoServicio tiposer = new tipoServicio(resultado.getInt("ID_TIPO"),resultado.getString("NOMBRE") );
               cmbTipo.addItem(tiposer);
           }
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }
    }
    
 private void borrar() {   
        int resultado;
        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("delete from SERVICIOS where COD_SERVICIO=?");
            enunciado.setInt(1, Integer.parseInt(txtID.getText()));
            
            resultado = enunciado.executeUpdate();
            if (resultado > 0) {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/pngwing.com (1) (1).png"));
                JOptionPane.showMessageDialog(null,"Servicio Eliminado Correctamente ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            } else {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/error.png"));
                JOptionPane.showMessageDialog(null,"Error ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }    
    
 public void llenarTabla(){
         Object O[]=null;
         for (int i = 0; i < servicios.size(); i++) {
            dtm.addRow(O);
            Servicio ser = (Servicio) servicios.get(i);  
           dtm.setValueAt(ser.getCodServicio(), i, 0);
            dtm.setValueAt(ser.getConsepto(), i, 1);
            dtm.setValueAt(ser.getPrecio(), i, 3);
            dtm.setValueAt(ser.getProvedor(), i, 2);
            }
     }
public void Validar(){
int n=cmbTipo.getItemCount();
        switch (n){

            case 0:{

                System.out.println("Usted eligió la opcion 1.");
                servicio.setId_tipoServicio(0);
                break;

            }

            case 2:{

                System.out.println("Usted eligió la opcion 2.");
                servicio.setId_tipoServicio(1);
                break;

            }

            case 3:{
                servicio.setId_tipoServicio(2);
                System.out.println("Usted eligió la opcion 3.");

                break;

            }

            default: {

                System.out.println("Opcion incorrecta");

            }

      }//cierra SWITCH

}

private void buscar2() {
         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            String concepto= txtConcepto.getText();
            String selectSql = "SELECT * FROM SERVICIOS WHERE concepto='"+concepto+"'";
            resultado= statement.executeQuery(selectSql);
            
            if(resultado.next()){
                txtConcepto.setText(resultado.getString("CONCEPTO"));
                txtProveedor.setText(resultado.getString("PROVEEDOR"));
                txtPU.setText(resultado.getString("PRECIO_UNITARIO"));
                txtID.setText(resultado.getString("COD_SERVICIO"));
              //  cmbTipo.setSelectedIndex(servicio.getId_tipoServicio());
                



              

                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/busqueda.png"));
                JOptionPane.showMessageDialog(null,"Cliente Encontrado Correctamente ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);  

            }else{
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/cliente no encontrado.png"));
                JOptionPane.showMessageDialog(null,"Cliente No Encontrado, intentelo nuevamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
                 
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            bd.cerrar(statement, resultado);
        }
        
        
    }

 
     private void buscar() {         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            
            String selectSql = "SELECT * from SERVICIOS";
            resultado= statement.executeQuery(selectSql);
          
            while(resultado.next()){
            Servicio servicis = new Servicio(resultado.getInt("COD_SERVICIO"),resultado.getString("CONCEPTO"),resultado.getBigDecimal("PRECIO_UNITARIO"),
            resultado.getInt("TIPO_SERVICIO"),resultado.getString("PROVEEDOR"));
            servicios.add(servicis);
            
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            bd.cerrar(statement, resultado);
            llenarTabla();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtPU = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(697, 404));

        jPanel1.setBackground(new java.awt.Color(251, 229, 218));

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Dubai", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Gestion de servicios");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/servicios-de-apoyo.png"))); // NOI18N

        tbl1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Proveedor", "PrecioUnitario", "TipoServicio"
            }
        ));
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl1);

        btnAgregar.setBackground(new java.awt.Color(255, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Dubai", 2, 24)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Dubai", 2, 24)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 204, 204));
        btnEditar.setFont(new java.awt.Font("Dubai", 2, 24)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Dubai", 2, 24)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-eliminar-carpeta.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setText("Concepto");

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setText("Precio Unitario");

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel7.setText("Tipo_servicio");

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel9.setText("Codigo");

        txtConcepto.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        txtProveedor.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        txtPU.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel8.setText("Proveedor");

        cmbTipo.setFont(new java.awt.Font("Dubai Light", 0, 24)); // NOI18N
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPU, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(46, 46, 46)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnEditar)
                                .addGap(35, 35, 35)
                                .addComponent(btnEliminar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(411, 411, 411)
                    .addComponent(jLabel8)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jLabel8)
                    .addContainerGap(379, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        insertar();
        actualizar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    buscar2();
    //Validar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        borrar();
        limpiar();
        actualizar();
        //actualizar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        limpiar();
        int col = tbl1.getSelectedRow();
        txtID.setText(tbl1.getModel().getValueAt(col, 0).toString());
        txtConcepto.setText(tbl1.getModel().getValueAt(col, 1).toString());
        txtPU.setText(tbl1.getModel().getValueAt(col, 2).toString());
        txtProveedor.setText(tbl1.getModel().getValueAt(col, 3).toString());
        cmbTipo.setSelectedItem(tbl1.getModel().getValueAt(col, 4));
    }//GEN-LAST:event_tbl1MouseClicked

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
    
        
        
    
    }//GEN-LAST:event_cmbTipoItemStateChanged
    public void limpiar(){
        txtConcepto.setText("");
        txtProveedor.setText("");
        txtID.setText("");
        txtPU.setText("");
        cmbTipo.setSelectedIndex(0);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<tipoServicio> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl1;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPU;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
