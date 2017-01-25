import java.util.ArrayList;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	//public Setter method for GameHelper?
	//public Setter method for dotComsList?
	//public Setter method for numOfGuesses?
	
	private void setUpGame() { //make three DotCom objects and name them
		DotCom one = new DotCom();
		DotCom two = new DotCom();
		DotCom three = new DotCom();
		one.setName("Pets.com"); //is this a method in the DotCom class? I think so.
		two.setName("eToys.com");
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, and Go2.com.");
		System.out.println("Try to sink them all in the fewest number of guesses!");
		
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess:");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
				
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		for (int x = 0; x < dotComsList.size(); x++) {
			result = dotComsList.get(x).checkYourself(userGuess);
			if (result.equals("hit")){
				break;
			}
			if (result.equals("kill")){
				dotComsList.remove(x);
				break;
			}
		}
		System.out.println(result);
	} 
		
	private void finishGame() {
		System.out.println("All Dot Coms are dead! Your stock is now worthless. Well done.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses to finish.");
			System.out.println("You got out before the bubble burst and don't go bankrupt, congratulations!");
		} else {
			System.out.println("Well it took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Your business sinks without trace as the bust sets in. Byeeeee!");
		}
	}
				
	public static void main (String[] args)	{
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}