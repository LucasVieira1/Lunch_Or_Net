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
public class menu_almoco extends javax.swing.JFrame {

    int[] valor = new int[30];

    /**
     * Creates new form teste2
     */
    public menu_almoco() {
        initComponents();
        btnbase.setBackground(new Color(0, 0, 0, 0));
        btnsaladas.setBackground(new Color(0, 0, 0, 0));
        btnproteinas.setBackground(new Color(0, 0, 0, 0));
        btnchurrasco.setBackground(new Color(0, 0, 0, 0));
        btnbebidas.setBackground(new Color(0, 0, 0, 0));
        arrozmais.setBackground(new Color(0, 0, 0, 0));
        arrozmenos.setBackground(new Color(0, 0, 0, 0));
        txtresul.setBackground(new Color(0, 0, 0, 0));
        feijaomais.setBackground(new Color(0, 0, 0, 0));
        feijaomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul1.setBackground(new Color(0, 0, 0, 0));
        macarraomais.setBackground(new Color(0, 0, 0, 0));
        macarraomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul2.setBackground(new Color(0, 0, 0, 0));
        alfacemais.setBackground(new Color(0, 0, 0, 0));
        alfacemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul3.setBackground(new Color(0, 0, 0, 0));
        tomatemais.setBackground(new Color(0, 0, 0, 0));
        tomatemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul4.setBackground(new Color(0, 0, 0, 0));
        bifemais.setBackground(new Color(0, 0, 0, 0));
        bifemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul5.setBackground(new Color(0, 0, 0, 0));
        frangomais.setBackground(new Color(0, 0, 0, 0));
        frangomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul6.setBackground(new Color(0, 0, 0, 0));
        ovosmais.setBackground(new Color(0, 0, 0, 0));
        ovosmenos.setBackground(new Color(0, 0, 0, 0));
        txtresul7.setBackground(new Color(0, 0, 0, 0));
        peixemais.setBackground(new Color(0, 0, 0, 0));
        peixemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul8.setBackground(new Color(0, 0, 0, 0));
        efrangomais.setBackground(new Color(0, 0, 0, 0));
        efrangomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul9.setBackground(new Color(0, 0, 0, 0));
        elinguicamais.setBackground(new Color(0, 0, 0, 0));
        elinguicamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul10.setBackground(new Color(0, 0, 0, 0));
        ecarnemais.setBackground(new Color(0, 0, 0, 0));
        ecarnemenos.setBackground(new Color(0, 0, 0, 0));
        txtresul11.setBackground(new Color(0, 0, 0, 0));
        ecoracaomais.setBackground(new Color(0, 0, 0, 0));
        ecoracaomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul12.setBackground(new Color(0, 0, 0, 0));
        ecostelamais.setBackground(new Color(0, 0, 0, 0));
        ecostelamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul13.setBackground(new Color(0, 0, 0, 0));
        ecoxafrangomais.setBackground(new Color(0, 0, 0, 0));
        ecoxafrangomenos.setBackground(new Color(0, 0, 0, 0));
        txtresul14.setBackground(new Color(0, 0, 0, 0));
        sodamais.setBackground(new Color(0, 0, 0, 0));
        sodamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul15.setBackground(new Color(0, 0, 0, 0));
        colamais.setBackground(new Color(0, 0, 0, 0));
        colamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul16.setBackground(new Color(0, 0, 0, 0));
        aguamais.setBackground(new Color(0, 0, 0, 0));
        aguamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul17.setBackground(new Color(0, 0, 0, 0));
        laranjadamais.setBackground(new Color(0, 0, 0, 0));
        laranjadamenos.setBackground(new Color(0, 0, 0, 0));
        txtresul18.setBackground(new Color(0, 0, 0, 0));
        btnvoltar.setBackground(new Color(0, 0, 0, 0));
        btnvolrar2.setBackground(new Color(0, 0, 0, 0));
        btnvoltar3.setBackground(new Color(0, 0, 0, 0));
        btnvoltar4.setBackground(new Color(0, 0, 0, 0));
        btnvoltar5.setBackground(new Color(0, 0, 0, 0));
        btnsalvar1.setBackground(new Color(0, 0, 0, 0));
        btnsalvar2.setBackground(new Color(0, 0, 0, 0));
        btnsalvar3.setBackground(new Color(0, 0, 0, 0));
        btnsalvar4.setBackground(new Color(0, 0, 0, 0));
        btnsalvar5.setBackground(new Color(0, 0, 0, 0));
        btnfinalizar1.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnfinalizar1 = new javax.swing.JButton();
        lblfundo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        acompanhamentos = new javax.swing.JPanel();
        arrozmais = new javax.swing.JButton();
        arrozmenos = new javax.swing.JButton();
        txtresul = new javax.swing.JTextField();
        feijaomenos = new javax.swing.JButton();
        feijaomais = new javax.swing.JButton();
        txtresul1 = new javax.swing.JTextField();
        macarraomenos = new javax.swing.JButton();
        macarraomais = new javax.swing.JButton();
        txtresul2 = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();
        btnsalvar1 = new javax.swing.JButton();
        lblfundobase = new javax.swing.JLabel();
        saladas = new javax.swing.JPanel();
        alfacemenos = new javax.swing.JButton();
        alfacemais = new javax.swing.JButton();
        txtresul3 = new javax.swing.JTextField();
        tomatemais = new javax.swing.JButton();
        tomatemenos = new javax.swing.JButton();
        txtresul4 = new javax.swing.JTextField();
        btnsalvar2 = new javax.swing.JButton();
        btnvolrar2 = new javax.swing.JButton();
        lblfundosaladas = new javax.swing.JLabel();
        guarnicoes = new javax.swing.JPanel();
        frangomenos = new javax.swing.JButton();
        frangomais = new javax.swing.JButton();
        txtresul5 = new javax.swing.JTextField();
        bifemais = new javax.swing.JButton();
        bifemenos = new javax.swing.JButton();
        txtresul8 = new javax.swing.JTextField();
        peixemais = new javax.swing.JButton();
        peixemenos = new javax.swing.JButton();
        txtresul7 = new javax.swing.JTextField();
        ovosmais = new javax.swing.JButton();
        ovosmenos = new javax.swing.JButton();
        txtresul6 = new javax.swing.JTextField();
        btnsalvar3 = new javax.swing.JButton();
        btnvoltar3 = new javax.swing.JButton();
        lblfundoproteinas = new javax.swing.JLabel();
        churrascos = new javax.swing.JPanel();
        elinguicamenos = new javax.swing.JButton();
        elinguicamais = new javax.swing.JButton();
        txtresul9 = new javax.swing.JTextField();
        efrangomais = new javax.swing.JButton();
        efrangomenos = new javax.swing.JButton();
        txtresul10 = new javax.swing.JTextField();
        ecarnemais = new javax.swing.JButton();
        ecarnemenos = new javax.swing.JButton();
        txtresul11 = new javax.swing.JTextField();
        ecoracaomais = new javax.swing.JButton();
        ecoracaomenos = new javax.swing.JButton();
        txtresul12 = new javax.swing.JTextField();
        ecostelamais = new javax.swing.JButton();
        ecostelamenos = new javax.swing.JButton();
        txtresul13 = new javax.swing.JTextField();
        ecoxafrangomenos = new javax.swing.JButton();
        ecoxafrangomais = new javax.swing.JButton();
        txtresul14 = new javax.swing.JTextField();
        btnsalvar4 = new javax.swing.JButton();
        btnvoltar4 = new javax.swing.JButton();
        lblfundobebidas = new javax.swing.JLabel();
        bebidas = new javax.swing.JPanel();
        sodamenos = new javax.swing.JButton();
        sodamais = new javax.swing.JButton();
        txtresul15 = new javax.swing.JTextField();
        colamenos = new javax.swing.JButton();
        colamais = new javax.swing.JButton();
        txtresul16 = new javax.swing.JTextField();
        aguamenos = new javax.swing.JButton();
        aguamais = new javax.swing.JButton();
        txtresul17 = new javax.swing.JTextField();
        laranjadamenos = new javax.swing.JButton();
        laranjadamais = new javax.swing.JButton();
        txtresul18 = new javax.swing.JTextField();
        btnsalvar5 = new javax.swing.JButton();
        btnvoltar5 = new javax.swing.JButton();
        lblchurrasco = new javax.swing.JLabel();
        btnsaladas = new javax.swing.JButton();
        btnbase = new javax.swing.JButton();
        btnproteinas = new javax.swing.JButton();
        btnchurrasco = new javax.swing.JButton();
        btnbebidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnfinalizar1.setBorder(null);
        btnfinalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnfinalizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 190, 40));

        lblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/1.png"))); // NOI18N
        getContentPane().add(lblfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 280, 750));

        acompanhamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arrozmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrozmaisActionPerformed(evt);
            }
        });
        acompanhamentos.add(arrozmais, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 30, 30));

        arrozmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrozmenosActionPerformed(evt);
            }
        });
        acompanhamentos.add(arrozmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 30, 30));

        txtresul.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul.setText("0");
        txtresul.setBorder(null);
        txtresul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresulActionPerformed(evt);
            }
        });
        acompanhamentos.add(txtresul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 30, 30));

        feijaomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feijaomenosActionPerformed(evt);
            }
        });
        acompanhamentos.add(feijaomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 30, 30));

        feijaomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feijaomaisActionPerformed(evt);
            }
        });
        acompanhamentos.add(feijaomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 30, 30));

        txtresul1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul1.setText("0");
        txtresul1.setBorder(null);
        txtresul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul1ActionPerformed(evt);
            }
        });
        acompanhamentos.add(txtresul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 30, 30));

        macarraomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macarraomenosActionPerformed(evt);
            }
        });
        acompanhamentos.add(macarraomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 30, 30));

        macarraomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macarraomaisActionPerformed(evt);
            }
        });
        acompanhamentos.add(macarraomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 30, 30));

        txtresul2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul2.setText("0");
        txtresul2.setBorder(null);
        txtresul2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul2ActionPerformed(evt);
            }
        });
        acompanhamentos.add(txtresul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 30, 30));

        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        acompanhamentos.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 100, 40));

        btnsalvar1.setBorder(null);
        btnsalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar1ActionPerformed(evt);
            }
        });
        acompanhamentos.add(btnsalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 670, 100, 40));

        lblfundobase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/acompanhamento_almoco.jpg"))); // NOI18N
        acompanhamentos.add(lblfundobase, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1160, 750));

        jTabbedPane1.addTab("tab1", acompanhamentos);

        saladas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alfacemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfacemenosActionPerformed(evt);
            }
        });
        saladas.add(alfacemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 30, 30));

        alfacemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfacemaisActionPerformed(evt);
            }
        });
        saladas.add(alfacemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 30, 30));

        txtresul3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul3.setText("0");
        txtresul3.setBorder(null);
        txtresul3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul3ActionPerformed(evt);
            }
        });
        saladas.add(txtresul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 40, 20));
        txtresul3.getAccessibleContext().setAccessibleName("");

        tomatemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatemaisActionPerformed(evt);
            }
        });
        saladas.add(tomatemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 30, 30));

        tomatemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatemenosActionPerformed(evt);
            }
        });
        saladas.add(tomatemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 30, 30));

        txtresul4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul4.setText("0");
        txtresul4.setBorder(null);
        txtresul4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul4ActionPerformed(evt);
            }
        });
        saladas.add(txtresul4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 40, 30));

        btnsalvar2.setBorder(null);
        btnsalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar2ActionPerformed(evt);
            }
        });
        saladas.add(btnsalvar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 100, 40));

        btnvolrar2.setBorder(null);
        btnvolrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolrar2ActionPerformed(evt);
            }
        });
        saladas.add(btnvolrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 90, 40));

        lblfundosaladas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/salada_almoco.jpg"))); // NOI18N
        saladas.add(lblfundosaladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1140, 730));

        jTabbedPane1.addTab("tab2", saladas);

        guarnicoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frangomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frangomenosActionPerformed(evt);
            }
        });
        guarnicoes.add(frangomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 30, 30));

        frangomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frangomaisActionPerformed(evt);
            }
        });
        guarnicoes.add(frangomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 30, 30));

        txtresul5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul5.setText("0");
        txtresul5.setBorder(null);
        guarnicoes.add(txtresul5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 30, 20));

        bifemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bifemaisActionPerformed(evt);
            }
        });
        guarnicoes.add(bifemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 30, 30));

        bifemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bifemenosActionPerformed(evt);
            }
        });
        guarnicoes.add(bifemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 30, 30));

        txtresul8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul8.setText("0");
        txtresul8.setBorder(null);
        txtresul8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul8ActionPerformed(evt);
            }
        });
        guarnicoes.add(txtresul8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 30, 20));

        peixemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peixemaisActionPerformed(evt);
            }
        });
        guarnicoes.add(peixemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 30, 30));

        peixemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peixemenosActionPerformed(evt);
            }
        });
        guarnicoes.add(peixemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 30, 30));

        txtresul7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul7.setText("0");
        txtresul7.setBorder(null);
        guarnicoes.add(txtresul7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 30, 20));

        ovosmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovosmaisActionPerformed(evt);
            }
        });
        guarnicoes.add(ovosmais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 30, 30));

        ovosmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovosmenosActionPerformed(evt);
            }
        });
        guarnicoes.add(ovosmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 30, 30));

        txtresul6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul6.setText("0");
        txtresul6.setBorder(null);
        guarnicoes.add(txtresul6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 30, 20));

        btnsalvar3.setBorder(null);
        btnsalvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar3ActionPerformed(evt);
            }
        });
        guarnicoes.add(btnsalvar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, 110, 40));

        btnvoltar3.setBorder(null);
        btnvoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar3ActionPerformed(evt);
            }
        });
        guarnicoes.add(btnvoltar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 90, 30));

        lblfundoproteinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/guarnicoes_almoco.jpg"))); // NOI18N
        lblfundoproteinas.setText("0");
        guarnicoes.add(lblfundoproteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1140, 730));

        jTabbedPane1.addTab("tab3", guarnicoes);

        churrascos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elinguicamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elinguicamenosActionPerformed(evt);
            }
        });
        churrascos.add(elinguicamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 30, 30));

        elinguicamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elinguicamaisActionPerformed(evt);
            }
        });
        churrascos.add(elinguicamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 30, 30));

        txtresul9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul9.setText("0");
        txtresul9.setBorder(null);
        txtresul9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul9ActionPerformed(evt);
            }
        });
        churrascos.add(txtresul9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 20, 30));

        efrangomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efrangomaisActionPerformed(evt);
            }
        });
        churrascos.add(efrangomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 30, 30));

        efrangomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efrangomenosActionPerformed(evt);
            }
        });
        churrascos.add(efrangomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 30, 30));

        txtresul10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul10.setText("0");
        txtresul10.setBorder(null);
        txtresul10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul10ActionPerformed(evt);
            }
        });
        churrascos.add(txtresul10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 20, 30));

        ecarnemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecarnemaisActionPerformed(evt);
            }
        });
        churrascos.add(ecarnemais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 30, 30));

        ecarnemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecarnemenosActionPerformed(evt);
            }
        });
        churrascos.add(ecarnemenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 30, 30));

        txtresul11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul11.setText("0");
        txtresul11.setBorder(null);
        txtresul11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul11ActionPerformed(evt);
            }
        });
        churrascos.add(txtresul11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 20, 30));

        ecoracaomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoracaomaisActionPerformed(evt);
            }
        });
        churrascos.add(ecoracaomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 30, 30));

        ecoracaomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoracaomenosActionPerformed(evt);
            }
        });
        churrascos.add(ecoracaomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 30, 30));

        txtresul12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul12.setText("0");
        txtresul12.setBorder(null);
        churrascos.add(txtresul12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 40, 30));

        ecostelamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecostelamaisActionPerformed(evt);
            }
        });
        churrascos.add(ecostelamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 30, 30));

        ecostelamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecostelamenosActionPerformed(evt);
            }
        });
        churrascos.add(ecostelamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 30, 30));

        txtresul13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul13.setText("0");
        txtresul13.setBorder(null);
        txtresul13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul13ActionPerformed(evt);
            }
        });
        churrascos.add(txtresul13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 20, 30));

        ecoxafrangomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoxafrangomenosActionPerformed(evt);
            }
        });
        churrascos.add(ecoxafrangomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 30, 30));

        ecoxafrangomais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoxafrangomaisActionPerformed(evt);
            }
        });
        churrascos.add(ecoxafrangomais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 30, 30));

        txtresul14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul14.setText("0");
        txtresul14.setBorder(null);
        txtresul14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul14ActionPerformed(evt);
            }
        });
        churrascos.add(txtresul14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 20, 30));

        btnsalvar4.setBorder(null);
        btnsalvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar4ActionPerformed(evt);
            }
        });
        churrascos.add(btnsalvar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 100, 40));

        btnvoltar4.setBorder(null);
        btnvoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar4ActionPerformed(evt);
            }
        });
        churrascos.add(btnvoltar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 100, 30));

        lblfundobebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/churrasco_almoco.jpg"))); // NOI18N
        churrascos.add(lblfundobebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1140, 730));

        jTabbedPane1.addTab("tab5", churrascos);

        bebidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sodamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodamenosActionPerformed(evt);
            }
        });
        bebidas.add(sodamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, 40));

        sodamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodamaisActionPerformed(evt);
            }
        });
        bebidas.add(sodamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 30, 40));

        txtresul15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul15.setText("0");
        txtresul15.setBorder(null);
        bebidas.add(txtresul15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 40, 40));

        colamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colamenosActionPerformed(evt);
            }
        });
        bebidas.add(colamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 30, 30));

        colamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colamaisActionPerformed(evt);
            }
        });
        bebidas.add(colamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 30, 30));

        txtresul16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul16.setText("0");
        txtresul16.setBorder(null);
        txtresul16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresul16ActionPerformed(evt);
            }
        });
        bebidas.add(txtresul16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 100, 30));

        aguamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguamenosActionPerformed(evt);
            }
        });
        bebidas.add(aguamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 30, 30));

        aguamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguamaisActionPerformed(evt);
            }
        });
        bebidas.add(aguamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 30, 30));

        txtresul17.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul17.setText("0");
        txtresul17.setBorder(null);
        bebidas.add(txtresul17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 100, 30));

        laranjadamenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laranjadamenosActionPerformed(evt);
            }
        });
        bebidas.add(laranjadamenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 30, 40));

        laranjadamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laranjadamaisActionPerformed(evt);
            }
        });
        bebidas.add(laranjadamais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 30, 40));

        txtresul18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtresul18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresul18.setText("0");
        txtresul18.setBorder(null);
        bebidas.add(txtresul18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 40, 40));

        btnsalvar5.setBorder(null);
        btnsalvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar5ActionPerformed(evt);
            }
        });
        bebidas.add(btnsalvar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 100, 40));

        btnvoltar5.setBorder(null);
        btnvoltar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar5ActionPerformed(evt);
            }
        });
        bebidas.add(btnvoltar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 80, 30));

        lblchurrasco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS2/lanche1.jpg"))); // NOI18N
        bebidas.add(lblchurrasco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1140, 730));

        jTabbedPane1.addTab("tab4", bebidas);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -30, 1120, 920));

        btnsaladas.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        btnsaladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaladasActionPerformed(evt);
            }
        });
        getContentPane().add(btnsaladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 329, 190, 40));

        btnbase.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        btnbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 269, 190, 40));

        btnproteinas.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        btnproteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproteinasActionPerformed(evt);
            }
        });
        getContentPane().add(btnproteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 389, 190, 40));

        btnchurrasco.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        btnchurrasco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchurrascoActionPerformed(evt);
            }
        });
        getContentPane().add(btnchurrasco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 449, 190, 40));

        btnbebidas.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        btnbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbebidasActionPerformed(evt);
            }
        });
        getContentPane().add(btnbebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 190, 40));

        setSize(new java.awt.Dimension(1377, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaladasActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnsaladasActionPerformed

    private void btnbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbaseActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnbaseActionPerformed

    private void btnproteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproteinasActionPerformed
        jTabbedPane1.setSelectedIndex(2);
           }//GEN-LAST:event_btnproteinasActionPerformed

    private void btnchurrascoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchurrascoActionPerformed
        jTabbedPane1.setSelectedIndex(3);
          }//GEN-LAST:event_btnchurrascoActionPerformed

    private void btnbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbebidasActionPerformed
