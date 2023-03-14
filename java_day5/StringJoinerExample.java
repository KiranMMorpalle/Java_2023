package java_day5;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args)
	{
		//1
		StringJoiner objJoiner= new StringJoiner("-");
		
		objJoiner.add("India");
		objJoiner.add("Russia");
		objJoiner.add("Israel");
		objJoiner.add("Japan");
		
		System.out.println(objJoiner);
		
		
		//2
		StringJoiner objJoiner1= new StringJoiner("##");
		
		objJoiner1.add("India");
		objJoiner1.add("Russia");
		objJoiner1.add("Israel");
		objJoiner1.add("Japan");
		
		System.out.println(objJoiner1);
		
		
		//3
		StringJoiner objJoiner2= new StringJoiner(", ","[", "]");   //(", ","[", "]");
		
		objJoiner2.add("India");
		objJoiner2.add("Russia");
		objJoiner2.add("Israel");
		objJoiner2.add("Japan");
		
		System.out.println(objJoiner2);
		
		
		//4
		StringJoiner objJoiner3= new StringJoiner(", ","([","])" );   //(", ","[", "]");
		
		objJoiner3.add("India");
		objJoiner3.add("Russia");
		objJoiner3.add("Israel");
		objJoiner3.add("Japan");
		
		System.out.println(objJoiner3);		

	}
}


//output:
//	India-Russia-Israel-Japan
//	India##Russia##Israel##Japan
//	[India, Russia, Israel, Japan]
//	([India, Russia, Israel, Japan])

