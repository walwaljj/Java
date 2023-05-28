package day07;

public class ConstructorTest {

	public static void main(String[] args) {
		
		
		
		// 기본 생성자(Person) 호출
		Person p=new Person();
		
		
		System.out.println("p.name : "+p.name);
		System.out.println("p.age : "+p.age);
		
		
		//public Person(String name)일때
		Person p1=new Person("왈와리");
		System.out.println("p1.name :"+p1.name);
		System.out.println("p1.age :"+p1.age);
		//Person p1=new Person("왈와리",22);
		//앞쪽 구성 시 public Person(String name)로 했기때문에 err
		
		
		//public Person(String name, int age)일때
		Person p2=new Person("이순신",22);
		System.out.println("p2.name :"+p2.name);
		System.out.println("p2.age :"+p2.age);
		
		
		//public Person(int age,String name)일때
		Person p3=new Person(27,"강감찬");
		System.out.println("p3.name :"+p3.name);
		System.out.println("p3.age :"+p3.age);
		
	}

}
