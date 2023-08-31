package Day31;

class First{
	void show() {
		System.out.println("First class called");
	}
}

class Second extends First{
	void show1() {
		System.out.println("Second class called");
	}
}
public class UpDownCastingExample {

	public static void main(String[] args) {

		First obj=(First)new Second();
		obj.show();
		
		Second obj1=(Second) obj;
		obj1.show1();	
	}
}

/* 
 * First class called
 * Second class called
 */

