/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card twoClub = new Card("Clubs", "2", 2);
		Card jHeart = new Card("Hearts", "Jack", 11);
		Card nineDiam = new Card("Diamonds", "9", 9);

		System.out.println(twoClub.toString());
		System.out.println(jHeart.toString());
	}
}
