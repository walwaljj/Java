package com.in28minutes.oops.level2;

public class Rectangle {
	private int length, width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return String.format("length - %s , width - %s , area - %d , perimeter - %d ", length, width, area(),
				perimeter());
	}
}
