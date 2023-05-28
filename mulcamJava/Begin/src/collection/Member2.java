package collection;

import java.util.*;

public class Member2 implements Comparator<Member2>{
	private int memberId;
	private String memberName;
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId=memberId;
	}
	
	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}

}
