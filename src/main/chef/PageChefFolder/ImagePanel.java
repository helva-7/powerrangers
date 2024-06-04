/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.chef.PageChefFolder;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
/**
 *
 * @author 21261
 */
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private Image backgroundImage;

    public ImagePanel() {
        
        initializeBackgroundImage();
        Dimension size = new Dimension(625, 584);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setLayout(null);
    }

    private void initializeBackgroundImage() {
        try {
            ImageIcon icon = new ImageIcon("src\\testappuniresto\\PageChefFolder\\Background2.jpeg");
            backgroundImage = icon.getImage();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Image not found");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        } else {
            System.out.println("No Image to display");
        }
    }
}
