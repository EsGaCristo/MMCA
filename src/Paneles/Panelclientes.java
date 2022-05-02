
package Paneles;

import java.awt.Color;
import Clases.Clientes.*;
import Clases.ProyectoExcepcion;
import Principal.BaseDatos;
import java.awt.Image;
////////sql////////////////////
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.UIManager;
/**
 *
 * @author Ivanr
 */
public class Panelclientes extends javax.swing.JPanel {
     public  Connection conexion;
     BaseDatos bd= new BaseDatos();
     
     
    
    public Panelclientes() {
        initComponents();
        
    }
 private boolean validaCampo(JTextField t){
        try{
            estaVacio(t);
        }catch(ProyectoExcepcion e){
            showMessageDialog(this,e.getMessage()); t.requestFocus();
            return true;
        }
        return false;
    }
    
    private void estaVacio(JTextField t)throws ProyectoExcepcion{
        String cad=t.getText().trim();
        if(cad.equals(""))throw new ProyectoExcepcion("Campo vacio");
    }
    private void limpiarcampo(){
                txtNombre.setText("");
                txtApellidos.setText("");
                txtDireccion.setText("");
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtDescripcion.setText("");
        }
    public void validaCampos(){
    

    }

public boolean esEntero(String val){
        float cant=0;
        try{
        cant=Float.parseFloat(val);
        }catch(NumberFormatException err){
            showMessageDialog(this,"Verifique tipo de dato");
            
        }
       if(cant>0){return true;
       }else{showMessageDialog(this,"El valor debe ser >0","Servicios", JOptionPane.INFORMATION_MESSAGE); return false;}
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTituloClientes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpnInfoCuerpo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        PanelBotonesClientes = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnVisualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(251, 229, 218));
        setLayout(new java.awt.BorderLayout());

        jpnInfo.setBackground(new java.awt.Color(251, 229, 218));
        jpnInfo.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon clientes.png"))); // NOI18N
        jpnInfo.add(jLabel1, java.awt.BorderLayout.WEST);

        jpnTituloClientes.setBackground(new java.awt.Color(251, 229, 218));
        jpnTituloClientes.setPreferredSize(new java.awt.Dimension(820, 70));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setText("Registro de Clientes");
        jpnTituloClientes.add(jLabel2);

        jpnInfo.add(jpnTituloClientes, java.awt.BorderLayout.NORTH);

