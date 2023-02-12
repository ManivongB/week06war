package week6CardGame;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	

	      // Lets get Players Name
	      Scanner sinput= new Scanner(System.in); //System.in is a standard input stream
	      
	      System.out.println(" ");
	      System.out.println(" Who is our First Player (Name): ");
	      String pl1= sinput.nextLine();              //Get Player Name
	      System.out.println(" ");
	      System.out.println(" ");
	      System.out.println(" Who is our Second Player (Name): ");
	      String pl2= sinput.nextLine();              //Get Player Name
	      
	      
	   //Instantiates a deck and two players   
		Deck deck = new Deck();
		Player player1 = new Player(pl1);
		Player player2 = new Player(pl2);
		
		System.out.println(" Lets Have Some Fun ");
		deck.shuffle();
	
	// player1.describe();
	 System.out.println("---------------------------");
	// player2.describe();
	 
	 
	 System.out.println("---------------------------");
	 
	
		for (int i = 0; i <= 26; i++) {
			player1.draw(deck);
			
			player2.draw(deck);
			
		}
		 
			
		for (int i= 0; i <= 26; i++) {
			player1.flip();
		    player2.flip();
		
		  
	// A while loop to continue while players have cards in hand 
		    
	while((player1.hand.size() > 0 ) && (player2.hand.size() > 0)) {
		if(player1.flip() > player2.flip()) {
			player1.incrementScore();
			player1.describe();
		
		} else if (player2.flip() > player1.flip()) {
					player2.incrementScore();
					player2.describe();
		}
		
		else
			
		
		
		player1.describe();
		player2.describe();
	
		
		if (player1.score > player2.score) {
				System.out.println(player1.getName() + " "+ " Wins");
				System.out.println("---------------------------");
			}
			else if (player2.score > player1.score) {
				System.out.println(player2.getName() + "  "+ " Wins");
				System.out.println("---------------------------");
			}else {
				System.out.println("Draw");
				System.out.println("---------------------------");
			}
		}	
				
	
		
		
	}
		// Prints out each player and their score 
	System.out.println(player1.getName() + " score: " + player1.score);
	System.out.println(player2.getName() + " score: " + player2.score);
	
}
	
	}

