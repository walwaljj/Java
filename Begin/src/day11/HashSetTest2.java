package day11;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		//member 객체 3개 생성해서 HashSet에 저장하기
		
		Member mb1=new Member("하나",1);
		Member mb2=new Member("둘",2);
		Member mb3=new Member("셋",3);
		Member mb4=new Member("둘",2);
		Member mb5=new Member("하나",11);
		
		
		
		//Iterator()메서드로 저장된 회원들의 정보를 출력하기
		//Set<Member> set = new HashSet<>(); 아래와 같다. HashSet의 부모는 Set이라 부모타입으로도 선언가능하며 뒤쪽<>에는 HashSet이 생략되어있다.
		HashSet<Member> m=new HashSet<Member>();
		
		m.add(mb1);
		m.add(mb2);
		m.add(mb3);
		m.add(mb4);//set은 중복저장을 막지만. 출력됨. --> 이퀄과 해시코드를 통해 비교를 하고, 같다면 저장이 안됨.
		m.add(mb5);
		System.out.println("set.size() : " + m.size());
		
		Iterator<Member> mi= m.iterator(); 
		for(int i=1;mi.hasNext();i++) {
			Member ser = mi.next();
			System.out.println(i+":"+ser.name+","+ser.age+"세");
		}
		System.out.println("mb1.hashCode():"+mb1.hashCode());
		System.out.println("mb4.hashCode():"+mb4.hashCode());//2와 해시코드가 같다.
		System.out.println("mb2.hashCode():"+mb2.hashCode());
	}

}