jTabbedPane1.setSelectedIndex(4);          }//GEN-LAST:event_btnbebidasActionPerformed

    private void arrozmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrozmaisActionPerformed
        txtresul.setText(String.valueOf(++valor[0]));
    }//GEN-LAST:event_arrozmaisActionPerformed

    private void arrozmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrozmenosActionPerformed
        txtresul.setText(String.valueOf(--valor[0]));
    }//GEN-LAST:event_arrozmenosActionPerformed

    private void txtresulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresulActionPerformed
    }//GEN-LAST:event_txtresulActionPerformed

    private void feijaomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feijaomenosActionPerformed
txtresul1.setText(String.valueOf(--valor[1]));    }//GEN-LAST:event_feijaomenosActionPerformed

    private void feijaomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feijaomaisActionPerformed
txtresul1.setText(String.valueOf(++valor[1]));    }//GEN-LAST:event_feijaomaisActionPerformed

    private void txtresul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul1ActionPerformed
    }//GEN-LAST:event_txtresul1ActionPerformed

    private void macarraomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macarraomenosActionPerformed
txtresul2.setText(String.valueOf(--valor[2]));    }//GEN-LAST:event_macarraomenosActionPerformed

    private void macarraomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macarraomaisActionPerformed
txtresul2.setText(String.valueOf(++valor[2]));         }//GEN-LAST:event_macarraomaisActionPerformed

    private void txtresul2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul2ActionPerformed
    }//GEN-LAST:event_txtresul2ActionPerformed

    private void alfacemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfacemenosActionPerformed
        txtresul3.setText(String.valueOf(--valor[3]));
    }//GEN-LAST:event_alfacemenosActionPerformed

    private void tomatemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatemenosActionPerformed
