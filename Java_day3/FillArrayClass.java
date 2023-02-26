package Java_day3;

import java.util.Arrays;

public class FillArrayClass {
	
	public static void main(String args[])
	{
		int arr[]=new int [20];
		
		Arrays.fill(arr,0,10,10);  // start, end+1 , value
		Arrays.fill(arr,10,20,20); // start, end+1 , value
		
		System.out.println(Arrays.toString(arr));
		
	}
	

}
/*
 * output:
 
 [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20]

 */
