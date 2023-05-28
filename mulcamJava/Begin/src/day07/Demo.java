package day07;
///this 예제
public class Demo {
	
	int x=10;//멤버변수 (인스턴스 변수)
	double pi=3.14;//멤버변수 (인스턴스 변수)
	
	static String STR="Hello";
	
	
	//멤버 메소드(인스턴스 메소드)
	public void sub() {
		this.x=100;
		this.pi=5.78;
		
	}

	
	//클레스 메소드-static 메소드
	public static void main(String[] args) {
		//this.x=200;//[x] static 메소드 안에서는 this를 사용할 수 없다.
		//Cannot use this in a static context => 스테틱 안에서는 사용할수없어/
		
		
		
		Demo dm=new Demo();
		dm.x=200;//객체명.변수
		System.out.println("dm.x: "+dm.x);
		
		dm.sub();//sub안에서는 Demo 값 접근가능하나
		System.out.println("dm.x: "+dm.x);
		System.out.println("pi.x: "+dm.pi);
		
		
		//STR값 츌력
		System.out.println("Demo.STR : "+Demo.STR);
		System.out.println("dm.STR : "+dm.STR);
		
		//The static field Demo.STR should be accessed in a static way
		//=>스테틱인 변수는 스테틱인 방식으로 클레스.변수로 접근해야해! 라는 경고
		
	}

}