txtresul4.setText(String.valueOf(--valor[4]));    }//GEN-LAST:event_tomatemenosActionPerformed

    private void alfacemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfacemaisActionPerformed
        txtresul3.setText(String.valueOf(++valor[3]));
    }//GEN-LAST:event_alfacemaisActionPerformed

    private void tomatemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatemaisActionPerformed
txtresul4.setText(String.valueOf(++valor[4]));    }//GEN-LAST:event_tomatemaisActionPerformed

    private void frangomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frangomaisActionPerformed
txtresul5.setText(String.valueOf(++valor[5]));     }//GEN-LAST:event_frangomaisActionPerformed

    private void frangomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frangomenosActionPerformed
txtresul5.setText(String.valueOf(--valor[5]));     }//GEN-LAST:event_frangomenosActionPerformed

    private void ovosmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovosmaisActionPerformed
txtresul6.setText(String.valueOf(++valor[6]));     }//GEN-LAST:event_ovosmaisActionPerformed

    private void ovosmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovosmenosActionPerformed
txtresul6.setText(String.valueOf(--valor[6]));     }//GEN-LAST:event_ovosmenosActionPerformed

    private void peixemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peixemaisActionPerformed
txtresul7.setText(String.valueOf(++valor[7]));     }//GEN-LAST:event_peixemaisActionPerformed

    private void peixemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peixemenosActionPerformed
        txtresul7.setText(String.valueOf(--valor[7]));
    }//GEN-LAST:event_peixemenosActionPerformed

    private void bifemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bifemaisActionPerformed
