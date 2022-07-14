package day09;

class Super{
	
	void foo() {
		System.out.println("Super's foo()");
		
	}
	
}///Super cls 끝
//final + class : 다른클레스에서 상속받지 못하도록.
final class Sub extends Super{
	
	
	//오버라이드 - 지정자는 같거나 크게 (private [x])
	protected void foo() {
		System.out.println("sub's foo()");
	}
	
	
}/////////
//public class FinalTest1 extends Sub --> 오류남 sub는 자식을 가질수 없다.
//ex / java.lang.String 클래스 = > final 클래스
public class FinalTest1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
