package java_day4;

public class FindPrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindPrimeNumber objPrime= new FindPrimeNumber();
		
		for(int i=2; i<=100; i++)
		{
			String str=objPrime.findPrime(i);
			
			if(str.equals("Prime"))
				System.out.print(i+" ");
				
		}		
	}
}


//output:
//	
//	2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 