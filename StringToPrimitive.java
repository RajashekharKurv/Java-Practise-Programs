package Practise;

import java.util.Scanner;

public class StringToPrimitive {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string as a primitive type required to convert ");
		str=sc.next();
		int n = Integer.parseInt(str);
		System.out.println(n);
		
		

	}

}
