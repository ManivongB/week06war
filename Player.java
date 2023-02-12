package week6CardGame;

import java.util.*;
public class Player {

	ArrayList <Integer> hand = new ArrayList<>();
	
	
	int score  ;
    String name;

    
    public Player (String name) {
	 this.name = name;
	  score = 0;
	 
	 
	 
 }
public String getName() {
	return name;
}
    
    public int flip () {
    
	while (hand.size() > 0) {
			return hand.get(0) + hand.remove(0);
	          
	
	}	return hand.size();
		 
			
		 }
		
	 
    


 
public void draw (Deck card) {
	 
	
	
	 hand.add(card.draw());
			
	
	
		
	 
	 
 }
	public void describe () {
		
		Deck deck = new Deck();
		
	 System.out.println(name + " " +  score + " " + hand );
	}
	


public int incrementScore() {
 return	score++ ;
}
	
}
