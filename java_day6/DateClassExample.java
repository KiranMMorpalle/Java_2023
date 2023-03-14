package java_day6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassExample {

	public static void main(String[] args) 
	{
		Date objDate= new Date();
		
		
		//1
		SimpleDateFormat objFormat= new SimpleDateFormat("dd-MM-yy");  
		
		System.out.println(objFormat.format(objDate));
		
		
		//2
		SimpleDateFormat objFormat1= new SimpleDateFormat("dd-MMM-yyyy");  
		
		System.out.println(objFormat1.format(objDate));
		
		
		//3
		SimpleDateFormat objFormat2= new SimpleDateFormat("dd-MMMMM-yyyy HH:mm:ss");  
		
		System.out.println(objFormat2.format(objDate));
		
		
		
		//4
		SimpleDateFormat objFormat3= new SimpleDateFormat("dd-MMMMM-yyyy HH:mm:ss S");  
		
		System.out.println(objFormat3.format(objDate));
		
		
		
		//5
		SimpleDateFormat objFormat4= new SimpleDateFormat("EEE dd-MMMMM-yyyy HH:mm:ss");  
		
		System.out.println(objFormat4.format(objDate));
		
		
		
		//6
		SimpleDateFormat objFormat5= new SimpleDateFormat("EEEE dd-MMMMM-yyyy HH:mm:ss");  
		
		System.out.println(objFormat5.format(objDate));
		

	}

}


//output:
//	06-03-23
//	06-Mar-2023
//	06-March-2023 19:42:21
//	06-March-2023 19:42:21 611
//	Mon 06-March-2023 19:42:21
//	Monday 06-March-2023 19:42:21



