package Test11_1;

class MyDog{
	String name;
	String type;
	public MyDog(String name, String type) {
		this.name=name;
		this.type=type;
	}
	public String toString() {
		return this.type+this.name;
	}
}
public class Q4 {

	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
	}

}
