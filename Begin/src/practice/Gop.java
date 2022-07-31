package practice;

import java.util.Scanner;

public class Gop {
	public static void main(String [] args) {
		for(int i = 1 ; i < 10 ; i ++) {
			for(int j = 1 ; j < 10 ; j++) {
			//	System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		//가장 적은 수의 지폐를 거슬러주는 포스기.
		//34000원의 물건을 사려고 100000을 냈다면
		//5만원1장, 1만원 1장, 5천원 1장, 1천원 1장
		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		int []money={50000,10000,5000,1000};
		int a;
		int payment=sc.nextInt();
		int cost=sc.nextInt();
		a=payment-cost;
		for(int i = 0; i<money.length; i++ ) {
			System.out.println(a/money[i]);
			
			
		}
	}
}
