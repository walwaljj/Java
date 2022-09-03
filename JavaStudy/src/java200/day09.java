package java200;


public class day09 {

	public static void main(String[] args) {
		
		//거스름돈 몇개의 동전으로 지불할 수 있는지 계산하는 문제
		//큰 금액 우선으로 거슬러주기
		
		int[] coinUnit = {500, 100,50, 10 };
		
		int money = 2680;
		System.out.println("money = "+ money);
		
		for(int i = 0; i<coinUnit.length;i++) {
			int charge = money/coinUnit[i];
			System.out.println(coinUnit[i]+"원 : "+charge);
			money=money%coinUnit[i];
		}
		
		
		
	}

}
