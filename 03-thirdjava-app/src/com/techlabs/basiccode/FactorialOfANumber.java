package com.techlabs.basiccode;

public class FactorialOfANumber {

	
		    public static int factorial(int n) {
		        int result = 1;
		        
		        for (int i = 1; i <= n; i++) {
		            result *= i;
		        }
		        
		        return result;
		    }

		    public static void main(String[] args) {
		        int number = 5; // Change this value to calculate factorial for a different number
		        
		        int factorial = factorial(number);
		        System.out.println("Factorial of " + number + " is: " + factorial);
		    }
		


	}


