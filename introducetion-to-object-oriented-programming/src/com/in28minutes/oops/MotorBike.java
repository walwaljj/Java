package com.in28minutes.oops;

public class MotorBike {


//	public void MotorBike(String name) {
//		this.name = name;
//	}

	private int speed;

	MotorBike(int speed) {
		this.speed = speed;
	}

	public MotorBike() {
//		this.speed = 5;
		this(5); // 생성자를 호출함, 즉 ,MotorBike(int speed) 를 호출하고 인자를 5 로 설정하게됨.
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
//		if (this.speed > howMuch) {
//			this.speed -= howMuch;
//		} else {
//			this.speed = 0;
//		}

	}

	public void start() {
		System.out.println("Bike started");
	}


	public void stop() {
		System.out.println("Bike stop");
	}
}