txtresul8.setText(String.valueOf(++valor[8]));     }//GEN-LAST:event_bifemaisActionPerformed

    private void bifemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bifemenosActionPerformed
txtresul8.setText(String.valueOf(--valor[8]));     }//GEN-LAST:event_bifemenosActionPerformed

    private void txtresul4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul4ActionPerformed
    }//GEN-LAST:event_txtresul4ActionPerformed

    private void txtresul11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul11ActionPerformed
    }//GEN-LAST:event_txtresul11ActionPerformed

    private void txtresul13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul13ActionPerformed
    }//GEN-LAST:event_txtresul13ActionPerformed

    private void txtresul14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul14ActionPerformed
    }//GEN-LAST:event_txtresul14ActionPerformed

    private void elinguicamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elinguicamaisActionPerformed
txtresul9.setText(String.valueOf(++valor[9]));    }//GEN-LAST:event_elinguicamaisActionPerformed

    private void elinguicamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elinguicamenosActionPerformed
txtresul9.setText(String.valueOf(--valor[9]));    }//GEN-LAST:event_elinguicamenosActionPerformed

    private void efrangomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efrangomaisActionPerformed
txtresul10.setText(String.valueOf(++valor[10]));     }//GEN-LAST:event_efrangomaisActionPerformed

    private void efrangomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efrangomenosActionPerformed
