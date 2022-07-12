package day07;
//각 클레스들의 멤버 변수 모두캡슐화
//setter getter메소드 구성하기.
public class Student {
	private int no;
	private String name;
	private String major;
	
	
	//setter
	public void setNo(int no) {
		
		//멤버 변수와 지역변수의 이름이 동일할 경우
		//지역변수가 우선권을 가진다.
		//이럴때 멤버변수 지역변수를 구분하기위해
		//멤버변수 앞에는 this. 을 붙인다.
		//this: 자기자신의 객체(instance)를 참조할 때 사용하는 키워드.
		
		this.no=no;
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void setMajor(String major) {
		
		this.major=major;
		
	}
	
	
	//getter
	public int getNo(){
		
		return no;
	}
	
	public String getName(){
		
		return name;	
	}
	public String getMajor() {
		
		return major;
	}
	
	public void showInfo() {
		System.out.println("--학생 정보입니다--");
		System.out.println("학 번 : "+no);
		System.out.println("이 름 : "+name);
		System.out.println("전 공 : "+major);
		
		
	}
	

}
