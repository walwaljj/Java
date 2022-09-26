package jungsuk.jungsuk_200;

public class java200_7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();


	}

}

class Buyer {
	int money = 1000;
	
	Product[] cart = new Product[3];
	
	int i = 0;
	
	// 제품구입
	void buy(Product p) { 
			
			
			if(money < p.price ) {
				System.out.println("잔액이 부족하여" + p +"를 살 수 없습니다.");
				return;
			}else {
				money -= p.price;
				add(p);
			
		}
	}
	
	// 장바구니에 물건 추가
	void add(Product p) {
		
		if (i >= cart.length) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++]=p;//p는 물건임.
		
//		for (int i = 0 ; i >= cart.length ; i++) {
//			Product[] cart2 = new Product[cart.length*2];
//			cart2[i] = cart[i];
//			cart[i] = p;
		
	} 
	
	// 구입한 물건의 목록, 사용금액, 남은금액을 출력
	void summary() {
		String itemList = "";
		int sum = 0;
		
		for(int i = 0 ; i < cart.length ; i ++) {
			if(cart[i] == null)
				break ;
			
			itemList +=cart[i] + ",";
			
			sum += cart[i].price;
			
		}
		System.out.println("구입한 물건 : "+itemList
				+"\n사용한금액 : "+sum + "\n남은금액 : "+money);	
		 
	}
}

class Product {
	
	int price;
	
	Product(int price) { this.price = price;}
}

class Tv extends Product {
	
	Tv() {super(100);}
	
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	
	Computer() {super(200);}
	
	public String toString() { return "Computer";}

}

class Audio extends Product {
	
	Audio() {super(50);}
	public String toString() { return "Audio"; }
}






