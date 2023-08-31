package Day28;

class StudentInfo{
	String roll,name;// dept,college;
	
	static String dept="cse",college="sbpcoe";

	public StudentInfo(String roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
//		this.dept = "Computer";
//		this.college = "SB Patil,Indapur";
	}

	@Override
	public String toString() {
		return "StudentInfo [roll=" + roll + ", name=" + name + ", dept=" + dept + ", college=" + college + "]";
	}
	
}
public class StudentDetails {

	public static void main(String[] args) {

		StudentInfo objStudent=new StudentInfo("A22","Ravi");
		System.out.println(objStudent.toString());
		
		StudentInfo objStudent2=new StudentInfo("B133","Mahesh");
		System.out.println(objStudent2.toString());

	}

}
