package jungsuk.jungsuk_200;



public class java200_9_1 {

	public static void main(String[] args) {
		SutdaCard4 c1 = new SutdaCard4(3,true);
		SutdaCard4 c2 = new SutdaCard4(3,true);
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));
	}

}
class SutdaCard4 {
	int num;
	boolean isKwang;
	
	SutdaCard4() { 
		this(1, true);
	}
	SutdaCard4(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
	/*
	(1) 매개변수로 넘겨진 객체의num, isKwang  과
	멤버변수 을 비교하도록 오버라이딩 하시오 num, isKwang .
	*/
		if( obj instanceof SutdaCard4 ) {
			SutdaCard4 cn = (SutdaCard4)obj;
			if(this.num == cn.num  && isKwang == cn.isKwang) {
				return true;
			}else {
				return false;
			}
		}return false;
		
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
