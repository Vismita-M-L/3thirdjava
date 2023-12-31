package com.techlabs.basiccode;

public class PrimeOrNot {
	
	    public static  boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        int number = 17; // Change this value to check for a different number
	        
	        boolean isPrime = isPrime(number);
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}



