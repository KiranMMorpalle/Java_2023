package java_day5;

public class MainClass {

	public static void main(String[] args) 
	{
		CompareString1 objCompare= new CompareString1("John","Wick");
		
		//1. using equals()
		
		if(objCompare.str1.equals(objCompare.str2))
			System.out.println("Both strings are equals.");
		else
			System.out.println("Both strings are NOT equals.");
		
		
		//2. using ==
		
		if(objCompare.str1==objCompare.str2)
			System.out.println("\nBoth strings are equals.");
		else
			System.out.println("\nBoth strings are NOT equals.");
	}

}


//output :
//	Both strings are NOT equals.
//
//	Both strings are NOT equals.
