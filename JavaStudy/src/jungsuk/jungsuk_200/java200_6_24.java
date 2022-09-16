package jungsuk.jungsuk_200;

public class java200_6_24 {
	public static int abs(int value) {
		value = value < 0 ? value*-1 : value; 
		return value;
	}
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 : "+ abs(value));
		value = -10;
		System.out.println(value + "의 절대값 : "+ abs(value));
	}

}