txtresul10.setText(String.valueOf(--valor[10]));     }//GEN-LAST:event_efrangomenosActionPerformed

    private void ecarnemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecarnemaisActionPerformed
txtresul11.setText(String.valueOf(++valor[11]));     }//GEN-LAST:event_ecarnemaisActionPerformed

    private void ecarnemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecarnemenosActionPerformed
txtresul11.setText(String.valueOf(--valor[11]));     }//GEN-LAST:event_ecarnemenosActionPerformed

    private void ecoracaomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoracaomaisActionPerformed
txtresul12.setText(String.valueOf(++valor[12]));     }//GEN-LAST:event_ecoracaomaisActionPerformed

    private void ecoracaomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoracaomenosActionPerformed
txtresul12.setText(String.valueOf(--valor[12]));     }//GEN-LAST:event_ecoracaomenosActionPerformed

    private void ecostelamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecostelamaisActionPerformed
txtresul13.setText(String.valueOf(++valor[13]));     }//GEN-LAST:event_ecostelamaisActionPerformed

    private void ecostelamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecostelamenosActionPerformed
txtresul13.setText(String.valueOf(--valor[13]));     }//GEN-LAST:event_ecostelamenosActionPerformed

    private void ecoxafrangomaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoxafrangomaisActionPerformed
