package test6_5;

public class KongCafe {
	
	int money=4000;
	int sum;
	
	public KongCafe() {
		money+=4000;
		
		sum=money;
		 
	}

	
	public void ttl() {
		
		sum+=money;
		System.out.println("콩다방의 수입은"+sum+"입니다.");
		money+=4000;
	}

}
