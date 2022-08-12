package innerclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable{// runnable의 인터페이스를 상속받는 이너클래스 생성
			
			int localNum = 10;
			
			public void run() {// 상속받은 interface의 메소드 오버라이드
//				num=101; getrunnable의 지역변수를 이너클레스에서 변경할수없다.
//				i=100; 매개변수 또한 변경불가
				System.out.println("i="+i);
				System.out.println("num="+num);
				System.out.println("localNum="+localNum);
				System.out.println("outNum="+outNum+"외부클래스 인스턴스 변수");
				System.out.println("Outer.sNum="+Outer.sNum+"외부클래스 정적 변수");
				
			}
		}
		return new MyRunnable();// 메서드의 자료형이 runnable이고, 
		//							상속받은 지역내부클래스가 구현을 했기때문에 
		//							new 이너클래스명 으로 생성과 동시에 리턴.
		
	}
	
}
public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();//아우터의 객체생성
		Runnable runner = outer.getRunnable(10);
		//아우터 내부의 get..메소드에 매개변수10할당, runnable형의 변수에 값들을 저장
		runner.run();//저장된 값을 가지고 이너클레스 메소드에 접근 
					//==> 아우터클래스+상속받은 자료형 runnable 이라 가능
					//10을가지고 출력문 5개 출력하는데
					//매개변수 i = 10; \\ runner가 저장해온 num = 100
					//localNum =10 \\ Outer형의 outer의 값100 과 200
		
	}

}
