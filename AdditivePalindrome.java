package com.basicProblems;

import java.util.Scanner;

//Problem statement
//******************************
//You are given a positive integer N.
//
//In one operation:
//
//Reverse the digits of N.
//Add the reversed number to N.
//
//Repeat this process until the resulting number becomes a 
//palindrome (a number that reads the same forward and backward).
//
//Your task is to determine:
//
//the palindrome obtained, and/or
//the number of operations required to reach it (depending on the version of the problem).
//
//Example
//input : 87
//output:4
//explanation:
//87 + 78 = 165
//165 + 561 = 726
//726 + 627 = 1353
//1353 + 3531 = 4884
public class AdditivePalindrome {

	public static int reverse(int n)
	{
		int rev = 0;
		while(n > 0)
		{
			int rem = n%10;
			rev = rev*10+rem;
		    n = n/10;
		}
		return rev;
	}
	
	public static boolean isPalindrome(int n)
	{
		int x = reverse(n);
		if(x == n)
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int cnt = 0;
		
		while(!isPalindrome(n))
		{
			cnt++;
			n = n+reverse(n);
		}
		System.out.println("count : "+cnt);
	}

}
