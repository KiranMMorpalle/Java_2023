package java_day4;

public class FindPrimeNumber 
{
	public String findPrime(int num)
	{
		boolean isPrime=true;
		
		for(int i=2; i*i<=num; i++)
		{
			if(num % i==0)
			{
				isPrime=false;
				break;
			}					
		}
		
		if(isPrime)
			return "Prime";
		else
			return "Not Prime";
	
	}

}

//output :
//	
//num=4
//Number is Not Prime
//
//num=15
//Number is Not Prime