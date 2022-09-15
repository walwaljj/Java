package jungsuk.jungsuk_200;



public class java200_6_6 {
	static double getDistance(int x , int y , int x1, int y1) {
		double result = Math.sqrt((Math.pow(x1-x,1)+Math.pow(y1-y,1)));
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println(getDistance(1,1,2,2));
	}

}
