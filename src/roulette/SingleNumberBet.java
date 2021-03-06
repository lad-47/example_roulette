package roulette;

import roulette.Wheel.SpinResult;
import util.ConsoleReader;

public class SingleNumberBet extends Bet {

	public SingleNumberBet(String description, int odds) {
		super(description, odds);
	}
	
	@Override
	public String placeBet() {
		return Integer.toString(ConsoleReader.promptRange("Please bet", 1, Wheel.NUM_SPOTS-1));
	}
	
	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() == Integer.parseInt(betChoice));
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
