package Practise;

import java.util.Scanner;

public class Calculator {
	
	
	void calc(int n1, int n2, char c)
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
	
		System.out.println(n1 + "" +c+""+n2 +"= " +result);
	}

	public static void main(String[] args) {
		int num1,num2,result;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two  numbers to do arithmetic operation");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		System.out.println("Enter operator to do arithmetic operation");
		str = sc.next();
		char operator = str.charAt(0);
		Calculator obj = new Calculator();
		obj.calc(num1,num2,operator);
		
	}

}
