package com.bridgelabz.day6;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=n/2;i++)
		{
			if(n%i == 0)
			{
				sum += i;
			}
		}
		
		if(sum == n)
			System.out.println("Given number " + n + " is perfect number!!" );
		else
			System.out.println("Given number " + n + " is not a perfect number!!" );
		sc.close();
	}

}
