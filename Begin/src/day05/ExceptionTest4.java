package day05;

public class ExceptionTest4 {

	public static void main(String[] args) {
		//args : String 타입의 배열, 명령줄 인수
		//컴파일 : javac ExceptionTest4.java
		//실행 : java ExceptionTest4 안녕 . 잘가
		//							args[0] args[1]
		//ArrayIndexOutOfBoundsException err 
		try {
			System.out.println("args[0]="+args[0]);//국어 점수
			System.out.println("args[1]="+args[1]);//영어 점수
			//총 합계점수
			//평균점수
			System.out.println(args[0]+args[1]);//문자열이라 8577 표출된다.String 형.
			//java.lang.Integer 클래스 ==> 	Wrapper class
			//int (기본자료형)==> Integer
			//public static int parseInt(String s):
			//문자열 s를 정수로 변환시켜 반환해주는 메소드
			
			//int sum=0;
			
			int kor = Integer.parseInt(args[0]);// INT에 국어점수가 담김
			int eng = Integer.parseInt(args[1]);
			int sum=kor+eng;
			int avg=sum/args.length;
			
			System.out.println("총점 :" +sum);
			System.out.println("평균점수 :"+avg);
			System.out.println(avg/0);
			//숫자가 아닌 다른 값을 넣게되면 NumberFormatException 오류가 난다.
			/*try 블럭 하나에 catch절은 여러개가 올 수 있다.
			 * 그러나 이 때 catch 순서를 주의해야한다.
			 * 
			 * 
			 * 부모 자식의 상속관계가 있는 예외일 경우 
			 * 자식을 먼저 catch하고 부모 예외를 나중에 catch해야 한다.
			 * 
			 * 캐치되는 순간 밖으로 빠져나간다.
			 */
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 입력해야 합니다.");
		}catch(NumberFormatException e) {
			System.out.println("정수는 숫자로 입력해야 합니다.");
		}catch(Exception e) {//잡지 못하는 예외는 예외의 부모로 캐치
			System.out.println("기타 예상치 못한 예외 발생 : "+e);
		}
	
	}//main---
}//class
