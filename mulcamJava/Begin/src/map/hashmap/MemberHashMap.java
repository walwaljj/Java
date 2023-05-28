package map.hashmap;
import java.util.*;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer , Member>hashMap =new HashMap<Integer , Member>(); // integer 클래스와 member클래스를 담은 HashMap을 선언함.

	/**멤버를 추가하는 메서드*/
	public void addMember(Member member) {// 멤버 이름을 받는다.
		hashMap.put(member.getMemberId(), member);// hashMap에 getmemberid로 int형 id, 매개변수로 받은 member를 추가한다.
	}
	/**멤버를 삭제하는 메서드*/
	public boolean removeMember(int memberId) {//멤버 id를 받음.
		if(hashMap.containsKey(memberId)) {//만약 매개변수로 받은 멤버id가있다면
			hashMap.remove(memberId);//hashMep에서 그 id를 삭제해
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}	
	/*모든 멤버를 보여주는 메서드*/
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();//hashMap.keySet을 호출 ==> 모든 key값이 출력준비(set)됨=>iterator() 호출
															//준비된key값을 돌아볼수있는 Iterator를 변수 ir 에 담아준다.
		while(ir.hasNext()) {//다음 데이터가있을때까지 순회할예정
			int key = ir.next();// ir이 다음값을 가져와(next) key변수에 담음
			Member member = hashMap.get(key);//get메서드에 변수key를 넣어 값을 가져오고 변수 member에 담는다.
			System.out.println(member);//출력
		}
		System.out.println();
	}
}
