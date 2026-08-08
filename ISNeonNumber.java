package com.basicProblems;

import java.util.Scanner;

public class ISNeonNumber {

	public static boolean isNeonNumber(int n)
	{
		int n1 = n*n;
		int sum = 0;
		while(n1 > 0)
		{
			sum = sum + n1%10;
			n1 = n1/10;
		}
		if(sum == n)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(isNeonNumber(n))
		{
			System.out.println(n + " is a Neon Number");
		}
		else
		{
			System.out.println(n + " is not a Neon Number");
		}
	}

}
