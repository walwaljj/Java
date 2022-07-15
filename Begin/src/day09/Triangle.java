package day09;
//직삼각형 : (가로 *세로)/2
//Shape 추상클래스를 상속받아서 오류 없게 메서드 재정의하기
public class Triangle extends Shape {
	
	@Override//오버라이드는 헤더는 같고 내용은 다르게/
	public void area(int x, int y) {
		int m = (x*y)/2;
		System.out.println(m);
		System.out.println((x*y)/2);
		
		Shape s = new Triangle();
		System.out.println(s.getInfo());
		
	}
	

	
	
	
}
