package roulette;

import util.ConsoleReader;

public class OddOrEvenBet extends Bet {

	public OddOrEvenBet(String description, int odds) {
		super(description, odds);
	}
	
	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
