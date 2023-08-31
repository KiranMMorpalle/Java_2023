package Day29;
class First{
	First(){
		System.out.println("A constructor called");
	}
	First(int a){
		this();
		System.out.println("A Parametrized constructor called");
	}
}


class Second extends First{
	Second(){
		super(3);
		System.out.println("B constructor called");
	}
	
	Second(int n){
		this();
		System.out.println("B Parametrized constructor called");
	}
}



public class MultilevelInheritance extends Second{
	
	MultilevelInheritance(){
		super(10);
	}

	public static void main(String[] args) {
		
		MultilevelInheritance obj=new MultilevelInheritance();

	}

}
