package Test9;

public class CarTest {

	public static void main(String[] args) {
		Bus bus=new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassnger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
		
		//Car c=new (Car)AutoCar();
	}

}
