package com.bayviewglen.ThreeCardPoker;

import java.util.Scanner;

public class ThreeCardPoker {
	public static final int MIN_BET = 50;
	public static final int MAX_BET = 100;
	private static final double NUM_FACES = 13;
	private static final double NUM_SUITS = 4;
	private static final int STRAIGHT_FLUSH = 40;
	private static final int THREE_OF_A_KIND = 30;
	private static final int STRAIGHT = 6;
	private static final int FLUSH = 3;
	private static final int PAIR = 1;
	private static final int HIGH_CARD = 0;
	private static final int PLAY = 1;
	private static final int FOLD = 2;
	public static int playerWallet = 1000;
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Three-Card Poker!");
		boolean isGameOver = false;
		while (!isGameOver) {
			System.out.println();
			String playerHand = "";
			String dealerHand = "";

			System.out.println("Your Wallet: $" + playerWallet);
			System.out.print("Please enter an ante bet ($" + MIN_BET + "-$" + MAX_BET + "): ");
			int anteBet = getValidBet(playerWallet);
			playerWallet -= anteBet; // subtract ante bet from wallet
			System.out.print(
					"You have $" + playerWallet + " in your wallet. Would you like to place a PairPlus bet?(Y/N): ");
			int pairPlusBet = getPairPlusBet(in, playerWallet, anteBet);
			playerWallet -= pairPlusBet; // subtract PairPlus bet from wallet
			System.out.println();
			dealerHand = "XX XX XX";
			for (int i = 0; i < 3; i++) {

				boolean hasCard = false;
				while (!hasCard) {
					String card = getCard();
					if (isUnique(playerHand, card)) {
						playerHand += card + " ";
						hasCard = true;
					}

				}
			}
			System.out.println("Dealer's Hand: " + dealerHand);
			System.out.println("Your Hand: " + playerHand);
			int pairPlusWinnings = getPairPlusWinnings(pairPlusBet, playerHand);

			System.out.println();

			System.out.print("You have $" + playerWallet
					+ " in your wallet. Would you like to place a play wager, equal to your ante bet ($" + anteBet
					+ ") (1) or fold (2)?: ");
			int playerOption = getPlayerInput(in, anteBet);

			if (playerOption == FOLD) {
				System.out.println();
				System.out.println("Your Wallet Balance: $" + playerWallet);
				isGameOver = playAgain();

			} else if (playerOption == PLAY) {
				int playWinnings = 0;
				playerWallet -= anteBet; // subtracting play wager

				dealerHand = "";
				for (int i = 0; i < 3; i++) {

					boolean hasCard = false;
					while (!hasCard) {
						String card = getCard();
						if (isUnique(playerHand, dealerHand, card)) {
							dealerHand += card + " ";
							hasCard = true;
						}

					}
				}

				int playerHandRank = getHandRank(playerHand);
				int dealerHandRank = getDealerHandRank(dealerHand);

				System.out.println();
				System.out.println("Dealer Hand: " + dealerHand);
				System.out.println("Your Hand: " + playerHand);

				if (playerHandRank > dealerHandRank) { // a lower rank means a better hand
					System.out.println("Ooh, bad luck! You lost to the dealer!");
					playWinnings = 0;
				} else if (playerHandRank < dealerHandRank) {// if you beat dealer
					boolean dealerHandQualifies = dealerHandQualifies(dealerHand);
					if (dealerHandQualifies) { // dealer has queen high
						System.out.println("You beat the dealer!");
						playWinnings = (anteBet * 4); // ante bet = play bet, pay out 1 to 1

					} else { // dealer does not have queen high
						System.out.println(
								"You beat the dealer, but they didn't have a card that was Queen-high or better. Your play wager was returned. ");
						playWinnings = anteBet; // ante bet = play bet, play wager returned

					}
				} else if (playerHandRank == dealerHandRank) { // both hand ranks are equal, compare the rank of the cards that make up the hand								// hands
					
					if(playerHandRank == PAIR && dealerHandRank == PAIR) {
						playerHandRank = getPlayerPairRank(playerHand); 
						dealerHandRank = getDealerPairRank(dealerHand); 
						if (dealerHandRank > playerHandRank) {
							System.out.println("Ooh, bad luck! You lost to the dealer!");
							playWinnings = 0;
						} else if (dealerHandRank < playerHandRank) {
							boolean dealerHandQualifies = dealerHandQualifies(dealerHand);
							if (dealerHandQualifies) { // dealer has queen high
								System.out.println("You beat the dealer!");
								playWinnings = (anteBet * 4); // ante bet = play bet, pay out 1 to 1

							} else { // dealer does not have queen high
								System.out.println("You beat the dealer, but they didn't have a card that was Queen-high or better. Your play wager was returned. ");
								playWinnings = anteBet; // ante bet = play bet, play wager returned

							}
						} else if (dealerHandRank == playerHandRank) {
							boolean dealerHandQualifies = dealerHandQualifies(dealerHand);
							if (dealerHandQualifies) {
								System.out.println(
										"PUSH! You get your play wager back since the dealer had a Queen-high or better.");
								playWinnings = anteBet;
							} else {
								System.out.println(
										"PUSH! You don't get your play wager back, since the dealer didn't have a Queen-high card or better");
								playWinnings = 0;

							}
						}
						
						
					} 
						 dealerHandRank = getPlayerMaxRank(dealerHand);
						 playerHandRank = getDealerMaxRank(playerHand);
						if (dealerHandRank > playerHandRank) {
							System.out.println("Ooh, bad luck! You lost to the dealer!");
							playWinnings = 0;
						} else if (dealerHandRank < playerHandRank) {
							boolean dealerHandQualifies = dealerHandQualifies(dealerHand);
							if (dealerHandQualifies) { // dealer has queen high
								System.out.println("You beat the dealer!");
								playWinnings = (anteBet * 4); // ante bet = play bet, pay out 1 to 1

							} else { // dealer does not have queen high
								System.out.println("You beat the dealer, but they didn't have a card that was Queen-high or better. Your play wager was returned. ");
								playWinnings = anteBet; // ante bet = play bet, play wager returned

							}
						} else if (dealerHandRank == playerHandRank) {
							boolean dealerHandQualifies = dealerHandQualifies(dealerHand);
							if (dealerHandQualifies) {
								System.out.println(
										"PUSH! You get your play wager back since the dealer had a Queen-high or better.");
								playWinnings = anteBet;
							} else {
								System.out.println(
										"PUSH! You don't get your play wager back, since the dealer didn't have a Queen-high card or better");
								playWinnings = 0;

							}

						}
					

				}
				
				playerWallet += playWinnings + pairPlusWinnings;
				System.out.println();
				System.out.println("Congratulations, you won $" + pairPlusWinnings + " in PairPlus winnings and $"
						+ playWinnings + " by playing the dealer!");
				System.out.println("Your Wallet Balance: $" + playerWallet);
				isGameOver = playAgain();
				
			}
		}
	}


	private static int getPlayerPairRank(String playerHand) {
		String card1 = getCard1(playerHand);
		String card2 = getCard2(playerHand);
		String card3 = getCard3(playerHand);

		int rank1 = Integer.parseInt(card1.substring(0, card1.length() - 1));
		int rank2 = Integer.parseInt(card2.substring(0, card2.length() - 1));
		int rank3 = Integer.parseInt(card3.substring(0, card3.length() - 1));
		
		if (rank1 == rank2)
			return rank3; 
		else if(rank3 == rank2)
			return rank1; 
		else if(rank1 == rank3)
			return rank2; 
		return 0;
	}

	private static int getDealerPairRank(String dealerHand) {
		String card1 = getDealerCard1(dealerHand);
		String card2 = getDealerCard2(dealerHand);
		String card3 = getDealerCard3(dealerHand); 
		
		int rank1 = Integer.parseInt(card1.substring(0, card1.length() - 1));
		int rank2 = Integer.parseInt(card2.substring(0, card2.length() - 1));
		int rank3 = Integer.parseInt(card3.substring(0, card3.length() - 1));
		
		if (rank1 == rank2)
			return rank3; 
		else if(rank3 == rank2)
			return rank1; 
		else if(rank1 == rank3)
			return rank2; 
		return 0;
	}

	private static int getDealerMaxRank(String dealerHand) {
		String card1 = getDealerCard1(dealerHand);
		String card2 = getDealerCard2(dealerHand);
		String card3 = getDealerCard3(dealerHand);

		int rank1 = Integer.parseInt(card1.substring(0, card1.length() - 1));
		int rank2 = Integer.parseInt(card2.substring(0, card2.length() - 1));
		int rank3 = Integer.parseInt(card3.substring(0, card3.length() - 1));

		int max = Math.max(rank1, Math.max(rank2, rank3));

		return max;

	}

	private static int getPlayerMaxRank(String playerHand) {
		String card1 = getCard1(playerHand);
		String card2 = getCard2(playerHand);
		String card3 = getCard3(playerHand);

		int rank1 = Integer.parseInt(card1.substring(0, card1.length() - 1));
		int rank2 = Integer.parseInt(card2.substring(0, card2.length() - 1));
		int rank3 = Integer.parseInt(card3.substring(0, card3.length() - 1));

		int max = Math.max(rank1, Math.max(rank2, rank3));

		return max;
	}

	private static boolean dealerHandQualifies(String dealerHand) {
		int space1 = dealerHand.indexOf(" ");
		int space2 = dealerHand.indexOf(" ", space1 + 1); // where is the index of the next instance of the space?
		int space3 = dealerHand.indexOf(" ", space2 + 1);

		// Splits up cards, and assigns numerical rank to royalty (J, Q, K, A)
		String card1 = dealerHand.substring(0, space1);
		if (card1.substring(0, card1.length() - 1).equals("J"))
			card1 = 11 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("Q"))
			card1 = 12 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("K"))
			card1 = 13 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("A"))
			card1 = 14 + card1.substring(card1.length() - 1);
		String card2 = dealerHand.substring(space1 + 1, space2);
		if (card2.substring(0, card2.length() - 1).equals("J"))
			card2 = 11 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("Q"))
			card2 = 12 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("K"))
			card2 = 13 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("A"))
			card2 = 14 + card2.substring(card2.length() - 1);
		String card3 = dealerHand.substring(space2 + 1, space3);
		if (card3.substring(0, card3.length() - 1).equals("J"))
			card3 = 11 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("Q"))
			card3 = 12 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("K"))
			card3 = 13 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("A"))
			card3 = 14 + card3.substring(card3.length() - 1);

		int rank1 = Integer.parseInt(card1.substring(0, card1.length() - 1));
		int rank2 = Integer.parseInt(card2.substring(0, card2.length() - 1));
		int rank3 = Integer.parseInt(card3.substring(0, card3.length() - 1));

		int max = Math.max(rank1, Math.max(rank2, rank3));
		if (max >= 12) // if it is Queen high or better, the hand the hand qualifies
			return true;
		else
			return false;
	}

	private static int getDealerHandRank(String dealerHand) {
		int x = getHandType(dealerHand);
		if (x == STRAIGHT_FLUSH)
			return 1;
		else if (x == THREE_OF_A_KIND)
			return 2;
		else if (x == STRAIGHT)
			return 3;
		else if (x == FLUSH)
			return 4;
		else if (x == PAIR)
			return 5;
		else
			return 6;
	}

	private static boolean playAgain() {
		if (playerWallet < MIN_BET + MIN_BET) { // need to be able to place ante and play wagers
			System.out.println("Not enough money to play again. Thanks for playing!");
			return true;
		}
		System.out.print("Thanks for playing this round! Would you like to play again? (Y/N): ");
		boolean isValidInput = false;
		while (!isValidInput) {
			String temp = in.nextLine().toLowerCase();
			if (temp.equals("yes") || temp.equals("y"))
				return false;
			else if (temp.equals("no") || temp.equals("n"))
				return true;
			else
				System.out.print("Thanks for playing this round! Would you like to play again? (Y/N): ");
		}

		return false;
	}

	private static boolean isUnique(String playerHand, String card) {
		return playerHand.indexOf(card) == -1;
	}

	private static boolean isUnique(String playerHand, String dealerHand, String card) {
		return playerHand.indexOf(card) == -1 && dealerHand.indexOf(card) == -1;
	}

	private static int getPlayerInput(Scanner in, int anteBet) {
		boolean isValidInput = false;
		while (!isValidInput) {
			String x = in.nextLine();

			if (x.equals("1") || x.equals("2"))// 1, play 2, fold
				return Integer.parseInt(x);
			else
				System.out.print("You have $" + playerWallet
						+ " in your wallet. Would you like to place a play wager, equal to $" + anteBet
						+ " (1) or fold (2)?:");
		}
		return 0;
	}

	private static int getPairPlusWinnings(int pairPlusBet, String playerHand) {
		if (pairPlusBet == 0)
			return 0;
		int winnings = 0;
		int handRank = getHandRank(playerHand);
		if (handRank == 1) {
			winnings = (pairPlusBet * 40) + pairPlusBet;
			System.out.println("You got a Straight Flush, and won $" + winnings
					+ "! This will be added to your wallet after the round is over.");
			return winnings;
		} else if (handRank == 2) {
			winnings = (pairPlusBet * 30) + pairPlusBet;
			System.out.println("You got a Three of a Kind, and won $" + winnings
					+ "! This will be added to your wallet after the round is over.");
			return winnings;
		} else if (handRank == 3) {
			winnings = (pairPlusBet * 6) + pairPlusBet;
			System.out.println("You got a Straight, and won $" + winnings
					+ "! This will be added to your wallet after the round is over.");
			return winnings;
		} else if (handRank == 4) {
			winnings = (pairPlusBet * 3) + pairPlusBet;
			System.out.println("You got a Flush, and won $" + winnings
					+ "! This will be added to your wallet after the round is over.");
			return winnings;
		} else if (handRank == 5) {
			winnings = (pairPlusBet * 1) + pairPlusBet;
			System.out.println("You got a Pair, and won $" + winnings
					+ "! This will be added to your wallet after the round is over.");
			return winnings;
		} else
			System.out.println("Sorry, you won nothing!");
		return 0;
	}

	private static int getHandRank(String playerHand) {
		int x = getHandType(playerHand);
		if (x == STRAIGHT_FLUSH)
			return 1;
		else if (x == THREE_OF_A_KIND)
			return 2;
		else if (x == STRAIGHT)
			return 3;
		else if (x == FLUSH)
			return 4;
		else if (x == PAIR)
			return 5;
		else
			return 6;
	}

	private static int getHandType(String playerHand) {
		if (isStraightFlush(playerHand))
			return STRAIGHT_FLUSH;
		else if (isThreeOfAKind(playerHand))
			return THREE_OF_A_KIND;
		else if (isStraight(playerHand))
			return STRAIGHT;
		else if (isFlush(playerHand))
			return FLUSH;
		else if (isPair(playerHand))
			return PAIR;
		else
			return HIGH_CARD;

	}

	private static boolean isStraightFlush(String playerHand) {
		if (isStraight(playerHand) && isFlush(playerHand))
			return true;
		return false;
	}

	private static boolean isThreeOfAKind(String playerHand) {
		int numAces = 0;
		int numTwos = 0;
		int numThrees = 0;
		int numFours = 0;
		int numFives = 0;
		int numSixes = 0;
		int numSevens = 0;
		int numEights = 0;
		int numNines = 0;
		int numTens = 0;
		int numJacks = 0;
		int numQueens = 0;
		int numKings = 0;
		for (int i = 0; i < playerHand.length() - 2; i++) {
			String card = playerHand.substring(i, i + 2);
			if (card.substring(0, 1).equals("2"))
				numTwos++;
			else if (card.substring(0, 1).equals("3"))
				numThrees++;
			else if (card.substring(0, 1).equals("4"))
				numFours++;
			else if (card.substring(0, 1).equals("5"))
				numFives++;
			else if (card.substring(0, 1).equals("6"))
				numSixes++;
			else if (card.substring(0, 1).equals("7"))
				numSevens++;
			else if (card.substring(0, 1).equals("8"))
				numEights++;
			else if (card.substring(0, 1).equals("9"))
				numNines++;
			else if (card.substring(0, 2).equals("10"))
				numTens++;
			else if (card.substring(0, 1).equals("J"))
				numJacks++;
			else if (card.substring(0, 1).equals("Q"))
				numQueens++;
			else if (card.substring(0, 1).equals("K"))
				numKings++;
			else if (card.substring(0, 1).equals("A"))
				numAces++;
		}
		if (numTwos == 3)
			return true;
		else if (numThrees == 3)
			return true;
		else if (numFours == 3)
			return true;
		else if (numFives == 3)
			return true;
		else if (numSixes == 3)
			return true;
		else if (numSevens == 3)
			return true;
		else if (numEights == 3)
			return true;
		else if (numNines == 3)
			return true;
		else if (numTens == 3)
			return true;
		else if (numJacks == 3)
			return true;
		else if (numQueens == 3)
			return true;
		else if (numKings == 3)
			return true;
		else if (numAces == 3)
			return true;

		return false;
	}

	private static boolean isStraight(String playerHand) {
		String card1 = getCard1(playerHand);
		String card2 = getCard2(playerHand);
		String card3 = getCard3(playerHand);

		int rank1 = Integer.parseInt(card1.substring(0, card1.length() - 1));
		int rank2 = Integer.parseInt(card2.substring(0, card2.length() - 1));
		int rank3 = Integer.parseInt(card3.substring(0, card3.length() - 1));

		int max = Math.max(rank1, Math.max(rank2, rank3));
		int min = Math.min(rank1, Math.min(rank2, rank3));
		int mid = (rank1 + rank2 + rank3) - (max + min);

		if (max - 1 == mid && mid - 1 == min)
			return true;
		else
			return false;
	}

	private static String getCard3(String playerHand) {
		int space1 = playerHand.indexOf(" ");
		int space2 = playerHand.indexOf(" ", space1 + 1); // where is the index of the next instance of the space?
		int space3 = playerHand.indexOf(" ", space2 + 1);
		String card3 = playerHand.substring(space2 + 1, space3);
		if (card3.substring(0, card3.length() - 1).equals("J"))
			card3 = 11 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("Q"))
			card3 = 12 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("K"))
			card3 = 13 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("A"))
			card3 = 14 + card3.substring(card3.length() - 1);
		return card3;
	}

	private static String getDealerCard3(String dealerHand) {
		int space1 = dealerHand.indexOf(" ");
		int space2 = dealerHand.indexOf(" ", space1 + 1); // where is the index of the next instance of the space?
		int space3 = dealerHand.indexOf(" ", space2 + 1);
		String card3 = dealerHand.substring(space2 + 1, space3);
		if (card3.substring(0, card3.length() - 1).equals("J"))
			card3 = 11 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("Q"))
			card3 = 12 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("K"))
			card3 = 13 + card3.substring(card3.length() - 1);
		else if (card3.substring(0, card3.length() - 1).equals("A"))
			card3 = 14 + card3.substring(card3.length() - 1);
		return card3;
	}

	private static String getCard2(String playerHand) {
		int space1 = playerHand.indexOf(" ");
		int space2 = playerHand.indexOf(" ", space1 + 1);
		String card2 = playerHand.substring(space1 + 1, space2);
		if (card2.substring(0, card2.length() - 1).equals("J"))
			card2 = 11 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("Q"))
			card2 = 12 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("K"))
			card2 = 13 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("A"))
			card2 = 14 + card2.substring(card2.length() - 1);
		return card2;
	}

	private static String getDealerCard2(String dealerHand) {
		int space1 = dealerHand.indexOf(" ");
		int space2 = dealerHand.indexOf(" ", space1 + 1);
		String card2 = dealerHand.substring(space1 + 1, space2);
		if (card2.substring(0, card2.length() - 1).equals("J"))
			card2 = 11 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("Q"))
			card2 = 12 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("K"))
			card2 = 13 + card2.substring(card2.length() - 1);
		else if (card2.substring(0, card2.length() - 1).equals("A"))
			card2 = 14 + card2.substring(card2.length() - 1);
		return card2;
	}

	private static String getCard1(String playerHand) {
		int space1 = playerHand.indexOf(" ");
		String card1 = playerHand.substring(0, space1);
		if (card1.substring(0, card1.length() - 1).equals("J"))
			card1 = 11 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("Q"))
			card1 = 12 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("K"))
			card1 = 13 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("A"))
			card1 = 14 + card1.substring(card1.length() - 1);
		return card1;

	}

	private static String getDealerCard1(String dealerHand) {
		int space1 = dealerHand.indexOf(" ");
		String card1 = dealerHand.substring(0, space1);
		if (card1.substring(0, card1.length() - 1).equals("J"))
			card1 = 11 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("Q"))
			card1 = 12 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("K"))
			card1 = 13 + card1.substring(card1.length() - 1);
		else if (card1.substring(0, card1.length() - 1).equals("A"))
			card1 = 14 + card1.substring(card1.length() - 1);
		return card1;

	}

	private static boolean isFlush(String playerHand) {
		int numHearts = 0;
		int numDiamonds = 0;
		int numSpades = 0;
		int numClubs = 0;
		for (int i = 0; i < playerHand.length() - 2; i++) {
			String card = playerHand.substring(i, i + 2);
			if (card.substring(1, 2).equals("H"))
				numHearts++;
			else if (card.substring(1, 2).equals("D"))
				numDiamonds++;
			else if (card.substring(1, 2).equals("S"))
				numSpades++;
			else if (card.substring(1, 2).equals("C"))
				numClubs++;
		}
		if (numHearts == 3)
			return true;
		else if (numDiamonds == 3)
			return true;
		else if (numSpades == 3)
			return true;
		else if (numClubs == 3)
			return true;

		return false;
	}

	private static boolean isPair(String playerHand) {
		int numAces = 0;
		int numTwos = 0;
		int numThrees = 0;
		int numFours = 0;
		int numFives = 0;
		int numSixes = 0;
		int numSevens = 0;
		int numEights = 0;
		int numNines = 0;
		int numTens = 0;
		int numJacks = 0;
		int numQueens = 0;
		int numKings = 0;
		for (int i = 0; i < playerHand.length() - 2; i++) {
			String card = playerHand.substring(i, i + 2);
			if (card.substring(0, 1).equals("2"))
				numTwos++;
			else if (card.substring(0, 1).equals("3"))
				numThrees++;
			else if (card.substring(0, 1).equals("4"))
				numFours++;
			else if (card.substring(0, 1).equals("5"))
				numFives++;
			else if (card.substring(0, 1).equals("6"))
				numSixes++;
			else if (card.substring(0, 1).equals("7"))
				numSevens++;
			else if (card.substring(0, 1).equals("8"))
				numEights++;
			else if (card.substring(0, 1).equals("9"))
				numNines++;
			else if (card.substring(0, 2).equals("10"))
				numTens++;
			else if (card.substring(0, 1).equals("J"))
				numJacks++;
			else if (card.substring(0, 1).equals("Q"))
				numQueens++;
			else if (card.substring(0, 1).equals("K"))
				numKings++;
			else if (card.substring(0, 1).equals("A"))
				numAces++;
		}
		if (numTwos == 2)
			return true;
		else if (numThrees == 2)
			return true;
		else if (numFours == 2)
			return true;
		else if (numFives == 2)
			return true;
		else if (numSixes == 2)
			return true;
		else if (numSevens == 2)
			return true;
		else if (numEights == 2)
			return true;
		else if (numNines == 2)
			return true;
		else if (numTens == 2)
			return true;
		else if (numJacks == 2)
			return true;
		else if (numQueens == 2)
			return true;
		else if (numKings == 2)
			return true;
		else if (numAces == 2)
			return true;

		return false;
	}

	private static int getPairPlusBet(Scanner in, int playerWallet, int anteBet) {
		boolean isValidInput = false;
		while (!isValidInput) {
			String temp = in.nextLine().toLowerCase();
			if (temp.equals("yes") || temp.equals("y")) {
				isValidInput = true;
				if (playerWallet - (2*anteBet) < MIN_BET) { // Checking if they can place a play bet after they place a pair
														// plus
					System.out.println(
							"Sorry, but you cannot bet a PairPlus, since you will not be able to place a play wager.");
					return 0;
				}
				System.out.print("How much will you be betting?: ");
				return getValidBet(playerWallet);
			} else if (temp.equals("no") || temp.equals("n")) {
				isValidInput = true;
				return 0;
			} else
				System.out.print("You have $" + playerWallet
						+ " in your wallet. Would you like to place a Pair Plus bet(Y/N)?:");
		}
		return 0;
	}

	private static int getValidBet(int playerWallet) {
		boolean isValidBet = false;
		while (!isValidBet) {
			try {
				int x = Integer.parseInt(in.nextLine());
				if (x >= MIN_BET && x <= MAX_BET && (x * 2) <= playerWallet) {
					isValidBet = true;
					return x;
				} else if ((x * 2) >= playerWallet) {
					System.out.print("Sorry, you need at least $" + MIN_BET
							+ " to place a play wager, please bet a lower amount:");
				} else if (x < MIN_BET || x > MAX_BET || (x * 2) > playerWallet) {
					System.out.print("Invalid bet ($" + MIN_BET + "-$" + MAX_BET + "): ");
				}
			} catch (Exception ex) {
				System.out.print("Invalid bet ($" + MIN_BET + "-$" + MAX_BET + "), no spaces please: ");
			}
		}

		return 0;
	}

	public static String getCard() {
		return getFace() + getSuit();
	}

	public static String getFace() {
		int x = (int) (Math.random() * NUM_FACES) + 2;

		if (x <= 10)
			return "" + x;
		else if (x == 11)
			return "J";
		else if (x == 12)
			return "Q";
		else if (x == 13)
			return "K";
		else
			return "A";

	}

	public static String getSuit() {
		int x = (int) (Math.random() * NUM_SUITS);
		if (x == 0)
			return "S";
		else if (x == 1)
			return "D";
		else if (x == 2)
			return "H";
		else
			return "C";
	}

}
