package day03;
import java.util.*;
public class SwitchTest3 {

	public static void main(String[] args) {
		/*[문제2] ***수도요금 계산***
		 *1. 가정용(litter당 50원)
		 *2. 상업용(litter당 45원)
		 *3. 공업용(litter당 30원)
		 *==>메뉴 선택 후 사용량 입력
		 *
		 *-츌력될 내용
		 *1) 사용자 코드,사용량, 총 수도요금
		 *
		 *사용요금= 사용량*리터당 가격
		 *총 수도요금= 수도사용요금 + 세금(요금의 5%)
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("---------Menu---------");
		System.out.println("1. 가정용(litter당 50원)");
		System.out.println("2. 상업용(litter당 45원)");
		System.out.println("3. 공업용(litter당 30원)");
		System.out.println("----------------------");
		System.out.println("메뉴를 선택하세요========>");
		System.out.println("----------------------");
		int i=sc.nextInt();//1.2.3
		System.out.println("사용량을 입력하세요=======>");
		int j=sc.nextInt();
		int result=0;//사용량*i값해야함
		switch(i) {
		case 1:
			result=j*50;
			//result=i
			break;
		case 2:
			result=j*45;
			break;
		case 3:
			result=j*30;
			break;
		}
		System.out.println("사용자 코드 ["+i+"]"+"\n"+"사용량 : "+j+"\n요금 : "+result*1.05);
		
	//System.out.println("[1.가정용]"+);
		
	}

}
