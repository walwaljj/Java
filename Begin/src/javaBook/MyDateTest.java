package javaBook;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(11,2,2000);//유효하지 않은 날짜입니다.
		System.out.println(date1.isVlid());
		MyDate date2 = new MyDate(32,10,2006);//유효한 날짜입니다.
		System.out.println(date2.isVlid());
		

	}

}
