package practice;

public class Students6 {

	public static void main(String[] args) {
		Students3 st=new Students3(1);
		System.out.println(st.id);
		System.out.println(Students3.num);
		st.showInfo("정수현");
		System.out.println("--------------");
		
		Students3 st1=new Students3(2);
		st1.showInfo("정수현2");
		
	}

}
