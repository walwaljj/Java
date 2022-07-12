package Tesk;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		

		
		//큰 금액의 동전을 우선적으로 거슬러주기
		
		/*int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			for(int j=0;j<4;j++);
				
			}System.out.println();*/
		Scanner sc=new Scanner(System.in);
		int [] coinUnit = {500,100,50,10);
		System.out.println("가지고 있는 돈을 입력하세요==>");
		int money = sc.nextInt();
		System.out.println(money+"원");
		System.out.println("-----------------------");
		for(int i=0;i<coinUnit.length;i++) {
			int su=money/coinUnit[i];
			System.out.println(coinUnit[i]+"원 : "+su);
			money=money%coinUnit[i];
		}
		
	}	
	
}
