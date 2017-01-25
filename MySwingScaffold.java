import javax.swing.JFrame;

public abstract class MySwingScaffold {

	JFrame frame = new JFrame();
	
	public void init() {
		frame.setTitle("My First Music Video");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setBounds(30,30,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void go() {
		init();
		setUp(); // Calls specific set up in the subclass
		display();
	}
	
	public abstract void setUp();
	
	public void display() {
		frame.setVisible(true);
	}
		
	
}
