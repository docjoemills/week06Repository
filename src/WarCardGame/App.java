package WarCardGame;

//App.java
public class App {
 public static void main(String[] args) {
	 // Create and shuffle a new deck of 52 cards
	 Deck deck = new Deck();
     deck.shuffle();

     // Create two players with given names
     Player player1 = new Player("Player 1");
     Player player2 = new Player("Player 2");
     
     // Deal all 52 cards to the two players, alternating cards between them
     for (int i = 0; i < 52; i++) {
         if (i % 2 == 0) {
             player1.draw(deck);	// Player 1 draws on even turns
         } else {
             player2.draw(deck);	// Player 2 draws on odd turns
         }
     }
     
     // Play 26 rounds of the game (each player has 26 cards)
     for (int i = 0; i < 26; i++) {
         System.out.println("Round " + (i + 1) + ":");
         
         // Each player flips the top card from their hand
         Card p1Card = player1.flip();
         Card p2Card = player2.flip();
         
         // Display the card played by each player
         System.out.print(player1.getName() + " plays: ");
         p1Card.describe();
         System.out.print(player2.getName() + " plays: ");
         p2Card.describe();

         // Compare the values of the two cards to determine the round winner
         if (p1Card.getValue() > p2Card.getValue()) {
             player1.incrementScore();	// Player 1 wins the round and gains a point
             System.out.println("-> " + player1.getName() + " wins the round!");
         } else if (p1Card.getValue() < p2Card.getValue()) {
             player2.incrementScore();	// Player 2 wins the round and gains a point
             System.out.println("-> " + player2.getName() + " wins the round!");
         } else {
        	 // If both cards have equal value, it's a tie and no points are awarded
        	 System.out.println("-> It's a tie. No points awarded.");
         }

         // Print the current score after each round
         System.out.println("Scores => " + player1.getName() + ": " + player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
         System.out.println("-----------------------------------");
     }
     // Print final scores after all rounds have been played
     System.out.println("Final Scores:");
     System.out.println(player1.getName() + ": " + player1.getScore());
     System.out.println(player2.getName() + ": " + player2.getScore());

     // Determine and print the winner of the game or if it was a draw
     if (player1.getScore() > player2.getScore()) {
         System.out.println(player1.getName() + " wins the game!");
     } else if (player1.getScore() < player2.getScore()) {
         System.out.println(player2.getName() + " wins the game!");
     } else {
         System.out.println("The game is a draw.");
     }
 }
}