        jpnInfoCuerpo.setBackground(new java.awt.Color(251, 229, 218));
        jpnInfoCuerpo.setLayout(new java.awt.GridLayout(6, 4));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombre(s):");
        jpnInfoCuerpo.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Apellidos:");
        jpnInfoCuerpo.add(jLabel4);

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(4, 19));
        txtNombre.setName(""); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(4, 19));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jpnInfoCuerpo.add(txtNombre);

        txtApellidos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jpnInfoCuerpo.add(txtApellidos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Direccion:");
        jpnInfoCuerpo.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Correo electronico:");
        jpnInfoCuerpo.add(jLabel6);

        txtDireccion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jpnInfoCuerpo.add(txtDireccion);

        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jpnInfoCuerpo.add(txtCorreo);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Telefono:");
        jpnInfoCuerpo.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Descripcion:");
        jpnInfoCuerpo.add(jLabel8);

        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jpnInfoCuerpo.add(txtTelefono);

        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jpnInfoCuerpo.add(txtDescripcion);

        jpnInfo.add(jpnInfoCuerpo, java.awt.BorderLayout.CENTER);

        add(jpnInfo, java.awt.BorderLayout.CENTER);

        PanelBotonesClientes.setBackground(new java.awt.Color(251, 229, 218));
        PanelBotonesClientes.setForeground(new java.awt.Color(255, 255, 255));
        PanelBotonesClientes.setPreferredSize(new java.awt.Dimension(732, 170));
        PanelBotonesClientes.setLayout(new java.awt.GridLayout(2, 3));

        jPanel1.setBackground(new java.awt.Color(251, 229, 218));

        btnLimpiar.setBackground(new java.awt.Color(251, 229, 218));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBotonesClientes.add(jPanel1);

        jPanel7.setBackground(new java.awt.Color(251, 229, 218));

        btnAgregar.setBackground(new java.awt.Color(251, 229, 218));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(83, 83, 83))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBotonesClientes.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(251, 229, 218));

        btnBuscar.setBackground(new java.awt.Color(251, 229, 218));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(95, 95, 95))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBotonesClientes.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(251, 229, 218));

        btnEliminar.setBackground(new java.awt.Color(251, 229, 218));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-eliminar-carpeta.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(83, 83, 83))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBotonesClientes.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(251, 229, 218));

        btnActualizar.setBackground(new java.awt.Color(251, 229, 218));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(83, 83, 83))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBotonesClientes.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(251, 229, 218));

        btnVisualizar.setBackground(new java.awt.Color(251, 229, 218));
        btnVisualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Visualizar.png"))); // NOI18N
        btnVisualizar.setText("Visualizar Clientes");
        btnVisualizar.setBorder(null);
        btnVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(btnVisualizar)
                .addGap(83, 83, 83))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnVisualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBotonesClientes.add(jPanel11);

        add(PanelBotonesClientes, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

   ///////////////////////BD//////////////////////////////////////////
      ////////////////insertar//////////////////////////////////
    //HOLA
    private void insertar() {

        int resultado;

        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("insert into CLIENTE(NOMBRE, APELLIDOS, DIRECCION, "
                    + "CORREO, CEL_CLIENTE, DESCRIPCION) values (?,?,?,?,?,?)");
            
            enunciado.setString(1, txtNombre.getText());
            enunciado.setString(2, txtApellidos.getText());
            enunciado.setString(3, txtDireccion.getText());
            enunciado.setString(4, txtCorreo.getText());
            enunciado.setString(5, txtTelefono.getText());
            enunciado.setString(6, txtDescripcion.getText());
  
            
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
    
    ////////////////////////buscar//////////////////////////////////
     private void buscar() {
         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            String nom= txtNombre.getText();
            String apell=txtApellidos.getText();
            String selectSql = "SELECT * from CLIENTE where NOMBRE='"+nom+"'"+"AND APELLIDOS='"+apell+"'";
            resultado= statement.executeQuery(selectSql);
            
            if(resultado.next()){
                txtNombre.setText(resultado.getString("NOMBRE"));
                txtApellidos.setText(resultado.getString("APELLIDOS"));
                txtDireccion.setText(resultado.getString("DIRECCION"));
                txtCorreo.setText(resultado.getString("CORREO"));
                txtTelefono.setText(resultado.getString("CEL_CLIENTE"));
                txtDescripcion.setText(resultado.getString("DESCRIPCION"));
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
    
     ////////////////////////borrar//////////////////////////////////
       private void borrar() {

        int resultado;

        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("delete from CLIENTE where NOMBRE=? and apellidos=?");
            enunciado.setString(1, txtNombre.getText());
            enunciado.setString(2, txtApellidos.getText());
            
            resultado = enunciado.executeUpdate();
            if (resultado > 0) {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/cliente no encontrado.png"));
                JOptionPane.showMessageDialog(null,"Cliente Eliminado Correctamente ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
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
    
    ////////////////actualizar//////////////////////////////////

    private void actualizar(){

        int resultado;

        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("update CLIENTE set NOMBRE=?, APELLIDOS=?, DIRECCION=?, "
                    + "CORREO=?, CEL_CLIENTE=?, DESCRIPCION=? where NOMBRE=? and apellidos=?");
            
            enunciado.setString(1, txtNombre.getText());
            enunciado.setString(2, txtApellidos.getText());
            enunciado.setString(3, txtDireccion.getText());
            enunciado.setString(4, txtCorreo.getText());
            enunciado.setString(5, txtTelefono.getText());
            enunciado.setString(6, txtDescripcion.getText());
            enunciado.setString(7, txtNombre.getText());
            enunciado.setString(8, txtApellidos.getText());
  
            
            resultado = enunciado.executeUpdate();
            if (resultado > 0) {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/actualizado.png"));
                JOptionPane.showMessageDialog(null,"Cliente Actualizado Correctamente ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
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
    
    
    /////////////////////eventos /////////////////////////////////////
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
            
    }//GEN-LAST:event_txtNombreActionPerformed
    
    
    private void botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseExited
         evt.getComponent().setBackground(new Color(251,229,218));
    }//GEN-LAST:event_botonMouseExited

    private void botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseEntered
        evt.getComponent().setBackground(new Color(170,133,111));
    }//GEN-LAST:event_botonMouseEntered

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    if(validaCampo(txtNombre))return;
    if(validaCampo(txtApellidos))return;
    if(validaCampo(txtDireccion))return;
    if(validaCampo(txtCorreo))return;
    if(validaCampo(txtTelefono))return;
    if(validaCampo(txtDescripcion))return;
    insertar();
    limpiarcampo();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
                txtNombre.setText("");
                txtApellidos.setText("");
                txtDireccion.setText("");
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtDescripcion.setText("");
                
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     if(validaCampo(txtNombre))return;
     if(validaCampo(txtApellidos))return;  
     buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int confirmado = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?");
    if (JOptionPane.OK_OPTION == confirmado){
       if(validaCampo(txtNombre))return; 
           if(validaCampo(txtNombre))return;
           if(validaCampo(txtApellidos))return;
           borrar();
           limpiarcampo();
    }else
       System.out.println("No se ha eliminado");
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    if(validaCampo(txtNombre))return;
    if(validaCampo(txtApellidos))return;
    if(validaCampo(txtDireccion))return;
    if(validaCampo(txtCorreo))return;
    if(validaCampo(txtTelefono))return;
    if(validaCampo(txtDescripcion))return;
        actualizar();
        limpiarcampo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
      new VisualizarClientes().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotonesClientes;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jpnInfo;
    public javax.swing.JPanel jpnInfoCuerpo;
    private javax.swing.JPanel jpnTituloClientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
