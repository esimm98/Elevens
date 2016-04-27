# A9

## Questions

1. Size is not an abstract method because the size in Board is just the length of the cards array, which is the same for all games. The BOARD_SIZE is just defined as a constant for the ElevensBoard.java

2. There are no abstract methods for selection of cards because that works exactly the same way for all the games. The only variation is in the isLegal method checking for the proper number of selected cards.

3. This alternate design would not work as well, because this interface can't have any of its own code, so there would be plenty repeated throughout the different types of boards. It would be able to call isLegal and anotherPlayIsPossible polymorphically. The issue would just be with the actual shared code that is currently in the abstract Board class. 