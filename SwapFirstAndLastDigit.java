package com.basicProblems;


//1. Write a Java program to swap the first and last digits of a 
//given number using loops?
//input: 12345
//output: 52341

import java.util.Scanner;

public class SwapFirstAndLastDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int temp = n;
		int digitCount = Integer.toString(n).length();
		int digitCountTemp = digitCount-2;
		int unitDigit = n%10;
		
		int x = 1;
		for(int i = 0; i <  digitCountTemp;i++ )
		{
			x = x*10;
		}
		temp = temp/10;
		
		int middleNumber= temp%x;
		int lastDigit = temp/x;
		
		int newNumber = ((middleNumber*10)+lastDigit);
		newNumber = (unitDigit*x*10)+newNumber;
		System.out.println("Swapped Number : "+ newNumber);
	}

}
