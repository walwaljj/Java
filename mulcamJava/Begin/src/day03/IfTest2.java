package day03;
//java.util.Scanner 이용해보기

import java.util.Scanner;
public class IfTest2 {
/* if ( 조건식) {
 * 		실행문
 * 		}else{
 * 		실행문
 * 		}
 */
	public static void main(String[] args) {
		
		//Scanner : 스캐너 클래스형 (참조형) => new 연산자를 이용해서 객체를 생성해 사용.
		Scanner sc=new Scanner(System.in);
		//System.in : 입력
		//System.out : 출력
		
		System.out.println("정수를 입력하세요=>");
		int input =sc.nextInt();//정수를 입력받아 사용자가 입력한 값을 반환해준다.
					//sc.next___() = 자료형을 받을 입력값에 맞게 입력
		System.out.println("input: "+input);
		//문제1
		//input 값이 짝수면 짝수입니다.를 출력해보시오 (if 문)
		
		
		
		
		
		
		
		
		if(input%2==0) {
			System.out.println("짝수입니다.");
			}else {System.out.print("홀수입니다.");
			
			}
		
		

	}

}
