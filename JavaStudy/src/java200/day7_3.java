package java200;

public class day7_3 {

	public static void main(String[] args) {
		//회문수(palindrome) : 숫자를 거꾸로 읽어도 앞으로 읽는것과 같은 수
		//회문수를 판별하는 프로그램을 만들기
		
		int number = 12321;
		int tmp = number;
		
		int result = 0;//변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp !=0) {
//			
			result=tmp%10+result*10;//result * 10을 해줘야 숫자가 뒤집힌다..!ㅜ
//			System.out.print(result);
			tmp=tmp/10;
		}
		System.out.println();
		System.out.println("tmp : "+tmp);
		System.out.println("result : "+ result);
		
		if(number == result)
			System.out.println(number +"는 회문수 입니다.");
		else
			System.out.println(number +"는 회문수가 아닙니다.");
		
		
	}	

}
