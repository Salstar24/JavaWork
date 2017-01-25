import javax.swing.*;
import java.awt.*;

public class SimpleAnimation extends MySwingScaffold {
	
	int x = 70;
	int y = 70;
	
	public static void main (String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void setUp() {
		DrawPanel dp = new DrawPanel();
		
		frame.getContentPane().add(dp);
		frame.setSize(300,300);
		
		for (int i = 0; i < 130; i++) {
			x++;
			y++;
			
			dp.repaint();
			
			try {
				Thread.sleep(200);
			} catch(Exception ex) {}
		}
	}
	
	class DrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			
			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
		}
	}
}