package innerclass;


class OutClass{ 
	private int num = 10;
	private static int sNum = 20;
	

	
	class InClass{
		int inNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num +"외부클래스의 인스턴스 변수");
			System.out.println("OutClass sNum = "+ sNum + "외부클래스의 정적변수");
		}
//		
//		static void sTest() {
//			
//		}
		public void usingClass() {
			InClass.inTest();
		}
	}
	
}
public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		System.out.println("외부클래스 이용해 내부클래스 기능을 호출해요");
		outClass.usingClass();

	}

}
