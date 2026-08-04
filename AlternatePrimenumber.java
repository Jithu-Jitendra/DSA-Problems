package com.basicProblems;

import java.util.Scanner;

public class AlternatePrimenumber {

	public static boolean isPrime(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 2; i <= n; i++)
		{
			boolean status = isPrime(i);
			if(status)
			{
				if(cnt%2 == 0)
				{
					System.out.print(i+" ");
				}
				cnt++;
			}
		}
	}

}
