import java.util.Scanner;
import java.util.Random;

public class NigiriB {
	
	static int blackTake;
	static int whiteTake;

	public static void main(String[] args) {
		
		System.out.println("Nigiri - Cai xian - Tol kariki");
		System.out.println();
		System.out.println("First player to pick 1 or 2 black stones,");
		System.out.println("make your choice:");
		
		Scanner blackChoice = new Scanner(System.in);
		
		blackTake = blackChoice.nextInt();
		
		if (blackTake == 1) {
			System.out.println("You take " + blackTake + " black stone.");
	        
		}
		else if (blackTake == 2) {	
			System.out.println("You take " + blackTake + " black stones.");
			
		}
		else {
			System.out.println("You must pick 1 or 2 black stones.");
			return;
			
		}
			 
			 
		int whiteTake = (int)(Math.random() * 20 + 1);
		
		if ((whiteTake % 2) == 0) {
			System.out.println();
			System.out.println("Other player take " + whiteTake + " white stones.");
			
			if (blackTake == 1) {
				System.out.println();
				System.out.println("You lose! :(");
				System.out.println("You will play with white stones.");
			}	
			else {
				System.out.println();
				System.out.println("You win! :)");
				System.out.println("You will play with black stones.");
			}
			}
		 else {
			System.out.println();
			System.out.println("Other player take " + whiteTake + " white stones.");
			
			if (blackTake == 2) {
				System.out.println();
				System.out.println("You lose! :(");
				System.out.println("You will play with white stones.");
			}	
			else {
				System.out.println();
				System.out.println("You win! :)");
				System.out.println("You will play with black stones.");
			}
	     }

	}
}	
