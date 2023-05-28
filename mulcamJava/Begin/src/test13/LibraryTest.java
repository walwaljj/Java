package test13;

import java.util.*;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name ;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
}


public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바" , 25000));
		bookList.add(new Book("파이썬" , 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		//스트림생성하고 출력하기
		int ttl = bookList.stream().mapToInt(p->p.getPrice()).sum();
		System.out.println(ttl);
		
		bookList.stream().filter(f->f.getPrice()>=20000)
		.map(m->m.getName()).sorted().forEach(s->System.out.println(s));
	}

}
