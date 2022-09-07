package jungsuk.jungsuk_200;

class SutdaCard {
	int num = 0;
	boolean isKwang = true;
	
	public SutdaCard() {
		this.num = (int)(Math.random()*10+1);
		isKwang = true;
	}
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String info() {
		String result = (this.isKwang==true) ? "K" : " ";
		return this.num+result;
	}

}

public class java200_6_1 {
	
	public static void main(String[] args) {
		
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
