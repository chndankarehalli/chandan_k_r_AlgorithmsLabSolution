package com.greatlearning.lab2.q1;

import java.util.Scanner;

public class PayMoney {
	public int sizeOfTransaction, targets, targetValue, temp;
	public int transactionArray[];
	
	Scanner sc = new Scanner(System.in);

	void insertValues() {
		System.out.println("Enter the size of transaction array:");
		sizeOfTransaction = sc.nextInt();
		transactionArray = new int[sizeOfTransaction];
		for (int i = 0; i < transactionArray.length; i++) {
			System.out.println("Enter the values of transaction " + (i + 1) + ":");
			transactionArray[i] = sc.nextInt();
		}
	}

	void traget() {
		System.out.println("Enter the total no of targets that needs to be achieved:");
		targets = sc.nextInt();
		for (int i = 1; i <= targets; i++) {
			System.out.println("Enter the value of target " + i + " :");
			temp = 0;
			targetValue = sc.nextInt();
			while (targetValue > 0) {
				for (int j = 0; j < transactionArray.length; j++) {
					if (targetValue <= transactionArray[j] + temp) {
						System.out.println("Target achieved after " + (j + 1) + " transactions");
						break;
					} else {
						temp = temp + transactionArray[j];
					}
				}
				break;
			}
			if (targetValue <= 0) {
				System.out.println("Invalid target value");
				break;
			}
			if (sumarry(transactionArray) < targetValue) {
				System.out.println("Given target is not achieved");
			}
		}
	}

	int sumarry(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayMoney money = new PayMoney();
		money.insertValues();
		money.traget();
	}
}