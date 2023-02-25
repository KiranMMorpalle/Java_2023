package Java_day1;

public class Main {

	public static void main(String[] args) {

//		Calci calciObj = new Calci();
//		
//		System.out.println("Adiition is : "+calciObj.add(10, 20));
//		System.out.println("Adiition is : "+calciObj.sub(40, 20));
//		System.out.println("Adiition is : "+calciObj.mul(10, 15));

		
		
		
//		LoginValidator objLoginValidator= new LoginValidator();
//		
//		if(objLoginValidator.loginValidater("Admin", "1234"))
//			System.out.println("Login Succesfull..!!");
//		else
//			System.out.println("Login Failed..!!");
		

		
		
//		InterestCalculator objInterest=new InterestCalculator();
//		
//		double si=objInterest.calculateSimpleInterest(700000, 6, 12);
//		System.out.println("Simple Interest : "+si);
	
		

		
//		CurrencyConverter objCurrencyConverter= new CurrencyConverter();
//		
//		System.out.println("In INR : "+objCurrencyConverter.convertUSDtoINR(15));
		
		
		
		
		TemperatureConverter objTempConverter= new TemperatureConverter();
			
		double temp=objTempConverter.convertFahrenhaitToCelcius(45.25);
		System.out.println("Temperature in Celcius : "+temp);
	}

}