txtresul14.setText(String.valueOf(++valor[14]));     }//GEN-LAST:event_ecoxafrangomaisActionPerformed

    private void ecoxafrangomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoxafrangomenosActionPerformed
txtresul14.setText(String.valueOf(--valor[14]));     }//GEN-LAST:event_ecoxafrangomenosActionPerformed

    private void txtresul16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul16ActionPerformed
    }//GEN-LAST:event_txtresul16ActionPerformed

    private void aguamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aguamenosActionPerformed
txtresul17.setText(String.valueOf(--valor[17]));     }//GEN-LAST:event_aguamenosActionPerformed

    private void sodamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodamaisActionPerformed
txtresul15.setText(String.valueOf(++valor[15]));     }//GEN-LAST:event_sodamaisActionPerformed

    private void sodamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodamenosActionPerformed
txtresul15.setText(String.valueOf(--valor[15]));     }//GEN-LAST:event_sodamenosActionPerformed

    private void colamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colamaisActionPerformed
txtresul16.setText(String.valueOf(++valor[16]));     }//GEN-LAST:event_colamaisActionPerformed

    private void colamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colamenosActionPerformed
txtresul16.setText(String.valueOf(--valor[16]));     }//GEN-LAST:event_colamenosActionPerformed

    private void aguamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aguamaisActionPerformed
