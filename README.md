# 🃏 WAR Card Game – Java Edition

## 📌 Project Description

Welcome to the **WAR Card Game**, a fully automated Java application that simulates the classic two-player card game **WAR**! This project was developed as a capstone for foundational Java learning and object-oriented programming (OOP) principles.

The game runs entirely in the console and is designed to demonstrate clean class-based design, randomization, conditional logic, loops, and encapsulation. Two players are automatically dealt a shuffled deck of cards and battle it out in 26 rounds, with each round scored and displayed in real-time. At the end, the game announces the winner — or a draw — based on final scores.

### 🎮 Features
- Automatically shuffles and deals a full 52-card deck
- Simulates 26 rounds of WAR gameplay
- Real-time round-by-round updates and score tracking
- Declares the final winner or a tie based on game outcome
- Fully object-oriented design using `Card`, `Deck`, `Player`, and `App` classes

## 🔗 Live Demo

There is a description of this code at (https://youtu.be/Zpc7N6wf1tg).

## 🛠️ Technologies Used

- **Java 17**
- **Java Collections Framework** (`ArrayList`, `Collections.shuffle`)
- **Eclipse IDE** or **IntelliJ IDEA**
- **Command Line / Terminal**

## 🌟 Favorite Features

### 1. Object-Oriented Architecture

Each component of the game — the deck, the cards, and the players — is encapsulated in its own class. This clean separation of concerns made the code intuitive and modular.

> **Challenge**: Initially, integrating the flow of cards between deck and player hands seemed complex.  
> **Solution**: We built reusable `draw()` and `flip()` methods, streamlining the exchange of cards and actions between objects.

### 2. Console Feedback & Scoring

Each round provides descriptive feedback via the `describe()` method for both the card and the player, giving the console output a dynamic and engaging feel.

> **Challenge**: Making the game feel alive without a GUI.  
> **Solution**: Rich output descriptions and round-by-round score tracking keep the game interactive and clear.

## 🧠 Code Snippets

### Deck Initialization & Shuffle

```java 
   public Deck() { cards = new ArrayList<>(); String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; for (String suit : suits) { for (int i = 0; i < names.length; i++) { cards.add(new Card(i + 2, names[i] + " of " + suit)); } } } 
      ```

### Player Flip & Score Comparison Logic

```java 
   Card p1Card = player1.flip(); Card p2Card = player2.flip(); System.out.print(player1.getName() + " plays: "); p1Card.describe(); System.out.print(player2.getName() + " plays: "); p2Card.describe(); if (p1Card.getValue() > p2Card.getValue()) { player1.incrementScore(); System.out.println("-> " + player1.getName() + " wins the round!"); } else if (p1Card.getValue() < p2Card.getValue()) { player2.incrementScore(); System.out.println("-> " + player2.getName() + " wins the round!"); } else { System.out.println("-> It's a tie. No points awarded."); } 
      ```

## 🚀 Installation & Usage

### 🔧 Prerequisites
- Java 17+ installed
- IDE like Eclipse or IntelliJ, or use terminal

### 💻 Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/WarCardGame.git
2. Open the project in your IDE or navigate via terminal.
3. Compile and run the App.java file.
4. Watch the game play out in your console!

## 🤝 Contributing

Want to enhance the WAR card game or add new features (like GUI or real WAR rules)?

### Guidelines
- Fork the repo
- Create a new branch (`feature-new-feature`)
- Commit your changes
- Push to the branch
- Submit a pull request

Bug reports, feature suggestions, and code improvements are welcome!

## 📄 License

This project is licensed under the **MIT License**.  
You are free to use, modify, and distribute this code, but it comes with **no warranty**.

## 📬 Contact

- **GitHub**: [https://github.com/docjoemills](https://github.com/docjoemills)


