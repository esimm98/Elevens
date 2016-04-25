# Elevens

## A2

1. A deck is an object that contains many card objects, one for each value of each suit
2. 6 cards
3. ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"}
suits = {"spades", "hearts", "diamonds", "clubs"}
pointValues = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}.
Yes, the order of these arrays does matter, the ranks and pointValues must match in order to create cards of the proper values. 

## A3

1. ```java
public static String flip() {  
	if (Math.random() > 0.3333) return "heads";  
	return "tails";  
}
```

2. ```java
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
```

3. 0, 1, 1, 0 is one of the possible sequences of integers.

## A6

1. For a board of: 5♠ 4♥ 2♦ 6♣ A♠ J♥ K♦ 5♣ 2♠
You can remove 6♣ and (5♠ or 5♣)

2. Yes, because all other cards have to be removed in pairs, so if only those were removed, there would be an even number of cards left, and the J, Q, and K have to be removed in those sets of 3, so that is the only way to leave an odd number of cards.

3. No, this game does not involve any strategy, if you have multiple available moves, it doesn't matter what order you make them, because either way you will have the same number of new cards dealt after you makes those moves. And the positions of the cards you remove don't matter either, because the next card in the deck will just be dealt out no matter what, so that order won't change either.

## A7

1. You need a deck of 52 playing cards.
private Card[] cards and private Deck deck

2. Check if there is a J, Q, and K, remove them.
Repeat until there are no more of these sets
Check for a pair that adds up to 11, remove it.
Repeat until there are no more pairs.

Repeat this whole process until neither of those are true.

3. Yes, the ElevensBoard class does contain the necessary state and behavior.

4.
  a. dealMyCards is called in the ElevensBoard constructor, after the cards and deck are created.

  b. isLegal and anotherPlayIsPossible() should call the containsPairSum11 and containsJQK methods.

  c. cardIndexes will return the list with J♥ 6♣ 2♠ A♠ 4♥

  d. ```java
  public static printCards (ElevensBoard board) {
		List<Integer> cIndexes = board.cardIndexes();
		for (int i = 0; i < cIndexes.size(); i++) {
			System.out.println(cards.get(i).toString());
		}
	}
	```

	e. anotherPlayIsPossible needs to call cardIndexes before containsPairSum11 and containsJQK. Because it has check the entire board to run, not just go through the selected cards.
