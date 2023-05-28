package day03;

public class Test {
	public static void main(String[] args) {
		//ystem.out.println("int형 변수x가 10보다 크로 20보다 작을때 ture인 조건식");
		int x=13;//초기값 넣기
		if(x>10 && x<20)
			{System.out.println("##");}
		
		//System.out.println("char형 변수 ch가 공백이나 탭이 아닐때 true인 조건식");
		char ch='A';
		if(ch!=' '&&ch!='\t') {
			System.out.println("공백이나 탭이아님");
			}else 
				System.out.println("공백이나 탭임");
		
		//System.out.println("char형 변수 ch가 'x'또는 'X'일때 true인 조건식");
		
		if(ch=='x'|ch=='X') {
			System.out.println("x입니다.");
		}else
			System.out.println("x가 아닙니다.");
		
	
		//System.out.println("char형 변수 ch가 숫자('0'~'9'일 때 true인 조건식");
		
		if(ch>='0'&ch<='9')
			System.out.println("0~9까지의 숫자군요");
		else
			System.out.println("기타 문자입니다.");
		
		//System.out.println("char형 변수 ch가 영문자(대/소)일때 true인 조건식");
		
		if(ch>='a'&ch<='z'|ch>='A'&ch<='Z')
			System.out.println("알파벳입니다.");
		else
			System.out.println("알파벳이 아닙니다.");
		
		//System.out.println("int형 변수 year 가 400으로 나눠 떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식");
		int year=400;
		if(year%400==0|year%4==0|year%100!=0)
			System.out.println("True");
		else
			System.out.println("ff");
		
		
		//System.out.println("boolean형 변수 powerOn가 false일 때 true인 조건식");
		boolean powerOn=false;
		if(powerOn==false)
			System.out.println("t");
		else
			System.out.println("f");
		
		
		//System.out.println("문자열 참조변수 str이 \"yes\"일 때 true인 조건식");
		String str="yes";
		
		if(str=="yes")
			System.out.println("t");
		else
			System.out.println("f");
		
		
			}

	}
	

