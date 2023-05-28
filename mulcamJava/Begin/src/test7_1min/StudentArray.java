package test7_1min;

public class StudentArray {

	public static void main(String[] args) {
		Student[] s1=new Student[3];
		
		int a=0;
		
		
		s1[0]= new Student(a,"ss");
		s1[1]= new Student(a,"정수현") ;
		s1[2]= new Student(a,"dd") ;
		

		
		for(int i=0;i<s1.length;i++) {
			s1[i].showStudentInfo();
			
		}
		
	}
}
