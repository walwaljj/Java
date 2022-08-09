package collection.arraylist;
import java.util.*;
import collection.Member;
public class MemberArrayList {
	private ArrayList<Member> arrayList; // ArrayList선언함.
	//private ArrayList<Member> arrayList1 = new ArrayList<>(); ==> 5번, 9번을 합친것과 같음.
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //member 자료형으로 arr생성.
											
	}
	
	/*Array에 회원을 추가하는 메서드*/
	public void addMember(Member member) {
		arrayList.add(member);// list계열은 .add(); 로 담아준다.
	}
	
	
	/*member클레스에서 회원을 제거하는 메서드.*/
	public boolean removeMember(int memberId) {
		
		for(int i=0; i<arrayList.size(); i++) {
			
			Member member = arrayList.get(i); // for 문을 돌며 get (i)로 member클래스의 정보를 가지고옴. 
			int tempId = member.getMemberId();// get(i)로 가지고온 정보를 member클래스의 getMemberId메소드를 거쳐 tempId에 담는다.
			if(tempId==memberId) {// tempId가 매개변수로 받은 memberId와 같다면
				arrayList.remove(i); // get(i)로 가지고온 정보를 remove로 삭제하겠다.
				return true;//삭제에 성공하면 true반환
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");// 매개변수로 받은 memberId가 array에 존재하지않을때 출력
		return false;//삭제하지 못했을경우 false반환.
	}
	
	/*Member클래스에 있는 모든 member를 출력하는 메서드.*/
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int position) {
		if(position <0 || position > arrayList.size()+1) {// 만약 포지션이 0보다 작고, 배열의 크기보다 크다면.
			System.out.println("실패");
			return;
			
		}
		arrayList.add(position-1, member); //입력한 포지션-1위치(배열은 0부터 시작하기 때문에.)에 멤버를 넣는다.
	
	}
	public boolean removeMember2(int memberId) {
		
		Iterator<Member> ir = arrayList.iterator();// Iterator 생성 , ir에 Member타입 리스트를 담아줌..?
		
		while(ir.hasNext()) {//  hasNext는 이후에 리스트안에 데이터가 있는지 확인하는 메서드(boolean타입)이며,
							//	ir안에 요소가 있는동안 반복문을 수행(=>요소가 있다면 true)하겠다는 조건.
			
			Member member = ir.next();// hasNext가 다음요소를 체크한 후 다음 요소가있다면 next메서드로 반환하며,
										// 해당 데이터는 member변수로 저장------------------------------------------**
			int tempId = member.getMemberId();//member 변수는 Member클래스형으로 , Member클래스의 get메소드를 거쳐 
											// 데이터를 tempId에 저장.
			if(tempId == memberId) {	// 만약 tempId에 저장한 값이 매개변수로 받은 memberId와 같다면
				arrayList.remove(member); // 리스트에서 해당 요소(**)를 제거하겠다
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");// 매개변수로 받은 memberId가 array에 존재하지않을때 출력
		return false;//삭제하지 못했을경우 false반환.
	}
	
}
