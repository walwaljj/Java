package jungsuk.jungsuk_200;

public class java200_4chapter2 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int result = 0;
		for (int i = 0 ; i < 5 ; i ++) {
			
			result= num%10;
			num = num/10;
			sum += result;
		}
		
		
		System.out.println("sum="+sum);

		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1+","+num2);
		
		for (int i = 0 ; i < 8 ; i++ ) {
			
			num3 = num1+num2;
			num1 = num2 ;
			num2 = num3;
			System.out.print(","+num3);
		}

	}

}
