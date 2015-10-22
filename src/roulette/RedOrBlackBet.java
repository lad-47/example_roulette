package roulette;

import roulette.Wheel.SpinResult;
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
