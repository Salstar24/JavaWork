import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

class MyDrawPanel5 extends JPanel {
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		Color startColor = RCG.getRandomColor();
		Color endColor = RCG.getRandomColor();
		
		GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(70,70,100,100);
	}
}