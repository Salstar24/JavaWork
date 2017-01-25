import java.awt.*;

class RCG {
		
	public static Color getRandomColor() {
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		Color randomColor = new Color(red, green, blue);
		return randomColor;
	}
	
}