package test11;
class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}
public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
		String a=new String("hi");
		String b=new String("!");
		System.out.println(System.identityHashCode(a));
		
		StringBuilder buffer = new StringBuilder(a);
		
		System.out.println(System.identityHashCode(buffer));
		buffer.append("~");
		buffer.append("I am");
		
		a=buffer.toString();
		System.out.println(System.identityHashCode(buffer));
		System.out.println(a+b);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a+b));
		
		
		
	}

}

