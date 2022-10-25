package jungsuk.jungsuk_200;

public class java200_3chapter {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius =((int)(((fahrenheit-32)*5/9f)*100)+1)/100f;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		char ch = 'A';
		char lowerCase = (ch < 97 ) ? (char)(ch + 32 ) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);


	}

}
