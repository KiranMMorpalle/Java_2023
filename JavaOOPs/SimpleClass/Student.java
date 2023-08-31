package Day28;

public class Student {
	
	private String roll,name,address;
	double marks;
	
	
	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}
	
	//name=> local variable
	//name=>instance variable
	public void setName(String name) //local variable
	{
		this.name=name;
	}
}
