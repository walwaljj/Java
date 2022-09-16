package jungsuk.jungsuk_200;

public class java200_6_22 {
	public static boolean isNumber(String str) {
		boolean bool = false;
		for(int i = 0 ; i < str.length() ; i++) {
			char isNum = str.charAt(i);
			bool = (!(isNum >='0'& isNum <='9')) ? false : true;
		
		}return bool;
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.printf("%s 은 숫자입니까? %b",str,isNumber(str));
		System.out.println();
		str = "1234o";
		System.out.println(str+" ? "+isNumber(str));
		str = "";
		System.out.println(str+" ? "+isNumber(str));
	}

}
