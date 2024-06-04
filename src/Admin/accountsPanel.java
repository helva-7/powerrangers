package Admin;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Admin.customButton.Button;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author PC
 */
public class accountsPanel extends javax.swing.JPanel {

    /**
     * Creates new form accountsPanel
     */
    private ImageIcon headerImage;
    private itemsPanel itemsPanelInstance;;
    public accountsPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountsPanel = new javax.swing.JPanel();
        accountsTxtField = new javax.swing.JTextField();
        accountsScrollPane = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JList<>();
        accountsButtonPanel = new JImagePanel(new ImageIcon("C:\\Users\\PC\\Pictures\\img_projet\\unsplash.jpg").getImage());
        itemsAjouterButton = new Button();
        itemsSupprimerButton = new Button();
        jLabel1 = new javax.swing.JLabel();
        accountsFormPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new JImagePanel(new ImageIcon("C:\\Users\\PC\\Pictures\\img_projet\\karabous1.png").getImage());
        accountsNomLabel = new javax.swing.JLabel();
        accountsMdpPasswordField = new javax.swing.JPasswordField();
        accountsRoleComboBox = new javax.swing.JComboBox<>();
        accountsMdpLabel = new javax.swing.JLabel();
        accountsNomTxtField = new javax.swing.JTextField();
        accountsValiderButton = new Button();
        accountsPrenomTxtField = new javax.swing.JTextField();
        accountsMailTxtField = new javax.swing.JTextField();
        accountsPrenomLabel = new javax.swing.JLabel();
        accountsResetButton = new Button();
        accountsMailLabel = new javax.swing.JLabel();
        accountsRoleLabel = new javax.swing.JLabel();
        jPanel3 = new JImagePanel(new ImageIcon("C:\\Users\\PC\\Pictures\\img_projet\\Blackboard3.png").getImage());

        setLayout(new java.awt.CardLayout());

