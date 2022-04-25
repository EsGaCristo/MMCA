/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.Proyecto;
import Principal.BaseDatos;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PanelProyectos extends javax.swing.JPanel {

    FondoPanel fondo  = new FondoPanel();
    public ArrayList <Proyecto> proyectos = new ArrayList();
    BaseDatos bd= new BaseDatos();
    DefaultTableModel dtm1,dtm2,dtm3;
    int auxA = 0;

    public PanelProyectos() {        
        initComponents();
        dtm1=(DefaultTableModel) tblObj1.getModel();
        dtm2=(DefaultTableModel) tblObj2.getModel();
        dtm3=(DefaultTableModel) tblObj3.getModel();
        buscar();
        
        //imprime los primeros 3 proyectos
        llenarObjeto(dtm1,proyectos.get(0));
        llenarObjeto(dtm2,proyectos.get(1));
        llenarObjeto(dtm3,proyectos.get(2));
        
        // recolorear lo de las tablas
        tblObj1.setFillsViewportHeight(true);
        tblObj2.setFillsViewportHeight(true);
        tblObj3.setFillsViewportHeight(true);
       
        
        
    }
    
    private void buscar() {         
        ResultSet resultado=null;
        Connection connection=null;
        Statement statement=null;
        try {
            connection = bd.getConexion();
            statement = connection.createStatement();
            
            String selectSql = "SELECT * from PROYECTO order by FECHA_FIN";
            resultado= statement.executeQuery(selectSql);
          
            while(resultado.next()){
            Proyecto p = new Proyecto(resultado.getInt("ID_PROYECTO"),resultado.getInt("ID_CLIENTE"),
                    resultado.getInt("ESTADO"),resultado.getDate("FECHA_INICIO"),resultado.getDate("FECHA_FIN"));
            proyectos.add(p);
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            bd.cerrar(statement, resultado);
        }
    }


    
     public void llenarObjeto(DefaultTableModel dtm,Proyecto p){
         Object O[]=null;
         for (int i = 0; i <5; i++) {
             dtm.addRow(O);
         }
         dtm.setValueAt("Id Proyecto"+p.getId(), 0, 0);
         dtm.setValueAt("", 1, 0);
         dtm.setValueAt(p.getEstado(), 2, 0);
         dtm.setValueAt(p.getStart(), 3, 0);
         dtm.setValueAt(p.getEnd(), 4, 0);
           
     }
    
    public void prox(){
        new ProyectosEnMarcha().setVisible(true);
    }
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pnProximos = new javax.swing.JPanel();
        obj9 = new FondoPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        obj10 = new FondoPanel();
        obj11 = new FondoPanel();
        pnlMarcha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        obj1 = new FondoPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblObj1 = new javax.swing.JTable();
        obj2 = new FondoPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblObj2 = new javax.swing.JTable();
        obj3 = new FondoPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblObj3 = new javax.swing.JTable();
        lblVer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(251, 229, 218));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnProximos.setBackground(new java.awt.Color(251, 229, 218));

        obj9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout obj9Layout = new javax.swing.GroupLayout(obj9);
        obj9.setLayout(obj9Layout);
        obj9Layout.setHorizontalGroup(
            obj9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        obj9Layout.setVerticalGroup(
            obj9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 102, 51));
        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 172, 133));
        jLabel3.setText("Proyectos Proximos");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar2.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        obj10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout obj10Layout = new javax.swing.GroupLayout(obj10);
        obj10.setLayout(obj10Layout);
        obj10Layout.setHorizontalGroup(
            obj10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        obj10Layout.setVerticalGroup(
            obj10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        obj11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout obj11Layout = new javax.swing.GroupLayout(obj11);
        obj11.setLayout(obj11Layout);
        obj11Layout.setHorizontalGroup(
            obj11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        obj11Layout.setVerticalGroup(
            obj11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnProximosLayout = new javax.swing.GroupLayout(pnProximos);
        pnProximos.setLayout(pnProximosLayout);
        pnProximosLayout.setHorizontalGroup(
            pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProximosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProximosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(752, Short.MAX_VALUE))
                    .addGroup(pnProximosLayout.createSequentialGroup()
                        .addComponent(obj9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(obj10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(obj11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43))))
        );
        pnProximosLayout.setVerticalGroup(
            pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProximosLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProximosLayout.createSequentialGroup()
                        .addGroup(pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnProximosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(obj9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(obj10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(obj11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnProximosLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel6)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(pnProximosLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(pnProximos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 254, 941, 310));

        pnlMarcha.setBackground(new java.awt.Color(251, 229, 218));

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 172, 133));
        jLabel1.setText("Proyectos en marcha");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        obj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj1MouseClicked(evt);
            }
        });

        tblObj1.setBackground(new java.awt.Color(251, 229, 218));
        tblObj1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 229, 218)));
        tblObj1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        tblObj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblObj1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblObj1.setGridColor(new java.awt.Color(251, 229, 218));
        tblObj1.setSelectionBackground(new java.awt.Color(187, 187, 187));
        tblObj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObj1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblObj1);
        if (tblObj1.getColumnModel().getColumnCount() > 0) {
            tblObj1.getColumnModel().getColumn(0).setHeaderValue("");
        }

        javax.swing.GroupLayout obj1Layout = new javax.swing.GroupLayout(obj1);
        obj1.setLayout(obj1Layout);
        obj1Layout.setHorizontalGroup(
            obj1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        obj1Layout.setVerticalGroup(
            obj1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        obj2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj2MouseClicked(evt);
            }
        });

        tblObj2.setBackground(new java.awt.Color(251, 229, 218));
        tblObj2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        tblObj2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        tblObj2.setGridColor(new java.awt.Color(251, 229, 218));
        tblObj2.setSelectionBackground(new java.awt.Color(187, 187, 187));
        tblObj2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObj2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblObj2);

        javax.swing.GroupLayout obj2Layout = new javax.swing.GroupLayout(obj2);
        obj2.setLayout(obj2Layout);
        obj2Layout.setHorizontalGroup(
            obj2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obj2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        obj2Layout.setVerticalGroup(
            obj2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        obj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj3MouseClicked(evt);
            }
        });

        tblObj3.setBackground(new java.awt.Color(251, 229, 218));
        tblObj3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        tblObj3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        tblObj3.setGridColor(new java.awt.Color(251, 229, 218));
        tblObj3.setSelectionBackground(new java.awt.Color(187, 187, 187));
        tblObj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObj3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblObj3);

        javax.swing.GroupLayout obj3Layout = new javax.swing.GroupLayout(obj3);
        obj3.setLayout(obj3Layout);
        obj3Layout.setHorizontalGroup(
            obj3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obj3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        obj3Layout.setVerticalGroup(
            obj3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        lblVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar2.png"))); // NOI18N
        lblVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMarchaLayout = new javax.swing.GroupLayout(pnlMarcha);
        pnlMarcha.setLayout(pnlMarchaLayout);
        pnlMarchaLayout.setHorizontalGroup(
            pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarchaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMarchaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMarchaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(obj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(obj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(obj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69)
                        .addComponent(lblVer)
                        .addGap(45, 45, 45))))
        );
        pnlMarchaLayout.setVerticalGroup(
            pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarchaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMarchaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMarchaLayout.createSequentialGroup()
                                .addComponent(lblVer)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMarchaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(79, 79, 79))))
                    .addGroup(pnlMarchaLayout.createSequentialGroup()
                        .addGroup(pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(obj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(obj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        add(pnlMarcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void obj9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj9MouseClicked

    private void obj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj1MouseClicked
        javax.swing.JOptionPane.showMessageDialog(this,"hola");
    }//GEN-LAST:event_obj1MouseClicked

    private void obj2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj2MouseClicked

    private void obj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       new ListaProximoProyecto().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new FrameProximoProyecto().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void obj10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj10MouseClicked

    private void obj11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj11MouseClicked

    private void tblObj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObj1MouseClicked
        prox();
    }//GEN-LAST:event_tblObj1MouseClicked

    private void tblObj2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObj2MouseClicked
        prox();
    }//GEN-LAST:event_tblObj2MouseClicked

    private void tblObj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObj3MouseClicked
        prox();
    }//GEN-LAST:event_tblObj3MouseClicked

    private void lblVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerMouseClicked
    new ListaProximoProyectoEdit().setVisible(true);

    }//GEN-LAST:event_lblVerMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    new ListaMarchaProyecto().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblVer;
    private javax.swing.JPanel obj1;
    private javax.swing.JPanel obj10;
    private javax.swing.JPanel obj11;
    private javax.swing.JPanel obj2;
    private javax.swing.JPanel obj3;
    private javax.swing.JPanel obj9;
    private javax.swing.JPanel pnProximos;
    private javax.swing.JPanel pnlMarcha;
    private javax.swing.JTable tblObj1;
    private javax.swing.JTable tblObj2;
    private javax.swing.JTable tblObj3;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

    
}
