/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import io.Archive;
import modele.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;

/**
 * @author Admin
 */
public class FenSaisie extends javax.swing.JFrame {

    /**
     * Creates new form FenResumeNew
     */
    private ListeRepresentants listeRepresentants = new ListeRepresentants();
    private HashMap<String, CategorieEmploye> categories = new HashMap<>();

    private RegistreFrais registreFrais = new RegistreFrais();

    public FenSaisie() {
        initComponents();

        trans.setVisible(false);

    }

    public FenSaisie(ListeRepresentants listeRepresentants, HashMap<String, CategorieEmploye> categories) {
        this();
        this.listeRepresentants = listeRepresentants;
        this.categories = categories;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG = new javax.swing.ButtonGroup();
        rbtnTra = new javax.swing.JRadioButton();
        rbtnHeb = new javax.swing.JRadioButton();
        rbtnRepas = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rbtnRepas2 = new javax.swing.JRadioButton();
        rbtnHeber2 = new javax.swing.JRadioButton();
        rbtnTrans2 = new javax.swing.JRadioButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        trans = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        txtRep = new javax.swing.JTextField();
        javax.swing.JPanel jPan2 = new javax.swing.JPanel();
        panMask = new javax.swing.JLayeredPane();
        lblMask = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblMont = new javax.swing.JLabel();
        txtMont = new javax.swing.JTextField();
        txtDate = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        lblLimite = new javax.swing.JLabel();
        btnQui = new javax.swing.JButton();
        btnSup = new javax.swing.JButton();
        btnAjou = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAffichage = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEnregistre = new javax.swing.JButton();
        txtLimit = new javax.swing.JTextField();

        rbtnTra.setText("Transport");
        rbtnTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTraActionPerformed(evt);
            }
        });

        rbtnHeb.setText("H??bergement");
        rbtnHeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHebActionPerformed(evt);
            }
        });

        rbtnRepas.setText("Repas");
        rbtnRepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRepasActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cat??gorie", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        btnG.add(rbtnRepas2);
        rbtnRepas2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbtnRepas2.setText("Repas");
        rbtnRepas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRepas2ActionPerformed(evt);
            }
        });

        btnG.add(rbtnHeber2);
        rbtnHeber2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbtnHeber2.setText("H??bergement");
        rbtnHeber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHeber2ActionPerformed(evt);
            }
        });

        btnG.add(rbtnTrans2);
        rbtnTrans2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbtnTrans2.setText("Transport");
        rbtnTrans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTrans2ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        trans.setEditable(true);
        trans.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        trans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Auto", " Train", " Avion" }));
        trans.setAlignmentX(1.0F);
        trans.setAlignmentY(1.0F);
        trans.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transActionPerformed(evt);
            }
        });
        jLayeredPane1.add(trans);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(rbtnRepas2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(rbtnHeber2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(rbtnTrans2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnHeber2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnRepas2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnTrans2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Num??ro de repr??sentant", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        txtRep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtRep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(txtRep, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtRep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPan2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPan2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPan2.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jPan2VetoableChange(evt);
            }
        });

        panMask.setLayout(new javax.swing.OverlayLayout(panMask));

        lblMask.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMask.setForeground(new java.awt.Color(153, 153, 153));
        lblMask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMask.setLabelFor(txtDate);
        lblMask.setText("yyyy - mm - dd");
        panMask.add(lblMask);
        lblMask.setVisible(false);

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("Date :");

        lblMont.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMont.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMont.setLabelFor(txtMont);
        lblMont.setText("Montant :");

        txtMont.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMont.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setToolTipText(" yyyy-mm-dd");
        txtDate.setActionCommand("<Not Set>");
        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateFocusLost(evt);
            }
        });
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPan2Layout = new javax.swing.GroupLayout(jPan2);
        jPan2.setLayout(jPan2Layout);
        jPan2Layout.setHorizontalGroup(
            jPan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPan2Layout.createSequentialGroup()
                .addGap(830, 830, 830)
                .addComponent(panMask, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
            .addGroup(jPan2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblMont)
                .addGap(21, 21, 21)
                .addComponent(txtMont, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jPan2Layout.setVerticalGroup(
            jPan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPan2Layout.createSequentialGroup()
                .addGroup(jPan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPan2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panMask, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDate)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnQui.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQui.setText("Quitter");
        btnQui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuiActionPerformed(evt);
            }
        });

        btnSup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSup.setText("Supprimer");
        btnSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupActionPerformed(evt);
            }
        });

        btnAjou.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAjou.setText("Ajouter");
        btnAjou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouActionPerformed(evt);
            }
        });

        tblAffichage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAffichage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Pr??nom", "Cat??gorie", "Date", "Type de frais", "Montant", "Remboursement"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAffichage.setEnabled(false);
        tblAffichage.setFocusable(false);
        tblAffichage.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tblAffichage);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ENREGISTREMENT DES FRAIS REMBOURSABLES");

        btnEnregistre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEnregistre.setText("Enregistrer");
        btnEnregistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistreActionPerformed(evt);
            }
        });

        txtLimit.setBackground(java.awt.SystemColor.control);
        txtLimit.setForeground(new java.awt.Color(153, 153, 153));
        txtLimit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimit.setText("Allocation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnQui, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSup, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAjou, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnregistre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLimit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLimite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQui)
                    .addComponent(btnSup)
                    .addComponent(btnAjou)
                    .addComponent(btnEnregistre))
                .addGap(17, 17, 17))
        );

        jPan2.getAccessibleContext().setAccessibleName("");
        jPan2.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupActionPerformed
         lblLimite.setText("L'allocation est de____$");
         txtLimit.setText("$25");
         txtLimit.setForeground(Color.BLACK);
         
        registreFrais.supprimerDerniereDepenseEnregistree();
        registreFrais.listerFraisPourUI(tblAffichage);      
    }//GEN-LAST:event_btnSupActionPerformed

    private void btnAjouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouActionPerformed
