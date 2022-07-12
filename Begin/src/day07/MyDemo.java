package day07;

public class MyDemo {
	
	int x=50;
	static int y=70;//static 은 객체들과 공간을 공유하기 때문에 클레스를 붙혀야함.
	
	public static void foo() {
		System.out.println("foo()...");		
				
	}
	public void bar() {
		System.out.println("bar()...");
	}
	
	public String star(int n) {
		String a=" ";
		for(int i=0;i<n;i++) {
			a+="☆";
		}
		return a;
	}
	
	public static String snail() {
		return "@@@@";
	}
	
}
