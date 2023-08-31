package Day24;

public class StringSplit {

	public static void main(String[] args) {


		String name="mahendra singh dhoni";
		
		String words[]=name.split(" ");
		
		for(String str:words) {
			System.out.print((str.charAt(0)+"").toUpperCase());
		}
		

	}

}
