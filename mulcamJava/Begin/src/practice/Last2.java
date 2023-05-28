package practice;
import java.util.*;
public class Last2 {

	public static void main(String[] args) {
		String value= "ff111";
		char ch = ' ';
		boolean isNumber=true;
		
		for(int i = 0; i<value.length();i++) {
			ch=value.charAt(i);
			if(!(ch>='0'&&ch<='9')) {
				isNumber=false;
				break;
			}
		}
		if(isNumber==true) {
			System.out.println(value+"숫자입니다.");
		}else {
			System.out.println("숫자가아닙니다.");
		}
		
		int [] coinUnit = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money = "+money);
		
		for(int i = 0;i<coinUnit.length;i++) {
			int cost=money/coinUnit[i];
			System.out.println(coinUnit[i]+" : "+cost);
			money=money%coinUnit[i];
		}
	}

}
