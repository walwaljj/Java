package jungsuk.jungsuk_200;
import java.util.*;
public class java200_9_11 {

	public static void main(String[] args) {
		System.out.println("시작 단과 끝 단 두 개의 정수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a<2||a>10)||(b<2||b>10)) {
			System.out.println("단의 범위는 2와 9사이의 값이어야 합니다 ");
		}else {
			for(int i = a ; i <= b ; i++ ) {
				for(int j = 1 ; j < 10; j ++) {
					System.out.printf("%d * %d = %d",i,j,i*j);
					System.out.println();
				}System.out.println();
			}
		}
	}

}
