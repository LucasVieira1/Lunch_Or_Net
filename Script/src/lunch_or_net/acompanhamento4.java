/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunch_or_net;

import lunch_or_net.acompanhamento1;
import lunch_or_net.tela_principal;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandro V Vieira
 */
public class acompanhamento4 extends javax.swing.JFrame {

    /**
     * Creates new form acompanhamento4
     */
    public acompanhamento4() {
        initComponents();
                att4.setBackground(new Color(0, 0, 0, 0));
                btnvoltar4.setBackground(new Color(0, 0, 0, 0));


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        att4 = new javax.swing.JButton();
        btnvoltar4 = new javax.swing.JButton();
        lblfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        att4.setBorder(null);
        att4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                att4ActionPerformed(evt);
            }
        });
        getContentPane().add(att4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 640, 140, 40));

        btnvoltar4.setBorder(null);
        btnvoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 100, 40));

        lblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/ACOMPANHAMENTO4.0.jpg"))); // NOI18N
        getContentPane().add(lblfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        setSize(new java.awt.Dimension(1370, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void att4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_att4ActionPerformed
       try {
            Thread.sleep(1 * 1500 );
        } catch (InterruptedException ex) {
            Logger.getLogger(acompanhamento1.class.getName()).log(Level.SEVERE, null, ex);
        } 
        acompanhamento5 a5 = new acompanhamento5();
    a5.setVisible(true);
    dispose();    dispose();    }//GEN-LAST:event_att4ActionPerformed

    private void btnvoltar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar4ActionPerformed
   int a = JOptionPane.showConfirmDialog(null, " Deseja voltar ao menu principal?", "Registro", JOptionPane.OK_CANCEL_OPTION);
        if (a == JOptionPane.OK_OPTION) {
             dispose();
            tela_principal ap = new tela_principal();
            ap.setVisible(true);
            dispose();
        } else {

        }
    }//GEN-LAST:event_btnvoltar4ActionPerformed

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
            java.util.logging.Logger.getLogger(acompanhamento4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acompanhamento4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acompanhamento4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acompanhamento4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acompanhamento4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton att4;
    private javax.swing.JButton btnvoltar4;
    private javax.swing.JLabel lblfundo;
    // End of variables declaration//GEN-END:variables
}