package Week06;

public class Card {

	private int value;								//created a class called card, used an int to hold the value of the card ranks
	private String name;							//String to hold the name of the cards
	
	public Card(int value, String name) {			//Constructor
		this.value = value;
		this.name = name;
	}

	public int getValue() {							//created the predefined getters and setters
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void describe(Card card) {				//called the method to describe the card and then print out the card name/value
		System.out.println(card.name);
		
	}
	
	
	
}
