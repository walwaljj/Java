package day03;
/* switch ~case 문 : 
 * 
 * switch() 괄호안에 들어가는 값,변수,수식 ==> int 이하의 자료형 (byte,short,char,int)또는 String만 사용가능하다.
 * 			
 * break 가 없으면 결과가 나오지 않고 아래 case로 내려가버린다.
 * 
 * swith(값|수식|변수){
 * 		case 값1:
 * 			실행문;
 * 			break;
 * 		case 값:
 * 			실행문;
 * 			break;
 * 		...
 * 		default:
 * 			실행문;
 * }
 * 
 */
import java.util.*;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//String oper;
		
		System.out.println("첫번째 정수를 입력하세요.");
		int a=sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		int b=sc.nextInt();
		System.out.println("연산자를 입력하세요[+,_,*,/]=>");
		int result=0;//초기값은 맨처음 기본값으로 항상 줘야한다.
		String oper=sc.next();
		switch(oper) {
		case "+":
			result=a+b;
			break;
		case "-":
			result=a-b;
			break;
		case "*":
			result=a*b;
			break;
		case"/":
			result=a/b;
			break;//소속된 블럭을{} 이탈한다(벗어난다)
			
		default:
			System.out.println("없는 연산자입니다.");
			return;//보조제어문 : 제어흐름을 되돌린다.(return문을 갖는 메소드-main()을 호출힌쪽으로 돌아간다)
		}
		System.out.println(a+oper+b+"="+result);
		//System.out.println("result:"+result);
		////oper 가 +일때는 8 , 
		
	

	}

}
