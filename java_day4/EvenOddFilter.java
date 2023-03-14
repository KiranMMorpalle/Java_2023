package java_day4;

public class EvenOddFilter 
{
	
	public String isEven(int num)
	{
		if(num%2==0)
			return "Even";
		else
			return "Not Even";
	}

	
	public String isOdd(int num)
	{
		if(num%2!=0)
			return "Odd";
		else
			return "Not Odd";
	}
	
	public void filterEven(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			if(isEven(arr[i]).equals("Even"))
				System.out.print(arr[i]+" ");
		}
	}
	
	public void filterOdd(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			if(isOdd(arr[i]).equals("Odd"))
				System.out.print(arr[i]+" ");
		}
	}

}


//output:
//	num=4
//	Even
//	
//	num=7
//	Odd
//	
//	Even no in array :
//	54 72 36 22 
//	
//	Odd no in array :
//	65 45 65 35 