package day09;

public class SubCircle extends Circle {
	//오버라이드
	public void area(int x , int y) {}
	//int2개짜리가 필요없어도 빈 블럭으로라도 재정의 해야한다. 추상클레스의 의무사항.
	
	
	//오버로딩
	public void area(int r) {
		System.out.println("원의 면적 : " + (Circle.PI*r*r));
	}

}
