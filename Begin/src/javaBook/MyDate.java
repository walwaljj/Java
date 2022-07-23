package javaBook;

public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean result;
	
	
	public MyDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		setDay(this.day);
	}
	
	public boolean isVlid() {
		
		switch(this.month) {
		case 1 , 3 , 5, 7, 8, 10, 12:
			if(this.day>32==false)
			break;
		case 2:
			if(this.day>29==false);
			break;
		case 4, 6, 9, 11:
			if(day>31==false);
			break;
		}
		return result;

	}
	
	public int getDay() {
		return this.day;
	}
	public void setDay(int a) {
		a=this.day;
		if(result==true) {
			System.out.println("유효한 날짜입니다.");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	public int getMonth() {
		return this.month;
	}
	public void setMounth(int a) {
		a=month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int a) {
		a=year;
	}

}
