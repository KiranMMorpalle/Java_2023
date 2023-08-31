package Day31;

public class TypeCastingClass {

	public static void main(String[] args) {
		
		int n=10;
		double num=Math.PI*n*n;
		System.out.println(num);
		
		int num2=(int) num;
		System.out.println(num2);
	}
}

//output :
//314.1592653589793
//314
