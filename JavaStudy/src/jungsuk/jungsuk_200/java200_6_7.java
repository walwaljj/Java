package jungsuk.jungsuk_200;
class MyPoint{
	int x ;
	int y ;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public  double getDistance(int x1, int y1) {
		double result = Math.sqrt(Math.pow((x1-x),2)+(Math.pow((y1-y),2)));
		return result;
	}
}
public class java200_6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2,2));
	}

}