        accountsPanel.setBackground(new java.awt.Color(153, 153, 153));
        accountsPanel.setInheritsPopupMenu(true);
        accountsPanel.setMaximumSize(new java.awt.Dimension(400, 306));
        accountsPanel.setMinimumSize(new java.awt.Dimension(400, 306));
        accountsPanel.setPreferredSize(new java.awt.Dimension(400, 306));
        accountsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountsPanelMouseEntered(evt);
            }
        });
        accountsPanel.setLayout(new java.awt.BorderLayout());

        accountsTxtField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsTxtField.setText("search Account");
        accountsPanel.add(accountsTxtField, java.awt.BorderLayout.PAGE_START);

        itemsList.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        accountsScrollPane.setViewportView(itemsList);

        accountsPanel.add(accountsScrollPane, java.awt.BorderLayout.CENTER);

        accountsButtonPanel.setBackground(new java.awt.Color(153, 153, 153));
        accountsButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsButtonPanelMouseClicked(evt);
            }
        });

        itemsAjouterButton.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemsAjouterButton.setText("Ajouter Compte");
        itemsAjouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsAjouterButtonActionPerformed(evt);
            }
        });

        itemsSupprimerButton.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemsSupprimerButton.setText("Supprimer Compte");
        itemsSupprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsSupprimerButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accountsW.png"))); // NOI18N
        jLabel1.setText("Accounts");

        javax.swing.GroupLayout accountsButtonPanelLayout = new javax.swing.GroupLayout(accountsButtonPanel);
        accountsButtonPanel.setLayout(accountsButtonPanelLayout);
        accountsButtonPanelLayout.setHorizontalGroup(
            accountsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountsButtonPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(accountsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemsSupprimerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemsAjouterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        accountsButtonPanelLayout.setVerticalGroup(
            accountsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountsButtonPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(accountsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(accountsButtonPanelLayout.createSequentialGroup()
                        .addComponent(itemsAjouterButton)
                        .addGap(18, 18, 18)
                        .addComponent(itemsSupprimerButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        accountsPanel.add(accountsButtonPanel, java.awt.BorderLayout.PAGE_END);

        add(accountsPanel, "card3");

        accountsFormPanel.setBackground(new java.awt.Color(102, 102, 102));
        accountsFormPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel2.setName(""); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(499, 300));

        accountsNomLabel.setBackground(new java.awt.Color(255, 204, 51));
        accountsNomLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsNomLabel.setText("Nom ");
        accountsNomLabel.setOpaque(true);

        accountsMdpPasswordField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N

        accountsRoleComboBox.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Chef", "Client" }));
        accountsRoleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsRoleComboBoxActionPerformed(evt);
            }
        });

        accountsMdpLabel.setBackground(new java.awt.Color(255, 204, 51));
        accountsMdpLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsMdpLabel.setText("Mot de passe ");
        accountsMdpLabel.setOpaque(true);

        accountsNomTxtField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsNomTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsNomTxtFieldActionPerformed(evt);
            }
        });

        accountsValiderButton.setBackground(java.awt.Color.orange);
        accountsValiderButton.setText("Valider");
        accountsValiderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsValiderButtonActionPerformed(evt);
            }
        });

        accountsPrenomTxtField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsPrenomTxtField.setText("votre prenom");
        accountsPrenomTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsPrenomTxtFieldActionPerformed(evt);
            }
        });

        accountsMailTxtField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsMailTxtField.setText("votre mail");

        accountsPrenomLabel.setBackground(new java.awt.Color(255, 204, 51));
        accountsPrenomLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsPrenomLabel.setText("Prenom ");
        accountsPrenomLabel.setOpaque(true);

        accountsResetButton.setBackground(java.awt.Color.black);
        accountsResetButton.setForeground(java.awt.Color.white);
        accountsResetButton.setText("Reset");
        accountsResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsResetButtonActionPerformed(evt);
            }
        });

        accountsMailLabel.setBackground(new java.awt.Color(255, 204, 51));
        accountsMailLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsMailLabel.setText("Mail ");
        accountsMailLabel.setOpaque(true);

        accountsRoleLabel.setBackground(new java.awt.Color(255, 204, 51));
        accountsRoleLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        accountsRoleLabel.setText("Role ");
        accountsRoleLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountsNomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsPrenomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsMailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsMdpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsRoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountsNomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsPrenomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsMailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsMdpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(accountsResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountsValiderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(160, 160, 160))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountsNomTxtField)
                    .addComponent(accountsNomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountsPrenomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsPrenomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountsMailLabel)
                    .addComponent(accountsMailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountsMdpLabel)
                    .addComponent(accountsMdpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountsRoleLabel)
                    .addComponent(accountsRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountsResetButton)
                    .addComponent(accountsValiderButton))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        accountsFormPanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(accountsFormPanel, "card6");
    }// </editor-fold>//GEN-END:initComponents

    private void itemsAjouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsAjouterButtonActionPerformed
        // TODO add your handling code here:
        accountsPanel.setVisible(false);
        accountsFormPanel.setVisible(true);
    }//GEN-LAST:event_itemsAjouterButtonActionPerformed

    private void accountsButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsButtonPanelMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_accountsButtonPanelMouseClicked

    private void accountsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsPanelMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_accountsPanelMouseClicked

    private void accountsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsPanelMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_accountsPanelMouseEntered

    private void accountsNomTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsNomTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountsNomTxtFieldActionPerformed

    private void accountsPrenomTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsPrenomTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountsPrenomTxtFieldActionPerformed

    private void accountsRoleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsRoleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountsRoleComboBoxActionPerformed

    private void accountsValiderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsValiderButtonActionPerformed
        // TODO add your handling code here:
        accountsPanel.setVisible(true);
        accountsFormPanel.setVisible(false);
    }//GEN-LAST:event_accountsValiderButtonActionPerformed

    private void accountsResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsResetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountsResetButtonActionPerformed

    private void itemsSupprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsSupprimerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemsSupprimerButtonActionPerformed

    private static class JImagePanel extends JPanel {

        private Image image;

        public JImagePanel(Image image) {
            this.image = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                g.drawImage(image, 0, 0, this);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountsButtonPanel;
    public javax.swing.JPanel accountsFormPanel;
    private javax.swing.JLabel accountsMailLabel;
    private javax.swing.JTextField accountsMailTxtField;
    private javax.swing.JLabel accountsMdpLabel;
    private javax.swing.JPasswordField accountsMdpPasswordField;
    private javax.swing.JLabel accountsNomLabel;
    private javax.swing.JTextField accountsNomTxtField;
    private javax.swing.JPanel accountsPanel;
    private javax.swing.JLabel accountsPrenomLabel;
    private javax.swing.JTextField accountsPrenomTxtField;
    private javax.swing.JButton accountsResetButton;
    private javax.swing.JComboBox<String> accountsRoleComboBox;
    private javax.swing.JLabel accountsRoleLabel;
    private javax.swing.JScrollPane accountsScrollPane;
    private javax.swing.JTextField accountsTxtField;
    private javax.swing.JButton accountsValiderButton;
    private javax.swing.JButton itemsAjouterButton;
    private javax.swing.JList<String> itemsList;
    private javax.swing.JButton itemsSupprimerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}