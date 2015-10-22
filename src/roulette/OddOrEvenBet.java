package roulette;

import roulette.Wheel.SpinResult;
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

    @Override
    public void place () {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isMade (SpinResult spinResult) {
        // TODO Auto-generated method stub
        return false;
    }
}
