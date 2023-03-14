package java_day5;

public class CompareString {

	public static void main(String[] args) 
	{
		
		String str1="Ravi";
		String str2="Kumar";
		
		//1. using equals() method
		
		if(str1.equals(str2))
			System.out.println("Both strings are equals.");
		else
			System.out.println("Both strings are NOT equals.");
		
		
		//2. using ==
		
		if(str1==str2)
			System.out.println("\nBoth strings are equals.");
		else
			System.out.println("\nBoth strings are NOT equals.");
	}

}

//output :
//	Both strings are NOT equals.
//
//	Both strings are NOT equals.

