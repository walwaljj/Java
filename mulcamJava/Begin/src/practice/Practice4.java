package practice;
import java.math.*;
import java.util.*;
public class Practice4 {
	
	public static void main(System[] args) {
		//알파벳 대문자를 무작위로 추출해서 3행 5열로 만들기
		Scanner sc=new Scanner(System.in);
		
		
		char c=((char)(Math.random()*10));
		System.out.println(c);
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(c);
			}
		}
		
	}


		
		
		
	
	
}
	
	
		
		
	