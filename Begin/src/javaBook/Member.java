package javaBook;
/**아이디 등록
 * */
public class Member {
	
	private String myId;
	private String myPw;
	

	public Member() {
		myId = "walwal";
		myPw = "1143";
	}


	public String getMyPw() {
		return myPw;
	}

	public void setMyPw(String myPw) {
		this.myPw = myPw;
	}


	public String getMyId() {
		return myId;
	}


	public void setMyId(String myId) {
		this.myId = myId;
	}
	
	public void login() {
		System.out.println(this.myId+" 님 환영합니다!");
		
	}
	

	

}
