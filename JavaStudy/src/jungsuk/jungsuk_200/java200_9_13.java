package jungsuk.jungsuk_200;

public class java200_9_13 {

	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa " + stringCount(src, "aa") +" .");
	}
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		if (key == null || key.length() == 0)
		return 0;
		else {
			for(int i = 0 ; i < src.length() ; i ++, pos ++) {
				index = src.indexOf(key);
				
				if(index != -1) {
					count ++;
				}else {
					break;
				}
			}
		}
		
		
		return count;
	}

}
