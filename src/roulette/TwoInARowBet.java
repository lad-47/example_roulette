package roulette;

import util.ConsoleReader;

public class TwoInARowBet extends Bet {

	public TwoInARowBet(String description, int odds) {
		super(description, odds);
	}
	
	@Override
	public String placeBet() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 2);
	}
	
	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 2);
	}

}