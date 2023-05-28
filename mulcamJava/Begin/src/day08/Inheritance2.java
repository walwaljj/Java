package day08;
/*하나의 자바파일에 여러 클래스를 구성할 경우
 * public 인 클래스는 1개만 존재해야하며,
 * 파일명으로 된 클래스에 public 을 붙힌다.
 * 
 * 
 * 
 */
class Person{ //앞에 public 을 붙히면 따로 cls 를 만들어야함.
	int no;
	String name;
	
	//생성자를 하나로도 구성하는 순간, 컴파일러가 제공하던 기본생성자는 사라진다.
	//생성자를 오버로드 하려면 기본생성자를 먼저 구성하는게 좋다. ==>기본생성자란 값을 정해놓은 생성자. name="홍생성자"; no=1 등
	
	public Person() {}
	
	public Person (int n,String m) {
		no= n;
		name= m;
	}
	
}/////////////////////////person 끝


//자식클래스의 생성자에는 묵시적으로 super()를 호출한다
//super() : 부모클래스의 기본생성자를 호출할 때 사용하는 키워드

class Student extends Person{
	String major;
	public Student() {
		super(100,"김학생");// 명시적으로 super(매개변수값)을 호출해 해결한다.
						//단, 부모클래스에 매개변수가 비어있는 생성자(public Person() {})가 있어야함.
	}
	
	
}/////////////////////////////Student

class Teacher extends Person{
	String subject;
	public Teacher() {//1번
		super(200,"최교사");//super 는 생성자에서만 호출가능하다
							// 	 	생성자의 첫번째 문장이어야한다
							//      this()와는 함께 사용할 수 없다.
							//	1번 또는 2번 두개중 하나만 사용가능하다.
	}
	/*public Teacher() {//2번 
		this(200,"최교사","c");
		*/ 
	public Teacher(int no, String name, String subject) {
		super(no,name);//--
		this.subject = subject;
		
	}
	
}//////////////////////////////Teacher

public class Inheritance2 {

	public static void main(String[] args) {
		Person p1=new Person(1,"홍길동");
		//p1.name="홍길동";
		//p1.no=1;
		
	}
	
	
}//////////////////////////////