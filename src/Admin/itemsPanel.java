package Admin;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import Admin.customButton.Button;
import javax.swing.DefaultListModel;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author PC
 */
public class itemsPanel extends javax.swing.JPanel {
     
    /**
     * Creates new form itemsPanel
     */
    private ImageIcon headerImage;
    private itemsPanel itemsPanelInstance;;
    public itemsPanel() {
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

        itemsPanel = new javax.swing.JPanel();
        itemsTxtField = new javax.swing.JTextField();
        itmesScrollPane = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JList<>();
        itemsButtonPanel = new JImagePanel(new ImageIcon("C:\\Users\\PC\\Pictures\\img_projet\\unsplash.jpg").getImage());
        itemsAjouterButton = new Button();
        itemsSupprimerButton = new Button();
        jLabel1 = new javax.swing.JLabel();
        itemsFormPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new JImagePanel(new ImageIcon("C:\\Users\\PC\\Pictures\\img_projet\\karabous1.png").getImage());
        itemComTxtField1 = new javax.swing.JTextField();
        itemDesLabel1 = new javax.swing.JLabel();
        itemStockLabel1 = new javax.swing.JLabel();
        itemComLabel1 = new javax.swing.JLabel();
        validerItemButton1 = new Button();
        itemNomTxtField1 = new javax.swing.JTextField();
        itemPrixTxtField1 = new javax.swing.JTextField();
        itemStockSpinner1 = new javax.swing.JSpinner();
        itemPrixLabel1 = new javax.swing.JLabel();
        itemsResetButton2 = new Button();
        itemNomLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mealDesAreaTxt1 = new javax.swing.JTextArea();
        jPanel3 = new JImagePanel(new ImageIcon("C:\\Users\\PC\\Pictures\\img_projet\\Blackboard3.png").getImage());

        setPreferredSize(new java.awt.Dimension(639, 300));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        setLayout(new java.awt.CardLayout());

        itemsPanel.setBackground(new java.awt.Color(153, 153, 153));
        itemsPanel.setInheritsPopupMenu(true);
        itemsPanel.setMaximumSize(new java.awt.Dimension(400, 306));
        itemsPanel.setMinimumSize(new java.awt.Dimension(400, 306));
        itemsPanel.setPreferredSize(new java.awt.Dimension(400, 306));
        itemsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemsPanelMouseEntered(evt);
            }
        });
        itemsPanel.setLayout(new java.awt.BorderLayout());

        itemsTxtField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemsTxtField.setText("search Item");
        itemsPanel.add(itemsTxtField, java.awt.BorderLayout.PAGE_START);

        itemsList.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        itmesScrollPane.setViewportView(itemsList);

        itemsPanel.add(itmesScrollPane, java.awt.BorderLayout.CENTER);

        itemsButtonPanel.setBackground(new java.awt.Color(153, 153, 153));
        itemsButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsButtonPanelMouseClicked(evt);
            }
        });

        itemsAjouterButton.setText("Ajouter Item");
        itemsAjouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsAjouterButtonActionPerformed(evt);
            }
        });

        itemsSupprimerButton.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemsSupprimerButton.setText("Supprimer Item");

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/itemsW.png"))); // NOI18N
        jLabel1.setText("Items");

        javax.swing.GroupLayout itemsButtonPanelLayout = new javax.swing.GroupLayout(itemsButtonPanel);
        itemsButtonPanel.setLayout(itemsButtonPanelLayout);
        itemsButtonPanelLayout.setHorizontalGroup(
            itemsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemsButtonPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(itemsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemsSupprimerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemsAjouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        itemsButtonPanelLayout.setVerticalGroup(
            itemsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsButtonPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(itemsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(itemsButtonPanelLayout.createSequentialGroup()
                        .addComponent(itemsAjouterButton)
                        .addGap(18, 18, 18)
                        .addComponent(itemsSupprimerButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        itemsPanel.add(itemsButtonPanel, java.awt.BorderLayout.PAGE_END);

        add(itemsPanel, "card3");

        itemsFormPanel.setBackground(new java.awt.Color(102, 102, 102));
        itemsFormPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel2.setName(""); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(499, 300));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemComTxtField1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemComTxtField1.setText("Commentaire");
        jPanel2.add(itemComTxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 96, 100, -1));

        itemDesLabel1.setBackground(new java.awt.Color(255, 204, 51));
        itemDesLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemDesLabel1.setText("Description  :");
        itemDesLabel1.setOpaque(true);
        jPanel2.add(itemDesLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 176, 77, -1));

        itemStockLabel1.setBackground(new java.awt.Color(255, 204, 51));
        itemStockLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemStockLabel1.setText("Stock :");
        itemStockLabel1.setOpaque(true);
        jPanel2.add(itemStockLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 139, 77, -1));

        itemComLabel1.setBackground(new java.awt.Color(255, 204, 51));
        itemComLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemComLabel1.setText("Commentaire :");
        itemComLabel1.setOpaque(true);
        jPanel2.add(itemComLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 99, -1, -1));

        validerItemButton1.setBackground(new java.awt.Color(255, 204, 51));
        validerItemButton1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        validerItemButton1.setText("Valider");
        validerItemButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerItemButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(validerItemButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 273, 70, 20));

        itemNomTxtField1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemNomTxtField1.setText("Nom du produit");
        itemNomTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNomTxtField1ActionPerformed(evt);
            }
        });
        jPanel2.add(itemNomTxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 16, -1, -1));

        itemPrixTxtField1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemPrixTxtField1.setText("Prix du produit");
        jPanel2.add(itemPrixTxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 56, 100, -1));
        jPanel2.add(itemStockSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 136, 100, -1));

        itemPrixLabel1.setBackground(new java.awt.Color(255, 204, 51));
        itemPrixLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemPrixLabel1.setText("Prix : ");
        itemPrixLabel1.setOpaque(true);
        jPanel2.add(itemPrixLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 59, 77, -1));

        itemsResetButton2.setBackground(java.awt.Color.black);
        itemsResetButton2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        itemsResetButton2.setForeground(java.awt.Color.white);
        itemsResetButton2.setText("Reset");
        itemsResetButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsResetButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(itemsResetButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 273, 70, 20));

        itemNomLabel1.setBackground(new java.awt.Color(255, 204, 51));
        itemNomLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        itemNomLabel1.setText("Nom : ");
        itemNomLabel1.setOpaque(true);
        jPanel2.add(itemNomLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 19, 77, -1));

        mealDesAreaTxt1.setColumns(20);
        mealDesAreaTxt1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        mealDesAreaTxt1.setRows(5);
        jScrollPane3.setViewportView(mealDesAreaTxt1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jPanel1.add(jPanel2);

        jPanel3.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        itemsFormPanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(itemsFormPanel, "card6");
    }// </editor-fold>//GEN-END:initComponents

    private void itemsAjouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsAjouterButtonActionPerformed
        // TODO add your handling code here:
        itemsPanel.setVisible(false);
        itemsFormPanel.setVisible(true);

    }//GEN-LAST:event_itemsAjouterButtonActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void itemsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsPanelMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemsPanelMouseEntered

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    private void itemsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsPanelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemsPanelMouseClicked

    private void itemsButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsButtonPanelMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_itemsButtonPanelMouseClicked

    private void validerItemButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerItemButton1ActionPerformed
        // TODO add your handling code here:
        itemsPanel.setVisible(true);
        itemsFormPanel.setVisible(false);
    }//GEN-LAST:event_validerItemButton1ActionPerformed

    private void itemNomTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNomTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNomTxtField1ActionPerformed

    private void itemsResetButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsResetButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemsResetButton2ActionPerformed


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
    private javax.swing.JLabel itemComLabel1;
    private javax.swing.JTextField itemComTxtField1;
    private javax.swing.JLabel itemDesLabel1;
    private javax.swing.JLabel itemNomLabel1;
    private javax.swing.JTextField itemNomTxtField1;
    private javax.swing.JLabel itemPrixLabel1;
    private javax.swing.JTextField itemPrixTxtField1;
    private javax.swing.JLabel itemStockLabel1;
    private javax.swing.JSpinner itemStockSpinner1;
    private javax.swing.JButton itemsAjouterButton;
    private javax.swing.JPanel itemsButtonPanel;
    public javax.swing.JPanel itemsFormPanel;
    private javax.swing.JList<String> itemsList;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JButton itemsResetButton2;
    private javax.swing.JButton itemsSupprimerButton;
    private javax.swing.JTextField itemsTxtField;
    private javax.swing.JScrollPane itmesScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea mealDesAreaTxt1;
    private javax.swing.JButton validerItemButton1;
    // End of variables declaration//GEN-END:variables
}
