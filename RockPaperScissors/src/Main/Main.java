package Main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int choice,compChoice;
	public static void main(String[] args) {
     newGame();
		
	}
	public static void newGame() {
		if(choice != 1 || choice != 2 || choice != 3 ) {
			getInput();
		}
		compChoice = getRandomNumber(1,3);
		
	     stateChoice(choice);
	     stateChoice(compChoice);

		
	     getResults(choice,compChoice);
		 
		
	}
	public static void stateChoice(int c) {
		switch(c) {
		case 1: System.out.println("ROCK!"); break;
		case 2: System.out.println("PAPER!"); break;
		case 3: System.out.println("SCISSORS!"); break;
		}
		
	}
	public static void getResults(int A, int B) {
	  int Winner = 0;
	  if (A == B){
		  Winner = 0;
	  }else if(A==1 && B==2) {
		  Winner = 2;
	  }else if(A==2 && B==3) {
		  Winner = 2;
	  }else if(A==3 && B==1) {
		  Winner = 2;
	  }else { Winner = 1;}
	  
		switch(Winner) {
		case 0: System.out.println("Draw!"); break;
		case 1: System.out.println("You Win!"); break;
		case 2: System.out.println("You Lose!"); break;
		
		}
		 System.out.println(" ");
	
	  newGame();
	}
    
    public static void getInput() {
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in) ;
		System.out.print("Rock(1),Paper(2),Scissors(3)?");
		choice = input.nextInt();
		if(choice<1 || choice>3) {
			System.out.println("Invalid Choice");
			getInput();
			
		}

    }
    
	public static int getRandomNumber(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt(max-min + 1) + min;
		
		
	}

}
