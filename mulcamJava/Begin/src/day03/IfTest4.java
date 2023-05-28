package day03;
import java.util.*;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("0~9, 알파벳, 기타 문자 1자만 입력하세요 =>");
		String input=sc.next();
		//string next():문자열을 입력받음
		System.out.println("input : "+input);
		//String 클래스가 가진 메소드
		/*
		 * char charAt(int index):문자열의 특정 index 위치의 문자를 추출하여 반환한다.
		 * 
		 * ex "Hello" 일때 h는 0번, e는 1번, l은 2번 ....
		 * 
		 */
		char ch=input.charAt(0);
	//	System.out.println("ch: "+ch);
		/*ch값이 0~ 9 값이면 "숫자입니다."를 출력
		 * 그 외 문자는 "기타문자입니다"출력
		 * 
		 */
		
		
	
		/*if(ch >=48 && ch <57 ) {
			System.out.println("숫자입니다");
		}else if((ch >=)&& ch <=90)||(ch>=97 &&<=122)){
			System.out.println("알파벳이군요");
			else {System.out.println("기타 문자입니다");}
			*/
			
			
		if(ch>='0'&& ch<='9') {
			System.out.println("숫자입니다");
			}else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			System.out.println("알파벳입니다");
		else System.out.println("기타 문자입니다");}	
	
	
			
	
}
