import java.util.Scanner;

public class Umpire {
	int guessNumber;
	int playerOneGuessNumber;
	int playerTwoGuessNumber;
	int playerThreeGuessNumber;
	int pOneScore;
	int pTwoScore;
	int pThreeScore;
	Guesser guesser = new Guesser();
	Player palyerOne = new Player("player-one");
	Player palyerTwo = new Player("player-two");
	Player palyerThree = new Player("player-three");

	public int guesserNumber() {
		//System.out.println("in guessNumber");
//		Guesser guesser = new Guesser();
		guessNumber = guesser.getGuessNumber();
		return guessNumber;

	}

	public int guessPlayerOneNumber() {
//		Player palyerOne = new Player("player-one");
		playerOneGuessNumber = palyerOne.getPlayerGuessNumber();
		return playerOneGuessNumber;
	}

	public int guessPlayerTwoNumber() {
//		Player palyerTwo = new Player("player-two");
		playerTwoGuessNumber = palyerTwo.getPlayerGuessNumber();
		return playerTwoGuessNumber;
	}

	public int guessPlayerThreeNumber() {
//		Player palyerThree = new Player("player-three");
		playerThreeGuessNumber = palyerThree.getPlayerGuessNumber();
		return playerThreeGuessNumber;
	}

	public void play(Umpire umpire) {

//		boolean exit=false;
//		while(!exit) {
//			exit= true;
		if (guessNumber == playerOneGuessNumber) {
			if (guessNumber == playerTwoGuessNumber && guessNumber == playerThreeGuessNumber) {
				pOneScore++;
				pTwoScore++;
				pThreeScore++;
			} else if (guessNumber == playerTwoGuessNumber) {
				pOneScore++;
				pTwoScore++;
			} else if (guessNumber == playerThreeGuessNumber) {
				pOneScore++;
				pThreeScore++;
			} else
				pOneScore++;
		} else if (guessNumber == playerTwoGuessNumber) {
			if (guessNumber == playerThreeGuessNumber) {
				pTwoScore++;
				pThreeScore++;
			} else
				pTwoScore++;

		} else if (guessNumber == playerThreeGuessNumber) {
			pThreeScore++;
		}
//		printScores();
//		System.out.println("Do you want to play again y/n?");
//		String s  = scanner.next();
//		if (s.toLowerCase()=="y") {
//			exit = false;
//			guesserNumber();
//			guessPlayerOneNumber();
//			guessPlayerTwoNumber();
//			guessPlayerThreeNumber();
//		}

	}

	public void printScores() {
		String winner = "";
		
		if (pOneScore > pTwoScore && pOneScore > pThreeScore) {
			winner = "player-one";
		} else if (pTwoScore > pThreeScore &&pTwoScore >pOneScore) {
			winner = "player-two";
		} else if (pThreeScore>pTwoScore &&pThreeScore >pOneScore) {
			winner = "player-three";
		}
		else if (pOneScore == pTwoScore) {
			if (pOneScore == pThreeScore) {
				winner = "player-one & player-two & player-three";
			} else{
				winner = "player-one & player-two";
			}
		} else if (pTwoScore == pThreeScore) {
			winner = "player-two & player-three";
		}else if (pOneScore == pThreeScore) {
			winner = "player-one & player-three";
			
		}
	
		System.out.println(winner + " won the game");
		System.out.println("player-one score:" + pOneScore);
		System.out.println("player-two score:" + pTwoScore);
		System.out.println("player-three score:" + pThreeScore);
		System.out.println();
	}

	public static void main(String[] args) {
		Umpire umpire = new Umpire();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			//System.out.println("exit=" + exit);
			exit = true;
			System.out.println("playing again");
			umpire.guesserNumber();
			umpire.guessPlayerOneNumber();
			umpire.guessPlayerTwoNumber();
			umpire.guessPlayerThreeNumber();
			umpire.play(umpire);
			umpire.printScores();
			System.out.println("Do you want to play again y/n?");
			String s = scanner.nextLine();
			if (s.toLowerCase().equals("y")) {
				exit = false;
				//System.out.println("exit:" + exit);
			}
			// umpire.printScores();

		}
	}
}
