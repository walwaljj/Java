package test15_2;
import java.io.*;

class Person implements Serializable{
	private static final long serialVersionUID = -00000000000001L;
	String name;
	String job;
	
	public Person () {}
	
	public Person(String name , String job) {
		this.name = name;
		this.job = job;
	}
//	
//	public String toString() {
//		return name + "," + job;
//	}
}
public class SerializationTest {

	public static void main(String[] args)throws ClassNotFoundException{
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
	
	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.out"))){
	
		oos.writeObject(personAhn);
		oos.writeObject(personKim);
		
	
	}catch(IOException e) {
		e.printStackTrace();
		
	}
	try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.out"))){
		Person p1 = (Person)ois.readObject();
		Person p2 = (Person)ois.readObject();

		System.out.println(p1);
		System.out.println(p2);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	

}
