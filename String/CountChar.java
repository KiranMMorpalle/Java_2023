package Day25;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		
		String name="Data Structure And Algorithm";
		
		char ch='A';
		int cnt=0;
				
		for(int i=0; i<name.length(); i++) {
			if((name.charAt(i))==ch)
				cnt++;
		}
		
		System.out.println(cnt);

	}

}
