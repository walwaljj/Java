package day06;

public class ERP_App {

	
	public static void main(String[] args) {
		//객체 생성  //Object = 현실세계있는 객체 = object = 메모리에 올라간 객체
		Employee e1=new Employee();//객체(object, instance)
		//객체명.변수=값
		e1.no=1;
		e1.name="김사원";
		e1.salary=500;
		e1.dept="기획부";
		//el.indate=new java.util.Date();//import를 안했을때 앞에 패키지명을 적으면 대신할수있다.
		e1.work("기획");
		
		int year_sal=e1.receive_sal();
		System.out.println("연봉: "+year_sal);
	}
}
