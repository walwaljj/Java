package Test10;

public interface Calc {
	double pi = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total (int[] arr) {
		int total =0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
