package roulette;

import java.util.List;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public class Bet {
    private String myDescription;
    private int myOdds;
    private Bet[] myBets;

    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds) {
        myDescription = description;
        myOdds = odds;
    }

    public void makeMyBets() {
    	myBets = new Bet[] { 
                new RedOrBlackBet("Red or Black", 1),
                new OddOrEvenBet("Odd or Even", 1),
                new ThreeInARowBet("Three in a Row", 11),
                new HighLowBet("High or Low", 1),
                new TwoInARowBet("Two in a Row", 17),
                new SingleNumberBet("Single Number", 35)
            };
    }
    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
        return myOdds;
    }
    
    public Bet getBet(int index) {
    	return myBets[index];
    }

    /**
     * @return name of this kind of bet
     */
    public String getDescription () {
        return myDescription;
    }
    
    public Bet[] getMyBets() {
    	return myBets;
    }
    
    public String placeBet() {
    	return "";
    }
    
    public boolean betIsMade(Wheel myWheel, String betChoice) {
    	return false;
    }
}
