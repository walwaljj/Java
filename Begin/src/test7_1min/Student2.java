package test7_1min;

public class Student2 {
	
		public static void main(String[]args) {
			Student3 s=new Student3(1,"정수현");
			System.out.println(s.toString());
			
	}
}
class Student3{
	int studentID ;
	String name;
	
	public Student3() {
	
	}
	
	public Student3(int studentID,String name) {
		this.studentID=studentID;
		this.name=name;
	}

	
	
	public void showStudentInfo() {
		
		System.out.println(studentID+","+name);
	}
	public String toString() {
		return studentID + ',' +name;
	}
	
	

	
}

