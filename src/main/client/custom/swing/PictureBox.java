/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client.custom.swing;

/**
 *
 * @author pc
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

public class PictureBox extends JLayeredPane {

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
         repaint();
    }

    private Icon image;

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if (image != null) {
            Graphics2D g2 = (Graphics2D) grphcs;
            Rectangle size = getAutoSize(image);
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            Image img = toImage(image);

            // Utiliser un rectangle avec des coins arrondis
            RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(
                size.x, size.y, size.width, size.height, 20, 20
            );
            g2.setClip(roundedRectangle);
            g2.drawImage(img, size.x, size.y, size.width, size.height, this);
            g2.setClip(null);
        }
    }

    private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int minDimension = Math.min(w, h); // Use the smallest dimension for a square
        int x = (w - minDimension) / 2;
        int y = (h - minDimension) / 2;
        return new Rectangle(x, y, minDimension, minDimension);
    }




    private Image toImage(Icon icon) {
       if (icon instanceof ImageIcon) {
            return ((ImageIcon) icon).getImage();
        }
        // Gérer d'autres types d'icônes si nécessaire
        return null;
    }
}

