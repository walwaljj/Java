package collection.arraylist;
import collection.Member;
public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서훤");
		Member memberHong = new Member(1004,"홍길동");
		Member memberd = new Member(1005,"d");
		
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberSon);
		memberArrayList.insertMember(memberd,6);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		// removeMember(memberHong.getMemberId)메소드로 회원 삭제함
		memberArrayList.showAllMember();
	}

}
