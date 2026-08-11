package com.basicProblems;

import java.util.Scanner;

public class AutomorphicNumber {
//An automorphic number is a number whose square ends with the same digits as the number itself.

//Examples
//5
//5^2 = 25
//Ends with 5 ✔️
//25^2 = 625
//Ends with 25 ✔️
//76
//76^2 = 5776
//Ends with 76 ✔️
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number");
		int num = sc.nextInt();
		int n = Integer.toString(num).length();
		
		int sqNum = num*num;
		int sum = 0;
		int x = 1;
		while(n > 0)
		{
			int rem = sqNum%10;
			sum = sum + (x*rem);
			x = x*10;
			sqNum = sqNum/10;
			n--;
		}
		if(sum == num)
		{
			System.out.println("Given number is automorphic number");
		}
		else
		{
			System.out.println("Given number is Not automorphic number");
		}
	}

}
