
package Frames;


import Clases.Proyecto;
import Clases.tipoServicio;
import Principal.BaseDatos;
import java.awt.Color;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zara
 */


public class ListaProximoProyectoEdit extends javax.swing.JFrame {
    public  Connection conexion;
     BaseDatos bd= new BaseDatos();
     ArrayList<Proyecto> proyectos = new ArrayList();
     DefaultTableModel dtm;
     //JPanel jpnProyecto = new PanelProyectos();


     /**
    * Editar estado Proyecto
    * pasa el proyecto a un estado de en marcha
    * se utiliza al pasar un proyecto aun estado en marcha
    */
     
private void editar(){
        SimpleDateFormat dFormat // Usado para dar formato a la fecha del DateChooser
                = new SimpleDateFormat("yyyy-MM-dd"); 
        int resultado;
        
         /*tipoServicio nose=(tipoServicio)cmbTipo.getSelectedItem();
         int tipo=nose.getId_tipoServicio();
*/

        try {
            PreparedStatement enunciado;
            enunciado = bd.getConexion().prepareStatement("UPDATE PROYECTO set Estado=1, FECHA_FIN =? where ID_PROYECTO=?");
            
            enunciado.setString(1, dFormat.format(DateFin.getDate()));
            enunciado.setString(2, txtId.getText());
            
            resultado = enunciado.executeUpdate();
            if (resultado > 0) {
                UIManager.put("OptionPane.background", Color.decode("#FBE5DA"));
                UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FBE5DA"));
                UIManager.put("Button.background", Color.decode("#FBE5DA"));
                Icon icono = new ImageIcon(getClass().getResource("/imagenes/actualizado.png"));
                JOptionPane.showMessageDialog(null,"Proyecto Actualizado Correctamente ", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
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

    /**
    * constructor de la clase
    * inicializa la clase
    * se usa al querer mostrar la interfaz de proximos proyecos
    */
    public ListaProximoProyectoEdit() {
        initComponents();
        this.setLocationRelativeTo(this);
        dtm=(DefaultTableModel) TablaPP.getModel();
        buscar();
        llenarTabla();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    
    /**
    * Reseteo de la tabla
    * realiza un reseteo de la tabla para poder actualizarla con campos nuevos
    * se utiliza al realizar una actualizacion den la tabla
    */
public void eliminarTb(){
        int a = TablaPP.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        dtm.removeRow(dtm.getRowCount()-1);
        }
        //cargaTicket();
    }

     /**
    * Funcion de busqueda en la base de datos
    * realiza una bosqueda en la tabla proyectos para traer una lista de los proyectos proximos
    * se utuliza para obtener los proximos proyectos
    *@SQLException en qué caso de que no este disponible la bd o los datos sean incorrectos
    */

    private void buscar() {         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            
            String selectSql = "SELECT proyecto.id_proyecto,cliente.nombre,proyecto.fecha_inicio,proyecto.fecha_fin,proyecto.estado from PROYECTO inner join CLIENTE ON proyecto.ID_CLIENTE = cliente.ID_CLIENTE  where estado = 0";
            resultado= statement.executeQuery(selectSql);
          
            while(resultado.next()){
            Proyecto p2 = new Proyecto(resultado.getInt("ID_PROYECTO"),resultado.getString("nombre"),resultado.getDate("fecha_Inicio"),resultado.getDate("fecha_Fin"),resultado.getInt("Estado"));
            proyectos.add(p2);
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
    * Realiza llenado de la tabla de proyectos con un arraylist proyectos
    * se llama cada que se realice una demostracion de la tabla o se le haga cambio
    */
     public void llenarTabla(){
         Object O[]=null;
         for (int i = 0; i < proyectos.size(); i++) {
            dtm.addRow(O);
            Proyecto per = (Proyecto) proyectos.get(i);  
            dtm.setValueAt(per.getId(), i, 0);
            dtm.setValueAt(per.getCliente(), i, 1);
            dtm.setValueAt(per.getStart(), i, 2);
            dtm.setValueAt(per.getEnd(), i, 3);
            dtm.setValueAt(per.getEstado(), i, 4);
            }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPP = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        DateFin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 229, 218));

        jLabel1.setFont(new java.awt.Font("Dubai", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA PRÓXIMOS PROYECTOS");

        TablaPP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Proyecto", "Cliente", "Fecha de inicio", "Fecha fin", "Estado"
            }
        ));
        TablaPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPP);
        if (TablaPP.getColumnModel().getColumnCount() > 0) {
            TablaPP.getColumnModel().getColumn(0).setHeaderValue("ID Proyecto");
            TablaPP.getColumnModel().getColumn(1).setHeaderValue("Cliente");
            TablaPP.getColumnModel().getColumn(2).setHeaderValue("Fecha de inicio");
            TablaPP.getColumnModel().getColumn(3).setHeaderValue("Fecha fin");
            TablaPP.getColumnModel().getColumn(4).setHeaderValue("Estado");
        }

        jButton1.setBackground(new java.awt.Color(241, 172, 133));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(241, 172, 133));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(52, 52, 52)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DateFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar)
                        .addComponent(jButton1)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
      actualizar();
      if(DateFin.getDate()!=null) {
      editar();
      buscar();
      }
      this.dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

      /**
    * realizacion de actualizacion de tabla
    * Realiza actualizacion de la tabla de Proyectos eliminando el que se cambio de estado 
    * se llama cada que se cambie el estado de un proyecto
    */
    public void actualizar(){        
        for (int i = 0; i >=dtm.getRowCount()-1 ; i++) {
            dtm.removeRow(i);
        }
    //dtm.setRowCount(0);
    //proyectos.clear();
    // buscar();
    //llenarTabla();
    }
    private void TablaPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPPMouseClicked
        
            String ID = ""+ dtm.getValueAt(TablaPP.getSelectedRow(),0);
            txtId.setText(ID);
       
    }//GEN-LAST:event_TablaPPMouseClicked
    
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
            java.util.logging.Logger.getLogger(ListaProximoProyectoEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProximoProyectoEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProximoProyectoEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProximoProyectoEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProximoProyectoEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateFin;
    private javax.swing.JTable TablaPP;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
