import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer2 {
	static MyDrawPanel m1;
	
	public static void main(String[] args) {
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}
	
	public void go() {		
		MyGui gui = new MyGui();
		gui.go();
				
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(m1, eventsIWant);
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for (int i = 0; i < 60; i+=4) {
				int r = RandomNumberGenerator.randNum(1,50);
				track.add(makeEvent(144,1,r,100,i));
				track.add(makeEvent(176,1,127,0,i));
				track.add(makeEvent(128,1,r,100, i + 2));
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {	}
		return event;
	}
	
	class MyGui extends MySwingScaffold {
		public void setUp() {
			m1 = new MyDrawPanel();
			frame.setContentPane(m1);
			frame.setSize(400,400);
		}
	}
	
	class MyDrawPanel extends JPanel implements ControllerEventListener {
		boolean msg = false;
		
		public void controlChange(ShortMessage event) {
			msg = true;
			repaint();
		}
		
		public void paintComponent(Graphics g) {
			if (msg) {
				Graphics2D g2 = (Graphics2D) g;
				
				g.setColor(RCG.getRandomColor());
				
				int ht = RandomNumberGenerator.randNum(10,120);
				int width = RandomNumberGenerator.randNum(10,120);
				int x = RandomNumberGenerator.randNum(10,40);
				int y = RandomNumberGenerator.randNum(10,40);
				
				g.fillRect(x, y, width, ht);
				msg = false;
			}
		}
	}
}