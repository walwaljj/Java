package day07;

public class Aquaman {
	
	String name;
	int height;
	double speed;
	/*
	 * 한개라도 생성자를 구성하게되면, 제공되던 디폴트 생성자는 사라진다.
	 * 따라서 아래쪽에 생성자를 구성했기 때문에 public Aquaman() 가 실행되지 않음.
	 * => 가능하면 기본 생성자를 먼저 구성하고 다른 생성자를 구성하는것이 오류를 피할 수 있는방법이다
	 * public Aquaman() {값이 없어도 생성해줄수 있음	
	  */
	public Aquaman() {
		this("수현",161,8);
		
		/*name="아";
		height=111;
		speed=22;*/
	}
	
	public Aquaman(String name,int speed) {
		this(name,8,speed);
		/*this.name=name;
		height=50;
		this.speed=speed;*/
	}
	public Aquaman(int height) {
		this("수혀니",height,10);
		/*name="쿠";
		this.height=height;
		speed=22;*/
	}
	public Aquaman(int height ,int speed) {
		this("수혀니2",height,speed);
		/*name="아악";
		this.height=height;
		this.speed=speed;*/
	}
	public Aquaman(String name,int height ,int speed) {
		this.name=name;
		this.height=height;
		this.speed=speed;
	}

	public String getInfo() {
		String info = "이름 :"+name+"\n키 :"+ height+"\n초능력 :"+speed;
		return info;
	}

}//////////////////////////////////////////////
