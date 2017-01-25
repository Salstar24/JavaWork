public class PhraseOMatic {
	public static void main (String[] args){
		String[] wordListOne = {"24/7", "win-win", "multi-tier", "30,000 foot", "customer-centric", "B-to-B", "pervasive"};
		String[] wordListTwo = {"empowered", "sticky", "outside-the-box", "clustered", "aligned", "sticky"};
		String[] wordListThree = {"process", "tipping-point", "mindshare", "space", "vision", "paradigm", "mission"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("What we need is a " + phrase);
		
	}
	
}