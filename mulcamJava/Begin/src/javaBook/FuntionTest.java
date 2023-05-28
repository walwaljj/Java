package javaBook;

public class FuntionTest {

	public static void main(String[] args) {
		
		int a1=10;
		int a2=2;
		
		
		FuntionTest2 a=new FuntionTest2();
		
		System.out.println(a.add(a1, a2));
		System.out.println(a.even(a1, a2));
		System.out.println(a.gop(a1, a2));
		System.out.println(a.div(a1, a2));
		
	}
	
	


}
 class FuntionTest2{
	
	public int add(int n, int n2) {
		int result = n+n2;
		return result;
	}
	public int even(int n, int n2) {
		int result = n-n2;
		return result;
	}
	public int gop(int n, int n2) {
		int result = n*n2;
		return result;
	}
	public int div(int n, int n2) {
		int result = n/n2;
		return result;
	}
}
