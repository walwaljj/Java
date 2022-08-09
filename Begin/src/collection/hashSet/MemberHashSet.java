package collection.hashSet;

import java.util.*;
import collection.Member;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;//hashset을 선언함.
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();//hashset 생성.
		//HashSet <Member> hashSet = new HashSet<>();로 선언과 동시에 생성가능.
	}
	
	/** 멤버를 추가하는 메서드*/
	public void addMember(Member member) {// 멤버클레스 자료형의 멤버를 매개변수로받고
		hashSet.add(member);// 매개변수로 받은 자료를 hashset에 저장함.
	}
	
	/** 저장했던 멤버를 삭제하는 메서드*/
	
	public boolean removerMember(int memberId) {//memberid 를 매개변수로받음
		Iterator<Member> ir=hashSet.iterator();//iterator의 변수 ir선언,자료형 member
												//ir을 iterator()를 이용해 hashset을 순회함.
		
		while(ir.hasNext()) {//다음 자료형이 있을때까지 순회한다는 조건.
			Member member = ir.next();// 회원을 하나씩 가지고옴.
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
