package roulette;

import roulette.Wheel.SpinResult;
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
