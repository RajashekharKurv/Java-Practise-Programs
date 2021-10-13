package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		int capacity = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter capacity of Arraylist");
		capacity = sc.nextInt();
		
		ArrayList<String> stu = new ArrayList<String>(capacity);
		String c[] = new String[capacity];
		System.out.println("Enter Names in to the string array");
		for(int i=0;i<capacity;i++)
		{
		    c[i] = sc.next();
		}
		
		System.out.println("Display String Array elements");
		for(String d :c)
			System.out.println(d);
	
		
		System.out.println("Adding string array to arraylist elemets");
		List<String> list = Arrays.asList(c);
		ArrayList<String> stu1 = new ArrayList<String>(list);
		stu1.add("Raja");
		
		System.out.println("Display Arraylist Elements");
		for(String s:stu1)
			System.out.print(" "+s);
		
		
		
		
	}

}
