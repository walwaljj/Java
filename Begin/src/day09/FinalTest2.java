package day09;

class SuperDemo{
	
	void sub() {
		System.out.println("SuperDemo's sub()");
	}
	
	final void bar() {
		System.out.println("SuperDemo's bar()");
	}
	
}///////SuperClass 끝

class SubDemo extends SuperDemo{
	//오버라이딩 하기
	@Override
	void sub() {
		System.out.println("SubDemo's sub");
	}
	//@Override
	//final void bar() {	//final +method는 오버라이딩할수없다.
	//}
	
}
public class FinalTest2 {

	public static void main(String[] args) {
		
		//SuperDemo의 sub(), bar() 호출
		SuperDemo sd = new SuperDemo();
		
		sd.sub();
		sd.bar();
		
		//subDemo의 재정의한 sub호출
		SubDemo ss = new SubDemo();
		ss.sub();
		ss.bar();//final +method는 오버라이딩할수없다. 다만 오버라이드해서 부모의 것을 가져올 수 있다.
		
		
	}

}
