import java.util.Random;

public class Gamble {
	
	private Random generator = new Random();
	private int money;
	//private int playerAmountBet;
	private boolean playerBet;
	private boolean gameResult;
	
	public Gamble(int m){
		this.money = m;
	}	
	
	public void recoverMoney(int r){
		this.money -= r;
	}
	
	public void giveMoney(int r){
		this.money += r;
	}
	
	public boolean bet(boolean headOrTail){
		this.playerBet = headOrTail;
		return(this.money != 0);
	}
	
	public boolean hasWon(){
		this.gameResult = generator.nextBoolean();
		return (this.playerBet == this.gameResult);
	}
	
	public String toString(){
		// 'tail' is true and 'head' is false
		String str_playerBet = (this.playerBet)?"tail":"head";
		String str_result = (this.gameResult)?"tail":"head";
		return "Player bet " + str_playerBet + " and game result was "+
				str_result+"\n"+Integer.toString(this.money)+" money left.";
	}
	
}
