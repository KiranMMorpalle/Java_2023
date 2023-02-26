package Java_day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//infinite for loop
				
		//		for(int i=0; i>=0; i++)
		//		{
		//			System.out.println(i);
		//		}
		
		
		int num=123;
		float num2=34.54f;
		double num3=67.10;
		String name="ravi";
		
		
		System.out.println("Using for loop :");
		
		for(int i=0; i<5; i++) {
			System.out.println(num+" "+num2+" "+num3+" "+name);
		}
		
		
		//---------------------------------
		System.out.println("\nUsing while loop :");
		
		int i=0;
		
		while(i<=5) {
			System.out.println(num+" "+num2+" "+num3+" "+name);
			
			i++;
		}

	}

}
