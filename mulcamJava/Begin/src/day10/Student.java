package day10;
//도메인 객체 - VO(Value Object), DTO(Data Transfer Object)// 프로젝트 할때 꼭!! 
public class Student {
	private int id;
	private String name;
	
	
	
	//기본생성자
	public Student() {
		this(0,"아무개");
	}
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {//반환
		return id;
	}

	public void setId(int id) {
		this.id = id;//멤버변수에 this 값을 저장함.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.name==s.name &&this.id==s.id;
	}
}
