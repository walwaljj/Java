package jungsuk.jungsuk_200;
class Outer2 {
	static class Inner {
		int iv=200;
	}
}
public class java200_7_26 {

	public static void main(String[] args) {
		Outer2.Inner oi = new Outer2. Inner();
		System.out.println(oi.iv);
	}

}
