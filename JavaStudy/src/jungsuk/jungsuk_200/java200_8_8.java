package jungsuk.jungsuk_200;
import java.util.*;
public class java200_8_8 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1 ;
		int input = 0 ;
		int count = 0 ;
		
		do {
			count ++;
			System.out.println("1과 100 사이의 값을 입력하세요 : ");
			try {
			input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e) {
				System.out.println("유효하지않은값");
				continue;
			}
			if(answer > input ) {
				
				System.out.println("더 큰 수를 입력하세요.");
			
			}else if( answer < input ) {
				
				System.out.println("더 작은 수를 입력하세요.");
			
			}else {
			
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;
			
			}
		}while(true);
	}

}
