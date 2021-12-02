/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunch_or_net;

import lunch_or_net.tela_principal;
import lunch_or_net.tela_carrinho;
import factory.ConnectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandro V Vieira
 */
public class menu_lanche extends javax.swing.JFrame {

    int[] valor = new int[30];

    /**
     * Creates new form menu_lanche
     */
    public menu_lanche() {
        initComponents();
        btnpaes.setBackground(new Color(0, 0, 0, 0));
        btnsaladas.setBackground(new Color(0, 0, 0, 0));
        btnqueijos.setBackground(new Color(0, 0, 0, 0));
        btnbebidas.setBackground(new Color(0, 0, 0, 0));
        btnmolhos.setBackground(new Color(0, 0, 0, 0));
        txtresul.setBackground(new Color(0, 0, 0, 0));
        paomais.setBackground(new Color(0, 0, 0, 0));
        paomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul1.setBackground(new Color(0, 0, 0, 0));
        paoausmais.setBackground(new Color(0, 0, 0, 0));
        paoausmenos.setBackground(new Color(0, 0, 0, 0));
        txtresul2.setBackground(new Color(0, 0, 0, 0));
        pontomais.setBackground(new Color(0, 0, 0, 0));
        pontomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul3.setBackground(new Color(0, 0, 0, 0));
        passadomais.setBackground(new Color(0, 0, 0, 0));
        passadomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul4.setBackground(new Color(0, 0, 0, 0));
        frangomais.setBackground(new Color(0, 0, 0, 0));
        frangomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul5.setBackground(new Color(0, 0, 0, 0));
        pratomais.setBackground(new Color(0, 0, 0, 0));
        pratomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul6.setBackground(new Color(0, 0, 0, 0));
        cheddarmais.setBackground(new Color(0, 0, 0, 0));
        cheddarmenos.setBackground(new Color(0, 0, 0, 0));
        txtresul7.setBackground(new Color(0, 0, 0, 0));
        ovomais.setBackground(new Color(0, 0, 0, 0));
        ovomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul8.setBackground(new Color(0, 0, 0, 0));
        baconmais.setBackground(new Color(0, 0, 0, 0));
        baconmenos.setBackground(new Color(0, 0, 0, 0));
        txtresul9.setBackground(new Color(0, 0, 0, 0));
        alfacemais.setBackground(new Color(0, 0, 0, 0));
        alfacemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul10.setBackground(new Color(0, 0, 0, 0));
        cebolamais.setBackground(new Color(0, 0, 0, 0));
        cebolamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul11.setBackground(new Color(0, 0, 0, 0));
        pepinomais.setBackground(new Color(0, 0, 0, 0));
        pepinomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul12.setBackground(new Color(0, 0, 0, 0));
        pimentaomais.setBackground(new Color(0, 0, 0, 0));
        pimentaomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul13.setBackground(new Color(0, 0, 0, 0));
        piclesmais.setBackground(new Color(0, 0, 0, 0));
        piclesmenos.setBackground(new Color(0, 0, 0, 0));
        txtresul14.setBackground(new Color(0, 0, 0, 0));
        tomatemais.setBackground(new Color(0, 0, 0, 0));
        tomatemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul15.setBackground(new Color(0, 0, 0, 0));
        barbecuemais.setBackground(new Color(0, 0, 0, 0));
        barbecuemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul16.setBackground(new Color(0, 0, 0, 0));
        maionesemais.setBackground(new Color(0, 0, 0, 0));
        maionesemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul17.setBackground(new Color(0, 0, 0, 0));
        mostardamais.setBackground(new Color(0, 0, 0, 0));
        mostardamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul18.setBackground(new Color(0, 0, 0, 0));
        ketchupmais.setBackground(new Color(0, 0, 0, 0));
        ketchupmenos.setBackground(new Color(0, 0, 0, 0));
        sodamais.setBackground(new Color(0, 0, 0, 0));
        sodamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul19.setBackground(new Color(0, 0, 0, 0));
        colamais.setBackground(new Color(0, 0, 0, 0));
        colamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul20.setBackground(new Color(0, 0, 0, 0));
        aguamais.setBackground(new Color(0, 0, 0, 0));
        aguamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul21.setBackground(new Color(0, 0, 0, 0));
        laranjadamais.setBackground(new Color(0, 0, 0, 0));
        laranjadamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul22.setBackground(new Color(0, 0, 0, 0));
        btnvoltar.setBackground(new Color(0, 0, 0, 0));
        btnvoltar2.setBackground(new Color(0, 0, 0, 0));
        btnvoltar3.setBackground(new Color(0, 0, 0, 0));
        btnvoltar4.setBackground(new Color(0, 0, 0, 0));
        btnvoltar5.setBackground(new Color(0, 0, 0, 0));
        btnsalvar6.setBackground(new Color(0, 0, 0, 0));
        btnsalvar7.setBackground(new Color(0, 0, 0, 0));
        btnsalvar8.setBackground(new Color(0, 0, 0, 0));
        btnsalvar9.setBackground(new Color(0, 0, 0, 0));
        btnsalvar10.setBackground(new Color(0, 0, 0, 0));
        btnfinalizar2.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnfinalizar2 = new javax.swing.JButton();
        menu_lanche = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PAES = new javax.swing.JPanel();
        paomenos = new javax.swing.JButton();
        paomais = new javax.swing.JButton();
        txtresul = new javax.swing.JTextField();
        txtresul1 = new javax.swing.JTextField();
        paoausmais = new javax.swing.JButton();
        paoausmenos = new javax.swing.JButton();
        txtresul2 = new javax.swing.JTextField();
        pontomais = new javax.swing.JButton();
        pontomenos = new javax.swing.JButton();
        txtresul3 = new javax.swing.JTextField();
        passadomais = new javax.swing.JButton();
        passadomenos = new javax.swing.JButton();
        txtresul4 = new javax.swing.JTextField();
        frangomais = new javax.swing.JButton();
        frangomenos = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        btnsalvar6 = new javax.swing.JButton();
        paesfundo = new javax.swing.JLabel();
        QUEIJOS = new javax.swing.JPanel();
        pratomenos = new javax.swing.JButton();
        pratomais = new javax.swing.JButton();
        txtresul5 = new javax.swing.JTextField();
        cheddarmais = new javax.swing.JButton();
        txtresul6 = new javax.swing.JTextField();
        cheddarmenos = new javax.swing.JButton();
        ovomais = new javax.swing.JButton();
        txtresul7 = new javax.swing.JTextField();
        ovomenos = new javax.swing.JButton();
        baconmais = new javax.swing.JButton();
        txtresul8 = new javax.swing.JTextField();
        baconmenos = new javax.swing.JButton();
        btnvoltar2 = new javax.swing.JButton();
        btnsalvar7 = new javax.swing.JButton();
        queijosfundo = new javax.swing.JLabel();
        SALADAS = new javax.swing.JPanel();
        cebolamenos = new javax.swing.JButton();
        cebolamais = new javax.swing.JButton();
        txtresul9 = new javax.swing.JTextField();
        txtresul10 = new javax.swing.JTextField();
        alfacemais = new javax.swing.JButton();
        alfacemenos = new javax.swing.JButton();
        txtresul11 = new javax.swing.JTextField();
        pepinomais = new javax.swing.JButton();
        pepinomenos = new javax.swing.JButton();
        txtresul12 = new javax.swing.JTextField();
        piclesmais = new javax.swing.JButton();
        piclesmenos = new javax.swing.JButton();
        txtresul13 = new javax.swing.JTextField();
        tomatemais = new javax.swing.JButton();
        tomatemenos = new javax.swing.JButton();
        txtresul14 = new javax.swing.JTextField();
        pimentaomais = new javax.swing.JButton();
        pimentaomenos = new javax.swing.JButton();
        btnsalvar8 = new javax.swing.JButton();
        btnvoltar3 = new javax.swing.JButton();
        saladasfundo = new javax.swing.JLabel();
        MOLHOS = new javax.swing.JPanel();
        barbecuemenos = new javax.swing.JButton();
        barbecuemais = new javax.swing.JButton();
        txtresul15 = new javax.swing.JTextField();
        txtresul16 = new javax.swing.JTextField();
        ketchupmais = new javax.swing.JButton();
        ketchupmenos = new javax.swing.JButton();
        txtresul17 = new javax.swing.JTextField();
        mostardamais = new javax.swing.JButton();
        mostardamenos = new javax.swing.JButton();
        txtresul18 = new javax.swing.JTextField();
        maionesemais = new javax.swing.JButton();
        maionesemenos = new javax.swing.JButton();
        btnsalvar9 = new javax.swing.JButton();
        btnvoltar4 = new javax.swing.JButton();
        molhosfundo = new javax.swing.JLabel();
        BEBIDAS = new javax.swing.JPanel();
        txtresul19 = new javax.swing.JTextField();
        sodamenos = new javax.swing.JButton();
        sodamais = new javax.swing.JButton();
        colamais = new javax.swing.JButton();
        colamenos = new javax.swing.JButton();
        txtresul20 = new javax.swing.JTextField();
        aguamais = new javax.swing.JButton();
        aguamenos = new javax.swing.JButton();
        txtresul21 = new javax.swing.JTextField();
        laranjadamais = new javax.swing.JButton();
        laranjadamenos = new javax.swing.JButton();
        txtresul22 = new javax.swing.JTextField();
        btnsalvar10 = new javax.swing.JButton();
        btnvoltar5 = new javax.swing.JButton();
        bebidasfundo = new javax.swing.JLabel();
        btnpaes = new javax.swing.JButton();
        btnqueijos = new javax.swing.JButton();
        btnsaladas = new javax.swing.JButton();
        btnmolhos = new javax.swing.JButton();
        btnbebidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnfinalizar2.setBorder(null);
        btnfinalizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnfinalizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 653, 190, 30));

        menu_lanche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/teste.png"))); // NOI18N
        getContentPane().add(menu_lanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 730));

        PAES.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paomenosActionPerformed(evt);
            }
        });
        PAES.add(paomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 30, 30));

        paomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paomaisActionPerformed(evt);
            }
        });
        PAES.add(paomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 30, 30));

        txtresul.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul.setText("0");
        txtresul.setBorder(null);
        txtresul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresulActionPerformed(evt);
            }
        });
        PAES.add(txtresul, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 40, 20));

        txtresul1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul1.setText("0");
        txtresul1.setBorder(null);
        txtresul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul1ActionPerformed(evt);
            }
        });
        PAES.add(txtresul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 40, 20));

        paoausmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paoausmaisActionPerformed(evt);
            }
        });
        PAES.add(paoausmais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 30, 30));

        paoausmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paoausmenosActionPerformed(evt);
            }
        });
        PAES.add(paoausmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 30, 30));

        txtresul2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul2.setText("0");
        txtresul2.setBorder(null);
        txtresul2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul2ActionPerformed(evt);
            }
        });
        PAES.add(txtresul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 40, 20));

        pontomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontomaisActionPerformed(evt);
            }
        });
        PAES.add(pontomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 30, 30));

        pontomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontomenosActionPerformed(evt);
            }
        });
        PAES.add(pontomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 30, 30));

        txtresul3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul3.setText("0");
        txtresul3.setBorder(null);
        PAES.add(txtresul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 40, 20));

        passadomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passadomaisActionPerformed(evt);
            }
        });
        PAES.add(passadomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 30, 30));

        passadomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passadomenosActionPerformed(evt);
            }
        });
        PAES.add(passadomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 30, 30));

        txtresul4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul4.setText("0");
        txtresul4.setBorder(null);
        PAES.add(txtresul4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 40, 30));

        frangomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frangomaisActionPerformed(evt);
            }
        });
        PAES.add(frangomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 30, 30));

        frangomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frangomenosActionPerformed(evt);
            }
        });
        PAES.add(frangomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 30, 30));

        btnvoltar.setBorder(null);
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        PAES.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 80, 40));

        btnsalvar6.setBorder(null);
        btnsalvar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar6ActionPerformed(evt);
            }
        });
        PAES.add(btnsalvar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 670, 100, 40));

        paesfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/paolanche.jpg"))); // NOI18N
        PAES.add(paesfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -5, 1660, 740));

        jTabbedPane1.addTab("tab1", PAES);

        QUEIJOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pratomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pratomenosActionPerformed(evt);
            }
        });
        QUEIJOS.add(pratomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 30, 30));

        pratomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pratomaisActionPerformed(evt);
            }
        });
        QUEIJOS.add(pratomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 30, 30));

        txtresul5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul5.setText("0");
        txtresul5.setBorder(null);
        QUEIJOS.add(txtresul5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 50, 20));

        cheddarmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheddarmaisActionPerformed(evt);
            }
        });
        QUEIJOS.add(cheddarmais, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 30, 30));

        txtresul6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul6.setText("0");
        txtresul6.setBorder(null);
        QUEIJOS.add(txtresul6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 50, 30));

        cheddarmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheddarmenosActionPerformed(evt);
            }
        });
        QUEIJOS.add(cheddarmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 30, 30));

        ovomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovomaisActionPerformed(evt);
            }
        });
        QUEIJOS.add(ovomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 30, 30));

        txtresul7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul7.setText("0");
        txtresul7.setBorder(null);
        QUEIJOS.add(txtresul7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 50, 30));

        ovomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovomenosActionPerformed(evt);
            }
        });
        QUEIJOS.add(ovomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 30, 30));

        baconmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baconmaisActionPerformed(evt);
            }
        });
        QUEIJOS.add(baconmais, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 30, 30));

        txtresul8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul8.setText("0");
        txtresul8.setBorder(null);
        QUEIJOS.add(txtresul8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 50, 20));

        baconmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baconmenosActionPerformed(evt);
            }
        });
        QUEIJOS.add(baconmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 30, 30));

        btnvoltar2.setBorder(null);
        btnvoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar2ActionPerformed(evt);
            }
        });
        QUEIJOS.add(btnvoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 80, 40));

        btnsalvar7.setBorder(null);
        btnsalvar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar7ActionPerformed(evt);
            }
        });
        QUEIJOS.add(btnsalvar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 670, 100, 40));

        queijosfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/queijolanche.jpg"))); // NOI18N
        QUEIJOS.add(queijosfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1120, 750));

        jTabbedPane1.addTab("tab2", QUEIJOS);

        SALADAS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cebolamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cebolamenosActionPerformed(evt);
            }
        });
        SALADAS.add(cebolamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 30, 30));

        cebolamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cebolamaisActionPerformed(evt);
            }
        });
        SALADAS.add(cebolamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 30, 30));

        txtresul9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul9.setText("0");
        txtresul9.setBorder(null);
        SALADAS.add(txtresul9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 30, 30));

        txtresul10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul10.setText("0");
        txtresul10.setBorder(null);
        SALADAS.add(txtresul10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 30, 20));

        alfacemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfacemaisActionPerformed(evt);
            }
        });
        SALADAS.add(alfacemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 30, 30));

        alfacemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfacemenosActionPerformed(evt);
            }
        });
        SALADAS.add(alfacemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 30, 30));

        txtresul11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul11.setText("0");
        txtresul11.setBorder(null);
        SALADAS.add(txtresul11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 10, 20));

        pepinomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepinomaisActionPerformed(evt);
            }
        });
        SALADAS.add(pepinomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 30, 30));

        pepinomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepinomenosActionPerformed(evt);
            }
        });
        SALADAS.add(pepinomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 30, 30));

        txtresul12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul12.setText("0");
        txtresul12.setBorder(null);
        SALADAS.add(txtresul12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 30, 20));

        piclesmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piclesmaisActionPerformed(evt);
            }
        });
        SALADAS.add(piclesmais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 30, 30));

        piclesmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piclesmenosActionPerformed(evt);
            }
        });
        SALADAS.add(piclesmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 30, 30));

        txtresul13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul13.setText("0");
        txtresul13.setBorder(null);
        SALADAS.add(txtresul13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 30, 30));

        tomatemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatemaisActionPerformed(evt);
            }
        });
        SALADAS.add(tomatemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 30, 30));

        tomatemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatemenosActionPerformed(evt);
            }
        });
        SALADAS.add(tomatemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 30, 30));

        txtresul14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul14.setText("0");
        txtresul14.setBorder(null);
        SALADAS.add(txtresul14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 30, 20));

        pimentaomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pimentaomaisActionPerformed(evt);
            }
        });
        SALADAS.add(pimentaomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 30, 30));

        pimentaomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pimentaomenosActionPerformed(evt);
            }
        });
        SALADAS.add(pimentaomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 30, 30));

        btnsalvar8.setBorder(null);
        btnsalvar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar8ActionPerformed(evt);
            }
        });
        SALADAS.add(btnsalvar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 670, 90, 40));

        btnvoltar3.setBorder(null);
        btnvoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar3ActionPerformed(evt);
            }
        });
        SALADAS.add(btnvoltar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 20, 80, 40));

        saladasfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/lanche2.jpg"))); // NOI18N
        SALADAS.add(saladasfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -27, -1, 780));

        jTabbedPane1.addTab("tab3", SALADAS);

        MOLHOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barbecuemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barbecuemenosActionPerformed(evt);
            }
        });
        MOLHOS.add(barbecuemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 30, 30));

        barbecuemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barbecuemaisActionPerformed(evt);
            }
        });
        MOLHOS.add(barbecuemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 30, 30));

        txtresul15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul15.setText("0");
        txtresul15.setBorder(null);
        MOLHOS.add(txtresul15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 30));

        txtresul16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul16.setText("0");
        txtresul16.setBorder(null);
        MOLHOS.add(txtresul16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 40, 20));

        ketchupmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketchupmaisActionPerformed(evt);
            }
        });
        MOLHOS.add(ketchupmais, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 30, 30));

        ketchupmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketchupmenosActionPerformed(evt);
            }
        });
        MOLHOS.add(ketchupmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 30, 30));

        txtresul17.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul17.setText("0");
        txtresul17.setBorder(null);
        txtresul17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul17ActionPerformed(evt);
            }
        });
        MOLHOS.add(txtresul17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 40, 20));

        mostardamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostardamaisActionPerformed(evt);
            }
        });
        MOLHOS.add(mostardamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 30, 30));

        mostardamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostardamenosActionPerformed(evt);
            }
        });
        MOLHOS.add(mostardamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 30, 30));

        txtresul18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul18.setText("0");
        txtresul18.setBorder(null);
        txtresul18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul18ActionPerformed(evt);
            }
        });
        MOLHOS.add(txtresul18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 40, 20));

        maionesemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maionesemaisActionPerformed(evt);
            }
        });
        MOLHOS.add(maionesemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 30, 30));

        maionesemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maionesemenosActionPerformed(evt);
            }
        });
        MOLHOS.add(maionesemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 30, 30));

        btnsalvar9.setBorder(null);
        btnsalvar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar9ActionPerformed(evt);
            }
        });
        MOLHOS.add(btnsalvar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 670, 100, 40));

        btnvoltar4.setBorder(null);
        btnvoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar4ActionPerformed(evt);
            }
        });
        MOLHOS.add(btnvoltar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 80, 40));

        molhosfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/molhoslanche.jpg"))); // NOI18N
        MOLHOS.add(molhosfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1130, 750));

        jTabbedPane1.addTab("tab4", MOLHOS);

        BEBIDAS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresul19.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul19.setText("0");
        txtresul19.setBorder(null);
        BEBIDAS.add(txtresul19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 30, 40));

        sodamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodamenosActionPerformed(evt);
            }
        });
        BEBIDAS.add(sodamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 30, 30));

        sodamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodamaisActionPerformed(evt);
            }
        });
        BEBIDAS.add(sodamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 30, 30));

        colamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colamaisActionPerformed(evt);
            }
        });
        BEBIDAS.add(colamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 30, 30));

        colamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colamenosActionPerformed(evt);
            }
        });
        BEBIDAS.add(colamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 30, 30));

        txtresul20.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul20.setText("0");
        txtresul20.setBorder(null);
        BEBIDAS.add(txtresul20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 30, 30));

        aguamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguamaisActionPerformed(evt);
            }
        });
        BEBIDAS.add(aguamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 30, 30));

        aguamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguamenosActionPerformed(evt);
            }
        });
        BEBIDAS.add(aguamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 30, 30));

        txtresul21.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul21.setText("0");
        txtresul21.setBorder(null);
        BEBIDAS.add(txtresul21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 30, 30));

        laranjadamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laranjadamaisActionPerformed(evt);
            }
        });
        BEBIDAS.add(laranjadamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 30, 30));

        laranjadamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laranjadamenosActionPerformed(evt);
            }
        });
        BEBIDAS.add(laranjadamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 30, 30));

        txtresul22.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul22.setText("0");
        txtresul22.setBorder(null);
        BEBIDAS.add(txtresul22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 30, 20));

        btnsalvar10.setBorder(null);
        btnsalvar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar10ActionPerformed(evt);
            }
        });
        BEBIDAS.add(btnsalvar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 670, 100, 40));

        btnvoltar5.setBorder(null);
        btnvoltar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar5ActionPerformed(evt);
            }
        });
        BEBIDAS.add(btnvoltar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 90, 30));

        bebidasfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/lanche1.jpg"))); // NOI18N
        BEBIDAS.add(bebidasfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1140, 750));

        jTabbedPane1.addTab("tab5", BEBIDAS);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -30, 1120, 760));

        btnpaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaesActionPerformed(evt);
            }
        });
        getContentPane().add(btnpaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, 40));

        btnqueijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnqueijosActionPerformed(evt);
            }
        });
        getContentPane().add(btnqueijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        btnsaladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaladasActionPerformed(evt);
            }
        });
        getContentPane().add(btnsaladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 200, 40));

        btnmolhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmolhosActionPerformed(evt);
            }
        });
        getContentPane().add(btnmolhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 200, 40));

        btnbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbebidasActionPerformed(evt);
            }
        });
        getContentPane().add(btnbebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 200, 40));

        setSize(new java.awt.Dimension(1366, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnpaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaesActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnpaesActionPerformed

    private void btnqueijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnqueijosActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnqueijosActionPerformed

    private void btnsaladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaladasActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnsaladasActionPerformed

    private void btnmolhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmolhosActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnmolhosActionPerformed

    private void btnbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbebidasActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnbebidasActionPerformed

    private void paomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paomaisActionPerformed
        txtresul.setText(String.valueOf(++valor[0]));
    }//GEN-LAST:event_paomaisActionPerformed

    private void paomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paomenosActionPerformed
        txtresul.setText(String.valueOf(--valor[0]));
    }//GEN-LAST:event_paomenosActionPerformed

    private void paoausmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paoausmaisActionPerformed
        txtresul1.setText(String.valueOf(++valor[1]));
    }//GEN-LAST:event_paoausmaisActionPerformed

    private void paoausmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paoausmenosActionPerformed
        txtresul1.setText(String.valueOf(--valor[1]));
    }//GEN-LAST:event_paoausmenosActionPerformed

    private void pontomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontomaisActionPerformed
        txtresul2.setText(String.valueOf(++valor[2]));
    }//GEN-LAST:event_pontomaisActionPerformed

    private void pontomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontomenosActionPerformed
        txtresul2.setText(String.valueOf(--valor[2]));
    }//GEN-LAST:event_pontomenosActionPerformed

    private void passadomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passadomaisActionPerformed
        txtresul3.setText(String.valueOf(++valor[3]));
    }//GEN-LAST:event_passadomaisActionPerformed

    private void passadomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passadomenosActionPerformed
        txtresul3.setText(String.valueOf(--valor[3]));
    }//GEN-LAST:event_passadomenosActionPerformed

    private void frangomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frangomaisActionPerformed
        txtresul4.setText(String.valueOf(++valor[4]));
    }//GEN-LAST:event_frangomaisActionPerformed

    private void frangomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frangomenosActionPerformed
        txtresul4.setText(String.valueOf(--valor[4]));
    }//GEN-LAST:event_frangomenosActionPerformed

    private void pratomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pratomaisActionPerformed
        txtresul5.setText(String.valueOf(++valor[5]));
    }//GEN-LAST:event_pratomaisActionPerformed

    private void pratomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pratomenosActionPerformed
        txtresul5.setText(String.valueOf(--valor[5]));
    }//GEN-LAST:event_pratomenosActionPerformed

    private void cheddarmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheddarmaisActionPerformed
        txtresul6.setText(String.valueOf(++valor[6]));
    }//GEN-LAST:event_cheddarmaisActionPerformed

    private void cheddarmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheddarmenosActionPerformed
        txtresul6.setText(String.valueOf(--valor[6]));
    }//GEN-LAST:event_cheddarmenosActionPerformed

    private void ovomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovomaisActionPerformed
        txtresul7.setText(String.valueOf(++valor[7]));
    }//GEN-LAST:event_ovomaisActionPerformed

    private void ovomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovomenosActionPerformed
        txtresul7.setText(String.valueOf(--valor[7]));
    }//GEN-LAST:event_ovomenosActionPerformed

    private void baconmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baconmaisActionPerformed
        txtresul8.setText(String.valueOf(++valor[8]));
    }//GEN-LAST:event_baconmaisActionPerformed

    private void baconmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baconmenosActionPerformed
        txtresul8.setText(String.valueOf(--valor[8]));
    }//GEN-LAST:event_baconmenosActionPerformed

    private void cebolamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cebolamaisActionPerformed
        txtresul9.setText(String.valueOf(++valor[9]));
    }//GEN-LAST:event_cebolamaisActionPerformed

    private void cebolamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cebolamenosActionPerformed
        txtresul9.setText(String.valueOf(--valor[9]));
    }//GEN-LAST:event_cebolamenosActionPerformed

    private void alfacemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfacemaisActionPerformed
        txtresul10.setText(String.valueOf(++valor[10]));
    }//GEN-LAST:event_alfacemaisActionPerformed

    private void alfacemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfacemenosActionPerformed
        txtresul10.setText(String.valueOf(--valor[10]));
    }//GEN-LAST:event_alfacemenosActionPerformed

    private void pepinomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepinomaisActionPerformed
        txtresul11.setText(String.valueOf(++valor[11]));
    }//GEN-LAST:event_pepinomaisActionPerformed

    private void pepinomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepinomenosActionPerformed
        txtresul11.setText(String.valueOf(--valor[11]));
    }//GEN-LAST:event_pepinomenosActionPerformed

    private void piclesmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piclesmaisActionPerformed
        txtresul12.setText(String.valueOf(++valor[12]));
    }//GEN-LAST:event_piclesmaisActionPerformed

    private void piclesmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piclesmenosActionPerformed
        txtresul12.setText(String.valueOf(--valor[12]));
    }//GEN-LAST:event_piclesmenosActionPerformed

    private void tomatemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatemaisActionPerformed
        txtresul13.setText(String.valueOf(++valor[13]));
    }//GEN-LAST:event_tomatemaisActionPerformed

    private void tomatemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatemenosActionPerformed
        txtresul13.setText(String.valueOf(--valor[13]));
    }//GEN-LAST:event_tomatemenosActionPerformed

    private void pimentaomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pimentaomaisActionPerformed
        txtresul14.setText(String.valueOf(++valor[14]));
    }//GEN-LAST:event_pimentaomaisActionPerformed

    private void pimentaomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pimentaomenosActionPerformed
        txtresul14.setText(String.valueOf(--valor[14]));
    }//GEN-LAST:event_pimentaomenosActionPerformed

    private void barbecuemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barbecuemaisActionPerformed
        txtresul15.setText(String.valueOf(++valor[15]));
    }//GEN-LAST:event_barbecuemaisActionPerformed

    private void barbecuemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barbecuemenosActionPerformed
        txtresul15.setText(String.valueOf(--valor[15]));
    }//GEN-LAST:event_barbecuemenosActionPerformed

    private void ketchupmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketchupmaisActionPerformed
        txtresul16.setText(String.valueOf(++valor[16]));
    }//GEN-LAST:event_ketchupmaisActionPerformed

    private void ketchupmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketchupmenosActionPerformed
        txtresul16.setText(String.valueOf(--valor[16]));
    }//GEN-LAST:event_ketchupmenosActionPerformed

    private void mostardamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostardamaisActionPerformed
        txtresul17.setText(String.valueOf(++valor[17]));
    }//GEN-LAST:event_mostardamaisActionPerformed

    private void mostardamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostardamenosActionPerformed
        txtresul17.setText(String.valueOf(--valor[17]));
    }//GEN-LAST:event_mostardamenosActionPerformed

    private void maionesemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maionesemaisActionPerformed
        txtresul18.setText(String.valueOf(++valor[18]));
    }//GEN-LAST:event_maionesemaisActionPerformed

    private void maionesemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maionesemenosActionPerformed
        txtresul18.setText(String.valueOf(--valor[18]));
    }//GEN-LAST:event_maionesemenosActionPerformed

    private void sodamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodamaisActionPerformed
        txtresul19.setText(String.valueOf(++valor[19]));
    }//GEN-LAST:event_sodamaisActionPerformed

    private void sodamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodamenosActionPerformed
        txtresul19.setText(String.valueOf(--valor[19]));
    }//GEN-LAST:event_sodamenosActionPerformed

    private void colamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colamaisActionPerformed
        txtresul20.setText(String.valueOf(++valor[20]));
    }//GEN-LAST:event_colamaisActionPerformed

    private void colamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colamenosActionPerformed
        txtresul20.setText(String.valueOf(--valor[20]));
    }//GEN-LAST:event_colamenosActionPerformed

    private void aguamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aguamaisActionPerformed
        txtresul21.setText(String.valueOf(++valor[21]));
    }//GEN-LAST:event_aguamaisActionPerformed

    private void aguamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aguamenosActionPerformed
        txtresul21.setText(String.valueOf(--valor[21]));
    }//GEN-LAST:event_aguamenosActionPerformed

    private void laranjadamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laranjadamaisActionPerformed
        txtresul22.setText(String.valueOf(++valor[22]));
    }//GEN-LAST:event_laranjadamaisActionPerformed

    private void laranjadamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laranjadamenosActionPerformed
        txtresul22.setText(String.valueOf(--valor[22]));
    }//GEN-LAST:event_laranjadamenosActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        tela_principal principal = new tela_principal();
        principal.setVisible(true);
