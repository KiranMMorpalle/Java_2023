package Day25;

public class VowelChecker {

	public static void main(String[] args) {

		String name1="Data Structure And Algorithm";
		
		String vowel="";
		
		//change case
		String name=name1.toLowerCase();
		
		StringBuilder str=new StringBuilder();
				
		for(int i=0; i<name.length(); i++) {
			if((name.charAt(i))=='a' || (name.charAt(i))=='e' || (name.charAt(i))=='i' ||
					(name.charAt(i))=='o' || (name.charAt(i))=='u') {
				str.append(name.charAt(i));
				vowel+=name.charAt(i);
			}			
			
//			if((name.charAt(i))=='A' || (name.charAt(i))=='E' || (name.charAt(i))=='I' || (name.charAt(i))=='O' || (name.charAt(i))=='U') {
//				str.append(name.charAt(i));
//			}				
		}
		System.out.println(vowel);
		System.out.println(str);
	

	}

}
