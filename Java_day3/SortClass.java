package Java_day3;

import java.util.Arrays;

public class SortClass {
	
	public static void main(String args[]) 
	{
		
		int arr[]= {88,5,76,95,23,80,7};
		
		
		System.out.println("Befor sorting integer array :\n");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		
		Arrays.sort(arr);
		
		System.out.println("\n\nAfter sorting integer array :\n");
		for(int num1: arr)
		{
			System.out.print(num1+" ");
		}
		
		
		System.out.println("\n-----------------------------------------");
		
		
		String city[]= {"Latur","Pune","Mumbai","Banglore","Goa"};
				
		System.out.println("\n\nBefore sorting string array :\n");
		
		for(String str : city)
		{
			System.out.print(str+" ");
		}
		
		Arrays.sort(city);
			
		System.out.println("\n\n\nAfter sorting string array :\n");
		
		for(String str1 : city)
		{
			System.out.print(str1+" ");
		}
	}

}

/*
  output:
  
Before sorting integer array :

88 5 76 95 23 80 7 

After sorting integer array :

5 7 23 76 80 88 95 
-----------------------------------------


Before sorting string array :

Latur Pune Mumbai Banglore Goa 


After sorting string array :

Banglore Goa Latur Mumbai Pune 
 */

