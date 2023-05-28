package practice;
import java.util.*;
public class Practice5 {

	public static void main(String[] args) {
		
		int r = (int)(Math.random()*10+5);
		int count=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			int p=sc.nextInt();
				if(p>15) {
				System.out.println("1~15까지의 정수를 입력해주세요");
				continue;
				}
				count++;
				if(count>3) {
				System.out.println("횟수 초과! 다시 시도하세요.");
				break;
				}
				if(r==p) {
					System.out.println("맞췄습니다!");
					break;
				}else if(r>p) {
					System.out.println("더 큰수를 입력하세요");
				}else{
				System.out.println("더 작은수를 입력하세요");
				}
			}System.out.println("게임 시도 횟수 : "+ count);
			
		

	}

}
