package com.techlabs.refactoringpigdice;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
	private static final int TARGET_SCORE = 20;

    private Random random;
    private Scanner scanner;
    private int totalScore;
    private int turnCount;

    private PigGame() {
        random = new Random();
        scanner = new Scanner(System.in);
        totalScore = 0;
        turnCount = 0;
    }

    private void play() {
        System.out.println("Let's Play PIG!\n");

        while (totalScore < TARGET_SCORE) {
            turnCount++;
            int turnScore = playTurn();
            totalScore += turnScore;
            System.out.println("Score for turn: " + turnScore);
            System.out.println("Total score: " + totalScore + "\n");
        }

        System.out.println("You finished in " + turnCount + " turns!");
        System.out.println("\nGame over!");

        scanner.close();
    }

    private int playTurn() {
        int turnScore = 0;
        System.out.println("TURN " + turnCount);

        while (true) {
            System.out.print("Roll or hold? (r/h): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("r")) {
                int die = rollDie();
                System.out.println("Die: " + die);

                if (die == 1) {
                    turnScore = 0;
                    System.out.println("Turn over. No score.");
                    break;
                } else {
                    turnScore += die;
                }
            } else if (choice.equalsIgnoreCase("h")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        return turnScore;
    }

    private int rollDie() {
        return random.nextInt(6) + 1;
    }

	public static void main(String[] args) {
		PigGame pigGame = new PigGame();
        pigGame.play();
    }
}
		

	


