package Practise;

public class SrtingMethods {
	
	 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="abc",str2 = "AbC",str3="abc";
		
		
		// string methods
		
		//Note: Do not use the == operator to compare Strings
		
		// 1. equals() method      *********** will consider the case sensitive ************
		System.out.println("Two strings are equal: "+str1.equals(str2));
		System.out.println("Two strings are equal: "+str1.equals(str3));
		
		// 2. equalsIgnoreCase()   ********** it will ignore the case sensitive ********
		System.out.println("Two strings are  equal : "+str1.equalsIgnoreCase(str2));
		
		
		//3. constant string can compare with string variable
		
		System.out.println("constant string :"+ "ABC".equals(str3));
		System.out.println("constant string with ignore case:"+ "ABC".equalsIgnoreCase(str3));
		
		
		//4. compareTo()  it will the difference of two characters 
		
	
		System.out.println("compare string : "+ str1.compareTo(str2));
		
		
		// The two string references do not point to the same object
		if (str1 != str2) {
		System.out.println("The strings are not the same object");
		}
		
	    /* toUpperCase to convert all characters to upper case
		toLowerCase to convert all characters to lower case  */
		
		System.out.println("Converting Upper case :"+str1.toUpperCase());
		System.out.println("Converting to lowercase :"+str2.toLowerCase());
		
		
		// To find a string with in other string   contains()
		
		System.out.println("str2 is present in str1: "+str1.contains(str2));
		
		
	
		
		
	}

}
