/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.Jlabel;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PanelProyectos extends javax.swing.JPanel {

    public PanelProyectos() {
        initComponents();

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlMarcha = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnProximos = new javax.swing.JPanel();

        setBackground(new java.awt.Color(251, 229, 218));

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Dubai", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Gestion de Proyectos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/servicios-de-apoyo.png"))); // NOI18N

        pnlMarcha.setBackground(new java.awt.Color(251, 229, 218));
        pnlMarcha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 172, 133), 3));

        jLabel4.setText("h");

        javax.swing.GroupLayout pnlMarchaLayout = new javax.swing.GroupLayout(pnlMarcha);
        pnlMarcha.setLayout(pnlMarchaLayout);
        pnlMarchaLayout.setHorizontalGroup(
            pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMarchaLayout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(425, 425, 425))
        );
        pnlMarchaLayout.setVerticalGroup(
            pnlMarchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarchaLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pnProximos.setBackground(new java.awt.Color(251, 229, 218));
        pnProximos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 172, 133), 3));

        javax.swing.GroupLayout pnProximosLayout = new javax.swing.GroupLayout(pnProximos);
        pnProximos.setLayout(pnProximosLayout);
        pnProximosLayout.setHorizontalGroup(
            pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnProximosLayout.setVerticalGroup(
            pnProximosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMarcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnProximos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMarcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnProximos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnProximos;
    private javax.swing.JPanel pnlMarcha;
    // End of variables declaration//GEN-END:variables
}
