package jungsuk.jungsuk_200;

public class java200_9_12 {
	public static int getRand( int from, int to) {
//		
//		return a;
//		int a = 0;
//		int b = Math.min(from, to);
//		int c = Math.abs(b);
//		for (int i = 0 ; i < 20 ; i ++) {
//			a= (int)(Math.random()*c)+b ;
//		}
//		
//		return a;
		
		return (int)(Math.random()*(Math.abs(to - from)+1))+Math.min(from, to);
		
	}
	public static void main(String[] args) {
		for (int i = 0 ; i < 20 ; i ++) {
			System.out.print(getRand(1,-3)+",");
		}
	}

}
