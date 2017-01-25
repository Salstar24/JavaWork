public class SimpleDotComGame {
	public static void main (String[] args) {
		//DECLARE an int variable to hold the number of user guesses, named 'numOfGuesses', set it to 0
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		//MAKE a new SimpleDotCom instance
		SimpleDotCom theDotCom = new SimpleDotCom();
		//COMPUTE a random number between 0 and 4 that will be the starting location cell position
		int startNum = (int) (Math.random() * 5) ;
		//MAKE an int array with 3 ints using the randomly-generated number, that number incremented by 1, and that number incremented by 2 
		int[] loc = {startNum, startNum + 1, startNum + 2};
		//INVOKE the setLocationCells() method on the SimpleDotCom instance
		theDotCom.setLocationCells(loc);
		//DECLARE a boolean variable representing the state of the game, named isAlive, SET it to true
		boolean isAlive = true;
		//WHILE the dot com is still alive
		while(isAlive == true){
			//GET user input from the command line
			String stringGuess = helper.getUserInput("Enter a number: ");
			// CHECK the user guess			
			//INVOKE the checkYourself() method on the SimpleDotCom instance
			String result = theDotCom.checkYourself(stringGuess);
			//INCREMENT numOfGuesses variable
			numOfGuesses++;
			//CHECK for dot com death
			
			//IF result is 'kill'
			if (result.equals("kill")){
				//SET isAlive to false
				isAlive = false;
				//PRINT the number of user guesses
				System.out.println("You used " + numOfGuesses + " guesses.");
			}
		}
	}
}