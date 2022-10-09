package jungsuk.jungsuk_200;

public class java200_9_6 {
	public static String fillZero(String src, int length) {
		String str = "";
		if(src.length()>=length&&length>0) {
			str = src.substring(0,length);
		
		}
		else if(src.length()<length) {
			for(int i = 0; i < length-src.length(); i ++) {
				str+='0';
			}
			str+=src;
		}else {
			str = "";
		}
		return str;
	}
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
		

	}

}
