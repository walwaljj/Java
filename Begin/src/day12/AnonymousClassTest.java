package day12;

class MyObject extends Object{
	
	@Override
	public String toString() {
		return "I am MyObject";
	}
}


public class AnonymousClassTest {

	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object() {//이름없는 로컬 이너클레스, 객체 생성문 뒤에 {}를 붙혀 만든다.
			@Override
			public String toString() {
				return "Anonymous Object";
			}//<-- ㄴ이름없는 클래스 , 일회용으로 클래스를 상속받는다.
		};//<-세미콜론 있어야함
		
		
		
		System.out.println(o1);
		System.out.println(o1.toString());
		
		
		Object o3=new MyObject();
		System.out.println(o3);

	}

}
