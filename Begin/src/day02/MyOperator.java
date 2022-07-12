package day02;

public class MyOperator {

	public static void main(String[] args) {
		System.out.println("1.산술 연산자---");
		//+,-,*,/(나눈몫을 구하는 연산자). %(나머지 값을 구하는 연산자)
		int a=10;
		System.out.println(a-6);
		System.out.println(a*3);
		System.out.println(a/4);//int/int ==> 결과 int (소수점은 버림)
		System.out.println(a%3);
		
		double b=10;
		System.out.println(b/3); // double/int ==> 결과 double (소수점까지 모두나온다.)
		//42 : 00000000 00000000 00000000 00101010
		System.out.println("2. Shift 연산자 (<<, >>, >>>)---");
		System.out.println(42<<3);
		//00000 00000000 00000000 00101010 *+000*
		System.out.println(42>>3);
		//000 00000000 00000000 00000000 00101 *-010*
		System.out.println(42>>>3);
		//000 00000000 00000000 00000000 00101 *-010*
		/* 시프트 연산자 : 비트로 바꿔서 연산을 수행한다.
		 * 1) >> : 오른쪽으로 비트수 만큼 이동
		 * 				앞에 남은 부호비트로 채운다.
		 * 2) << : 왼쪽으로 비트수만큼 이동
		 * 				뒤에 남은 빈칸은 0으로 채운다.
		 * 3)>>> : 오른쪽으로 비트수 만큼 이동
		 * 				앞에 남은 빈칸은 무조건 0으로 채운다.(무조건 양수로 만든다.)
		 */
		
		System.out.println("3.비교연산자 : ==, !=, >, >=, <, <=, instanceof");
		/*1) > : 큰가?
		 * 2)>=: 크거나 같은가
		 * 3)< : 작은가?
		 * 4)<=: 작거나 같은가?
		 * 5)==: 같은가?
		 * 6)!=: 다른가?
		 * 7) 참조변수 instanceof 클래스명: 참조변수가 클래스의 객체인가?
		 */
		int m=60;
		int n=60;
		System.out.println(m>=n);//true
		
		if(m>=n) {
			System.out.println("@@@@");
		}else if(m<n) {
			System.out.println("####");
		}
		
	}

}
