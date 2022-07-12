package day07;

public class Superman {
	

	String name;
	int height;
	int power;//초능력
		
	
	

	
	public Superman(){
		this(111,222,"슈퍼맨");
		//this() : 자기 자신의 생성자를 호출할 때 사용한다.
		//			생성자 안에서만 호출가능
		//			제일 첫번째 문장이어야 한다.
		
		/*name="보스";
		height=100;
		power=1111;*/		
	}
	public Superman(String name) {
		this(170,200,name);
		/*this.name=name;
		height=180;
		power=1100;*/
	}
	public Superman(int height) {
		this(height,210,"이름없는");
		/*name="슈퍼";
		this.height=height;
		power=2000;*/
	}
	//target은 꼭 있어야함.
	public Superman(int height ,int power,String name) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	public String getInfo() {

		String info = "이름 :"+name+"\n키 :"+ height+"\n초능력 :"+power;
		return info;
	
	}
	
	

	}////////////////////////////cls 끝////////////////////////////////


