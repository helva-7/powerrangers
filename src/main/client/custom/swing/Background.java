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
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Background extends JPanel {

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }
    
      private void loadImage() {
        try {
            // Load the image (adjust the file path as necessary)
            URL imagePath = getClass().getResource("/client/image/bg.jpg");
            image = ImageIO.read(imagePath);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Background() {
        setOpaque(false);
        loadImage();
    }
    private int round = 20;
    private BufferedImage image;
    
   @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Paint the background with repeating image
        if (image != null) {
            int iw = image.getWidth();
            int ih = image.getHeight();
            for (int x = 0; x < getWidth(); x += iw) {
                for (int y = 0; y < getHeight(); y += ih) {
                    g2.drawImage(image, x, y, this);
                }
            }
        }

        g2.setColor(new Color(255, 255, 255, 50)); // Semi-transparent white overlay
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), round, round);
        g2.dispose();
    }
} 

