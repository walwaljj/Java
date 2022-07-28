package Test11_1;

public class HashCodeTest {

	public static void main(String[] args) {
		Integer iValue=new Integer(100);
		int myValue = iValue.intValue();
		System.out.println(myValue);
		
		Integer number1 = Integer.valueOf("100");
		Integer number2 = Integer.valueOf(100);
		
		System.out.println(number1==number2);
		
		int num=Integer.parseInt("100");
		System.out.println(num);
		
		System.out.println(num+20);
		
	}

}
