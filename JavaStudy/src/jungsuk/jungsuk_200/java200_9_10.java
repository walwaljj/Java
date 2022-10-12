package jungsuk.jungsuk_200;

public class java200_9_10 {

	public static String format( String str, int length, int alignment ) {
		char[] ch ;
		char[] source = str.toCharArray();
		if(length<str.length()) {
			return str.substring(0, length);
		}else {
			ch = new char[10];
			for(int i = 0 ; i <ch.length ; i++) {
				ch[i] = ' ';
			}
			switch(alignment) {
			case 0 :
			default :
			System.arraycopy(source, 0, ch,alignment, source.length);
			break;
			case 1 :
			System.arraycopy(source, 0, ch, alignment, source.length);
			break;
			case 2 :
			System.arraycopy(source, 0, ch,alignment, source.length);
			break;
			}
			return new String(ch);
		}
	}
	
	public static void main(String[] args) {
		String str = "가나다"; 
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬


	}

}
