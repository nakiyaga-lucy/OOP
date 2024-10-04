package guessinggame;
import java.util.Scanner;
public class Gessinggame {

	public static void main(String[] args) {
		int numberToguess=10;
		int guess;
		Scanner scanner=new
				Scanner(System.in);
		
		while(true) {
		System.out.print("Guess a number between 1-20:");
		guess= scanner.nextInt(); 
		
		if(guess==numberToguess) {
		System.out.println("Congratulations! You gussed it.");
		break;
		}else if(guess<numberToguess) {
        System.out.println("Too low.Try again");
		}else {
			System.out.println("Too high. Try again");
		}
	}
    scanner.close();

}
}