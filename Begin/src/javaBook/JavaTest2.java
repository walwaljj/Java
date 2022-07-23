package javaBook;

import java.util.Scanner;

public class JavaTest2 {

	public static void main(String[] args) {
		int num;
		for(num=1;num<101;num++) {
			if(num%3!=0)
				continue;
			System.out.println(num);
		}
		
		int sum=0;
		int num1;
		for(num1 = 1; ;num1++) {
			sum+=num1;
			if(sum>=500)
			break;
		}
		System.out.println(sum);
		System.out.println(num1);
		
		int num2=10;
		int num3=2;
		char operator='*';
	
		
		if(operator!='+'&&operator!='-'&&operator!='*'&&operator!='/') {
			System.out.println("연산 가능한 기호를 적어주세요 +,-,*,/");
		}else {
			switch(operator) {
			case '+':
				System.out.println(num2+num3);
				break;
			case '-':
				System.out.println(num2-num3);
				break;
			case '*':
				System.out.println(num2*num3);
				break;
			case '/':
				System.out.println(num2/num3);
				break;
			}
		}
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(j%2!=0)
					continue;
				System.out.print(j+"*"+i+"="+j*i+"\t");
				
			}System.out.println();
		}
		
		//단보다 곱하는 수가 작거나 같은경우만 출력
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i>=j) {
					System.out.print(i+"*"+j+"="+j*i+"\t");
					
				}System.out.println();
			}
			
		}
		int scount=1;
		int bcount=4;
	
		while(bcount!=0) {
		for(int i=0;i<bcount;i++) {
			System.out.print(" ");
		}for(int i=0;i<scount;i++) {
			System.out.print("*");
		}for(int i=0;i<bcount;i++) {
			System.out.print(" ");	

		}System.out.println();
		scount+=2;
		bcount-=1;
	}
		int scount1=1;
		int bcount1=4;
		int lcount=0;
		while(lcount<7) {
			for(int i=0;i<bcount1;i++) {
				System.out.print(" ");
			}for(int i=0;i<scount1;i++) {
				System.out.print("*");
			}for(int i=0;i<bcount1;i++) {
				System.out.print(" ");	
			}System.out.println();
			lcount ++;
				if(lcount<4) {
				scount1+=2;
				bcount1-=1;
				}else{
					scount1-=2;
					bcount1+=1;
			}
			
			
		}
	}

	

}
