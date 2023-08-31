package Day29;


//Abstract - 
class Student{
	
}

abstract class Staff{
	
	void getStudentDetails() {}
	abstract void eligibleForInterview();
	abstract void selectedStudent();
	abstract void reportDetails();	
}

abstract class PlacementCell extends Staff{
	void eligibleForInterview() {
		System.out.println("Eligible");
	}
}

class Trainer extends PlacementCell
{
	void selectedStudent() {
		System.out.println("Selected");
	}

	void reportDetails() {
		System.out.println("Report");
	}	
}

public class AbstractExample extends Trainer{

	public static void main(String[] args) {
		AbstractExample obj=new AbstractExample();
		obj.getStudentDetails();
		obj.eligibleForInterview();		
		obj.selectedStudent();
		obj.reportDetails();

	}

}


/*
 * class Girl1{
 * 	void show(){
 * }}
 * 
 * class Girl2{
 * 	void show(){
 * }}
 * 
 * class Boy Girl1,Girl2{
 * 	}
 * */
