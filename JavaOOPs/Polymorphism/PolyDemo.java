package Day30;
class Person{
	void displayDetails(int age, String name) 
	{
		System.out.println(name+" : "+age);
	}
}

public class PolyDemo extends Person {
	void displayDetails(String name, int age) 
	{
		System.out.println(name+" : "+age);
	}
	
	public static void main(String[] args) {
		
		PolyDemo obj=new PolyDemo();
		obj.displayDetails(22, "Ravi");
		
		obj.displayDetails("Ajay", 23);
	}

}
