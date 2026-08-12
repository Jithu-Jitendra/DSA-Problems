package com.basicProblems;

import java.util.Scanner;

public class findSecondmax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array elements");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int firstmax = arr[0];;
		int secondmax = Integer.MIN_VALUE;
		for(int num : arr)
		{
			if(firstmax < num)
			{
				secondmax = firstmax;
				firstmax = num;
			}
			else if(secondmax < num)
			{
				secondmax = num;
			}
		}
		System.out.println("second max : "+secondmax);
	}

}
