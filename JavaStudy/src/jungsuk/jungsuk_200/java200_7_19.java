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
	
	void buy(Product p) {
		
	}
	void add(Product p) {
	
	} 
	void summary() {
	}
}
class Product {
	int price;
	
	Product(int price) {
		
	this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
public String toString() { return "Tv"; }
}
class Computer extends Product {
Computer() { super(200); }
public String toString() { return "Computer";}
}
class Audio extends Product {
Audio() { super(50); }
public String toString() { return "Audio"; }