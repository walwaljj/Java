package day10;
import java.util.*;
import java.io.*;//console 때문
/*HashMap
 *  - Map계열
 *  - 무순서 (입력순서와 출력순서가 다를 수 있음)
 *	- Key값을 Set 으로 관리한다/ 
 */
public class HashMapTest {
	HashMap<String , String> map=new HashMap<>();
	
	public void join() {//이중 로그인 못하게 하는 사이트는 HashMap을 쓴다.
		map.put("Hong", "123");
		map.put("Lee", "abc");
		map.put("Admin", "tiger");
		System.out.println("+.,+회원가입 완료+'`+ 총 회원수 ["+map.size()+"]명 !");
		
	}//=-----------------
	public void loginCheck() {//console은 이클립스가 아닌 도스창에서 ... ==> 이클립스는 null
								//C:\Users\wjdtn\git\new\Begin\bin  에서 실행
								/*java day10.HashMapTest
								 * 
								 * 
								 */
		Console console = System.console();//io를 import 해야함
		
		//password 를 문자열 하나씩 반복문을 돌며 반환.
		//System.out.println("pwd: "+pwd);// char 타입이라 주소값을 찍음.
		//System.out.println("pwd: "+new String(pwd));//주소값이 나오지 않게 형변환
		//1)입력한 아이디가 map에 저장되어 있는지 체크하기
		//  		- 없다면 -> "등록되지 않은 아이디입니다."
		//			- 있다면 -> 비밀번호가 일치하는 경우 "환영합니다"
		//					ㄴ>일치하이 않는경우 	  "일치하지 않습니다."
		
		while(true) {
			System.out.println("아이디: ");
			String userid=console.readLine();//string타입의 console 라인을 읽는다.
			
			System.out.println("비밀번호 : ");
			char[] pwd=console.readPassword();//NullPointerException : java에서 실행되지 않음.
			
			
			if (!map.containsKey(userid)) {
				System.out.println("입력오류! 회원이 아닙니다.");
			} else {
				String realPwd=map.get(userid);// == > String 타입 : 참조형이기때문에 주소값을 비교한다.
												//					but 기본자료형은 값을 비교.
												//따라서 boolean equals(Object o) : (String)참조형 내용 비교는 
												//							ㄴ을 이용해서 문자열 비교
				if (realPwd.equals(new String(pwd))) {//String 타입의 realPwd가 pwd와 일치한지를 물음.
					System.out.println(userid + "님 환영합니다.");
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
			}

			//System.out.println("userid: " +userid);
			//if(map.keySet() != ){
			//	System.out.println("환영합니다");
			//}else if(userid!=map.get(console)){
			//	System.out.println("등록되지 않은 아이디입니다.");
			//}
			
			
		}
	}
	public static void main(String[] args) {
	//join()호출
		HashMapTest h=new HashMapTest();
		h.join();
		h.loginCheck();//console을 java에서 실행되지 않음.
		HashMapTest h1=new HashMapTest();
		h1.join();
		HashMapTest h2=new HashMapTest();
		h2.join();
		
		

	}

}
