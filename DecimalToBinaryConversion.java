package com.basicProblems;

import java.util.Scanner;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		String bin = "";
		while(n > 0)
		{
			int rem = n%2;
			n = n/2;
			bin = rem+bin;
		}
		System.out.println("Binary number for "+temp+ " is : "+ bin);
	}

}
