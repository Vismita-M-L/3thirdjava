package com.techlabs.treasurehunt;

import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Welcome to Treasure Island!");
		        System.out.println("Your mission is to find the treasure.");

		        System.out.print("You're at a crossroad. Choose your path - Left or Right: ");
		        String pathChoice = scanner.nextLine();

		        if (pathChoice.equalsIgnoreCase("left")) {
		            System.out.print("You've come to a lake. Would you like to swim across or wait? Swim/Wait: ");
		            String lakeChoice = scanner.nextLine();

		            if (lakeChoice.equalsIgnoreCase("wait")) {
		                System.out.print("You arrive at three doors - Red, Blue, and Yellow. Choose a door: ");
		                String doorChoice = scanner.nextLine();

		                if (doorChoice.equalsIgnoreCase("red")) {
		                    System.out.println("You opened the Red door and got burned by fire. Game Over!");
		                } else if (doorChoice.equalsIgnoreCase("blue")) {
		                    System.out.println("You opened the Blue door and got eaten by beasts. Game Over!");
		                } else if (doorChoice.equalsIgnoreCase("yellow")) {
		                    System.out.println("Congratulations! You opened the Yellow door and found the treasure. You Win!");
		                } else {
		                    System.out.println("You opened an unknown door. Game Over!");
		                }
		            } else {
		                System.out.println("You were attacked by trout. Game Over!");
		            }
		        } else {
		            System.out.println("You fell into a hole. Game Over!");
		        }

		        scanner.close();
		    }
		}


	


