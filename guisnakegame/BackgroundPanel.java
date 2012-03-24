package guisnakegame;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.net.URL;

import javax.swing.JPanel;

public class BackgroundPanel extends JPanel implements ImageObserver {
	private Image bgImage;
        int x=0,y=0;

	public BackgroundPanel(String fileName) {
		URL imgUrl = getClass().getResource(fileName);
		bgImage = Toolkit.getDefaultToolkit().getImage(imgUrl);
	}

	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		g.drawImage(bgImage, x, y, this);
	}
}