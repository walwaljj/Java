package java200;

public class day7 {

	public static void main(String[] args) {
		// 파보니치 수열은 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열이다.
		//1 , 1 , 2, 3, 5, 8, 13, 21, 34 , 55 가 되게 출력
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1 + ", "+num2);
		
		for(int i = 0 ; i < 8 ; i ++) {
			num3 =num1+num2;
		
			System.out.print(", "+num3);
			
			num1=num2;
			num2=num3;
			
			
		}
		System.out.println();
		// 모든 단의 *3까지만 출력시키기
		//단, 1단은 나오지않고 , 2 3 4 // 5 6 7// 8 9 로
		
		
		for(int j = 1; j <=9 ; j++) {
			for(int i = 1 ;i <=3 ; i++) {
				System.out.println(i + " * " + j + " = " + j*i+"\t");
			}
			System.out.println();
			
		}
		
		for(int i = 1 ; i <= 9; i ++) {
			for(int j = 1; j<=3 ; j++) {
				int x = j+1+(i-1)/3*3;
				//x는 곱하는 수의 변수, 곱+1+(단-1)
				int y = i%3==0? 3:i%3;
				//y는 단의 변수,단%3이 0일때 y는3, 0이 아닐때 단%3
				if(x > 9)
					break;
				System.out.print(x + " * " + y + " = "+ x *y+ "\t");
			}
			System.out.println();
			if(i%3==0) System.out.println();
		}
		
		//문자열 value가 숫자인지 판별하는 프로그램.
		//반복문과 charAt(int i ) 를 이용해서 문자열의 문자를 하나씩 읽어 검사하기.
		String value = "01235534";
		char ch = ' ' ;
		boolean isNumber = true;
		
		for (int i = 0; i < value.length();i++) {
			ch= value.charAt(i);
			isNumber = ch>='0'&&ch<='9' ? isNumber : false;
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		}else{
			System.out.println(value + "는 숫자가 아닙니다.");
		}
		
		
		
	}

}
