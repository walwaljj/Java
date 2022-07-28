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
		public int hashCode() {
			return studentId;
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
	
		System.out.println("s1의 hashCode :"+s1.hashCode());
		System.out.println("s2의 hashCode :"+s2.hashCode());
		System.out.println("s1의 주소값 :"+System.identityHashCode(s1));
		System.out.println("s2의 주소값 :"+System.identityHashCode(s2));
		
	}

}
