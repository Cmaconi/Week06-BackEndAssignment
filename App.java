package Week06;

public class App {

	public static void main(String[] args) {							//app class with a main method

		Deck deck = new Deck();											//instantiate a deck and shuffling that deck
		deck.shuffle();
		
		Player player1 = new Player("Patrick Mahomes");					//Strings to add the player names
		Player player2 = new Player("Tom Brady");
		
		
		
		for (int i = 0; i < 52; i++) {						//using a for loop to iterate through all 52 cards in the deck
			if (i % 2 == 0) {
				player1.draw(deck);							//player 1 drawing their cards
			} else {
				player2.draw(deck);							//player 2 drawing their cards
			}
		}
		
		for (int i = 0; i < 26; i++) {						//players flipping their cards to see who has the higher card and 
			Card card1 = player1.flip();					//wins the round
			Card card2 = player2.flip();
			card1.describe(card1);
			card2.describe(card2);
			
			if (card1.getValue() > card2.getValue()) {						//if player1 card is higher than player2 card, player1 gets the point
				player1.incrementScore();
				System.out.println(player1.getName() + " dominated that round!");
			} else if (card1.getValue() < card2.getValue()) {				//if player1 card is higher than player2 card, player1 gets the point
				player2.incrementScore();
				System.out.println(player2.getName() + " dominated that round");
			} else {														//if both player cards are the same value, its a tie and no points are awared
				System.out.println("I can't believe its a tie! No points awarded");
			}
			System.out.println("Score: " + player1.getName() + " - " + player1.getScore() + ", " + player2.getName() + " - " + player2.getScore());
		}
		
		System.out.println("Final Score: " + player1.getName() + " - " + player1.getScore() + ", " + player2.getName() + " - " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {					// add up point totals
			System.out.println(player1.getName() + " has won the game!!!!!");		//if player1 score is greater than player2, they win
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " takes it home!!!!");		//if player2 score is greater than player1, they win
		} else {
			System.out.println("Did it really end in a draw?!?!?");		//if both players have the same total point values, its a draw
		}
		
	}

}
