/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.Font.*;
/**
 *
 * @author Chiesaafandy
 */
public class Prologue extends javax.swing.JFrame  {

    public String playername(String namaplayer){
        return namaplayer;
    };
    public Prologue() {
        
        
        initComponents();
        setSize(800,600);
        setLocation(200,100);

        setResizable(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MCharacter mc = new MCharacter();
        TaNarative = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        jLabel2.setText("Click here to continue to map.......");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 530, 260, 30);

        TaNarative.setColumns(20);
        TaNarative.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        TaNarative.setText("Welcome " + mc.getName() + " Knight of The chosen one.\n"
            + "I Am King Henry of Larion kingdom have a quest for you.\n"
            + "Defeat all Element monster that destroying our land.\n"
            + "As the reward i will give you "
            + "My precious throne and crown \nand i will promote you as the new king of this land\n"
        );
        TaNarative.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaNarativeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TaNarative);
        TaNarative.setHighlighter(null);
        TaNarative.setEditable(false);
        TaNarative.setLineWrap(true);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 400, 776, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameproject/ThroneRoom.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -130, 800, 600);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 460, 800, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TaNarativeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaNarativeMouseClicked
        Level peta = new Level();
        peta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TaNarativeMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Level peta = new Level();
        peta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Prologue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prologue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prologue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prologue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prologue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TaNarative;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
