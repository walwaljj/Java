package practice;

public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean isValid;
	
	public MyDate(int day, int month, int year) {
		setDay_(day);
		//setMonth(month);
		//setDay(day);
	}
	
	public String isValid() {
		
		if(day>28|day<0) {
			System.out.print(" ");
		}else {
			System.out.print("유효한 날짜");
		}return "";
	}
		
	

	public void setDay_(int a) {
		day = a;
		if(a>28|a<0) {
			System.out.println("유효하지 않은 날짜");
		}
	}
	
	
	
	public int getDay_() {
		return day;
	}
	public void setMonth_(int a) {
		month = a;
	}
	public int getMonth_() {
		return month;
	}	
	
	public void setYear_(int a) {
		year = a;
	}
	public int getYear_() {
		return year;
	}
}
	

