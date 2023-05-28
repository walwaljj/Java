package day05;
/* 예외 처리 방법
 * [1] Handle : try~ catch절 사용
 * [2] Declare : throws 절을 사용
 */
public class ExceptionTest {

	public static void main(String[] args) {
		String[] fruits = {"수박","멜론","사과","배"};
		try {
			for(int i=0;i<5;i++) {///4가아닌 5로 했기때문에 err
				System.out.println(fruits[i]);//i가 4가 되는 순간 err,아래 중요한코드 프린트 안됨.
				
			}//for---
		}//try절 시작 ( 오류가 난 구문을 try절로 감싼 후 catch절을 시작)
		catch(ArrayIndexOutOfBoundsException e){
			//예외처리코드
			System.out.println("배열의 인덱스 범위가 초과되었습니다..");
			//에러 발생시 처리해야하는 코드를 작성해주기도함
		}
		System.out.println("###반드시 실행되어야 하는 중요한 코드###");
		
		
	}

}
