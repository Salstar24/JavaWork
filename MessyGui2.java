import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessyGui2 extends MySwingScaffold {
	private JLabel label;
	
	public static void main(String[] args) {
		MessyGui2 mg = new MessyGui2();
		mg.go();
	}
	
	// Overriding my parent to add widgets and stuff
	public void setUp() {
		MyDrawPanel5 mdp = new MyDrawPanel5();
		
		MyButton button = new MyButton();
		button.setText("Change colours!");
		button.addActionListener(button);
		
		LabelListener labelButton = new LabelListener();
		labelButton.setText("Change the label");
		labelButton.addActionListener(labelButton);
		
		label = new JLabel("I'm a label");
		
		frame.getContentPane().add(BorderLayout.CENTER, mdp);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(300, 300);
	}
	
	class MyButton extends JButton implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}
	
	class LabelListener extends JButton implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Ouch!");
		}
	}
}