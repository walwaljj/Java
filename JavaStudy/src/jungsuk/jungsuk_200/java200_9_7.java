package jungsuk.jungsuk_200;

public class java200_9_7 {
	public static boolean contains(String src,String target) {
		int a = src.indexOf(target);
		if(a!=-1) {
			return true;
		}else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));


	}

}
