package practice;
import java.util.*;
public class Practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요");
		String value=sc.next();
		System.out.println(value);
		char ch=' ';
		boolean num=true;
		
		for(int i=0;i<value.length();i++) {
			ch = value.charAt(i);
			
			if(!('A'<=ch && ch<='z')) {
				num=false;
				break;
			}
		}
		if (num) {
			System.out.println(value+"는 알파벳입니다.");
		}else {
			System.out.println(value+"는 알파벳이 아닙니다.");
		}
	

	}

}
