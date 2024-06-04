/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client.custom.swing;

/**
 *
 * @author pc
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelItem extends JPanel {
    
    public ImageIcon imageIcon;
    
    
@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the image on the panel
        if (imageIcon != null) {
            Image image = imageIcon.getImage();
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    } 
    public PanelItem() {
           imageIcon = new ImageIcon(getClass().getResource("/client/image/bg.jpg"));
        setLayout(new WrapLayout(WrapLayout.LEFT, 10, 10));
    }
}

