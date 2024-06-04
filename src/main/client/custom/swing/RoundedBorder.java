package client.custom.swing;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Custom class for a button with a rounded border that changes color based on mouse state.
 */
public class RoundedBorder extends JButton {
    private Color color = new Color(255, 194, 15);          // Initial background color (Yellow)
    private Color colorOver = new Color(179, 250, 160);     // Color when mouse is over (Light Green)
    private Color colorClick = new Color(13, 13, 13);       // Color when mouse is pressed (Almost Black)
    private Color borderColor = new Color(255, 194, 15);    // Border color (Yellow)
    
    private int radius = 30;  // Radius for rounded corners

    public RoundedBorder() {
        super();
        setBackground(color);
        setContentAreaFilled(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorOver);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(e.getComponent().contains(e.getX(), e.getY()) ? colorOver : color);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        g2.setColor(Color.white);  // Set text color
        g2.setFont(new Font("SansSerif", Font.BOLD, 16));  // Set font
        FontMetrics metrics = g2.getFontMetrics();
        int x = (getWidth() - metrics.stringWidth("Ajouter")) / 2;
        int y = (getHeight() - metrics.getHeight()) / 2 + metrics.getAscent();

        // Draw string in the center
        g2.drawString("Ajouter", x, y);
        g2.dispose();
    }
}
