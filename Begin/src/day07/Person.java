package day07;
//다형성 
public class Person {
	
	String name;
	int age;
	//생성자(Constructor): 객체를 생성할 때 호출되는 메소드의 일종
	/* 
	 * 규칙
	 * <1> 생성자 이름은 클래스 이름과 동일하게
	 * <2> 반환타입은 명시하지 않는다.
	 * <3> 역할 : 멤버 변수 값을 초기화 하는 일을 한다.
	 * ex) public 생성자명(){
	 * 
	 * 
	 * }
	 * 
	 * */
	
	
	//생성자 오버로딩 // 동일한 메소드 이름으로 여러개를 생성한다.
						/*-단, 매개변수의 자료형이나 갯수, 순서등을 다르게 구성해야한다.
						 *public Person(String name) 아래 같은 구성이 있어 err
						 * 반환타입은 없거나 달라도 상관없다.
						 *==========================================
						 *
						/*public____Person()
						/         ㄴ반환타입 나타내는 자리에 비어있음 = 반환타입은 없거나 달라도 상관없다.*/
						
	
	//기본생성자 default constructor : 매개변수가 없음.
	//**********void 쓰면 메소드가됨 주의
	public Person() { //public 클레스이름()
		name="왈왈";
		age=28;
	}
	
	
	//인자 생성자 constructor using fields : 매개변수가 있음
	public Person(String name) {
		this.name=name;
		age=10;
	}
	
	
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
		
		
		
	public Person(int age,String name) {
		this.name=name;
		this.age=age;
		
		
		
	}
}
