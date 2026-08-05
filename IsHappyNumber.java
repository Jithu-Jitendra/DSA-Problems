package com.basicProblems;

//2. Write a Java program to check a number is happy number or not?
//input:19
//output: 19 is a happy number

//A Happy Number is a number that eventually becomes 1 
//when you repeatedly replace it with the sum of the squares of its digits.
//
//If the process enters a cycle that does not include 1, 
//the number is not a happy number
import java.util.Scanner;

public class IsHappyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int temp = n;
		
		while(n > 9)
		{
		int sum = 0;
		while(n > 0)
		{
			int rem = n%10;
			sum = sum+(rem*rem);
			n = n/10;
		}
		n = sum;
		}
		if(n == 1 || n == 7)
		{
			System.out.println("The given Number "+temp+ " is Happy Number");
		}
		else
		{
			System.out.println("The given Number "+temp+ " is not Happy Number");
		}
	}
}
