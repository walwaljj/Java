package practice;
import java.util.*;
public class practice6 {

	public static void main(String[] args) {
		
		int pc=(int)(Math.random()*3+1);
		System.out.println("*********가위바위보**********");
		System.out.println("[1]가위 [2]바위 [3] 보 [9]종료");
		System.out.println("***************************");
		System.out.println("무엇을 내실 건가요? 입력해주세요!");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		while(true) {
				
				if(a==9) {
					System.out.println("종료-----");
					break;
				}
				if(pc==a) {
					System.out.println("비겼습니다.");
				}else if((pc==1&a==2)|(pc==2&a==3)|(pc==3&a==1)) {
				System.out.println("당신이 이겼군요");
				return;
				}else if(a>4|a<0) {
					System.out.println("유효하지 않은 번호입니다.");
					return;
					
				}else {
					System.out.println("당신이 졌습니다.");
					return;
				}
					
			
				}
	}

}
