package javaBook;

public class PersonTest {

	public static void main(String[] args) {

		Person_ p=new Person_("정수현");
		Person_ p1=new Person_();//왈왈
		Person_ p2=new Person_("왈와리",161,11);
		p1.showInfo();
		p.hight=160;
		//p.name="정수현";
		//weight=50;
		System.out.println(p.name);//정수현
		System.out.println(p1.hight);
		

	}

}
