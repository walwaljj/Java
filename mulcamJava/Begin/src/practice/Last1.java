package practice;
import java.util.*;
import java.io.*;
public class Last1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		boolean bl=true;
		try {
		int x= sc.nextInt();
		
		if(x>10&&x<20) {
			System.out.println(bl);
		}else {
			System.out.println(!bl);
		}
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아니거나 범위를 벗어난 문자");
		}
		
		
		char ch= 'a';
		if(!(ch==' '||ch=='\t')) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		char ch1='x';
		if(ch1=='x'||ch1=='X') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}		
		char ch2='4';
		if(ch2>='0'&&ch2<='9') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		char ch3='v';
		if(ch3>='a'&ch3<='z'||ch3>='A'&ch3<='Z') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		int year = 444;
		if(year%400==0||(year%4==0&&year%100!=0)){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		boolean powarOn=true;
		if(powarOn==false) {
			System.out.println("7번문제는"+true);
		}else {
		System.out.println("7번문제는"+false);
		}
		
		String str= "yes";
		if(str.equals("yes")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		int sum=0;
		for(int i = 0; i<21; i++) {
			if(!(i%2==0||i%3==0)) {
				sum+=i;
			}
		}System.out.println(sum);
		int ttl=0;
		int sum2=0;
		for(int i =0 ; i<11; i++) {
			sum2+=i;
			ttl+=sum2;
		}System.out.println(ttl);
		
	}
}