dispose();    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnvoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar2ActionPerformed
     jTabbedPane1.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnvoltar2ActionPerformed

    private void btnsalvar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar6ActionPerformed
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 15 THEN ?\n"
                    + "   WHEN 16 THEN ?\n"
                    + "   WHEN 17 THEN ?\n"
                    + "   WHEN 18 THEN ?\n"
                    + "   WHEN 19 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(15,16,17,18,19)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, txtresul.getText());
            stmt.setString(2, txtresul1.getText());
            stmt.setString(3, txtresul2.getText());
            stmt.setString(4, txtresul3.getText());
            stmt.setString(5, txtresul4.getText());
            stmt.execute();
            stmt.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "salvo com sucesso!");
            jTabbedPane1.setSelectedIndex(1);

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }

     }//GEN-LAST:event_btnsalvar6ActionPerformed

    private void btnsalvar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar7ActionPerformed
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 20 THEN ?\n"
                    + "   WHEN 21 THEN ?\n"
                    + "   WHEN 22 THEN ?\n"
                    + "   WHEN 23 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(20,21,22,23)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, txtresul5.getText());
            stmt.setString(2, txtresul6.getText());
            stmt.setString(3, txtresul7.getText());
            stmt.setString(4, txtresul8.getText());

            stmt.execute();
            stmt.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "salvo com sucesso!");
            jTabbedPane1.setSelectedIndex(2);

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }     }//GEN-LAST:event_btnsalvar7ActionPerformed

    private void btnsalvar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar8ActionPerformed
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 5 THEN ?\n"
                    + "   WHEN 6 THEN ?\n"
                    + "   WHEN 7 THEN ?\n"
                    + "   WHEN 8 THEN ?\n"
                    + "   WHEN 9 THEN ?\n"
                    + "   WHEN 10 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(5,6,7,8,9,10)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, txtresul9.getText());
            stmt.setString(2, txtresul10.getText());
            stmt.setString(3, txtresul11.getText());
            stmt.setString(4, txtresul12.getText());
            stmt.setString(5, txtresul13.getText());
            stmt.setString(6, txtresul14.getText());

            stmt.execute();
            stmt.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "salvo com sucesso!");
            jTabbedPane1.setSelectedIndex(3);

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }     }//GEN-LAST:event_btnsalvar8ActionPerformed

    private void btnsalvar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar9ActionPerformed
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 11 THEN ?\n"
                    + "   WHEN 12 THEN ?\n"
                    + "   WHEN 13 THEN ?\n"
                    + "   WHEN 14 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(11,12,13,14)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, txtresul15.getText());
            stmt.setString(2, txtresul16.getText());
            stmt.setString(3, txtresul17.getText());
            stmt.setString(4, txtresul18.getText());

            stmt.execute();
            stmt.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "salvo com sucesso!");
            jTabbedPane1.setSelectedIndex(4);

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }    }//GEN-LAST:event_btnsalvar9ActionPerformed

    private void btnsalvar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar10ActionPerformed
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 56 THEN ?\n"
                    + "   WHEN 55 THEN ?\n"
                    + "   WHEN 54 THEN ?\n"
                    + "   WHEN 53 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(56,55,54,53)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, txtresul19.getText());
            stmt.setString(2, txtresul20.getText());
            stmt.setString(3, txtresul21.getText());
            stmt.setString(4, txtresul22.getText());

            stmt.execute();
            stmt.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "salvo com sucesso!");

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }    }//GEN-LAST:event_btnsalvar10ActionPerformed

    private void btnfinalizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizar2ActionPerformed
