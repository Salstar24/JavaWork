import java.awt.Color;

/* Random Colour Generator */
public class RCG {
	public static Color getRandomColor() {
		int red = getRandomNumber(256);
		int green = getRandomNumber(256);
		int blue = getRandomNumber(256);
		
		return new Color(red, green, blue);
	}
	
	public static int getRandomNumber(int upToButNotIncluding) {
		return (int) (Math.random() * upToButNotIncluding);
	}
}
