package day04;

public class MathTest {

	public static void main(String[] args) {
		//java.lang.Math 클래스의 멤버변수
		
		//public static final double PI : 상수 원주율
		System.out.println(Math.PI);
		//static붙은 변수들은 앞에 클레스를 붙혀준다 ex) math.pi
		
		
		//메소드: 기능을 가지고 있다. 
		    // 1. static 이있는지보자 (static 메소드)  => 있다면 class.메소드명(값)
		
		
		//public static double sqrt​(double a) : 매개변수 a의 제곱근을 구해서 반환한다.
		double b=Math.sqrt(64);
		System.out.println("64의 제곱근 "+b);
		
		//public static double ceil​(double a) : 올림값을 반환해줌
		double num=45.0123;
		double c = Math.ceil(num);
		System.out.println("num의 올림값"+c);
		
		
		//public static double floor​(double a) : 내림값
		double bum=20.001;
		double d = Math.floor(bum);
		System.out.println("num의 내림값"+d);
		
		
		//public static int round​(float a) : 반올림
		num=40.678;
		long e = Math.round(num);
		//물어보자 형변환 ! int e2= (int)(Math.round(num));
		int e3= Math.round((float)num);
		System.out.println("num의 반올림"+e);
		//System.out.println("num의 반올림"+e2);
		System.out.println("num의 반올림"+e3);
		
		
		//public static double random() : 0.0<= ? < 1.0 사이의 임의 난수를 발생시켜 변환해준다.
		
		double f = Math.random();
		System.out.println("f의 값 :"+f);
		
		
		
		//[문제1] 0<= r4 < 10 사이의 임의의 정수를 발생시켜 출력하세요 ( 랜덤활용 )
		
		double r4 =Math.random();
		System.out.println("r4의 값:"+ Math.round(r4));
		
		int n=((int)(r4*10));
		System.out.println("r4_2의 값"+n);
		
		
		int r4_1=(int)(Math.random()*10);
		System.out.println("r4_1의 값:" + r4_1);
		
		//--2번과 3번이 같네! 같은
		
	
		
		//[문제2] 5<= r5 <15 사이의 임의의 정수를 발생시켜 출력 (랜덤활용)
		
		int r5 =(int)(Math.random()*10+5);
		System.out.println("r5: " +r5);
		
		//*********int x = (int)(Math.random() *범위 + 시작 수)**********
		
		//[문제3] 16<= r6 <48 사이의 임의의 정수
		
		int r6 = (int)(Math.random()*32+16);//*수+수 =최대값이 되어야함
		System.out.println("r6: " +r6);
		
		//[문제4] 알파벳 대문자를 무작위로 추출하여 아래와 같은 형태로 출력 되도록 하세요.
		
	/* w i p p o   (<-예제)
	 * t b p w z
	 * c v b q w
	 *  
	 */
		for(int l=0;l<3;l++) {

			for(int j=1;j<5;j++) {

				char ch=(char)('A'+(Math.random()*25+1));

				System.out.print(ch+" ");

			} System.out.println();

		}

		
		
	}

}
