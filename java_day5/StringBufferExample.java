package java_day5;

public class StringBufferExample 
{
	String str;
	StringBufferExample(String str)
	{
		this.str=str;
	}

	
	public static void main(String[] args) 
	{
		
		
		//1
		StringBuffer sb= new StringBuffer();
		
		sb.ensureCapacity(100);
		sb.append("Namaste");
		
		System.out.println("String is : "+sb+"\nCapacity is : "+sb.capacity());
		
		
		
		//2
		StringBufferExample objStrinBuffer=new StringBufferExample(" Duniya");
		
		sb.append(objStrinBuffer.str);
		System.out.println("\nString is : "+sb);
		
		
		
		//3
		
		sb.insert(7, "Hello");
		System.out.println("\nString is : "+sb);
		
		
		//4
		sb.delete(7, 12);
		System.out.println("\nString is : "+sb);
		
		
		//5
		sb.replace(0, 6, "Welcome");
		System.out.println("\nString is : "+sb);
		
		
		//6
		sb.reverse();
		System.out.println("\nString is : "+sb);
	}

}


//output:
//	String is : Namaste
//	Capacity is : 100
//
//	String is : Namaste Duniya
//
//	String is : NamasteHello Duniya
//
//	String is : Namaste Duniya
//
//	String is : Welcomee Duniya

//  String is : ayinuD eemocleW