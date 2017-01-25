public class SimpleDotComTestDrive {
	public static void main (String[] args){
		SimpleDotCom dot = new SimpleDotCom();
		
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if (result.equals("hit")){
			testResult = "passed";
		}
		System.out.println(testResult);
	}
}

// I think we also need to add what happens if the numOfHits reaches maximum and the dot com is killed