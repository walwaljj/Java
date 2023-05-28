package day03;
import java.util.Scanner;
/*for 루프문 이용해서 아래형식 출력
 * 
 * 7 x 1=7
 * ...
 * 7 x 9 = 63
 * 
 */
public class ForTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int dan=7;
		for(int i=1;i<10;i++)
		{		System.out.println(dan+"x"+i+"="+dan*i);
		



	/*[문제2] 1~10까지 합을 구해 출력
	 *[문제3] 1~10까지 곱
	 *[문제4] 1~100까지의 짝수 합
	 *[문제5] 1~100까지 17로 나누어 떨어지는 수를 출력
	 *[문제6] 대문자 알파벳[A ~ Z]를 for 이용해서 출력
	 */
	//2.
		int sum=0;//덧셈에 영향을 주지않을 수
		for(int a=1;a<=10;a++){
			sum =sum+=a;
		}
		System.out.println("1~10까지의 합:"+sum);
	//3.
		int gop=1;
		for(int b=1;b<11;b++) {
			gop = gop*b;
					
		}
		System.out.println("1~10까지의 곱 : "+gop);
		
	
	//4.
		int sum2=1;
		for(int c=1;c<=100;c++) {
			if(c%2==0)
				sum2=sum2+c;
		}
		System.out.println("1~100까지의 수 중 짝수들의 합:" +sum2);
		
	//5.
		int sum1=0;
		for(int d=0;d<101;d+=2) {
			sum1+=d;
		}
		System.out.println("1~100까지의 수 중 짝수들의 합:" +sum1);
		
		}
	//6.
	
		for(char al='A';al<='Z';al++)
			{System.out.print(al);}
	}
}



