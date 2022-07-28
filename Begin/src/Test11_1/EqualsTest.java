package Test11_1;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student std = (Student)obj;
				if(this.studentId == std.studentId)
					return true;
				else return false;
			}
			return false;
		}
	
}
public class EqualsTest {

	public static void main(String[] args) {
		Student s1 = new Student(10,"정");
		Student ss1=s1;
		Student s2 = new Student(10,"정");
		
		if(s1==ss1)
			System.out.println("s1과 ss1의 주소는 같습니다.");
		else
			System.out.println("s1과 ss1의 주소는 다릅니다.");
		
		if(s1.equals(ss1))
			System.out.println("s1과 ss1은 동일합니다.");
		else
			System.out.println("s1과 ss1은 다릅니다.");
		
		if(s1==s2)
			System.out.println("s1과 s2의 주소는 같습니다.");
		else
			System.out.println("s1과 s2의 주소는 다릅니다.");
		
		if(s1.equals(s2))
			System.out.println("s1과 s2은 동일합니다.");
		else
			System.out.println("s1과 s2은 다릅니다.");
	
	}

}
