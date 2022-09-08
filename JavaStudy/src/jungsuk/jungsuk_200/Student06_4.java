package jungsuk.jungsuk_200;

public class Student06_4 {

	public static void main(String[] args) {
		Student06_3 s = new Student06_3 ();
		s.name = "hong";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : "+ s.name);
		System.out.println(s.info());
		System.out.println(s.getAverage());
	}

}
