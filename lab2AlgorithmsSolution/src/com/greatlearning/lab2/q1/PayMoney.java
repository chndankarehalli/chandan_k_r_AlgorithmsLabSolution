package com.greatlearning.lab2.q1;

import java.util.Scanner;

public class PayMoney {
	public int sizeOfTransaction, targets, targetValue;
	public int transactionArray[];
	public boolean status = false;

	Scanner sc = new Scanner(System.in);

	void insertValues() {
		System.out.println("Enter the size of transaction array:");
		sizeOfTransaction = sc.nextInt();
		transactionArray = new int[sizeOfTransaction];
		for (int i = 0; i < transactionArray.length; i++) {
			int c = i + 1;
			System.out.println("Enter the values of transaction " + c + ":");
			transactionArray[i] = sc.nextInt();
		}
	}

	void traget() {
		System.out.println("Enter the total no of targets that needs to be achieved:");
		targets = sc.nextInt();
		for (int i = 1; i <= targets; i++) {
			System.out.println("Enter the value of target " + i + " :");
			targetValue = sc.nextInt();
			int temp = 0;
			for (int j = 0; j < transactionArray.length; j++) {
				if (targetValue <= transactionArray[j] + temp) {
					int d = j + 1;
					status = true;
					System.out.println("Target achieved after " + d + " transactions");
					break;
				} else {
					temp = temp + transactionArray[j];
				}
			}
		}
		if (status == false) {
			System.out.println("Given target is not achieved");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayMoney money = new PayMoney();
		money.insertValues();
		money.traget();
	}
}