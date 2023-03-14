package java_day4;

public class FindMinMaxNumber 
{
	
	public int findMaxNumber(int arr[])
	{
		int max= Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
				max=arr[i];
		}
		
		return max;
	}
	
	
	
	public int findMinNumber(int arr[])
	{
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
				min=arr[i];
		}
		
		return min;
	}

}

//output:
//	Max no from array is : 181
//
//	Min no from array is : 4

