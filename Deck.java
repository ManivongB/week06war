package week6CardGame;

import java.util.*;
import java.util.Map.Entry;
public class Deck {
HashMap <String, Integer> Cards = new HashMap<>();
ArrayList <Integer> deck = new ArrayList <>();
String [] suits = {"hearts", "clubs", "spades", "diamonds"};

public Deck (){
	for (int j= 0; j< 4; j++ ) {
		for(int i = 2; i <= 14; i++) {
		Card a = new Card(i,suits[j] );
		if (!Cards.containsKey(a)) {
				Cards.put(a.toString(), i);
			
		}
	}
	}
	}
public List<Integer> shuffle(){
	for(int i = 0; i < Cards.size(); i++) {
		deck.add(Cards.get(i).valueOf(i));
	}
Collections.shuffle(deck);
return deck;

}
public int draw () {
	deck.add(deck.remove(0));
	return(deck.get(51));
	
	
}


 public String describe(){
	
	 return   Cards.entrySet().toString(); 

 }
 }

