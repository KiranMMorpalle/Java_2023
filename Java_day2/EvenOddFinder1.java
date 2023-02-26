package Java_day2;

public class EvenOddFinder1 {

	
	public void printEvenInRange(int start, int end) 
	{	
		System.out.println("Even no in range "+start+" to "+end);
		
		for(int i=start; i<=end; i++) 
		{		
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
	
	
	public void printOddInRange(int start, int end) 
	{	
		System.out.println("\n\nOdd no in range "+start+" to "+end);
		
		for(int i=start; i<=end; i++) 
		{		
			if(i%2!=0)
				System.out.print(i+" ");
		}
	}
	
}
