package Day30;

class First{
	public void show() {
		System.out.println("First method call");
	}
}

class Second extends First{
	public void show() {
		System.out.println("Second method call");
	}
}

class Third extends First{
	public void show() {
		System.out.println("Third method call");
	}
}
public class OverridingExample{

	public static void main(String[] args) {
		
		
		//dynamic method dispatch
		First obj=new First();  // reference call
		obj.show();
		
		// for both second & third class we     ss object cannot define new object for them
		//because first class object is reference call
		obj=new Second();     
		obj.show();
		
		obj=new Third();
		obj.show();

	}

}
