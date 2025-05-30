package WarCardGame;

//Deck.java
import java.util.*;	// Importing utility classes for using List and Collections

public class Deck {
	// A list to hold all the cards in the deck
	private List<Card> cards;
	
	// Constructor to initialize a full deck of 52 cards
	public Deck() {
		cards = new ArrayList<>();	// Create an empty list to hold the cards
		
		// Define the four suits found in a standard deck
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		// Define the names of cards from Two to Ace
		String[] names = {
				"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"
		};
		
		// Loop through each suit and card name to generate 52 unique cards
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				// Add a new Card to the deck with a value from 2 to 14 and a full name
				cards.add(new Card(i + 2, names[i] + " of " + suit));
			}
		}
	}

	// Randomizes the order of cards in the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}

	// Removes and returns the top card from the deck
	public Card draw() {
		return cards.remove(0);
	}
}