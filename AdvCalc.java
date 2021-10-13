package Practise;

import java.util.Scanner;

public class AdvCalc {
	
	
	int calc(int n1, int n2, char c)
	{
		int result=0;
		switch(c)
		{
		case '+':result = n1+n2;
		break;
		case '-':result = n1-n2;
		break;
		case '*':result = n1*n2;
		break;
		case '/':result = n1/n2;
		break;
		case '%':result = n1%n2;
		break;
		
		}
		System.out.println("Result = "+result);
	
		return result;
	}
	
	public static void main(String[] args) {
		int num1,num2,result=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numer");
		num1 =sc.nextInt();
		result = num1;
		while(true)
		{
			
			System.out.println("Enter  +,-,*,/,%  operator to do arithmetic operation or Enter Q/q to reset operation");
			char operator = sc.next().charAt(0);  
			
			if(operator == 'q' || operator  == 'Q') {
				System.out.println("Operation  reset is done :");
				result =0;
				System.out.println("Enter numer1");
				num1 =sc.nextInt();
				result = num1;
				
			
			}
			else
			{
				System.out.println("Enter next  number to do arithmetic operation");
				
				num2 =sc.nextInt();
				
				AdvCalc obj = new AdvCalc();
				result = obj.calc(result,num2,operator);
			}	
		}
	}
}
