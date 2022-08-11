package collection;

import java.util.*;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId=memberId;
		
	}
	
	public String getMemberName() {
		return memberName;
		
	}
	public void setMemberName(String memberName) {
		this.memberName=memberName;
	}
	
	public String toString() {
		return memberName+"아이디는 "+memberId+"입니다.";
	}
	
	@Override// equals와 hashCode는 세트다. 같이 Override해야함
	public int hashCode() {
		return memberId;// hashCode()메서드가 회원아이디를 반환하도록 ..
		
						//일반적으로 hashcode는 멤버변수를 활용하는것이 좋고 
					//equals에서 사용할 멤버변수를 return 하게 재정의한다.
	}
	
	@Override
	public boolean equals(Object obj) {// equals를 재정의 , 어떤 자료형이든 비교하기위해 object유형
		if(obj instanceof Member) {//만약 member가 obj의 자식일때
			Member member = (Member)obj;//obj를 멤버클래스형으로 강제형변환해서 member변수에 담는다.
			if(this.memberId == member.memberId)//매개변수로 받은 회원아이디가(member.memberId)
												//자신의 회원아이디(this.memberId)와 같다면
				return true;// true를 반환
			else
				return false;
		}
		return false;

	}
	
	@Override// 부모 comparble인터페이스의  public int compareTo(T o);를 재정의함.
	public int compareTo(Member member) {
	return(this.memberId - member.memberId);//this.member : 새로 추가한 memberid
											//추가된 멤버아이디가 크면 양수를 반환.
	
	}
//	@Override
//	public int compareTo(Member member) {
//		
//		return this.memberName.compareTo(member.memberName);
//		
//	} // 추가한 member를 이름순으로 정렬하게 재정의함.
}
