/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunch_or_net;

import java.awt.Color;
import javax.swing.JOptionPane;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Sandro V Vieira
 */
public class tela_cadastro extends javax.swing.JFrame {

    /**
     * Creates new form tela_cadastro
     */
    public tela_cadastro() {
        initComponents();
        txtusuario.setBackground(new Color(0, 0, 0, 0));
        txtemail.setBackground(new Color(0, 0, 0, 0));
        txtsenha.setBackground(new Color(0, 0, 0, 0));
        txtconfirmar.setBackground(new Color(0, 0, 0, 0));
        btnconcordo.setBackground(new Color(0, 0, 0, 0));
        btnregistrar.setBackground(new Color(0, 0, 0, 0));
        btnvoltar2.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        txtconfirmar = new javax.swing.JPasswordField();
        txtsenha = new javax.swing.JPasswordField();
        txtusuario = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnconcordo = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnvoltar2 = new javax.swing.JButton();
        lblfundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtconfirmar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtconfirmar.setBorder(null);
        getContentPane().add(txtconfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 340, 20));

        txtsenha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtsenha.setBorder(null);
        getContentPane().add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 340, 30));

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtusuario.setBorder(null);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 340, 20));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtemail.setBorder(null);
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 340, 20));

        btnconcordo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnconcordo.setBorder(null);
        btnconcordo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcordoActionPerformed(evt);
            }
        });
        getContentPane().add(btnconcordo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 30, 20));

        btnregistrar.setBackground(new java.awt.Color(255, 0, 0));
        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnregistrar.setBorder(null);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 350, 33));

        btnvoltar2.setBackground(new java.awt.Color(255, 255, 255));
        btnvoltar2.setBorder(null);
        btnvoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 40, 30));

        lblfundo.setBackground(new java.awt.Color(255, 255, 255));
        lblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Registro.png"))); // NOI18N
        getContentPane().add(lblfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 428, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/AMAMOS_A_IMAGEM_DO_AGEO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        setBounds(0, 0, 1366, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar2ActionPerformed
        tela_login_senha voltar = new tela_login_senha();
        voltar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnvoltar2ActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // instanciando a classe Usuario do pacote modelo e criando seu objeto usuarios
        Usuario usuarios = new Usuario();
        usuarios.setNome(txtusuario.getText());
        usuarios.setEmail(txtemail.getText());
        usuarios.setSenha(String.valueOf(txtsenha.getPassword()));
        usuarios.setConfirmar(String.valueOf(txtconfirmar.getPassword()));

        // fazendo a validação dos dados
        if ((txtusuario.getText().isEmpty()) || (txtsenha.getPassword().length == 0) || (txtconfirmar.getPassword().length == 0)) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
            txtsenha.setText("");
            txtconfirmar.setText("");
        } else if (new String(txtconfirmar.getPassword()).equals(new String(txtsenha.getPassword()))) {

            // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
            UsuarioDAO dao = new UsuarioDAO();
            dao.insert(usuarios);
            int a = JOptionPane.showConfirmDialog(null, "Usuário " + txtusuario.getText() + " cadastrado com sucesso!\n Fazer login?", "Registro", JOptionPane.OK_CANCEL_OPTION);
            if (a == JOptionPane.OK_OPTION) {
                tela_login_senha voltar = new tela_login_senha();
                voltar.setVisible(true);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
            txtsenha.setText("");
            txtconfirmar.setText("");
        }

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnconcordoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcordoActionPerformed
        btnconcordo.setText("X");
    }//GEN-LAST:event_btnconcordoActionPerformed

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
            java.util.logging.Logger.getLogger(tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconcordo;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnvoltar2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblfundo;
    private javax.swing.JPasswordField txtconfirmar;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}