package Practise;

import java.util.Scanner;

public class Series {
	
	public void series(int num)
	{
		int i=1, n1=1,n2=2,n3;
		
		System.out.println("*********  Sereis ***********");
		System.out.print(" "+n1 + " "+n2);
		for(;i<=num;i++)
		{
			n3 = n1*n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

	public static void main(String[] args) {
		int num;
		Series obj = new Series();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ther number to print  series up to that number ");
		num =sc.nextInt();
		obj.series(num);
		
		
	}

}
