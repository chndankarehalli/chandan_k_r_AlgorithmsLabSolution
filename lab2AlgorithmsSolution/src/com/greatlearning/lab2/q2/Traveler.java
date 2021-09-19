package com.greatlearning.lab2.q2;

import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Traveler {
	Scanner sc = new Scanner(System.in);
	public int denominations, amount;
	public int[] currency;
	public int[] currencyCounter;

	void insertValues() {
		System.out.println("Enter the size of currency denominations: ");
		denominations = sc.nextInt();
		currency = new int[denominations];
		System.out.println("Enter the currency denominations value: ");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}
	}

	void currencyDenominations() {
		Arrays.sort(currency);
		System.out.println("Enter the amount you want to pay: ");
		amount = sc.nextInt();
		currencyCounter = new int[denominations];
		for (int i = currency.length-1; i >= 0; i--) {
			if (amount >= currency[i]) {
				currencyCounter[i] = amount / currency[i];
				amount = amount - currencyCounter[i] * currency[i];
			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be: ");
		for (int i = 0; i < currency.length; i++) {
			if (currencyCounter[i] != 0) {
				System.out.println(currency[i] + " : " + currencyCounter[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Traveler notes = new Traveler();

		notes.insertValues();
		notes.currencyDenominations();
	}
}