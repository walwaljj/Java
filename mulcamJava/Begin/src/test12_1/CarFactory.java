package test12_1;
import java.util.*;


public class CarFactory {
	Car car = new Car();
	static CarFactory instance = new CarFactory();
	HashMap<String, Car> carMap = new HashMap<>();
	
	public static CarFactory getInstance() {
		
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public Car createCar(String name) {
		if( carMap.containsKey(name) ) {
			return carMap.get(name);
		}
		
		carMap.put(name, car);
		return car;
	}
	
	public void showCar() {
		Iterator<String> ir = carMap.keySet().iterator();
		while(ir.hasNext()) {
			String key=ir.next();
			Car car1=carMap.get(key);
			System.out.println(car1);
		}
		System.out.println();
	}



}