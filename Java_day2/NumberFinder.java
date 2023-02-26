package Java_day2;

public class NumberFinder {
	
	public void printEvenDivisible(int start, int end, int num)
	{
		System.out.println("Even no in range "+start+" to "+end+" & divisible by "+num+" : ");
		
		int i=start;
		
		while(i<=end)
		{
			if(i%2==0 && i%num==0)
				System.out.print(i+" ");
			
			i++;
		}
		
	}
	
	
	public void printOddDivisible(int start, int end, int num)
	{
		System.out.println("\n\nOdd no in range "+start+" to "+end+" & divisible by "+num+" : ");
		
		int i=start;
		
		while(i<=end)
		{
			if(i%2!=0 && i%num==0)
				System.out.print(i+" ");
			
			i++;
		}
		
	}

}
