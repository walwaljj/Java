package practice;

public class Ex4q1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		char oper = '-';
		int sum = 0;
		
		System.out.println("-----");
		if(oper=='+') {
			sum=num1+num2;
		}
		else if(oper=='-') {
			sum=num1-num2;
		}else if(oper=='*') {
			sum=num1*num2;
		}else if(oper=='/') {
			sum=num1/num2;
		}else {
			System.out.println("없는 연산자입니다.");
		}System.out.println(sum);
		
		System.out.println("------");
		
		switch(oper) {
		
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			
		}
	

	}

}
