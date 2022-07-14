package javaBook;

public class Students {
	
	private String studentname;
	private int studentnum;
	private String major;
	//필수 과목
	//private 점수 
	//private 점수 계산
	
	private Students students=new Students(); 
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentnum() {
		return studentnum;
	}
	public void setStudentnum(int studentnum) {
		this.studentnum = studentnum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
