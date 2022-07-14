package day08;
//부모클래스 : Super class , Base class
public class Human {//묵시적으로 extends Object 
	
	String name;
	int height;
	
	public Human(){//<== 이 기본생성자를 없애면 상속받는 자식클래스에서 에러가생김.
							//부모클레스는 기본생성자를 만들고 하는게 좋다. 자식클레스는 슈퍼의 기본생성자를 호출하게되어있다.
		this("아무개", 155);
	}
	public Human(String n, int h) {//매개변수를 받아들이는 생성자
		name=n;
		height=h;
	}
	
	public String getInfo() {
		
		return "이름 : " +name+"\n키 : " + height;
	}

}
