package day09;
//도형 클래스 => 추상클래스
//추상클래스 : 일반 멤버변수, 멤버 메서드, + 추상메서드(메서드의 몸체없이 헤더만 선언함)
//	  목적 : 상속받은 자식 클래스에서 추상메서드를 오버라이딩 시킬 목적
			//==>무조건 재정의 할 수 있게. 메소드가 다르면 err나게/
public abstract  class Shape {
	int x,y;// 일반 멤버 변수
	public String getInfo() {
		return " 나는 도형 클래스입니다.";
	}
	abstract public void area (int a, int b);//메소드 헤더만 선언하는것을 추상메서드라함
	// abstract를 붙혀야한다. 
	//추상 메서드를 1개 이상 가진 클래스는 역시 추상클래스여야 한다.
	
}
