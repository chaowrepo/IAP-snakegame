/**
 * @author Chaowarat Tangrueng
 * @since 18/08/2011
 * @note NetBeans 7.0.1
 * @note Windows 7 Professional x64
 * @Purpose:create JLayeredPane for insert background image to Board
 * @Contract: NewPane() => JLayeredPane
 */
package guisnakegame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class BackGround {

    private BackgroundPanel backgroundPanel;

    public JPanel NewPane() {
        backgroundPanel = new BackgroundPanel("background1.png");
        backgroundPanel.setOpaque(true);
        backgroundPanel.setLocation(0, 0);

        JPanel bgPane = new JPanel();
        bgPane.setLayout(new GridLayout());
        bgPane.add(backgroundPanel);
        bgPane.setOpaque(true);
        bgPane.setPreferredSize(new Dimension(700, 670));

        return bgPane;
    }
    public JPanel NewPane(String dir,int x,int y,boolean Opaque) {
        
        backgroundPanel = new BackgroundPanel(dir);
        backgroundPanel.setOpaque(true);
        backgroundPanel.setBackground(new Color(0, 0, 0, 0));
        //backgroundPanel.setBackground(Color.ORANGE);
        backgroundPanel.x = x;
        backgroundPanel.y = y;
        JPanel bgPane = new JPanel();
        bgPane.setLayout(new GridLayout());
        bgPane.add(backgroundPanel);
        
        bgPane.setOpaque(Opaque);
        //bgPane.setLocation(x, y);
        bgPane.setPreferredSize(new Dimension(600, 600));

        return bgPane;
    }
}