txtresul17.setText(String.valueOf(++valor[17]));     }//GEN-LAST:event_aguamaisActionPerformed

    private void laranjadamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laranjadamaisActionPerformed
txtresul18.setText(String.valueOf(++valor[18]));     }//GEN-LAST:event_laranjadamaisActionPerformed

    private void laranjadamenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laranjadamenosActionPerformed
txtresul18.setText(String.valueOf(--valor[18]));     }//GEN-LAST:event_laranjadamenosActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        tela_principal principal = new tela_principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void txtresul3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresul3ActionPerformed

    private void txtresul8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresul8ActionPerformed

    private void txtresul9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresul9ActionPerformed

    private void txtresul10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresul10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresul10ActionPerformed

    private void btnsalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar1ActionPerformed
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 32 THEN ?\n"
                    + "   WHEN 33 THEN ?\n"
                    + "   WHEN 34 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(32, 33, 34)";

                PreparedStatement stmt = connection.prepareStatement(sql);
              
                stmt.setString(1, txtresul.getText());
                stmt.setString(2, txtresul1.getText());
                stmt.setString(3, txtresul2.getText());
                
                /*
                int arroz = Integer.parseInt(txtresul.getText());
               System.out.println(arroz);
               int feijao;
               int macarrao;                          
               
                System.out.println(txtresul1.getText());
                System.out.println(txtresul2.getText());
                System.out.println(txtresul.getText());
                */
                
                stmt.execute();
                stmt.close();
                connection.close();

                JOptionPane.showMessageDialog(null, "salvo com sucesso!");
                jTabbedPane1.setSelectedIndex(1);
      

            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

            
        }
    }//GEN-LAST:event_btnsalvar1ActionPerformed

    private void btnsalvar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar3ActionPerformed
 try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 35 THEN ?\n"
                    + "   WHEN 36 THEN ?\n"
                    + "   WHEN 37 THEN ?\n"
                    + "   WHEN 38 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(35,36,37,38)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, txtresul5.getText());
                stmt.setString(2, txtresul6.getText());
                stmt.setString(3, txtresul7.getText());
                stmt.setString(4, txtresul8.getText());

                stmt.execute();
                stmt.close();
                connection.close();

                JOptionPane.showMessageDialog(null, "salvo com sucesso!");
                jTabbedPane1.setSelectedIndex(3);
      

            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

            
        }    }//GEN-LAST:event_btnsalvar3ActionPerformed

    private void btnsalvar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar4ActionPerformed
 try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 26 THEN ?\n"
                    + "   WHEN 27 THEN ?\n"
                    + "   WHEN 28 THEN ?\n"
                    + "   WHEN 29 THEN ?\n"
                    + "   WHEN 30 THEN ?\n"
                    + "   WHEN 31 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(26,27,28,29,30,31)";
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
                jTabbedPane1.setSelectedIndex(4);
      

            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

            
        }    }//GEN-LAST:event_btnsalvar4ActionPerformed

    private void btnsalvar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar5ActionPerformed
try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 49 THEN ?\n"
                    + "   WHEN 50 THEN ?\n"
                    + "   WHEN 51 THEN ?\n"
                    + "   WHEN 52 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(49,50,51,52)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, txtresul15.getText());
                stmt.setString(2, txtresul16.getText());
                stmt.setString(3, txtresul17.getText());
                stmt.setString(4, txtresul18.getText());


                stmt.execute();
                stmt.close();
                connection.close();

                JOptionPane.showMessageDialog(null, "salvo com sucesso!");
      

            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

            
        }    }//GEN-LAST:event_btnsalvar5ActionPerformed

    private void btnfinalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizar1ActionPerformed

        tela_carrinho carrinho = new tela_carrinho();