tela_carrinho carrinho = new tela_carrinho();
carrinho.setVisible(true);
dispose();
    }//GEN-LAST:event_btnfinalizar2ActionPerformed

    private void txtresulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresulActionPerformed

    private void txtresul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresul1ActionPerformed

    private void txtresul2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresul2ActionPerformed

    private void txtresul17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresul17ActionPerformed

    private void txtresul18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresul18ActionPerformed

    private void btnvoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar3ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnvoltar3ActionPerformed

    private void btnvoltar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar4ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnvoltar4ActionPerformed

    private void btnvoltar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar5ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnvoltar5ActionPerformed

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
            java.util.logging.Logger.getLogger(menu_lanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_lanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_lanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_lanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_lanche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BEBIDAS;
    private javax.swing.JPanel MOLHOS;
    private javax.swing.JPanel PAES;
    private javax.swing.JPanel QUEIJOS;
    private javax.swing.JPanel SALADAS;
    private javax.swing.JButton aguamais;
    private javax.swing.JButton aguamenos;
    private javax.swing.JButton alfacemais;
    private javax.swing.JButton alfacemenos;
    private javax.swing.JButton baconmais;
    private javax.swing.JButton baconmenos;
    private javax.swing.JButton barbecuemais;
    private javax.swing.JButton barbecuemenos;
    private javax.swing.JLabel bebidasfundo;
    private javax.swing.JButton btnbebidas;
    private javax.swing.JButton btnfinalizar2;
    private javax.swing.JButton btnmolhos;
    private javax.swing.JButton btnpaes;
    private javax.swing.JButton btnqueijos;
    private javax.swing.JButton btnsaladas;
    private javax.swing.JButton btnsalvar10;
    private javax.swing.JButton btnsalvar6;
    private javax.swing.JButton btnsalvar7;
    private javax.swing.JButton btnsalvar8;
    private javax.swing.JButton btnsalvar9;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JButton btnvoltar2;
    private javax.swing.JButton btnvoltar3;
    private javax.swing.JButton btnvoltar4;
    private javax.swing.JButton btnvoltar5;
    private javax.swing.JButton cebolamais;
    private javax.swing.JButton cebolamenos;
    private javax.swing.JButton cheddarmais;
    private javax.swing.JButton cheddarmenos;
    private javax.swing.JButton colamais;
    private javax.swing.JButton colamenos;
    private javax.swing.JButton frangomais;
    private javax.swing.JButton frangomenos;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton ketchupmais;
    private javax.swing.JButton ketchupmenos;
    private javax.swing.JButton laranjadamais;
    private javax.swing.JButton laranjadamenos;
    private javax.swing.JButton maionesemais;
    private javax.swing.JButton maionesemenos;
    private javax.swing.JLabel menu_lanche;
    private javax.swing.JLabel molhosfundo;
    private javax.swing.JButton mostardamais;
    private javax.swing.JButton mostardamenos;
    private javax.swing.JButton ovomais;
    private javax.swing.JButton ovomenos;
    private javax.swing.JLabel paesfundo;
    private javax.swing.JButton paoausmais;
    private javax.swing.JButton paoausmenos;
    private javax.swing.JButton paomais;
    private javax.swing.JButton paomenos;
    private javax.swing.JButton passadomais;
    private javax.swing.JButton passadomenos;
    private javax.swing.JButton pepinomais;
    private javax.swing.JButton pepinomenos;
    private javax.swing.JButton piclesmais;
    private javax.swing.JButton piclesmenos;
    private javax.swing.JButton pimentaomais;
    private javax.swing.JButton pimentaomenos;
    private javax.swing.JButton pontomais;
    private javax.swing.JButton pontomenos;
    private javax.swing.JButton pratomais;
    private javax.swing.JButton pratomenos;
    private javax.swing.JLabel queijosfundo;
    private javax.swing.JLabel saladasfundo;
    private javax.swing.JButton sodamais;
    private javax.swing.JButton sodamenos;
    private javax.swing.JButton tomatemais;
    private javax.swing.JButton tomatemenos;
    private javax.swing.JTextField txtresul;
    private javax.swing.JTextField txtresul1;
    private javax.swing.JTextField txtresul10;
    private javax.swing.JTextField txtresul11;
    private javax.swing.JTextField txtresul12;
    private javax.swing.JTextField txtresul13;
    private javax.swing.JTextField txtresul14;
    private javax.swing.JTextField txtresul15;
    private javax.swing.JTextField txtresul16;
    private javax.swing.JTextField txtresul17;
    private javax.swing.JTextField txtresul18;
    private javax.swing.JTextField txtresul19;
    private javax.swing.JTextField txtresul2;
    private javax.swing.JTextField txtresul20;
    private javax.swing.JTextField txtresul21;
    private javax.swing.JTextField txtresul22;
    private javax.swing.JTextField txtresul3;
    private javax.swing.JTextField txtresul4;
    private javax.swing.JTextField txtresul5;
    private javax.swing.JTextField txtresul6;
    private javax.swing.JTextField txtresul7;
    private javax.swing.JTextField txtresul8;
    private javax.swing.JTextField txtresul9;
    // End of variables declaration//GEN-END:variables
}
