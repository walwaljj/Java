package day03;
import java.util.Scanner;
public class IfTest3 {
		/*if와 else if
		 * 
		 * if (조건식){
		 * 실행문
		 * }else if{
		 * 실행문
		 * }else{
		 * }
		 *
		*/
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("평균점수를 입력하세요=>");
		float score =sc.nextFloat();
		System.out.print("평균점수: "+score);
	/*문제 : 점수별로 학점내기
	 * 100 - 90 : a
	 * 89.?- 80 : b
	 * ...
	 * 60 미만   : d
	 */
		char hak=' ';
		
		if(score>=90) {
			hak='a';
		}else if(score>=80) {
			hak='b';
		}else if(score>=70) {
			hak='c';
		}else if(score>=60) {
			hak='d';
		}else {hak='f';}
		System.out.print("학점:"+hak);
		
			
		}
	

	}

