package test13;

interface MyNumber {// 인터페이스 생성.
	int getMax(int num1, int num2);// 추상메서드 선언

}
public class TestMyNumber{
	public static void main(String[]args) {
		
		MyNumber max = (x,y) -> x >=y ? x : y;
		System.out.println(max.getMax(10, 20));
	}
}