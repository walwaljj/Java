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
		
		
		String s3 = "567a8";
		boolean isNum=true;
		for(int i=0;i<s3.length();i++) {
			char ch = s3.charAt(i);
			System.out.print(ch+",");
			if(!(ch>='0'&&ch<='9')) {//숫자가 아닌 문자가 있다면
				isNum=false;
				break;
			}
		}
		String result=(isNum)? "숫자입니다." : "숫자가 아닙니다.";
		
		System.out.println("\n변수 s3는 "+result);
		System.out.println("------------------------------");
		//int indexOf(String str):str 문자열이 위치한 곳의 index번호를 반환한다.
		//							만약 str문자열이 없다면 -1을 반환한다.
		String s4 = "어머님은 짜장면이 싫다고 하셨어. 어머님은 짜장면이 ... ";
		
		//문자열의 앞에서 부터 찾는다.
		int idx = s4.indexOf("짜장면");
		System.out.println("idx : "+idx);
		
		
		//문자열 뒤에서부터 찾는다.(.lastIndexOf())
		idx = s4.lastIndexOf("짜장면");
		System.out.println("idx : "+idx);
		
		
		//str문자열이 없다면 -1을 반환한다
		idx = s4.lastIndexOf("짬뽕");
		System.out.println("idx : "+idx);
		
		//String substring(int start): start부터 끝까지 문자열을 반환
		//String substring(int start, int end):인덱스 start에서부터 end-1까지의 문자열을 반환
		System.out.println(s4.substring(s4.indexOf("짜장면"),s4.lastIndexOf("짜장면")));
		System.out.println(s4.substring(s4.indexOf("짜장면")));
		System.out.println(s4.substring(5));
		System.out.println(s4);
		
		//replace(String oldStr, String newStr)
		//짜장면을 짬뽕으로 바꿔서 출력하기.
		System.out.println(s4.replace("짜장면","짬뽕"));
		System.out.println(s4);//바꿨다해서 원본이 바뀌지 않는다.
		/*
		 * for(int i=0;i<s4.length();i++) { System.out.println(); }
		 */
		System.out.println("-------------------------------------");
		
		String s5=" 100#Tom#반갑습니다~ 오늘도 즐거운 하루 되세요";
		System.out.println("s5.length() : "+s5.length()+" "+s5);
		
		//String trim() : 문자열 앞,뒤의 공백 문자를 제거한다.
		String s6=s5.trim();
		System.out.println("s6.length() : "+s6.length()+" "+s6);
		
		//String toUpperCase()/toLowerCase()
		
		//String[] split(String regex): 특정 패턴 문자열을 기준으로 문자열을 쪼개어 배열에 담아 반환한다.
		String[] tokens=s5.split("#");//#을 기준으로 배열을 나눈다. 
		System.out.println("tokens.length : "+tokens.length);
		System.out.println("tokens[0] : "+tokens[0]);//#이전
		System.out.println("tokens[1] : "+tokens[1]);//#부터 #
		System.out.println("tokens[2] : "+tokens[2]);//#이후
	}

}
