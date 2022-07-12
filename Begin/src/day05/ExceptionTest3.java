package day05;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) 
			try{
				int a=50/(i-3);
				System.out.println("a="+a);
			}catch(ArithmeticException c) {
				System.out.println("분모가 0이되어 오류입니다.");
		}//for----
		
		System.out.println("##매우 중요한 코드 ##");
		}
	}


