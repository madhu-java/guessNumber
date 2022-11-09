import java.util.Random;
import java.util.Scanner;

public class Guesser {
int guessNumber;
Scanner scanner = new Scanner(System.in);
public int getGuessNumber() {
	boolean guessInRange = false;
	while(!guessInRange) {
	System.out.println("Guesser please guess a number between 1-10");
//	Random random = new Random();
//	
//	System.out.println("random:"+random.nextInt(10));
	guessNumber = scanner.nextInt();
	if(guessNumber >=1 && guessNumber<=10) {
		guessInRange=true;
	}
	
	
	}
	return guessNumber;
}
}
