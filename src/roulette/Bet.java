package roulette;

import java.util.List;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet {
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
     * @return amount to pay out for winning this bet
     */
    public int payout (int wager) {
        return myOdds * wager;
    }
    
    public Bet getBet(int index) {
    	return myBets[index];
    }

    /**
     * @return string representation of this bet
     */
    public String toString () {
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

    /**
     * Place bet by prompting user for the specific information need to complete this bet.
     */
    public abstract void place ();

    /**
     * Checks if bet is won or lost given result of spinning the wheel.
     *
     * @param wheel information needed to check if bet won or lost
     */
    public abstract boolean isMade (Wheel.SpinResult spinResult);
}