carrinho.setVisible(true);
dispose();
    }//GEN-LAST:event_btnfinalizar1ActionPerformed

    private void btnsalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar2ActionPerformed
try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "UPDATE cprodutos\n"
                    + "   SET quantidade = CASE id\n"
                    + "   WHEN 24 THEN ?\n"
                    + "   WHEN 25 THEN ?\n"
                    + "   ELSE quantidade END WHERE id IN(24,25)";
               
              PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, txtresul3.getText());
                stmt.setString(2, txtresul4.getText());


                stmt.execute();
                stmt.close();
                connection.close();

                JOptionPane.showMessageDialog(null, "salvo com sucesso!");
                jTabbedPane1.setSelectedIndex(2);

            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

            
        }     }//GEN-LAST:event_btnsalvar2ActionPerformed

    private void btnvoltar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar5ActionPerformed
jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnvoltar5ActionPerformed

    private void btnvoltar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar4ActionPerformed
jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnvoltar4ActionPerformed

    private void btnvoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar3ActionPerformed
jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnvoltar3ActionPerformed

    private void btnvolrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolrar2ActionPerformed
jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnvolrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(menu_almoco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_almoco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_almoco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_almoco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_almoco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acompanhamentos;
    private javax.swing.JButton aguamais;
    private javax.swing.JButton aguamenos;
    private javax.swing.JButton alfacemais;
    private javax.swing.JButton alfacemenos;
    private javax.swing.JButton arrozmais;
    private javax.swing.JButton arrozmenos;
    private javax.swing.JPanel bebidas;
    private javax.swing.JButton bifemais;
    private javax.swing.JButton bifemenos;
    private javax.swing.JButton btnbase;
    private javax.swing.JButton btnbebidas;
    private javax.swing.JButton btnchurrasco;
    private javax.swing.JButton btnfinalizar1;
    private javax.swing.JButton btnproteinas;
    private javax.swing.JButton btnsaladas;
    private javax.swing.JButton btnsalvar1;
    private javax.swing.JButton btnsalvar2;
    private javax.swing.JButton btnsalvar3;
    private javax.swing.JButton btnsalvar4;
    private javax.swing.JButton btnsalvar5;
    private javax.swing.JButton btnvolrar2;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JButton btnvoltar3;
    private javax.swing.JButton btnvoltar4;
    private javax.swing.JButton btnvoltar5;
    private javax.swing.JPanel churrascos;
    private javax.swing.JButton colamais;
    private javax.swing.JButton colamenos;
    private javax.swing.JButton ecarnemais;
    private javax.swing.JButton ecarnemenos;
    private javax.swing.JButton ecoracaomais;
    private javax.swing.JButton ecoracaomenos;
    private javax.swing.JButton ecostelamais;
    private javax.swing.JButton ecostelamenos;
    private javax.swing.JButton ecoxafrangomais;
    private javax.swing.JButton ecoxafrangomenos;
    private javax.swing.JButton efrangomais;
    private javax.swing.JButton efrangomenos;
    private javax.swing.JButton elinguicamais;
    private javax.swing.JButton elinguicamenos;
    private javax.swing.JButton feijaomais;
    private javax.swing.JButton feijaomenos;
    private javax.swing.JButton frangomais;
    private javax.swing.JButton frangomenos;
    private javax.swing.JPanel guarnicoes;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton laranjadamais;
    private javax.swing.JButton laranjadamenos;
    private javax.swing.JLabel lblchurrasco;
    private javax.swing.JLabel lblfundo;
    private javax.swing.JLabel lblfundobase;
    private javax.swing.JLabel lblfundobebidas;
    private javax.swing.JLabel lblfundoproteinas;
    private javax.swing.JLabel lblfundosaladas;
    private javax.swing.JButton macarraomais;
    private javax.swing.JButton macarraomenos;
    private javax.swing.JButton ovosmais;
    private javax.swing.JButton ovosmenos;
    private javax.swing.JButton peixemais;
    private javax.swing.JButton peixemenos;
    private javax.swing.JPanel saladas;
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
    private javax.swing.JTextField txtresul2;
    private javax.swing.JTextField txtresul3;
    private javax.swing.JTextField txtresul4;
    private javax.swing.JTextField txtresul5;
    private javax.swing.JTextField txtresul6;
    private javax.swing.JTextField txtresul7;
    private javax.swing.JTextField txtresul8;
    private javax.swing.JTextField txtresul9;
    // End of variables declaration//GEN-END:variables
}
