import java.util.*;

public class MontyHallGame {
	
	private MontyGameHelper helper = new MontyGameHelper();
	private RandomNumberGenerator rng = new RandomNumberGenerator();
	private ArrayList<Door> doors = new ArrayList<Door>();
	private Door chosenDoor;
	private Door remainingDoor;
	private Door revealedDoor;
	
	public void setUpGame() {
		Door one = new Door();
		Door two = new Door();
		Door three = new Door();
		
		one.setName("Door One");
		two.setName("Door Two");
		three.setName("Door Three");
		
		doors.add(one);
		doors.add(two);
		doors.add(three);
		
		//Random assignment of a goat to one door and nothing to the others
		int randomNumber;
		randomNumber = rng.randNum(0, 2);
		Door chosenDoor = doors.get(randomNumber);
		for (Door eachDoor : doors) {
			if (eachDoor.equals(chosenDoor)) {
				eachDoor.setHiddenObject("goat");
			} else {
				eachDoor.setHiddenObject("a whole lot of nothing"); //Is this bit even used? Remove it?
			}
		}
	}
	
	private void showInitialInstructions() {
		//Print out instructions to the player
		System.out.println("Welcome to Monty Hall's famous game show!");
		System.out.println("In front of you are three doors, each exactly the same.");
		System.out.println("Behind one of the doors is your prize: a goat. You really want that goat.");
	}
	
	private void firstGuess() {
		String userGuess = helper.getUserInput("Enter a guess (Door One, Door Two, Door Three): ");
		makeDoorChoice(userGuess);
	}
	
	public void makeDoorChoice(String doorName) {
		chosenDoor = getDoorForName(doorName);
	}
	
	private void secondGuess() {
		String secondUserGuess = helper.getUserInput("Enter your second guess from the remaining two doors - either sticking with the same again or switching to the other closed door:");
		makeDoorChoice(secondUserGuess);
	}
	
	//A separate identifyDoor() method just to assign which one is the chosenDoor, which one the prize door, and which one should therefore be revealedDoor?
	
	private Door getDoorForName(String name) {
		for (Door eachDoor : doors) {
			if (eachDoor.getName().equals(name)) {
				return eachDoor;
			}
		}
		return null;
	}
	
	public void stickOrSwitch() {
		//If chosenDoor has the prize, pick one to view at random from the other two
		String behindDoor = chosenDoor.getHiddenObject();
		
		ArrayList<Door> remainingDoors = new ArrayList<Door>();
		remainingDoors.addAll(doors);
		remainingDoors.remove(chosenDoor);
		
		if (behindDoor.equals("goat")) {
			int c = rng.randNum(0,1);
			revealedDoor = remainingDoors.get(c);
			int rD = c == 0 ? 1 : 0;
			remainingDoor = remainingDoors.get(rD);
		} else { //If chosenDoor has not got the prize, carefully pick the other door that doesn't have the prize to show
			if (remainingDoors.get(0).getHiddenObject().equals("goat")) {
				revealedDoor = remainingDoors.get(1);
				remainingDoor = remainingDoors.get(0);

			} else {
				revealedDoor = remainingDoors.get(0);
				remainingDoor = remainingDoors.get(1);
			}
		}
	}
	
	public void switchDoor() {
		chosenDoor = remainingDoor;
	}
	
	private void stickOrSwitchInstructions() {
			//Show the contestant one door of emptiness (remove it as an option)
		System.out.println("Monty Hall opens " + revealedDoor.getName() + ". There is nothing behind it."); //Can I do string interpolation?
		//State which doors are left to choose from, ask if they want to stick or switch
		System.out.println("So, you can either stick with your " + chosenDoor.getName() + " or switch to " + remainingDoor.getName() + " What would you like to do?");
	}
	
	private void finishGame() {
		if (didIWin()) {
			System.out.println("Congratulations! The door opens and reveals the treasured goat. Well done! You win!");
		} else {
			System.out.println("Sorry. The door opens and there is nothing behind it! Weep! Weep, my friend!");
		}
	}
	
	public boolean didIWin() {
		String prize = chosenDoor.getHiddenObject();
		boolean iWon = false;
		if (prize.equals("goat")) {
			iWon = true;
		} 
		return iWon;
	}
	
	public static void main (String[] args)	{
		// Plays the game interactively
		MontyHallGame game = new MontyHallGame();
		game.setUpGame();
		game.showInitialInstructions();
		game.firstGuess();
		game.stickOrSwitch();
		game.stickOrSwitchInstructions();
		game.secondGuess();
		game.finishGame();
	}
}