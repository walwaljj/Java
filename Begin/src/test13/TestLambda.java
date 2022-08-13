package test13;


interface PrintString{
	void showString(String str);
}
public class TestLambda {
	public static void main(String [] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello lamda_1");
		show(lambdaStr);
		
		PrintString reStr = returnString();
		reStr.showString("Hello");
	}
	public static PrintString returnString() {
		return s -> System.out.println("world");
	}
	
	public static void show(PrintString p) {
		p.showString("Hello lamda_2");
	}
	
	
	
	

}
