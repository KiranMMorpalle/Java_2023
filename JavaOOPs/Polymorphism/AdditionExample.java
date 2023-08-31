package Day30;
//method overloading
class Calci{
	
	int add(int a,int b) {
		return a+b;
	}
	
	double add(int a,double b){
		return a+b;
	}
	double add(double b, int a){
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class AdditionExample extends Calci{

	public static void main(String[] args) {


		AdditionExample obj=new AdditionExample();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 13.23));
		System.out.println(obj.add(33.4, 20));
		System.out.println(obj.add(40,10,20));
		
	}

}
