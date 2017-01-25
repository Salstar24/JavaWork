public class RandomNumberGenerator {
	
	public static int randNum(int lowerBound, int upperBound) {
	int randomNumber;
	randomNumber = (int) ((Math.random() * ((upperBound + 1) - lowerBound)) + lowerBound);
	return randomNumber;	
	}
}