import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyButton extends JButton implements ActionListener {
	JButton button = new JButton("Change colors");
	private JFrame frame;
	
	public void register() {
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
	
	public void setFrame(JFrame frame){
		this.frame = frame;
	}
}