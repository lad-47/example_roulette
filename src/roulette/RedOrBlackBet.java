package roulette;

import util.ConsoleReader;

public class RedOrBlackBet extends Bet {

	public RedOrBlackBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return myWheel.getColor().equals(betChoice);
	}
}
