package practice;

public class StudenArray_Students {
	
	public int studentID=1000;
	public String name;
	
	
	public StudenArray_Students() {}
	
	public StudenArray_Students(int studentID,String name) {
		this.name=name;
		this.studentID=studentID;
		
		
	}
	
	public void showStudentInfo() {
		System.out.println(this.studentID+","+name);
		 
	}

}
