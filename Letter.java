package Practise;

import java.util.Scanner;

public class Letter {
	
	
	public void letter(String str, char ch)
	{
		int i=0,count=0;
		for(;i < str.length();i++)
		{
			if(ch == str.charAt(i) || ch == str.charAt(i)-32 || ch == str.charAt(i)+32 )
			{
				count++;
			}
		}
		
		System.out.println("No of characters of *"+ch +"* is: "+count);
	}
	

	public static void main(String[] args) {
		
		char ch;
		String str;
		Letter obj = new Letter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		str = sc.nextLine();
		System.out.println("Enter character to find in String: ");
		ch = sc.next().charAt(0);
		
	    obj.letter(str, ch);;
	    
		

	}

}
