package my.day11.a.inheritance;

public class Member {
		/* Gujikja 클래스와 Company 클래스에 사용될 공통 field 선언 */
	protected String id;
	protected String passwd;
	protected String name;
	
		/* 새로 입력 받은 id와 passwd 비교 후 true,flase 반환 */
	boolean isExists(String id, String passwd) {	
		if(this.id.equals(id) && this.passwd.equals(passwd))
			return true;
		else 
			return false;
	}
}