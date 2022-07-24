package test7_1min;

import java.util.ArrayList;

public class DogTest {
	
	public static void main(String[] args) {
		Dog[] d =new Dog[5];
		d[0] =new Dog ("ㅁ","ㅇ");
		d[1] =new Dog ("ㅁ","ㅇ");
		d[2] =new Dog ("s","ㅇ");
		d[3] =new Dog ("ㅁ","ㅇ");
		d[4] =new Dog ("ㅁ","ㅇ");
		
		for(Dog dog : d) {
			Dog di = dog;
			System.out.println(di.showDogInfo());
		}
		DogTestArrayList dd=new DogTestArrayList();
		
		for(Dog dog : dd.d) {
			System.out.println(dog.showDogInfo());
		}
	}
	

}
class DogTestArrayList{
	ArrayList <Dog> d;
	public void list() {
		
	d.add(new Dog("d","f"));
	d.add(new Dog("d1","f"));
	d.add(new Dog("d2","f"));
	d.add(new Dog("d3","f"));
	d.add(new Dog("d4","f"));
	
	
	}
	
}
