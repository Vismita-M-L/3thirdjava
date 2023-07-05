package com.techlabs.BookCricket;

import java.util.Random;

public class BookCricket {

	public static void main(String[] args) {
		int totalPages = 300;
		        int targetScore = playGame(totalPages);
		        
		        System.out.println("Player 1 Score: " + targetScore);
		        
		        int player2Score = playGame(totalPages);
		        System.out.println("Player 2 Score: " + player2Score);
		        
		        if (targetScore > player2Score) {
		            System.out.println("Player 1 wins!");
		        } else if (targetScore < player2Score) {
		            System.out.println("Player 2 wins!");
		        } else {
		            System.out.println("It's a tie!");
		        }
		    }
	public static int playGame(int totalPages) {
		    	int answer= (int)(Math.random()*100)+1;
		    	System.out.println("Random Number is:"+answer);
		        Random random = new Random();
		        int score = 0;
		        int turns = 0;
		        while (true) {
		            int page = random.nextInt(totalPages) + 1;
		            int pageScore = page % 7;
		            
		            if (pageScore == 0) {
		                break;
		            }
		            
		            score += pageScore;
		            turns++;
		        }
		        
		        return score;
		    }
	}


