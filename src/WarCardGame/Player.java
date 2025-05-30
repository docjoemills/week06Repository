package WarCardGame;

//Player.java
import java.util.*;	// Importing utility classes for using List and ArrayList

public class Player {
	// List to hold the player's hand of cards
	private List<Card> hand;
	
	// Integer to track the player's score
	private int score;
	
	// The name of the player
	private String name;

	// Constructor to initialize a player with a name, empty hand, and a score of 0
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}

	// Prints out the player's name and the cards in their hand
	public void describe() {
		System.out.println(name + " has the following cards:");
		for (Card card : hand) {
			card.describe();
		}
	}

	// Removes and returns the top card from the player's hand (simulates playing a card)
	public Card flip() {
		return hand.remove(0);
	}
	// Draws a card from the deck and adds it to the player's hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	// Increments the player's score by 1
	public void incrementScore() {
		score++;
	}

	// Returns the current score of the player
	public int getScore() {
		return score;
	}

	// Returns the name of the player
	public String getName() {
		return name;
	}
}