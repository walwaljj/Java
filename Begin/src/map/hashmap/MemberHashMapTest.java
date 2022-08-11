package map.hashmap;
import collection.Member;
public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberPark = new Member(1003,"박서훤");
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberHong = new Member(1004,"홍길동");
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		System.out.println("------------------------------");
		
		memberHashMap.removeMember(1003);
		memberHashMap.showAllMember();
		

	}

}
