package Practise;

import java.util.Scanner;

public class Factorial {
	
	public int factorial(int n1)
	{
		int i,fact=1;
		for(i=1;i<=n1;i++)
		{
			fact = fact *i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		int num;
		Factorial result = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get Factorial:");
		num = sc.nextInt();
		System.out.println("Factorial of "+num+" is :"+result.factorial(num));
		
	}

}
