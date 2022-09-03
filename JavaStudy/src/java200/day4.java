package java200;

public class day4 {

	public static void main(String[] args) {
//		아래는 변수 의 값에 따라 num ‘0’ 양수 음수 을 출력하는 코드이다 삼항 연산 .
//		자를 이용해서 에 알맞은 코드를 넣으시오 (1) .
		
		int num3 =0;
		System.out.println(num3>0 ? "양수입니다.":(num3==0?"0":"음수입니다."));
		
		if(num3>0) {
			System.out.println("양수입니다.");
		}else if(num3<0){
			System.out.println("음수입니다.");
		}else if(num3==0)
			System.out.println("0입니다.");
		else {
		System.out.println("기타문자입니다.");
		}//양수
		
//아래는 변수 의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num
//	의 값이 ‘456’ 이라면‘400’이 되고 , ‘111’이라면  ‘100’   이 된다 에 알맞은 코드를 넣으 . (1)
//	시오.
		int num4 = 1222;
		System.out.println(num4/100*100);
		
		if(num4%100!=0) {
			int a=num4%100;
			System.out.println(num4-a);
		}
		
		/*아래는 변수 num의 값중에서 일의자리를 바꾸는 코드이다.
		 * 만일 변수의num이 333이라면 331이되고 777이라면 771된다.
		 */
		int num5 = 335;
		System.out.println(num5/10*10+1);
		int b=num5%10;
		
		int num5_1=num5-b;
		System.out.println(num5_1+1);
		
		
		//아래는 변수의 num 의 값보다 크면서도 가장 가까운 10의 배수에서 num의 값을뺀
		// 나머지를 구하는 코드이다 예를 들어 24의 크면서도 가장 가까운 10 의 배수는 30 이
		//다. 19의 경우 20 이고 , 81의 경우 90이 된다.
		//30 에서 24를 뺀 나머지는 6 이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야한다.		
		//[나머지 연산자 사용하기]
		int num6=24;
		System.out.println((num6+10)/10*10-num6);
		System.out.println(10-(num6%10));
		
		/*아래는 화씨 'F' 를 섭씨 'C' 로 변환하는 코드이다.  변환공식이  'C =5/9 ×(F - 32)' '
		 *라고 할 떄 알맞은 코드를 넣으시오. 단 변환 결과값은 소수점 셋째자리에서 반올림해야한다
		 *[Math.round()사용하지 않고 처리하기]*/
		
		int fahrenheit = 100;
		float celcius=(int)((fahrenheit - 32)*5/9f*100+0.5f)/100f ;//여기
		
		System.out.println("Fahrenheig : "+ fahrenheit);//100
		System.out.println("Celcius :"+ celcius);//37.78
		
		//아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하세요
		float f2=0.1f;
		double d = 0.1;
		boolean result = d==f2;
		
		System.out.println(d);
		System.out.println(f2);
		System.out.println((result));
		
		//다음은 문자형 변수 가 영문자 대문자 또는 소문자 이거나 숫자일 때만 
		//변수 b의 값이 true가 되도록 하는 코드이다 에 알맞은 코드를 넣으시오
		
		char ch = '0';
		boolean b9 = (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9');
		System.out.println(b9);
		
		//다음은 대문자를 소문자로 변경하는 코드인데 , 문자 ch에 저장된 문자가 대문자인 경우에만
		//소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다.
		//예를들어 'A'의 코드는 65이고 , 'a'의 코드는 97이다.
		
		char ch10 = 'z';
		char lowerCase = (ch10>='A'|ch10<='Z') ?((char)(ch10+32)) : ch10;
		System.out.println("ch : "+ (ch10));
		System.out.println("ch to lowerCase : " + lowerCase);
		
		//아래코드는 사과를 바구니에 담는데 필요한 바구니수를 구하는것.
		//사과수가 123이고 바구니에는 10개만 담을수있다.
		//담을 바구니수가 13이나오도록 해보자
		
		int numOfApples=1244;
		int sizeOfBucket = 100;
		int numOfBucket = (numOfApples/sizeOfBucket)
				+(numOfApples%sizeOfBucket==0? 0:1);
		
		System.out.println("필요한 바구니의 수 : "+ numOfBucket);
	}
	

	

}
