package jungsuk.jungsuk_200;

public class java200_9_8 {
	public static double round(double d, int n) {
		return Math.round(Math.pow(d,n));
	}
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));

	}

}
