/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

public class FenSaisie extends javax.swing.JPanel {

    public FenSaisie() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRepresentant = new javax.swing.JLabel();
        txtRepresentant = new javax.swing.JTextField();
        lblCategorieDepense = new javax.swing.JLabel();
        rbtnRepas = new javax.swing.JRadioButton();
        rbtnHebergerment = new javax.swing.JRadioButton();
        javax.swing.JRadioButton rbtnTransport = new javax.swing.JRadioButton();
        btnAjouter = new javax.swing.JButton();
        btnCalculer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSommaire = new javax.swing.JTextArea();
        lblTransport = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblMontant = new javax.swing.JLabel();
        txtMontant = new javax.swing.JTextField();
        cboxTypeTransport = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblTypeTransport = new javax.swing.JLabel();
        btnQuitter = new javax.swing.JButton();
        lblNotice1 = new javax.swing.JLabel();
        btnSupprimer = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRepresentant.setText("Numéro du représentant");

        lblCategorieDepense.setText("Catégorie");

        rbtnRepas.setText("Repas");

        rbtnHebergerment.setText("Hébergement");

        rbtnTransport.setSelected(true);
        rbtnTransport.setText("Transport");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblRepresentant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRepresentant, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategorieDepense, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnRepas)
                        .addGap(34, 34, 34)
                        .addComponent(rbtnHebergerment)
                        .addGap(40, 40, 40)
                        .addComponent(rbtnTransport)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRepresentant)
                            .addComponent(txtRepresentant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblCategorieDepense)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnRepas)
                            .addComponent(rbtnHebergerment)
                            .addComponent(rbtnTransport))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnCalculer.setText("Calculer");

        txtAreaSommaire.setBackground(new java.awt.Color(229, 234, 244));
        txtAreaSommaire.setColumns(20);
        txtAreaSommaire.setRows(5);
        jScrollPane2.setViewportView(txtAreaSommaire);

        lblTransport.setText("Transport");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDate.setToolTipText("date");

        lblDate.setText("Date (yyyy-mm-dd):");

        lblMontant.setText("Montant:");

        txtMontant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontantActionPerformed(evt);
            }
        });

        cboxTypeTransport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxTypeTransport.setSelectedIndex(2);
        cboxTypeTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTypeTransportActionPerformed(evt);
            }
        });

        lblTypeTransport.setText("Type de transport:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblMontant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMontant, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(lblTypeTransport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxTypeTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate)
                    .addComponent(lblMontant)
                    .addComponent(txtMontant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxTypeTransport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTypeTransport))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnQuitter.setText("Quitter");

        lblNotice1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNotice1.setText("Note: (ex: max $25 / jour)");

        btnSupprimer.setText("Supprimer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNotice1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnQuitter)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSupprimer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAjouter)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCalculer))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(253, Short.MAX_VALUE)
                    .addComponent(lblTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(437, 437, 437)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblNotice1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnCalculer)
                    .addComponent(btnQuitter)
                    .addComponent(btnSupprimer))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(lblTransport)
                    .addContainerGap(408, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void txtMontantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontantActionPerformed

    private void cboxTypeTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTypeTransportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTypeTransportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnCalculer;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JComboBox<String> cboxTypeTransport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategorieDepense;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMontant;
    private javax.swing.JLabel lblNotice1;
    private javax.swing.JLabel lblRepresentant;
    private javax.swing.JLabel lblTransport;
    private javax.swing.JRadioButton rbtnHebergerment;
    private javax.swing.JRadioButton rbtnRepas;
    private javax.swing.JTextArea txtAreaSommaire;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtMontant;
    private javax.swing.JTextField txtRepresentant;
    // End of variables declaration//GEN-END:variables
}
