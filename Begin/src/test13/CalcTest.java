package test13;


interface Calc{
	public int add(int num1, int num2);
}

public class CalcTest {

	public static void main(String[] args) {
		Calc calc = (num1,num2)->(num1+num2);
		
		System.out.println(calc.add(1,2));
		
	}

}
