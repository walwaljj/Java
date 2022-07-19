package javaBook;

import java.util.*;


/**Member클레스의 user등록 및 login
 */

public class Login {
	private Hashtable<String,String> hm = new Hashtable<>();
	Member mb=new Member();
	
	public void add() {
		hm.put(mb.getMyId(),mb.getMyPw());
		Scanner sc=new Scanner(System.in);
		
		
	while(true) {
		System.out.println("아이디 : ");
		String user = sc.next();
		
		if(!hm.containsKey(user)) {
			System.out.println("등록되지 않은 아이디 입니다.");
			
		}else{
			String realPwd=hm.get(user);
			System.out.println("비밀번호 : ");
			String pwd = sc.next();
			if(realPwd.equals(new String(pwd))) {
				mb.login();
				break;
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}
		}
			
	}
		
	}
	
	public static void main(String[] args) {
		Login l=new Login();
		l.add();
		
		
		

		
	
		
		

	}




}
