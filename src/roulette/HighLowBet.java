package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet {

	public HighLowBet(String description, int odds) {
		super(description, odds);
	}
	
	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "high", "low");
	}
	
	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() >= 19 && betChoice.equals("high") ||
				myWheel.getNumber() <= 18 && betChoice.equals("low"));
	}

}
