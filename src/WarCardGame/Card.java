package WarCardGame;

//Card.java
public class Card {
	// The numeric value of the card (2 through 14, where 11–14 represent Jack, Queen, King, Ace)
	private int value;
	// The full name of the card (e.g., "Ace of Spades", "Two of Hearts")
	private String name;

	// Constructor to initialize the card with a value and name
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	// Getter for the card's value
	public int getValue() {
		return value;
	}

	// Setter to change the card's value
	public void setValue(int value) {
		this.value = value;
	}

	// Getter for the card's name
	public String getName() {
		return name;
	}

	// Setter to change the card's name
	public void setName(String name) {
		this.name = name;
	}

	// Prints a human-readable description of the card
	public void describe() {
		System.out.println(name + " (Value: " + value + ")");
	}

}
