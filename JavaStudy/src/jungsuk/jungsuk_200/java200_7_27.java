package jungsuk.jungsuk_200;

class Outer3{
	int value = 10;
	
	class Inner {
		int value = 20 ;
		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(new Outer3().value);
		}
	}
}
public class java200_7_27 {

	public static void main(String[] args) {
		
		Outer3.Inner inner = new Outer3().new Inner();
		
		inner.method1();
	}

}
