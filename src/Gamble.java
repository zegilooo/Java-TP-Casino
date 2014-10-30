import java.util.Random;

public class Gamble {
	
	private Random generator = new Random();
	private int money;
	//private int playerAmountBet;
	private boolean player_bet;
	private boolean game_result;
	
	public Gamble(int m){
		this.money = m;
	}	
	
	public void recover_money(int r){
		this.money -= r;
	}
	
	public void give_money(int r){
		this.money += r;
	}
	
	public boolean bet(boolean headOrTail){
		this.player_bet = headOrTail;
		return(this.money != 0);
	}
	
	public boolean has_won(){
		this.game_result = generator.nextBoolean();
		return (this.player_bet == this.game_result);
	}
	
	public String toString(){
		// 'tail' is true and 'head' is false
		String str_player_bet = (this.player_bet)?"tail":"head";
		String str_result = (this.game_result)?"tail":"head";
		return "Player bet " + str_player_bet + " and game result was "+
				str_result+"\n"+Integer.toString(this.money)+" money left.";
	}
	
}
