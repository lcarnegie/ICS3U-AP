package com.bayviewglen.dayfive;

import java.util.Scanner; 
public class DiceGame {
	// Two player game
	// Player 1 and Player 2
	// First to go over 50 wins
	//Option to roll 1 or two ice
	// if you roll 4 or 10 you lose 5 
	public static void main(String[] args) {
		
		int playerOneScore = 0; 
		int playerTwoScore = 0; 
		
		final int GOAL = 50; 
		
		boolean isGameOver = false; 
		Scanner in = new Scanner(System.in); 
		while (!isGameOver) {
			playerOneScore = playerTurn(in, "Player One", playerOneScore);  
			playerTwoScore = playerTurn(in, "Player Two", playerTwoScore);
			
			displayScore("Player One", playerOneScore);
			displayScore("Player Two", playerTwoScore); 
			
			if(playerOneScore > GOAL || playerTwoScore > GOAL)
				isGameOver = true; 
			
		}
		
		displayWinner("Player One", playerOneScore, "Player Two", playerTwoScore); 
			
		
		
		
	}
	
	public static void displayWinner(String playerOne, int playerOneScore, String playerTwo, int playerTwoScore) {
		if(playerOneScore > playerTwoScore)
			System.out.println(playerOne + " WINS! ");
		else 
			System.out.println(playerTwo + " WINS!");
		if(playerOneScore == playerTwoScore)
			System.out.println("It's a tie!");
		
	}

	public static void displayScore(String playerName, int playerScore) {
		System.out.println(playerName + " score: " + playerScore);
		
	}

	public static int playerTurn(Scanner in, String playerName, int playerScore) {
		System.out.print(playerName + ", how many dice would you like to roll (1 or 2)?");
		int numDice = getNumRolls(in); 
		int currentTurn = 0; 
		for (int i = 0; i<numDice; i++) {
			int currentRoll = roll(); 
			System.out.println(playerName + " rolled a " + currentRoll);
			currentTurn += currentRoll; 
			
		}
		if(currentTurn == 4 || currentTurn == 10) {
			System.out.println(playerName + " lost five points!");
			playerScore -= 5; 
		
		}else
			playerScore += currentTurn;
		
		return playerScore;
		
		
	}

	public static int getNumRolls(Scanner in) {
		int x = 0; 
		boolean validInput = false;  
		while(!validInput) {
			try { 
			x = Integer.parseInt(in.nextLine()); 
			if(x < 1 || x > 2)
			System.out.println("Please enter 1 or 2" );
			else 
				validInput = true; 
			}catch(Exception ex) { 
				System.out.println("Please enter 1 or 2" );
			}
		} 
		
		return x;
	}

	public static int roll() {
		return (int)(Math.random() * 6) + 1; 
	}

}
