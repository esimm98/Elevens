/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 4;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		// System.out.println("Results of " + SHUFFLE_COUNT +
		// 						 " consecutive perfect shuffles:");
		// int[] values1 = {0, 1, 2, 3};
		// for (int j = 1; j <= SHUFFLE_COUNT; j++) {
		// 	perfectShuffle(values1);
		// 	System.out.print("  " + j + ":");
		// 	for (int k = 0; k < values1.length; k++) {
		// 		System.out.print(" " + values1[k]);
		// 	}
		// 	System.out.println();
		// }
		// System.out.println();

		// System.out.println("Results of " + SHUFFLE_COUNT +
		// 						 " consecutive efficient selection shuffles:");
		// int[] values2 = {0, 1, 2, 3};
		// for (int j = 1; j <= SHUFFLE_COUNT; j++) {
		// 	selectionShuffle(values2);
		// 	System.out.print("  " + j + ":");
		// 	for (int k = 0; k < values2.length; k++) {
		// 		System.out.print(" " + values2[k]);
		// 	}
		// 	System.out.println();
		// }
		// System.out.println();

		int[] arr1 = {1, 3, 5, 9};
		int[] arr2 = {5, 3, 9, 1};
		System.out.println(arePermutations(arr1, arr2));
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int k = 0;
		for (int j = 0; j < (values.length + 1) / 2; j++) {
			shuffled[k] = values[j];
			k += 2;
		}
		k = 1;
		for (int j = values.length / 2; j < values.length; j++) {
			shuffled[k] = values[j];
			if (k + 2 <= values.length) k += 2;
		}

		for (int i = 0; i < values.length; i++) {
			values[i] = shuffled[i];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		for (int k = values.length - 1; k >= 0; k--) {
			int r = (int) Math.random() * (k + 1);
			int kVal = values[k];
			values[k] = values[r];
			values[r] = kVal;
		}
	}

	public static String flip() {  
		if (Math.random() > 0.3333) return "heads";  
		return "tails";  
	}

	public static boolean arePermutations(int[] arr1, int[] arr2) {
		boolean there = false;
		for (int val1 : arr1) {
			for (int i = 0; i < arr2.length; i++) {
				if (val1 == arr2[i]) there = true;
				if (there == false && i == arr2.length - 1) return false;
				if (i == arr2.length - 1) there = false;
			}
		}
		return true;
	}
}