//        try {
//            listeRepresentants = Archive.lecture("c:/temp/representants.json", categories);
//        } catch (FileNotFoundException e1) {
//            JOptionPane.showMessageDialog(null, "Probl??me de fichier en entr??e", "Erreur de fichier", JOptionPane.ERROR_MESSAGE);
//        } catch (IOException e2) {
//            JOptionPane.showMessageDialog(null, "Probl??me de fichier en sortie", "Erreur de fichier", JOptionPane.ERROR_MESSAGE);
//        } catch (ParseException e3) {
//            JOptionPane.showMessageDialog(null, "Probl??me de conversion de fichier", "Erreur de fichier", JOptionPane.ERROR_MESSAGE);
//        }

        Employe employe = listeRepresentants.rechercherEmployeParId(txtRep.getText());
        double montantFrais = Double.parseDouble(txtMont.getText());
        Frais frais = new FraisRepas();

        if (rbtnHeber2.isSelected()) {
            frais = new FraisHebergement();
        } else if (rbtnTrans2.isSelected()) {
            frais = new FraisDeplacement();
        }

        boolean aerien = false;
        if (trans.getSelectedItem().equals("avion")) {
            aerien = true;
        }

        double montantRemboursement = frais.calculerRemboursementFrais(employe, montantFrais, aerien);

        if (rbtnRepas2.isSelected()) {
            registreFrais.ajouterFrais(new FraisRepas(employe, "Repas", montantFrais, txtDate.getText(), montantRemboursement));
        } else if (rbtnHeber2.isSelected()) {
            registreFrais.ajouterFrais(new FraisHebergement(employe, "H??bergement", montantFrais, txtDate.getText(), montantRemboursement));
        } else if (rbtnTrans2.isSelected()) {
            String typeDeplacement;
            if (aerien) {
                typeDeplacement = "avion";
            } else {
                typeDeplacement = "voiture ou train";
            }
            registreFrais.ajouterFrais(new FraisDeplacement(employe, "D??placement", montantFrais, txtDate.getText(), montantRemboursement, "voiture ou train"));
        }

        registreFrais.listerFraisPourUI(tblAffichage);

    }//GEN-LAST:event_btnAjouActionPerformed

    public void reset() {
        
        txtRep.setText(null);
        txtDate.setText(null);
        txtMont.setText(null);
        btnG.clearSelection();
        trans.setVisible(false);
        txtLimit.setForeground(Color.GRAY);
        txtLimit.setText("Allocation");
        lblLimite.setText("");
        DefaultTableModel model = (DefaultTableModel) tblAffichage.getModel();
        model.setRowCount(0);
        registreFrais = new RegistreFrais();
    }
    
    private void combTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combTypeActionPerformed

    private void btnQuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuiActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuiActionPerformed


    private void rbtnRepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRepasActionPerformed

        btnG.add(rbtnRepas);
        btnG.add(rbtnHeb);
        btnG.add(rbtnTra);


    }//GEN-LAST:event_rbtnRepasActionPerformed

    private void rbtnHebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHebActionPerformed

    }//GEN-LAST:event_rbtnHebActionPerformed

    private void rbtnTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTraActionPerformed

    }//GEN-LAST:event_rbtnTraActionPerformed

    private void btnEnregistreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistreActionPerformed
        // TODO add your handling code here:
        Archive.ecriture("c:/temp/listeFraisRepresentants.txt", registreFrais);
        JOptionPane.showMessageDialog(null, "Vos donn??es ont ??t?? enregistr??es", "Merci", JOptionPane.INFORMATION_MESSAGE);
        reset();
    }//GEN-LAST:event_btnEnregistreActionPerformed

    private void rbtnTrans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTrans2ActionPerformed
       trans.setVisible(true);
       
    }//GEN-LAST:event_rbtnTrans2ActionPerformed

    private void transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transActionPerformed

    }//GEN-LAST:event_transActionPerformed

    private void rbtnRepas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRepas2ActionPerformed
        trans.setVisible(false);
    }//GEN-LAST:event_rbtnRepas2ActionPerformed

    private void rbtnHeber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHeber2ActionPerformed
       trans.setVisible(false);
    }//GEN-LAST:event_rbtnHeber2ActionPerformed

    private void jPan2VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPan2VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPan2VetoableChange

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateFocusLost
        lblMask.setVisible(false);
    }//GEN-LAST:event_txtDateFocusLost

    private void txtDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateFocusGained
        lblMask.setVisible(true);
    }//GEN-LAST:event_txtDateFocusGained

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
            java.util.logging.Logger.getLogger(FenSaisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenSaisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenSaisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenSaisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FenSaisie().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjou;
    private javax.swing.JButton btnEnregistre;
    private javax.swing.ButtonGroup btnG;
    private javax.swing.JButton btnQui;
    private javax.swing.JButton btnSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLimite;
    private javax.swing.JLabel lblMask;
    private javax.swing.JLabel lblMont;
    private javax.swing.JLayeredPane panMask;
    private javax.swing.JRadioButton rbtnHeb;
    private javax.swing.JRadioButton rbtnHeber2;
    private javax.swing.JRadioButton rbtnRepas;
    private javax.swing.JRadioButton rbtnRepas2;
    private javax.swing.JRadioButton rbtnTra;
    private javax.swing.JRadioButton rbtnTrans2;
    private javax.swing.JTable tblAffichage;
    private javax.swing.JComboBox<String> trans;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JTextField txtLimit;
    private javax.swing.JTextField txtMont;
    private javax.swing.JTextField txtRep;
    // End of variables declaration//GEN-END:variables
}
