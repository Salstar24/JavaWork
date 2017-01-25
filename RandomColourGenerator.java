import java.awt.*;

class RandomColorGenerator extends Color {
	public static Color randomColor = new RandomColorGenerator.setRandomColor();
	
	public static Color setRandomColor() {
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		randomColor = new Color(red, green, blue);
		return randomColor;
	}
	
}