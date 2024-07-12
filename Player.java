package Week06;

import java.util.ArrayList;
import java.util.List;

public class Player {												//Class of player with no main method

		private List<Card> hand = new ArrayList<>();				//created a new list/arraylist of hand
		private int score = 0;										//score set to 0 at the start of the game
		private String name;										
		
		public Player(String name) {								//player constructor of string name
			this.name = name;										//using the name of this string
		}

		
		public int getScore() {										//added the Getters and Setters for the score and name
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void describe() {										//method describing the players hand
			System.out.println(name + "'s hand:");
			for (Card card : hand) {
				card.describe(card);
			}
		}
		
		public Card flip() {											//method to flip through each card
			if (hand.isEmpty()) {
				throw new IllegalStateException("Hand is empty!");		//throws exception if the deck is empty
			}
			return hand.remove(0);
		}
		
		public void draw(Deck deck) {									//method to draw the cards from the deck for each turn
			hand.add(deck.draw());
		}
		
		public void incrementScore() {									//method to increment and add up the player scores
			score++;
		}
	
}
