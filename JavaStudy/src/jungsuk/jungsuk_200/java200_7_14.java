package jungsuk.jungsuk_200;

class SutdaDeck3{
	final int CARD_NUM = 20;
	SutdaCard3[] cards = new SutdaCard3[CARD_NUM];
	SutdaDeck3() {
		for(int i = 0 ; i < cards.length ; i++) {
			
			int num = i%10+1;
			boolean isKwang = (num<10)&(num == 1 || num == 3 || num == 8 ) ? true : false ;
			cards[i]=new SutdaCard3(num,isKwang);
			
		}
	}
}

class SutdaCard3 {
	private int num ; 
	private boolean isKwang;
	
	SutdaCard3(){
		this(1,true);
	}
	
	SutdaCard3(int num, boolean isKwang){
		this.num = num ;
		this.isKwang = isKwang; 
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setIsKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
	public int getNum() {
		return num;
	}
	
	public boolean getIsKwang() {
		return isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
public class java200_7_14 {

	public static void main(String[] args) {
		SutdaDeck3 deck = new SutdaDeck3();
		SutdaCard3 card = new SutdaCard3(1,true);
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}

}
