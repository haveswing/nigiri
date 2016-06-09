import java.util.Scanner;
import java.util.Random;

public class NigiriW {
	
	static int blackTake;
	static int whiteTake;
	
	public static void main(String[] args) {
		
		System.out.println("Nigiri - Cài xiàn - Tol kariki");
		System.out.println();
		System.out.println("First player to pick 1 or 2 black stones,");
		
		int blackTake = (int)(Math.random() * 2 + 1);
		System.out.println();
		System.out.println("Black stones picked.");
		System.out.println();
		System.out.println("How many white stones want to pick?");
		System.out.println("(min.1 - max. 20):");
		
        Scanner whiteChoice = new Scanner(System.in);
		
		whiteTake = whiteChoice.nextInt();
		
		if (whiteTake >= 21) {
			System.out.println("You must pick min.1/max.20 white stones.");
			return;
		     }
		else {
			System.out.println("You have picked " + whiteTake + " white stones.");
			
	         }
		if (blackTake == 1) {
			System.out.println();
			System.out.println("Other player take " + blackTake + " black stone.");
			}
		else {
			System.out.println();
		    System.out.println("Other player take " + blackTake + " black stones.");
		    }
		
		if ((whiteTake % 2) == 0) {
			
			if (blackTake == 1) {
				System.out.println();
				System.out.println("You win! :)");
				System.out.println("You will play with black stones.");
			}	
			else {
				System.out.println();
				System.out.println("You lose! :(");
				System.out.println("You will play with white stones.");
			}
			}
		 else {
			
			if (blackTake == 2) {
				System.out.println();
				System.out.println("You win! :)");
				System.out.println("You will play with black stones.");
			}	
			else {
				System.out.println();
				System.out.println("You lose! :(");
				System.out.println("You will play with white stones.");
			}
	     }
		
}
}