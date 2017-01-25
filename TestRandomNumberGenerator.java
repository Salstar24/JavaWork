public class TestRandomNumberGenerator {
	RandomNumberGenerator rng = new RandomNumberGenerator();
	
	public void testOutput(int lowerBound, int upperBound) {
		int output = rng.randNum(lowerBound, upperBound);
		if ((output < lowerBound) && (output > upperBound)) {
			System.out.println("You fucked up! Heeheehee!");
		}
		System.out.print(output + " ");
	}
	
	
	public static void main (String [] args) {
		TestRandomNumberGenerator tester = new TestRandomNumberGenerator();
		for (int x = 0; x < 100; x++) {
			tester.testOutput(3, 5);
		}
	}
}