package Day29;
class A{
	
	A(){
		System.out.println("A constructor called");
	}
	A(int a){
		this();
		System.out.println("A Parametrized constructor called");
	}
}


class B extends A{
	B(){
		this(9);
		System.out.println("B constructor called");
	}
	
	B(int n){ 
		super(3);
		System.out.println("B Parametrized constructor called");
	}
}

public class MultilevelInheritance2 extends B{
	
	MultilevelInheritance2(){
		super();
	}

	public static void main(String[] args) {
		MultilevelInheritance2 obj=new MultilevelInheritance2();
	}

}
