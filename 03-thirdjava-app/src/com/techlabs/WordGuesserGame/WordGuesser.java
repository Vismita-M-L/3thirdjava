package com.techlabs.WordGuesserGame;

import java.util.Scanner;

public class WordGuesser {
	private static String[] words = {"apple", "banana", "carrot", "dog", "elephant", "fruit", "guitar", "house", "internet", "java"};
    private static String chosenWord;
    private static boolean[] guessedLetters;

	public static void main(String[] args) {
		 chooseWord();
	        initializeGuessedLetters();
	        playGame();
	    }

	    private static void chooseWord() {
	        int randomIndex = (int) (Math.random() * words.length);
	        chosenWord = words[randomIndex];
	        System.out.println("Random Word is:"+chosenWord);
	    }

	    private static void initializeGuessedLetters() {
	        guessedLetters = new boolean[chosenWord.length()];
	        for (int i = 0; i < guessedLetters.length; i++) {
	            guessedLetters[i] = false;
	        }
	    }

	    private static void playGame() {
	        Scanner scanner = new Scanner(System.in);
	        int attempts = 5;
	        boolean wordGuessed = false;

	        System.out.println("Welcome to the Word Guesser game!");
	        System.out.println("Guess the word by entering one letter at a time.");
	        System.out.println("You have " + attempts + " attempts.");

	        while (attempts > 0 && !wordGuessed) {
	            System.out.print("Word: ");
	            printGuessedWord();

	            System.out.print("Enter a letter: ");
	            char letter = scanner.nextLine().charAt(0);

	            if (checkLetter(letter)) {
	                System.out.println("Correct guess!");
	            } else {
	                attempts--;
	                System.out.println("Wrong guess! Attempts left: " + attempts);
	            }

	            if (checkWordGuessed()) {
	                wordGuessed = true;
	                System.out.println("Congratulations! You guessed the word correctly.");
	            }
	        }

	        if (!wordGuessed) {
	            System.out.println("Game over! The word was: " + chosenWord);
	        }

	        scanner.close();
	    }

	    private static void printGuessedWord() {
	        for (int i = 0; i < chosenWord.length(); i++) {
	            if (guessedLetters[i]) {
	                System.out.print(chosenWord.charAt(i) + " ");
	            } else {
	                System.out.print("_ ");
	            }
	        }
	        System.out.println();
	    }

	    private static boolean checkLetter(char letter) {
	        boolean correctGuess = false;
	        for (int i = 0; i < chosenWord.length(); i++) {
	            if (chosenWord.charAt(i) == letter) {
	                guessedLetters[i] = true;
	                correctGuess = true;
	            }
	        }
	        return correctGuess;
	    }

	    private static boolean checkWordGuessed() {
	        for (boolean guessed : guessedLetters) {
	            if (!guessed) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

	


