package day12;
/*
 * 매개변수 2개를 받아서 두 수 중 큰수를 반환하는 함수를 람다식으로 구현해보기.
 * [1] 람다식을 구현하기 위해서는 먼저 인터페이스를 만들어야 한다.
 * [2] 인터페이스에 람다식으로 구현할 메서드를 선언한다.
 */

@FunctionalInterface //<== 추상메소드를 하나만 구현한다고 명시하는 것.
interface MyNum{
	
	//1.추상메소드 하나를 구현.
	int getMax(int a, int b);
	
//	int getMin(int a, int b); <==하게되면 추상메소드가 2개가되어 오류남. 꼭 1개!!
}

public class LambdaTest1 {

	public static void main(String[] args) {
		
		MyNum m1 = (int x,int y)->{//2.인터페이스에 람다식을 구현 , 여러문장일때 {}써줘야함.
			if(x>=y) {
				return x;
			}else {
				return y;
			}
		};
		System.out.println(m1.getMax(55,77));//3.추상메소드를 불러온다.
		System.out.println(m1.getMax(-2, 0));
		
		
		MyNum m2=(a, b)-> (a>=b) ? a : b; //리턴문을 생략해 사용가능.
		System.out.println(m2.getMax(70,90));

	}

}
