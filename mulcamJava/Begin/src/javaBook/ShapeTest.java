package javaBook;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		
	ArrayList <Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape s : list) {
			s.draw();
		}
	}

}
class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Circle extends Shape{
	public void deaw() {
		System.out.println("Cirale");
	}
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("Triangle");
	}
}