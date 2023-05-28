package practice;

public class Taxi {
	
	int money;
	int count;
	
	public void money(int money) {
		this.money=money;
		money+=10000;
	}
	
	public void count(int count) {
		this.count=count;
		count++;
	}
	public void showInfo() {
		System.out.println("오늘 택시의 수입은 "+money+"입니다.\n오늘 총 탑승객 수는 "+count+"명 입니다.");
	}

}
