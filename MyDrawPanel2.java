import java.awt.*;
import javax.swing.*;

class MyDrawPanel2 extends JPanel {
	public void paintComponent(Graphics g) {
		Image image = new ImageIcon("4.jpg").getImage();
		g.drawImage(image, 7, 8, this);
	}
}