/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"jack", "queen", "king"};
		String[] suits1 = {"spades", "hearts", "clubs"};
		int[] values1 = {11, 12, 13};
		String[] ranks2 = {"nine", "two", "seven"};
		String[] suits2 = {"diamonds", "hearts", "spades"};
		int[] values2 = {9, 2, 7};
		String[] ranks3 = {"ace", "two", "three"};
		String[] suits3 = {"hearts", "clubs", "diamonds"};
		int[] values3 = {1, 2, 3};


		Deck d1 = new Deck( ranks1, suits1, values1 );
		Deck d2 = new Deck( ranks2, suits2, values2 );
		Deck d3 = new Deck( ranks3, suits3, values3 );

		System.out.println(d1.isEmpty());
		System.out.println(d1.size());
		d1.shuffle();
		System.out.println(d1.deal());

		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
	}
}
