package test12_1;

public class GenericMethod {
	
	public static <T, V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		// 제네릭 클래스가 아니여도 제네릭을 메서드로 구현.
		double left=((Number)p1.getX()).doubleValue();
		double right=((Number)p2.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
	
		double width = right-left;
		double height = bottom - top;
		
		return width*height;
	}
	public static void main(String[] args) {
		Point<Integer, Double>p1=new Point <Integer , Double>(0, 0.0); 
		Point<Integer, Double>p2=new Point <>(10, 10.0);
		double rect=GenericMethod.<Integer, Double>makeRectangle(p1,p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+"입니다.");
		
		Point<Integer, Double>p11=new Point (0, 0.0); //<Integer , Double> 생략
		Point<Integer, Double>p22=new Point (10, 10.0);// <> 생략
		double rect1 = GenericMethod.makeRectangle(p11, p22);//<Integer , Double>, <> 생략
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect1+"입니다.");// 생략하더라도 유추하기 때문에 값은 같당.
		
		
	}

}
