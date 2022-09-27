package jungsuk.jungsuk_200;
class Outer{
	class Inner {
		int iv = 100 ;
	}
}
public class java200_7_25 {

	public static void main(String[] args) {
//		Outer.Inner ot = new Outer(new Outer.Inner);
		Outer ot2 = new Outer();
		Outer.Inner oi = ot2.new Inner();
		System.out.print(oi.iv);
		
	}

}
