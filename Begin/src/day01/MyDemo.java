package day01;
//[1]패키지 선언문 package 패키지명;
import java.lang.System;
//[2]import 문 : import 패키지명.클래스명;
public class MyDemo {
//[3]class 선언문
	public static void main(String[] args) {
	//main() 메소드 구성	
	
			System.out.println("자바의 자료형---");
			/*
			 * 정수형 : byte(1) < short(2) < int(4) 디폴트 < long(8)
			 * 실수형 : float(4) < double(8) 디폴트
			 */
			byte a=1;//1byte => 8bit : -2^7~ 2^7-1 : -128 ~ 127
			double b= 1.23;
			System.out.println(a);
			System.out.println(b);
			
			short c=128;//2byte=> 16bit :-2^15~ 2^15-1
			short d=5000;
			System.out.println(c);
			System.out.println(d);
			
			int e=70000;//4byte=> 32bit : -2^31 ~ 2^31-1
			System.out.println(e);
			
			long ln=40;//8byte=> 64bit :-2^63 ~ 2^63-1
			long ln2=40L;//long형의 경우 접미사l 을 붙힐 수 있다.
			System.out.println(ln);
			System.out.println(ln2);
			
			int i=100000000;//0이 9개 정수(-2147483648 ~2147483647)
			long j=1000000000;//0이 10개
			System.out.println(i);
			System.out.println(j);
			
			
		}

	}

