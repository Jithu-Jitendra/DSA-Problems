package com.basicProblems;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		String s = sc.next();
		
		int n = s.length();
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			if(s.charAt(i) != '0' || s.charAt(i) != '1')
			{
				System.out.println("invalid binary format");
				System.exit(0);
			}
			if(s.charAt(i) == '1' )
			{
			sum = sum + (int)Math.pow(2, n-i-1);
			}
			
		}
		System.out.println("Decimal number for given binary string "+s+ " is : "+sum);
	}

}
