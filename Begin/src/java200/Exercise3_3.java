package java200;

public class Exercise3_3 {

	public static void main(String[] args) {
//		아래는 변수 의 값에 따라 num ‘0’ 양수 음수 을 출력하는 코드이다 삼항 연산 .
//		자를 이용해서 에 알맞은 코드를 넣으시오 (1) .
		
		int num = 10;
		
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0){
			System.out.println("음수입니다.");
		}else if(num==0)
			System.out.println("0입니다.");
		else {
		System.out.println("기타문자입니다.");
		}//양수
		
//아래는 변수 의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num
//	의 값이 ‘456’ 이라면‘400’이 되고 , ‘111’이라면  ‘100’   이 된다 에 알맞은 코드를 넣으 . (1)
//	시오.
		int num2 = 456;
		
		if(num2%100!=0) {
			int a=num2%100;
			System.out.println(num2-a);
		}
		
		/*아래는 변수 num의 값중에서 일의자리를 바꾸는 코드이다.
		 * 만일 변수의num이 333이라면 331이되고 777이라면 771된다.
		 */
		int num3 = 777;
		
		int b=num3%10;
		
		int num3_1=num3-b;
		System.out.println(num3_1+1);
	}
	
}
