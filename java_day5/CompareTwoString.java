package java_day5;

public class CompareTwoString {

	public static void main(String[] args) 
	{
		//1
		String str1="Arjun", str2="arJuN";
		
		System.out.println(str1.equalsIgnoreCase(str2));   // check string are equal or not without considering the case
		
		
		
		//2
		String fName="Bablu Pandit", lName="Pandit";
		
		System.out.println(fName.contains(lName));      // check if string is substring or not
		
		
		//3
		System.out.println(fName.substring(2, 5));    // return substring from given index range
		System.out.println(lName.substring(2, 5));
		
		
		//4
		String licenseNum="MH24AK1410";
		
		System.out.println(licenseNum.startsWith("MH"));  // check start with prefix
		
		//5
		String num="1213OTP";
		
		System.out.println(num.endsWith("OTP"));     // check end with suffix
	}

}


//output:
//	true
//	true
//	blu
//	ndi
//	true
//	true

