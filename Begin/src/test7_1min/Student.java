package test7_1min;

public class Student {
	int studentID=100 ;
	String name;
	
	public Student() {
	
	}
	
	public Student(int id, String name) {
		id=id;
		this.name=name;
	}

	
	
	public void showStudentInfo() {
		studentID++;

		System.out.println(this.studentID+","+this.name);
	}

}
