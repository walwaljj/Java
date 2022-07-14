package day09;
//final + 변수 : 값 할당을 할 수 없게 함
//				public static final 을 함께 사용한다.
class MyFinal {

	final public static int NONE=1;//상수
						int x = 2;
	

}

public class FinalTest3 {

	public static void main(String[] args) {
		//MyFinal의 x, NONE 변수값을 출력하기
		MyFinal a=new MyFinal();
		System.out.println(a.x);// static 이 아니면 변수에 담아주고 출력
		System.out.println(MyFinal.NONE);//static 은 클래스명 . NONE
		
		a.x=20;
		System.out.println(a.x);
		//Myfinal.NONE = 10; ==> final 변수는 값을 변경할 수 없다.
		
		
		
	}

}//////////////////////////////////////////

