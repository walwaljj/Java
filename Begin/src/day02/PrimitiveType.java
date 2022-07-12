package day02;

public class PrimitiveType {

	public static void main(String[] args) {
		System.out.println("기본자료형-----------1");
		System.out.println("");
		int a=10;
		int b=010;//정수(8진수) : 8진수는 앞에 0을 접두어로 붙인다 (0 ~7)
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c=0123;//1*8^2 + 2*8^1 + 3=83
		System.out.println("c="+c);
		
		int d = 0x12;//정수 (16진수) : 16진수는 앞에 0x 를 접두어로 붙인다.	0 ~ 15 : 0~ 9 ,A, B, C, D, E, F
		//1*16 + 2 =>18
		int e=0x2ac;//2*16^2 + 10*16^1 + 12
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		
		char c1='a';
		System.out.println("c1="+c1);
		char c2='0';
		System.out.println("c2="+c2);
		
		//char c3=c1+c2;   			=>int 미만의 자료형 byte, short, char 는 연산에 사용되면 int형으로 자동형변환.
		int c3=(c1+c2); 
		System.out.println("c3="+c3);//145
		c1='a';
		c2='0';
		char c4=((char)(c2+1)); // c2값에 +1을해주어 아스키코드 내에서 +1한 값을 char로 변환하여 표출
		System.out.println("c4="+c4);
		
		double d2=.456e+2;//0.456* 10^2=45.6
		System.out.println(d2);
		
		
		

	}

}
