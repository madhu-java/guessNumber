import java.util.Scanner;

public class Player {
	String playerName;
	int playerGuessNumber;
	Player(String palyerName){
		this.playerName = palyerName;
	}
	Scanner scanner = new Scanner(System.in);
	public int getPlayerGuessNumber() {
		boolean guessInRange = false;
		while(!guessInRange) {
		System.out.println(this.playerName+" please guess a number between 1-10");
		playerGuessNumber = scanner.nextInt();
		if(playerGuessNumber >=1 && playerGuessNumber<=10) {
			guessInRange=true;
		}
		
		
		}
		return playerGuessNumber;
	}

}
