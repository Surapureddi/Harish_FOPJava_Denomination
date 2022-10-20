package com.greatlearning.currencyDenomination;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations:");
		int size = sc.nextInt();
		int [] count = new int[size]; 
		int [] array = new int[size];		
		System.out.println("enter the currency denomination value:");
		for (int i = 0; i < size; i++) {
		  array[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay:");
		int amountPayable = sc.nextInt();
		
		for (int i=0; i < size; i++) {
			
			if(amountPayable >= array[i]) {
			count [i] = amountPayable/array[i];
		amountPayable = amountPayable - count[i]*array[i];
			}
		}
		if(amountPayable > 0) {
			System.out.println("Your payment approach in order to give min no of notes will be:");
		}
		else {
		System.out.println("amount cannot be printed with the given denomination");
		for(int j=0; j<size; j++) {
			System.out.println(array[j] + ":" + count[j]);
	}
		
	}
	}
	
}

	

	
	

