package practice;

public class Student {
	
	String name;
	int money;
	String time;
	
	
	public void st(String name,int money, String time) {
		name="james";
		money=40000;
		time="09:30";
	}


	public void student() {
		
	}
	
	public void time(String time) {
		time="08시31분";
		
	}
	
	public void student(String name) {
		this.name=name;
		return;
	}
	
	public void takeTaxi(int money) {
		this.money-=10000;;
		
	}
	public void showInfo() {
		System.out.println(name+"학생은"+money+" 의 돈이 남아있습니다.\n택시를 탄 시간은 "+time+"입니다");
	
	}

}
