import java.awt.BorderLayout;

public class MessyGui extends MySwingScaffold {
	
	public static void main(String[] args) {
		MessyGui mg = new MessyGui();
		mg.go();
	}
	
	// Overriding my parent to add widgets and stuff
	public void setUp() {
		MyDrawPanel5 mdp = new MyDrawPanel5();
		MyButton button = new MyButton();
		button.setText("Change colours!");
		button.setFrame(frame);
		button.register();
		
		frame.getContentPane().add(BorderLayout.CENTER, mdp);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(300, 300);
	}
	
	//Inner classes for Color button and Label button (and label itself??)
	class ColorListenerButton implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}
	
}