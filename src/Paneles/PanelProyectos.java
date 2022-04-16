/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.Proyecto;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelProyectos extends javax.swing.JPanel {

    FondoPanel fondo  = new FondoPanel();
    public PanelProyectos() {        
        initComponents();
    }

   
    private ImageIcon resizedImg(String srcImg, int w, int h){
        ImageIcon icon = new ImageIcon(srcImg);
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(w, h,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pnProximos = new javax.swing.JPanel();
        pnlMarcha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        obj4 = new FondoPanel();
        lblId = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblFase1 = new javax.swing.JLabel();
        lblFase2 = new javax.swing.JLabel();
        lblFase3 = new javax.swing.JLabel();
        obj5 = new FondoPanel();
        lblId1 = new javax.swing.JLabel();
        lblDesc1 = new javax.swing.JLabel();
        lblFase4 = new javax.swing.JLabel();
        lblFase5 = new javax.swing.JLabel();
        lblFase6 = new javax.swing.JLabel();
        obj6 = new FondoPanel();
        lblId2 = new javax.swing.JLabel();
        lblDesc2 = new javax.swing.JLabel();
        lblFase7 = new javax.swing.JLabel();
        lblFase8 = new javax.swing.JLabel();
        lblFase9 = new javax.swing.JLabel();
        obj7 = new FondoPanel();
        lblFase12 = new javax.swing.JLabel();
        obj8 = new FondoPanel();
        lblFase13 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(251, 229, 218));

        pnProximos.setBackground(new java.awt.Color(251, 229, 218));
        pnProximos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 172, 133), 3));

        javax.swing.GroupLayout pnProximosLayout = new javax.swing.GroupLayout(pnProximos);
        pnProximos.setLayout(pnProximosLayout);
        pnProximosLayout.setHorizontalGroup(
            pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        pnProximosLayout.setVerticalGroup(
            pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        pnlMarcha.setBackground(new java.awt.Color(251, 229, 218));
        pnlMarcha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 172, 133), 3));

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 172, 133));
        jLabel1.setText("Proyectos en marcha");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        obj4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj4MouseClicked(evt);
            }
        });

        lblId.setText("ID Proyecto");

        lblDesc.setText("Descripcion");

        lblFase1.setText("Fase encontrada");

        lblFase2.setText("Fecha Inicio");

        lblFase3.setText("Fecha Final");

        javax.swing.GroupLayout obj4Layout = new javax.swing.GroupLayout(obj4);
        obj4.setLayout(obj4Layout);
        obj4Layout.setHorizontalGroup(
            obj4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obj4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(obj4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFase3)
                    .addComponent(lblFase2))
                .addGap(52, 52, 52))
            .addGroup(obj4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(obj4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFase1)
                    .addGroup(obj4Layout.createSequentialGroup()
                        .addGroup(obj4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesc)
                            .addComponent(lblId))
                        .addGap(13, 13, 13)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        obj4Layout.setVerticalGroup(
            obj4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDesc)
                .addGap(34, 34, 34)
                .addComponent(lblFase1)
                .addGap(33, 33, 33)
                .addComponent(lblFase2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFase3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        obj5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj5MouseClicked(evt);
            }
        });

        lblId1.setText("ID Proyecto");

        lblDesc1.setText("Descripcion");

        lblFase4.setText("Fase encontrada");

        lblFase5.setText("Fecha Inicio");

        lblFase6.setText("Fecha Final");

        javax.swing.GroupLayout obj5Layout = new javax.swing.GroupLayout(obj5);
        obj5.setLayout(obj5Layout);
        obj5Layout.setHorizontalGroup(
            obj5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obj5Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(obj5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFase4)
                    .addGroup(obj5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(obj5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFase5)
                            .addComponent(lblFase6))))
                .addGap(35, 35, 35))
            .addGroup(obj5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(obj5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId1)
                    .addComponent(lblDesc1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        obj5Layout.setVerticalGroup(
            obj5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblId1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDesc1)
                .addGap(18, 18, 18)
                .addComponent(lblFase4)
                .addGap(26, 26, 26)
                .addComponent(lblFase5)
                .addGap(18, 18, 18)
                .addComponent(lblFase6)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        obj6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj6MouseClicked(evt);
            }
        });

        lblId2.setText("ID Proyecto");

        lblDesc2.setText("Descripcion");

        lblFase7.setText("Fase encontrada");

        lblFase8.setText("Fecha Inicio");

        lblFase9.setText("Fecha Final");

        javax.swing.GroupLayout obj6Layout = new javax.swing.GroupLayout(obj6);
        obj6.setLayout(obj6Layout);
        obj6Layout.setHorizontalGroup(
            obj6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obj6Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(obj6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFase7)
                    .addGroup(obj6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(obj6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFase8)
                            .addComponent(lblFase9))))
                .addGap(35, 35, 35))
            .addGroup(obj6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(obj6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId2)
                    .addComponent(lblDesc2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        obj6Layout.setVerticalGroup(
            obj6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblId2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDesc2)
                .addGap(35, 35, 35)
                .addComponent(lblFase7)
                .addGap(32, 32, 32)
                .addComponent(lblFase8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFase9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        obj7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj7MouseClicked(evt);
            }
        });

        lblFase12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar2.png"))); // NOI18N

        javax.swing.GroupLayout obj7Layout = new javax.swing.GroupLayout(obj7);
        obj7.setLayout(obj7Layout);
        obj7Layout.setHorizontalGroup(
            obj7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblFase12)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        obj7Layout.setVerticalGroup(
            obj7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obj7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFase12)
                .addGap(68, 68, 68))
        );

        obj8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obj8MouseClicked(evt);
            }
        });

        lblFase13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N

        javax.swing.GroupLayout obj8Layout = new javax.swing.GroupLayout(obj8);
        obj8.setLayout(obj8Layout);
        obj8Layout.setHorizontalGroup(
            obj8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obj8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblFase13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        obj8Layout.setVerticalGroup(
            obj8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obj8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFase13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout pnlMarchaLayout = new javax.swing.GroupLayout(pnlMarcha);
        pnlMarcha.setLayout(pnlMarchaLayout);
        pnlMarchaLayout.setHorizontalGroup(
            pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarchaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMarchaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlMarchaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(obj4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(obj6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(obj5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(obj8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(obj7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlMarchaLayout.setVerticalGroup(
            pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarchaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMarchaLayout.createSequentialGroup()
                        .addGroup(pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(obj5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(obj4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(obj6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(obj7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(obj8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnProximos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMarcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMarcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnProximos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void obj4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj4MouseClicked
        javax.swing.JOptionPane.showMessageDialog(this,"hola");
    }//GEN-LAST:event_obj4MouseClicked

    private void obj5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj5MouseClicked

    private void obj6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj6MouseClicked

    private void obj7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj7MouseClicked

    private void obj8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obj8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obj8MouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblDesc1;
    private javax.swing.JLabel lblDesc2;
    private javax.swing.JLabel lblFase1;
    private javax.swing.JLabel lblFase12;
    private javax.swing.JLabel lblFase13;
    private javax.swing.JLabel lblFase2;
    private javax.swing.JLabel lblFase3;
    private javax.swing.JLabel lblFase4;
    private javax.swing.JLabel lblFase5;
    private javax.swing.JLabel lblFase6;
    private javax.swing.JLabel lblFase7;
    private javax.swing.JLabel lblFase8;
    private javax.swing.JLabel lblFase9;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId2;
    private javax.swing.JPanel obj4;
    private javax.swing.JPanel obj5;
    private javax.swing.JPanel obj6;
    private javax.swing.JPanel obj7;
    private javax.swing.JPanel obj8;
    private javax.swing.JPanel pnProximos;
    private javax.swing.JPanel pnlMarcha;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/proyectIcon.png")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
