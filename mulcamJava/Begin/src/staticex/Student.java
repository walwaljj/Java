package staticex;

public class Student {
	static int cardNum = 1000;
	String name ;
	
	public Student(String name) {
		this.name=name;
		cardNum++;
		System.out.println(this.name+"학생의 카드번호는 "+cardNum+"입니다.");
	}
	
	public static void cardnum() {
		//cardNum++;
		
	}
	
	public void studentInfo() {
		System.out.println(this.name+"학생의 카드번호는 "+cardNum+"입니다.");
	}
	
	
}
