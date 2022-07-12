package day02;

public class UnaryOperator {

	public static void main(String[] args) {
		System.out.println("1. 단항연산자(부호연산자 : +,-)");
		int a=8;
		System.out.println(+a);
		System.out.println(-a);
		System.out.println("2. 증감연산자 : ++, -- ");
		int b=5;
		long c=9;
		b++;//b=b+1
		c--;//c=c+1
		System.out.println(b);
		System.out.println(c);
		++b;
		--c;
		System.out.println(b);
		System.out.println(c);
		//++,--가 단독으로 사용될때는 변수 앞에오나 뒤에오나 별 차이는 없다.
		//하지만 다른 수식과 함께 사용되면 ++,--가 앞에 오는 것과 뒤에 오는 것은 차이가 있다.
		float d=5.3f;
		double e=7.3;
		System.out.println(d++);
		System.out.println("d="+d);
		
		System.out.println(e--);
		System.out.println("e="+e);
		
		int x=10;
		int y=x++;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		x=10;
		int z=++x;
		System.out.println("x="+x);
		System.out.println("z="+z);
		
		System.out.println("3.비트별 not 연산자 : ~");
		// 정수값을 비트로 바꾸고 연산을 수행하는데 , not 연산자는 1을 0으로, 0은 1로바꾼다.
		// 3: 00000000 00000000 00000000 00000011 
		//~3: 11111111 11111111 11111111 11111100 (마지막 1부터 부호 및 계산에 이용) = -4
		
		int m=3;
		System.out.println(m);
		System.out.println(~m);
		
		System.out.println("4.논리 부정 연산자: !");
		//boolean 형에서만 사용가능. int사용불가.
		//true => false로, false => ture로 바꾼다.
		boolean bo=true;
		System.out.println(bo);
		System.out.println(!bo);
		System.out.println(!(3<2));
		
		int fo=5;
		System.out.println(fo==5.0);//등가연산자 == : 기본 자료형에서는 값이 같은지 비교한다.
		System.out.println(fo!=5.0);// != : 기본형 자료에서는 값이 다르면 true, 같으면 false
		
	}

}
