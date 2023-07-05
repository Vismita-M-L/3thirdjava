package com.techlabs.basiccode;

public class FibinocciSeries {
	
	    public static void printFibonacciSeries(int n) {
	        if (n <= 0) {
	            return;
	        }
	        
	        int firstNum = 0;
	        int secondNum = 1;
	        
	        System.out.print("Fibonacci Series: ");
	        
	        for (int i = 1; i <= n; i++) {
	            System.out.print(firstNum + " ");
	            
	            int nextNum = firstNum + secondNum;
	            firstNum = secondNum;
	            secondNum = nextNum;
	        }
	    }

	    public static void main(String[] args) {
	     int n = 10; // Change this value to print a different number of Fibinocci series
	        
	        printFibonacciSeries(n);
	    }
	}



