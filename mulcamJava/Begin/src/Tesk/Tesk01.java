package Tesk;
import java.util.Scanner;
public class Tesk01 {

	public static void main(String[] args) {
		//num 의 값=456 이면 400.. 100의자리만 나타내는 함수
		System.out.println("숫자를 입력하세요.");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int d = num/100;
		System.out.println(d*100);

		
		
		
		//num의 값에따라 '양수','음수','0'을 출력하는코드

		
		if(num<0) {
			System.out.print("음수입니다.");
		}else if(num>0){
			System.out.print("양수입니다.");
		}else {
			System.out.print("0입니다.");
		}
		

	}

}
