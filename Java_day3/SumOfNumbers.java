package Java_day3;

public class SumOfNumbers 
{
	public static void main(String args[])
	{
		//Sum of no. from 1 to 100
		
		int sum=0;
		for(int i=1; i<=100; i++)
		{
			sum =sum+i;
		}
		
		System.out.println("Sum of no. from 1 to 100 : "+sum);
		
		
		int num=100;
		System.out.println("\nSum of no. from 1 to 100 using formula : "+(num*num+1)/2);
		
		
		
		int num1=5, fact=1;
		
		for(int i=1; i<=num1; i++)
		{
			fact=fact*i;
		}
		
		System.out.println("\nFactorial of "+num1+" is : "+fact);
	}

}



//output:
//	
//	Sum of no. from 1 to 100 : 5050
//
//	Sum of no. from 1 to 100 using formula : 5000
//
//	Factorial of 5 is : 120

