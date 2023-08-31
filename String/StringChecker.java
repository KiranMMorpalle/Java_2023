package Day25;

import java.util.Arrays;

public class StringChecker {

	private static int[] stringChecker(String name) {
		
		String str="";
		
		int vowel=0, con=0, digit=0;
		
		for(int i=0; i<name.length(); i++) 
		{
			if((name.charAt(i))=='a' || (name.charAt(i))=='e' || (name.charAt(i))=='i' ||
					(name.charAt(i))=='o' || (name.charAt(i))=='u') {
				vowel++;
			}
//			else if((name.charAt(i)>=48 && name.charAt(i)<=58))
//					digit++;
			else if(Character.isDigit(name.charAt(i)))
				digit++;     
			else
				con++;
				
		}
		
		return new int[] {vowel,digit,con};
	}

	public static void main(String[] args) {

		String str="a1e4f3i8u9";
		
		int result[]=stringChecker(str);
				
		System.out.println(Arrays.toString(result));
		
	}

}
