package day12;
import java.util.*;
//매개변수와 리턴값이 없는 람다식
@FunctionalInterface
interface MyFunc{
	void func();
}
@FunctionalInterface
interface YourFunc{
	void foo(int x);
}
@FunctionalInterface
interface HerFunc{
	String makeStr(String a, String b);
}/////////////


public class LambdaTest2 {

	public static void main(String[] args) {
		System.out.println("----------매개변수 없는 람다식 ------------");
		//[1] 람다식 ###을 출력하는 람다식을 구현한 뒤 함수를 호출해보기
		
		MyFunc mf1 = () -> System.out.println("####");
		mf1.func();
		
		//[2] 람다식\\^^//을 출력하는 람다식을 구현하고 함수 호출
		MyFunc mf2 = () -> System.out.println("\\\\^^//");
		mf2.func();
		
		System.out.println("----------매개변수 있는 람다식 ------------");
		
		//[3] YourFunc 매개변수를 받으면 거듭제곱값을 출력하는 람다식 구현한 뒤 함수 호출
		//Scanner sc = new Scanner(System.in);
		//int x=sc.nextInt();
		YourFunc yf1 = (int a) -> System.out.println(a*a);
		yf1.foo(3);//foo라는 함수를 불러줌
		
		//[4] YourFunc 매개변수에서 3을 빼주는 값을 출력하는 람다식 구현
		
		YourFunc yf2 = (int a) -> System.out.println(a-3);
		yf2.foo(4);
		
		System.out.println("----------매개변수를 받아 값을 반환 ------------");
		//[5] HerFunc 문자열 2개를 받아서 2개의 문자열을 연결해서 반환하는 람다식 구현, 호출
		
		HerFunc hf1 = (str1, str2)-> str1+","+str2;
		System.out.println(hf1.makeStr("hi","java"));
		
		//[6] HerFunc 문자열 2개를 받아서 2개의 문자열을 연결해서 반환하되 첫글자는 대문자로
	
		HerFunc hf2 = (str3, str4)->{
			char c1=str3.charAt(0);
			char c2=str4.charAt(0);
			String s1=str3.substring(1);
			String s2=str4.substring(1);
			
			//char 와 문자열 결합 ==> String
			String allStr = (c1+"").toUpperCase()+s1+String.valueOf(c2).toUpperCase()+s2;
			return allStr;
			

		
			
			
		};
	}

}
