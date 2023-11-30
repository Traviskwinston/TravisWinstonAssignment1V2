package com.coderscampus;

import java.util.*;
import java.text.NumberFormat;

//recreated the Java Assignment 1 using Methods instead.
public class TravisWinstonAssignment1V2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double initialInvestment = takeInput(scan, "Type in your starting investment:\n$", 0.0, 1000000);
		double interestRate = takeInput(scan, "Type in your interest rate (as a percent):\n", 0, 100)/100;
		
		for (int i = 1; i <= 30; i++) {
			initialInvestment = initialInvestment * (interestRate + 1.0);
			if (i % 5 == 0) {
				System.out.println("After " + i + " years, you would have: " +
				NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(initialInvestment));
			}
		}
		scan.close();
	}

	private static double takeInput(Scanner scan, String message, double min, double max) {
		System.out.print(message);
		double returnValue = scan.nextDouble();
		while (returnValue < min || returnValue > max) {
			System.out.println("Invalid input, Please enter a number between " + min + " and " + max);
			returnValue = scan.nextDouble();
		}
		return returnValue;
	}

}
