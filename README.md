# example_roulette
Lucas Donaldson (lad47) and Tyler Webner (tlw37)
Program to refactor that plays a game of roulette
## Refactor the Code
1. Bet should implement methods to replace all of the if cases in
Game.java.
2. Game should no longer keep a list of the different kinds of bets,
but should have a method that acquires such a list from Bet.java.
3. The Bet super-class should completely implement all of the getters
for returning instance variables, as well as a method to create the 
list of existing bet types.
4. The Game class should create the correct Bet class by referencing 
the index of the list of Bets acqured from the Bet class. 

## Add New Features
1. The refactored code does not contain the confusing if cases in 
Game.java.
2. The refactored code has more classes and methods.
3. We traded conciseness for flexibility.
4. We prefer the new code, because it is easier to extend.