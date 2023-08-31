package Day24;
import java.util.Scanner;

public class Loginpage {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String userName,password;
		
		System.out.println("Enter Username :");
		userName=sc.next();
		
		System.out.println("Enter Password :");
		password=sc.next();
		
		if(userName.equalsIgnoreCase("test") && password.equalsIgnoreCase("12345"))
			System.out.println("Login Success");
		else
			System.out.println("Login Failed");
	
	}

}
