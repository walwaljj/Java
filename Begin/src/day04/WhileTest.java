package day04;
import java.util.Scanner;
/*
 * 변수 선언문
 * while (조건식)
 * {
 * 		실행문;
 * 		증감식;
 * }
 * 
 * 조건식이 true이면 실행문을 실행한다.
 * 		FALSE이면 WHILE 문을 벗어난다.
 * 
 * 
 */
public class WhileTest {

	public static void main(String[] args) {
		
		//[문제1]a값이 1씩 증가하고, 5를 넘지않게 hello+a 의 값을 찍어내자
		int a=1;
		while(a<5) {
			
			System.out.println("Hello:"+a);
			a++;
			
		}
		System.out.println("The end"+a);
		
		//[문제2]b값이 0보다 클때까지 반복돌면서 java+b를 출력하되 감소식을 2만큼 감소시키기
		int b=10;
		while(b>0) {
			System.out.println("java:"+b);
			b-=2;
		}
		System.out.println("The end"+b);
		
		//[문제] 구구단의 단을 입력받아서 구구단을 출력하기.
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단 몇단을 출력할까요=>");
		int dan=sc.nextInt();
		int c=1;
		while(c<10) {
			System.out.println(dan+"x"+c+"="+dan*c);
			c++;
		}
		//[문제] 구구단 전체를 출력하되 while문을 중첩해서 출력하세요.
	
		int j = 2;
		int k = 1;
		while(k<10) {
			while(j<10) {
				System.out.print(j+" x "+ k + " = "+j*k +"\t ");
				j++;
			}
			System.out.println();
			j = 2;
			k++;
		}
		
		//while(true) {
			//	System.out.println("무한루프 돌아요");
		//	}

		
	}//main()------
	
	

}//class////
