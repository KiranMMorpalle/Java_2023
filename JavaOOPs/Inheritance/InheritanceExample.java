package Day29;

class SingleInheritance{
	void show() {
		System.out.println("Show method called");
	}
}

public class InheritanceExample extends SingleInheritance {

	public static void main(String[] args) {
		
		InheritanceExample obj=new InheritanceExample();
		obj.show();
	}

}
