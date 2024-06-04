/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.client.form;

import client.Model.ModelItem;

import client.Model.jpaneloder;
import client.component.Item;
import client.component.ItemDetail;

import client.custom.swing.PictureBoxBig;
import client.custom.swing.ScrollBar;
import client.event.EventItem;
import main.client.main.MenuduJour;
import main.client.main.Tout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 *
 * @author pc
 */
public class form extends javax.swing.JPanel {
    public ImageIcon imageIcon;
  
    
    jpaneloder jpaneloder1 = new jpaneloder();
    
    
    /**
     * Creates new form form
     */
    
    
    
     public void setEvent(EventItem event) {
        this.event = event;
        
    }

    private EventItem event;
    
    public form() {
        initComponents();
        imageIcon = new ImageIcon("Client/src/client/image/bg.jpg");
        scroll1.setVerticalScrollBar(new ScrollBar());
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the image on the panel
        if (imageIcon != null) {
            Image image = imageIcon.getImage();
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    } 
    
    public void addItem(ModelItem data) {
        Item item = new Item();
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showItemDetail(data);
            }
        });
        panelItem.add(item);
        panelItem.repaint();
        panelItem.revalidate();
    }

    public void setSelected(Component item) {
        for (Component com : panelItem.getComponents()) {
            Item i = (Item) com;
            if (i.isSelected()) {
                i.setSelected(false);
            }
        }
        ((Item) item).setSelected(true);
    }

    
     private void showItemDetail(ModelItem data) {
        JDialog dialog = new JDialog(SwingUtilities.getWindowAncestor(this), "Item Detail", Dialog.ModalityType.APPLICATION_MODAL);
        ItemDetail itemDetail = new ItemDetail();
        itemDetail.setData(data);
        dialog.add(itemDetail);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
     
     
   /* public void showItem(ModelItem data) {
        lbItemName.setText(data.getItemName());
        txtDescription.setText(data.getDescription());      
        DecimalFormat df = new DecimalFormat("#,##0.00 'DH'");
        lbPrice.setText(df.format(data.getPrice()));
        pictureBoxBig1.setImage(data.getImage());
        
    } */

    public Point getPanelItemLocation() {
        Point p = scroll1.getLocation();
        return new Point(p.x, p.y - scroll1.getViewport().getViewPosition().y);
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scroll1 = new javax.swing.JScrollPane();
        imgpanel1 = new client.Model.imgpanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbItemName = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        pictureBoxBig1 = new client.custom.swing.PictureBoxBig();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        roundedBorder1 = new client.custom.swing.RoundedBorder();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        footerpanel1 = new client.Model.footerpanel();
        panelItem = new client.custom.swing.PanelItem();
        footerpanel2 = new client.Model.footerpanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 657));
        jPanel1.setLayout(new java.awt.BorderLayout());

        scroll1.setPreferredSize(new java.awt.Dimension(800, 565));
        jPanel1.add(scroll1, java.awt.BorderLayout.LINE_START);

        imgpanel1.setPreferredSize(new java.awt.Dimension(500, 600));
        imgpanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("panier ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        imgpanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(imgpanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(370, 657));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbItemName.setBackground(new java.awt.Color(204, 204, 204));
        lbItemName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName.setForeground(new java.awt.Color(204, 204, 204));
        lbItemName.setText("Item Name");
        jPanel2.add(lbItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 245, 267, -1));

        lbPrice.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(204, 204, 204));
        lbPrice.setText("$0.00");
        jPanel2.add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 215, -1, -1));

        txtDescription.setBackground(new java.awt.Color(51, 51, 51));
        txtDescription.setBorder(null);
        txtDescription.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(51, 51, 51));
        txtDescription.setFocusable(false);
        txtDescription.setMaximumSize(new java.awt.Dimension(208, 63));
        jPanel2.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 281, 267, 63));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 197, 300, 12));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 356, 306, 12));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 188, -1, -1));
        jPanel2.add(pictureBoxBig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 33, 265, 158));

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 275, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Commentaire ?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 374, -1, -1));

        roundedBorder1.setText("roundedBord");
        roundedBorder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedBorder1ActionPerformed(evt);
            }
        });
        jPanel2.add(roundedBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 573, 163, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout footerpanel1Layout = new javax.swing.GroupLayout(footerpanel1);
        footerpanel1.setLayout(footerpanel1Layout);
        footerpanel1Layout.setHorizontalGroup(
            footerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        footerpanel1Layout.setVerticalGroup(
            footerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new java.awt.BorderLayout());

        panelItem.setBackground(new java.awt.Color(204, 204, 204));
        panelItem.setMinimumSize(new java.awt.Dimension(200, 200));
        panelItem.setPreferredSize(new java.awt.Dimension(671, 563));
        add(panelItem, java.awt.BorderLayout.CENTER);

        footerpanel2.setPreferredSize(new java.awt.Dimension(824, 44));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client/image/panier-25px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("0");

        javax.swing.GroupLayout footerpanel2Layout = new javax.swing.GroupLayout(footerpanel2);
        footerpanel2.setLayout(footerpanel2Layout);
        footerpanel2Layout.setHorizontalGroup(
            footerpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerpanel2Layout.createSequentialGroup()
                .addContainerGap(669, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(94, 94, 94))
        );
        footerpanel2Layout.setVerticalGroup(
            footerpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerpanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(footerpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(footerpanel2, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(250, 460));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        add(jPanel6, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void roundedBorder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedBorder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundedBorder1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private client.Model.footerpanel footerpanel1;
    private client.Model.footerpanel footerpanel2;
    private client.Model.imgpanel imgpanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbItemName;
    private javax.swing.JLabel lbPrice;
    private client.custom.swing.PanelItem panelItem;
    private client.custom.swing.PictureBoxBig pictureBoxBig1;
    private client.custom.swing.RoundedBorder roundedBorder1;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTextPane txtDescription;
    // End of variables declaration//GEN-END:variables
}