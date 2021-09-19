package com.greatlearning.lab2.q2;

import java.util.Arrays;
import java.util.Scanner;

public class Traveler {
	Scanner sc = new Scanner(System.in);
	public int denominations, amount;
	public int[] currency;
	public int[] currencyCounter;
	public int[] destArray;

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
		reverse_array(currency, currency.length);
		while (Arrays.binarySearch(currency, 0) == -1) {
			System.out.println("Enter the amount you want to pay: ");
			amount = sc.nextInt();
			if (amount > 0) {
				currencyCounter = new int[denominations];
				for (int i = 0; i < destArray.length; i++) {
					if (amount >= destArray[i]) {
						currencyCounter[i] = amount / destArray[i];
						amount = amount - currencyCounter[i] * destArray[i];
					}
				}
				System.out.println("Your payment approach in order to give min no of notes will be: ");
				for (int i = 0; i < destArray.length; i++) {
					if (currencyCounter[i] != 0) {
						System.out.println(destArray[i] + " : " + currencyCounter[i]);
					}
				}
				break;
			} else {
				System.out.println("0 --> Invalid amount to pay");
				break;
			}
		}
		if (Arrays.binarySearch(currency, 0) >= 0) {
			System.out.println("0 --> Invalid denomination found");
		}
	}

	void reverse_array(int array[], int n) {
		destArray = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			destArray[j - 1] = array[i];
			j = j - 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Traveler notes = new Traveler();

		notes.insertValues();
		notes.currencyDenominations();
	}
}