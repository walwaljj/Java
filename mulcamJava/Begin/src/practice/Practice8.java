package practice;

public class Practice8 {

	public static void main(String[] args) {
		
		int [] coinUnit = {500,100,50,10};
		
		int money = 2680;
		
		System.out.println("money : "+money);
		int i=0;
		
		
		for(i = 0;i<coinUnit.length;i++) {
			int charge =money%coinUnit[i];
			if(charge>coinUnit[i]) {
				money/coinUnit[i];
				break;
			}else
			System.out.println(coinUnit[i]+" : "+money/coinUnit[i]);
			
		}
			
	}

}
