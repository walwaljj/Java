package javaBook;

public class Student {
	
	String name ;
	String transport;
	long fee;
	String time;
	Taxi t=new Taxi();
	public Student() {
	}
	
	public Student(String name,String transport,String time) {
		this.name=name;
		this.time=time;
		this.transport=transport;
		this.fee=t.fee;
		studentInfo();
	}
	public void studentInfo() {
		
		
		System.out.println(name+"학생은 "+time+"에 일어나 "+transport
							+"를 탔습니다. 지불한금액은 "+t.fee+"입니다.");
	}	
}
