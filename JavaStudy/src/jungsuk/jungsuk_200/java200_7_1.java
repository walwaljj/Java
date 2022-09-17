package jungsuk.jungsuk_200;

class SutdaCard2 {
	int num ; 
	boolean isKwang;
	
	SutdaCard2(){
		this(1,true);
	}
	
	SutdaCard2(int num, boolean isKwang){
		this.num = num ;
		this.isKwang = isKwang; 
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	
	SutdaDeck() {
	
		for(int i = 0 ; i < cards.length ; i ++) {
			int num=i%10+1;
			boolean isKwang =(i<10)&&(num ==1 ||num == 3||num == 8);
			cards[i]=new SutdaCard2(num,isKwang);
		}
		
	}

	public SutdaCard2 pick(int i) {
		return cards[i];
	}
	public SutdaCard2 pick() {
		int a=(int)(Math.random()*cards.length);
		return cards[a];
	}
	public void shuffle() {
		for (int i = 0 ; i <cards.length ; i ++) {
			int rand = (int)(Math.random()*cards.length);
			SutdaCard2 tmp = cards[i];
			cards[i] = cards[rand];
			cards[rand] = tmp;
		}
	}
}
public class java200_7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0 ; i < deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
