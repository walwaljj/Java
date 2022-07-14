package day09;
//MyInter 를 상속받아서 에러나지않게 처리해보세요
public class MyClass implements MyInter, YourInter {
	
	public void demo() { // void demo() 로 하면 부모에 생략되어있는 public때문에 접근지정자 에러가남.
		System.out.println("MyClass's demo()###");
	}
	

	
	public int inter1() {
		return 100;
	}
	
	public void inter2(String s) {
		//String 타입의 출력이 필요없을때 그냥 비워두면됨.
		System.out.println(s.toUpperCase());
	}
	
	public static void main(String[] args) {
		//MyInter mi=new MyInter(); //[x]==> 추상메소드밖에없기때문에 new연산자불가.
		//인터페이스는 타입선언만 가능.
		
		MyInter mi=new MyClass();
		YourInter yi = new MyClass();
		
		//demo()
		
		//mi.inter1();[x]
		//mi타입으로는 고유한 demo를 받을수 없다.
		
		mi.demo();

		//inter1()  	//inter2()
		System.out.println(((MyClass)mi).inter1());
		int num=yi.inter1();
		System.out.println(num);
		yi.inter2("good afternoon");
		System.out.println(yi.inter1());
		
	
		
		//pi출력
		
		System.out.println(YourInter.PI);//static 이기때문에 클래스.pi
		System.out.println(MyClass.PI);//
		//MyClass.PI<= xx , MyClass.PI = 5.12 <== 값변경 불가 final이기때매 
		System.out.println(yi.PI);//가능은 하나 static 방법이 아니여서 경고.
		
		
		
	}

}
