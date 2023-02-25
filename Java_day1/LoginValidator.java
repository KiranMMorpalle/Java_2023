package Java_day1;

public class LoginValidator {
	
	String userName="Admin";
	String password="1234";
	
	public boolean loginValidater(String user, String pass)
	{
		if(user==userName && password==pass)
			return true;
		else
			return false;
	}

}
