package practice;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=~0xf1;
				System.out.println(sum);
		
		int a=1;
		while (a<10) {
			
			System.out.println("a: "+a);
			
			a++;
			
		}
	//	whie (c<100){
	//		System.out.print("c"+1)
	//	}
	
		for (int b=0;b<=9;b=b+2) {
			System.out.println("b: "+b);
		}
		//[문제1]a값이 1씩 증가하고, 5를 넘지않게 hello+a 의 값을 찍어내자
		//[문제2]b값이 0보다 클때까지 반복돌면서 java+b를 출력하되 감소식을 2만큼 감소시키기
		//[문제] 구구단의 단을 입력받아서 구구단을 출력하기.
				/*Scanner sc=new Scanner(System.in);
				System.out.println("구구단 몇단을 출력할까요=>");
				int dan=sc.nextInt();
				int c=1;
				while(c<10) {
					System.out.println(dan+"x"+c+"="+dan*c);
					c++;
				}*/
				//[문제] 구구단 전체를 출력하되 while문을 중첩해서 출력하세요.

	}

}
