public class AutoContestant {
	
	MontyHallGame game = new MontyHallGame();

	public boolean autoPlayGameStick() {
		game.setUpGame();
		game.makeDoorChoice("Door One");
		return game.didIWin();
	}
	
	public boolean autoPlayGameSwitch() {
		game.setUpGame();
		game.makeDoorChoice("Door One");
		game.stickOrSwitch();
		game.switchDoor();
		return game.didIWin();
	}
	
	public static void main (String[] args) {
		AutoContestant ac = new AutoContestant();
		int winCount = 0;
		for (int i = 0; i < 100; i++) {
			if (ac.autoPlayGameStick()) {
				winCount++;
			}
		}
		System.out.println("Out of 100 sticking attempts, the AutoContestant won " + winCount + " times");
		winCount = 0;
		for (int i = 0; i < 100; i++) {
			if (ac.autoPlayGameSwitch()) {
				winCount++;
			}
		}
		System.out.println("Out of 100 switching attempts, the AutoContestant won " + winCount + " times");
	
	}
}