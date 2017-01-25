public class BeerSong {
	public static void main (String[] args) {
		int bottles = 99;
		while (bottles > 1) {
			System.out.println(bottles + "bottles of beer on the wall, " + bottles + " bottles of beer! We take one down and spin it around, now ");
			bottles = bottles - 1;
			System.out.print(bottles + " bottles of beer!");
		}
		if (bottles == 1){
			System.out.println(bottles + "bottle of beer on the wall, " + bottles + "bottle of beer! Take it down, spin it around, no more bottles of beer!");
		}
	}
}