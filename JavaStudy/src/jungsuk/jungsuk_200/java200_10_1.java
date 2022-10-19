package jungsuk.jungsuk_200;
import java.text.*;
import java.util.*;
public class java200_10_1 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(2022, 0,1);
		for(int i = 0 ; i < 12 ; i ++) {
			int weekday = c.get(Calendar.DAY_OF_WEEK);
			
			int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
										//1==일 2==월 3==화 ..
										// weekday가 일요일이면 1+7이라 둘째일요일은 8
			c.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = c.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
			
			c.add(Calendar.MONTH,1);
			c.set(Calendar.DAY_OF_MONTH,1);
			
		}
		
	}

}
