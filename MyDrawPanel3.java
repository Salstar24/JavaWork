import java.awt.*;
import javax.swing.*;

class MyDrawPanel3 extends JPanel {
	Color randomColor;
	
	public void paintComponent(Graphics g) {
		g.fillRect(0,0,this.getWidth(), this.getHeight());
		Color randomColor = RCG.getRandomColor();
		g.setColor(randomColor);
		g.fillOval(70,70,100,100);
	}	
}