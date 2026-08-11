package com.basicProblems;

import java.util.Scanner;

public class DisariumNumber {

	//	135 = 1^1 + 3^2 + 5^3
	//	89 = 8^1 + 9^2
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number");
		int num = sc.nextInt();
		int temp = num;
		int n = Integer.toString(num).length();
		int sum = 0;
		while(n > 0)
		{
			int rem = num%10;
			sum = (int)(sum + Math.pow(rem,n));
			n--;
			num = num/10;
		}
		if(sum == temp)
		{
			System.out.println("Given number is Disarium Number");
		}
		else
		{
			System.out.println("Given  number is Not Disarium Number");
		}
	}

}
