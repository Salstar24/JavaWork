public class TestMontyHallGame {
	
	MontyHallGame game = new MontyHallGame();
	MontyGameHelper helper = new MontyGameHelper();

	public void testGetDoorForName() {
		game.setUpGame();
		Door door = game.getDoorForName("Door One"); 
		System.out.println(door);
	}
	
	public void testMontyGameHelper() {
		System.out.println(helper.getUserInput("Anything at all"));
	}
	
	public static void main (String[] args) {
		TestMontyHallGame test = new TestMontyHallGame();
		test.testGetDoorForName();
		test.testMontyGameHelper();
	}
}