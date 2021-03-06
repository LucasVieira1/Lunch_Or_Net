/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunch_or_net;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandro V Vieira
 */
public class Tela_carregando extends javax.swing.JFrame {

    /**
     * Creates new form Tela_carregando
     */
    public Tela_carregando() {
        initComponents();
         barraprogresso.setBackground(new Color (0,0,0,0));
        //setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlfundo = new javax.swing.JPanel();
        barraprogresso = new javax.swing.JProgressBar();
        lblgif = new javax.swing.JLabel();
        lblporcentagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);

        pnlfundo.setBackground(new java.awt.Color(186, 187, 191));

        barraprogresso.setBackground(new java.awt.Color(255, 0, 0));
        barraprogresso.setForeground(new java.awt.Color(51, 51, 51));
        barraprogresso.setBorder(null);

        lblgif.setBackground(new java.awt.Color(53, 183, 197));
        lblgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/GIF LANCHE.gif"))); // NOI18N

        lblporcentagem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblporcentagem.setText("0");

        javax.swing.GroupLayout pnlfundoLayout = new javax.swing.GroupLayout(pnlfundo);
        pnlfundo.setLayout(pnlfundoLayout);
        pnlfundoLayout.setHorizontalGroup(
            pnlfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfundoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblgif, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlfundoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(barraprogresso, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlfundoLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(lblporcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlfundoLayout.setVerticalGroup(
            pnlfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfundoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblgif, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(barraprogresso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblporcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(571, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  Tela_carregando carregando = new Tela_carregando();
        carregando.setVisible(true);
    
        try {
            for (int i = 0; i <= 100; i+=2) { //0 a 100%
                Thread.sleep(70); //70 milisegundos (tempo)
                carregando.barraprogresso.setValue(i);  //barra de progresso, representar de 0 a 100%
                carregando.lblporcentagem.setText(Integer.toString(i) + "%");  //converte o i em uma string, de 0 a 100%
            }
            carregando.dispose();
            tela_login_senha login = new tela_login_senha();  //chama a tela login
            login.setVisible(true); //liga a tela login

        } catch (InterruptedException e) {
            JOptionPane.showConfirmDialog(null, "ERRO!!!");  //se der errado aparece erro!
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraprogresso;
    private javax.swing.JLabel lblgif;
    private javax.swing.JLabel lblporcentagem;
    private javax.swing.JPanel pnlfundo;
    // End of variables declaration//GEN-END:variables
}
