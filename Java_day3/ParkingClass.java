package Java_day3;

public class ParkingClass {

	public static void main(String[] args) 
	{
		int arr[][]= new int[6][10];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if((i+j)%2==0)
					arr[i][j]=0;
				else
					arr[i][j]=1;
			}
		}
		
		//printing array
		int cnt=0, vacant=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");
				
				if(arr[i][j]==0)
					cnt++;
				else
					vacant++;
			}
			System.out.println();
		}
		
		
		//find available & vacant parking slots
		
//		int cnt=0, vacant=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=0; j<arr.length; j++)
//			{
//				if(arr[i][j]==0)
//					cnt++;
//				else
//					vacant++;
//			}
//		}
		
		System.out.println("\nAvailable Parking slots : "+cnt);
		
		System.out.println("Number of vehical parked : "+vacant);

	}

}



//output:
//	
//	
//	0 1 0 1 0 1 
//	1 0 1 0 1 0 
//	0 1 0 1 0 1 
//	1 0 1 0 1 0 
//	0 1 0 1 0 1 
//	1 0 1 0 1 0 
//
//	Available Parking slots : 18
//	Number of vehical parked : 18

