package map.treeMap;
import collection.Member;
public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003,"박서훤");
		Member memberHong = new Member(1004,"홍길동");
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		System.out.println("------------------------------");
		
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember();
		
		
		Integer a=memberHashMap.get(1003);
	}

}
