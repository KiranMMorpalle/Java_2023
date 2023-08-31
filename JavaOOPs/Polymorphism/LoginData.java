package Day30;

class Admin{
	public void login() {
		System.out.println("Admin login");
	}
}

class Staff extends Admin{
	public void login() {
		System.out.println("Staff login");
	}
}

class Student extends Admin{
	public void login() {
		System.out.println("Student login");
	}
}
public class LoginData extends Admin{

	public static void main(String[] args) {
		
		String uname,pass;
		uname="student103";
		pass="1234";
		
		String str="";
		
		for(int i=0; i<uname.length(); i++) {
			if(Character.isDigit(uname.charAt(i))) {   // if(ch[i]>=48 && ch[i]<=58)
				str+=uname.charAt(i);
			}
		}
		Integer.parseInt(str);

		
		Admin obj=new Admin();
		
		if(uname.contains("admin") && pass.contains("123")){
			obj.login();
		}
		else if(uname.contains("staff") && pass.contains("1234"))
		{		
			obj=new Staff();
			obj.login();	
			System.out.println("Staff ID : "+str);
		}
		else {
			obj=new Student();
			obj.login();
			System.out.println("Student ID : "+str);
		}
			

	}

}
