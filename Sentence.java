package Practise;

import java.util.Scanner;

public class Sentence {
	
	public void sentence(String str)
	{
		char ch;
		int i=0;
		int Uppercase_count=0,lowercase_count=0,Number_count=0,Space_count=0,Specialchar_count=0;
		
		
	  for(;i < str.length();i++)
		{
		  ch =str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				Uppercase_count++;
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				lowercase_count++;
			}
			else if(ch >= '0' && ch <= '9')
			{
				Number_count++;
			}
			else if(ch == ' ')
			{
				Space_count++;
			}
			else 
			{
				Specialchar_count++;
			}
			
			
		}
	    
	    System.out.println("No. odf UpperCase Letters : "+Uppercase_count);
	    System.out.println("No of Lowercase Count : "+lowercase_count);
	    System.out.println("No of Numerical Count : "+Number_count);
	    System.out.println("No of Spaces Count : "+Space_count);
	    System.out.println("No of Special Character Count :"+Specialchar_count);
	    
	}

	public static void main(String[] args) {
		Sentence obj = new Sentence();
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence to find the Lowercase , Uppercase, Spaces , Nummbers,Special characters");
		str=sc.nextLine();
		
		obj.sentence(str);

	}

}
