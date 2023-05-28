package Test9_2;

public abstract class Car2 {
	public abstract void drive();
	public abstract void stop();
	public abstract void start();
	public abstract void turnOff();
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
