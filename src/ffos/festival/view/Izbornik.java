/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.festival.view;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Endrina
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form FormaIzbornik
     */
    public Izbornik() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIzvodjac = new javax.swing.JButton();
        btnFunkcija = new javax.swing.JButton();
        btnKoncert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Izbornik");

        btnIzvodjac.setText("Izvođač");
        btnIzvodjac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzvodjacActionPerformed(evt);
            }
        });

        btnFunkcija.setText("Funkcija");
        btnFunkcija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFunkcijaActionPerformed(evt);
            }
        });

        btnKoncert.setText("Koncert");
        btnKoncert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKoncertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIzvodjac)
                    .addComponent(btnFunkcija)
                    .addComponent(btnKoncert))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnIzvodjac)
                .addGap(50, 50, 50)
                .addComponent(btnFunkcija)
                .addGap(50, 50, 50)
                .addComponent(btnKoncert)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzvodjacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzvodjacActionPerformed
        new FormaIzvodjac().setVisible(true);
    }//GEN-LAST:event_btnIzvodjacActionPerformed

    private void btnFunkcijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFunkcijaActionPerformed
        new FormaFunkcija().setVisible(true);
    }//GEN-LAST:event_btnFunkcijaActionPerformed

    private void btnKoncertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKoncertActionPerformed
        new FormaKoncert().setVisible(true);
    }//GEN-LAST:event_btnKoncertActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFunkcija;
    private javax.swing.JButton btnIzvodjac;
    private javax.swing.JButton btnKoncert;
    // End of variables declaration//GEN-END:variables
}