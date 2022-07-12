package day05;

public class Test1 {
	public static void main(String[] args) {
	
		int[][] arr = new int[5][5];
		int cnt=0;//1씩 증가시키면서 arr에 아래와 같이 저장하세요.
		
		/*1			2		3		4		5
		 * 16		17		18		19		6
		 * 15		24		25		20		7
		 * 14		23		22		21		8
		 * 13		12		11		10		9		
		 */
		
		
		//큰 금액의 동전을 우선적으로 거슬러주기
		
		/*int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			for(int j=0;j<4;j++);
				
			}System.out.println();*/
	
			int[] coinUnit = {500, 100, 50, 10};
			
			int money = 2680;
			System.out.println("money="+money);
			try{
				for(int i=0;i<coinUnit.length;i++) {
				for(int j=0;j<coinUnit.length;i++) 
					if(money/coinUnit[i]<=coinUnit[i])
						System.out.println(coinUnit[i]);
				}
				}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println();
		
				}
			
	}
	
			
	
}
