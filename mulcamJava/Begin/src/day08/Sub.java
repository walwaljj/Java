package day08;

public class Sub extends Super{
	int b=30;
	int c=40;
	
	//오버라이드 . 메소드는 같고 내용이 다르다.
	@Override //annotation
	public void func() {
		System.out.println("func()@@@");
	}
	//Overload
	public String func(int a) {//매개변수를 다르게 만듦.
		return "func():a="+a;
	}
}
