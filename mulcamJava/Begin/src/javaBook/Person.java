package javaBook;

public class Person {///왜안나오징>,,?ㅜ
	
	int age =40;
	String name="james";
	boolean isMarrid;
	int fam=3;
	
	public Person() {
		funtion();
	}
	public void funtion() {
		System.out.println("이 남자의 이름은 "+name+"이며 나이는 "+age+"살 입니다. 남자는 결혼을 "
				+marrid()+" 자식이 "+fam+"명 있습니다.");
	}
	
	public boolean marrid() {
		isMarrid=false;
		if(isMarrid!=false) {
			System.out.println("안했습니다.");
		}else {
			isMarrid=true;
			System.out.println("했습니다.");
		}
		return isMarrid;
	}
	

}
 class PersonTset{
	
	public static void main(String[] args) {
		
	Person p=new Person();
	p.funtion();
	
	}	
}