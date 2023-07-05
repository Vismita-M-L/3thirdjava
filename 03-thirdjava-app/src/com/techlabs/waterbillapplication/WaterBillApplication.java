package com.techlabs.waterbillapplication;

import java.util.Scanner;

public class WaterBillApplication {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of units consumed: ");
		        int unitsConsumed = scanner.nextInt();

		        double meterCharge = 75;
		        double charge;

		        if (unitsConsumed <= 100) {
		            charge = unitsConsumed * 5;
		        } else if (unitsConsumed <= 250) {
		            charge = unitsConsumed * 10;
		        } else {
		            charge = unitsConsumed * 20;
		        }

		        double totalBill = charge + meterCharge;

		        System.out.println("Water Bill Calculation");
		        System.out.println("Number of Units Consumed: " + unitsConsumed);
		        System.out.println("Meter Charge: $" + meterCharge);
		        System.out.println("Charge: $" + charge);
		        System.out.println("Total Water Bill: $" + totalBill);

		        scanner.close();
		    }
		}

	

	


