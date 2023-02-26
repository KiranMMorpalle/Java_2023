package Java_day3;

//import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) 
	{
		
		//int arr[]=new arr(5);
		//System.out.println(Arrays.toString(arr));
		
		System.out.println("Array of integer :\n");
		
		int arr[]= {10,52,32,46,88};
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.print(arr[i]+" ");			
		}
		
		
		//---------------------------------------------------------
		
		System.out.println("\n\nArray of string :\n");
		
		String names[]= {"Ravi", "Akash", "Amar", "Sandip"};
		
		for(int i=0; i<names.length; i++)
		{
			System.out.print(names[i]+" ");
		}
		
	}

}

//output :

//Array of integer :
//
//10 52 32 46 88 
//
//Array of string :
//
//Ravi Akash Amar Sandip 
