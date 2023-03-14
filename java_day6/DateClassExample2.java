package java_day6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassExample2 {

	public static void main(String[] args) 
	{
		
		//Date objDate= new Date();
		
		
		//1
		try {
			SimpleDateFormat objFormat= new SimpleDateFormat("dd-MM-yyyy");
			
			String dateString="01-01-2023";
			Date objDate=objFormat.parse(dateString);
			
			System.out.println(objDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//2
		try {
			SimpleDateFormat objFormat1= new SimpleDateFormat("dd-MMM-yyyy");
			String dateString1="01-Feb-2023";
			
			Date objDate1=objFormat1.parse(dateString1);
			
			System.out.println(objDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//3
		
		try {
			SimpleDateFormat objFormat2= new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
			String dateString2="01-Feb-2023 12:00:00";
			
			Date objDate2=objFormat2.parse(dateString2);
			System.out.println(objDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//4
		try {
			SimpleDateFormat objFormat3= new SimpleDateFormat("dd-MMMMM-yyyy");
			String dateString3="01-March-2023";
			
			Date objDate3=objFormat3.parse(dateString3);
			System.out.println(objDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


//output:
//	Sun Jan 01 00:00:00 IST 2023
//	Wed Feb 01 00:00:00 IST 2023
//	Wed Feb 01 12:00:00 IST 2023
//	Wed Mar 01 00:00:00 IST 2023

