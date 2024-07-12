package Week06;

import java.util.ArrayList;							//imported arraylist
import java.util.Collections;						
import java.util.List;								//imported list

public class Deck {
	
	private List<Card> cards = new ArrayList<>();		//created new list of string called cards
	
	public Deck() {										//constructor called Deck
		
		String[] valueNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};			
		String[] suits = {"Hearts" , "Diamonds", "Clubs", "Spades"};					//values of the cards and the suits stored in arrays
		
		for (String suit : suits) {									//used an enhanced for loop to iterate over each suit in the suits array
			for (int i = 2; i <= 14; i++) {							//nested for loop iterates over the card values from 2 to 14
				String valueName = valueNames[i - 2];				//using this to get the correct index since we started at 2, as arrays start at 0
				String cardName = valueName + " of " + suit;
				cards.add(new Card(i, cardName));					//adding new card object to the cards list
			}
		}
		
		
	}

	public void shuffle() {
		Collections.shuffle(this.cards);							//using a shuffle method to shuffle the cards in the deck
	}
	
	public Card draw() {											//method to draw a card and subtract the value of the cards left in the deck by 1
		return cards.remove(cards.size() - 1);
	}
	
	
}
