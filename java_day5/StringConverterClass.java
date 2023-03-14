package java_day5;

public class StringConverterClass {

	public static void main(String[] args) 
	{
		
		//1
		
		String name="Ravi";
		
		System.out.println("Upper Case : "+name.toUpperCase());    // convert in upper case
		
		System.out.println("Lower Case : "+name.toLowerCase());     // convert in lower case
		
		
		
		//2
		
		String str=" Jugad  ";
		
		System.out.println(str.stripLeading());   // remove leading (start) space
		
		System.out.println(str.stripTrailing());   // remove trailing (end) space
		
		System.out.println(str.strip());   // remove both leading & trailing space
		
		
	}

}




//output:
//	Upper Case : RAVI
//	Lower Case : ravi

//Jugad  
//Jugad
//Jugad
