package test6_5;

public class CafeTest {

	public static void main(String[] args) {
		Person p = new Person("정수현","별다방");
		StarCafe s=new StarCafe();
		
		s.ttl();

		

		
		Person p1 = new Person("정수현1","별다방"); StarCafe s1=new StarCafe();
		s1.ttl();
	
		
		Person p2 = new Person("정수현2","콩다방");
		KongCafe s2=new KongCafe();
		s2.ttl();
		
		Person p3 = new Person("정수현3","콩다방");
		KongCafe s3=new KongCafe();
		s3.ttl();
		p3.takeCaffee(s3);
	}

}
