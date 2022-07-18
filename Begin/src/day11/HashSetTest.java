package day11;
import java.util.*;
/* Set계열
 * - 순서를 기억하지 않음
 * - 데이터 중복을 허용하지 않는다.(아닌경우도 있다.)
 * - 구현한 클래스: HashSet, TreeSet...
 * 
 * HashSet의 중복
 *  ㄴ 해시셋은 객체를 저장하기 전에 객체의 hashCode()를 호출해서 해시코드를 얻어낸다.
 *  	그리고 이미저장되어있는 객체들의 해시코드와 비교한다.
 *  	만약 동일한 해시코드가 있다면 , 다시 equals()메서드로 두 객체를 비교해서
 * 		true가 나오면 동일한 객체로 판단하고 중복저장을 하지 않는다.
 * 
 */
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		
		//데이터 저장시 add(E)
		set.add("Java");
		set.add("HTML");
		set.add("CSS");
		set.add("Python");
		set.add("MySQL");
		
		set.add("Java");//중복된 데이터 : 저장해도 용량은 똑같다.
									//: 주소 즉, 해시코드(@3242d...)를 비교, 그리고 equals()를 또 비교
		System.out.println("set.size() :"+ set.size());
		
		
		//데이터 꺼낼때 get메소드가 없기때문에
		//방법 [1] : Iterator<E> 변수 = set.iterator() 이후 반복문.
		Iterator<String> it = set.iterator(); 
		while(it.hasNext()) {
			String val=it.next();
			System.out.println(val);
		}
		
		//저장된 내용 지정 삭제.
		//set.remove(E);
		set.remove("CSS");
		System.out.println("set.siza() : "+ set.size());
		
		//방법 [2] Iterator가 아닌 확장 for 루프 이용해 데이터 꺼내기
		for(String str : set)
			System.out.println(str);
		
		//저장된 내용 모두 삭제.
		//set.clear(), set.removeAll()
		set.clear();
		System.out.println("set.siza() : "+ set.size());
	
		
	}

}
