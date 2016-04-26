# A8

## Questions

1. Elevens, Thirteens, and Tens all have a board, have to add up pairs of cards for a certain sum, and cards that can just be removed in sets. But they're different in which kind of cards can be removed, whether as a set, or the necessary sum from the pairs.

2. The Board instance variables are initialized as as the cards and deck, with size, ranks, suits, and pointValues passed into the constructor.

3. The abstract methods for Board are isLegal and anotherPlayIsPossible. They are simply declared without anything to actually run for it. Then ElevensBoard simply checks those cards specifically for the sum of 11, or JQK set. Yes, this covers the differences discussed earlier, as these methods cover the different possible combinations of legal moves, which is what changes between the games. 