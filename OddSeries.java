package Practise;

import java.util.Scanner;

public class OddSeries {
	
	public void oddSeries(int num)
	{
		int i=1;
		System.out.println("********* Odd Sereis ***********");
	
		for(;i<=num;i++)
		{
			if(i%2 ==1)
			System.out.print(" "+i);
		}
		
	}

	public static void main(String[] args) {
		int num;
		OddSeries obj = new OddSeries();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ther number to print odd series up to that number ");
		num =sc.nextInt();
		obj.oddSeries(num);
		
		
	}

}
