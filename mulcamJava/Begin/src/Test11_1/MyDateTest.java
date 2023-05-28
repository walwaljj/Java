package Test11_1;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public boolean equals(Object obj) {// 어떤 데이터가오든 비교하겠다는 의미에서 object를 쓰는듯!
		if(obj instanceof MyDate){
			MyDate date = (MyDate)obj;
			if(date.day==this.day&&date.month==this.month&&date.year==this.year) {
				return true;
			}
			else {return false;}
		}
		return true;
	}
	
	public int hashCode() {
		
		return day+month+year;
	}
	
}

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(9,18,2004);
		MyDate date2 = new MyDate(9,18,2004);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
