package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike somthingElse = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(80);

		ducati.decreaseSpeed(1000);
		honda.decreaseSpeed(30);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}

}
