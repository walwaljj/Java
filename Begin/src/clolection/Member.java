package clolection;

public class Member {
	//속성
	private int memberId;//회원 아이디
	private String memberName;//회원 이름
	
	
	//생성자 int, String 
	public Member(int memberId,String memberName) {
		this.memberId = memberId;     
		this.memberName = memberName;
		
	}
	//memberId getter
	public int getMemberId() {
		return memberId;
	}
	//memberId setter
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	//memberId getter
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberId(String memberName) {
		this.memberName = memberName;
	}
	
	
	@Override
	public String toString() {// toString () 메서드의 재정의
		return memberName+"회원님의 아이디는 "+memberId+"입니다.";
	}

}
