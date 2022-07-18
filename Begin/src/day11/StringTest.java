package day11;

public class StringTest {

	public static void main(String[] args) {
		//java.lang.String : final 클래스 . 상속 받을 수 없다.
		//					 immutable(불변성) : 문자열 결합이나 삭제 ,
		//                   수정 등의 작업을 할 때 원본문자열은 그대로 두고 새로생성함.
		
		String s1="Java";
		s1+=" Langue"; /// 하는 순간 새로운 객체가 생성이되며 원본은 변하지 않음(원본 + 새로운 내용)
						//==> 객체생성으로 인한 메모리가 계속 상승, 웹이 느려짐.
		
		System.out.println(s1);
		/*
		 * s1 ---> "Java"
		 * 
		 * s1 ---> "Java Language"
		 * 
		 * */
		
		//concat() : 문자열을 결합
		
		String s2=s1.concat("Nice");
		System.out.println("s2 :" + s2);
		System.out.println("s1 :" + s1);
		
		//[2] char cahrAt(int i) : 특정 문자의 index를 불러올때
		char c1=s1.charAt(5);
		//0123456789101112
		//java language
		System.out.println("c1 :"+c1);
	}

}
