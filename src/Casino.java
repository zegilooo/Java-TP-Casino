import java.util.Scanner;

public class Casino {

	public static void main(String[] args) {
		Gamble game = new Gamble(50);
		Scanner sc = new Scanner(System.in);
		String str;
		do{
			System.out.println("bet 0 for 'head', 1 for 'tail', "
					+ "anything else to stop playing.");
			str = sc.nextLine();
			if(str.equals("0") || str.equals("1")){
				// 'tail' is true and 'head' is false
				boolean bet = (str.equals("0"))?false:true;
				if(game.bet(bet)){
					if(game.has_won()){
						game.give_money(1);
					}else{
						game.recover_money(1);
					}					
				}
				System.out.println(game);
			}
		}while(str.equals("0") || str.equals("1"));

	}

}
