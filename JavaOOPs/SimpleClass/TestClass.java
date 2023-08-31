package Day28;

public class TestClass {

	public static void main(String[] args) {

		Student objStudent=new Student();
		
		objStudent.setName("Ravi");
		//System.out.println(objStudent.getName());
		objStudent.setRoll("A668");
		objStudent.setAddress("latur");
		objStudent.setMarks(88.86);
		
		System.out.println(objStudent.toString());

	}

}
