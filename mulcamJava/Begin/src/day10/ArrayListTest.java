package day10;
import java.util.*;
/*ArrayList 는 java.util.List계열
 * -Vector 와 기능은 동일
 * -단, 벡터는 멀티 스레드가 동작하는 환경일 때 동기화가 구현되어 있어//동기화 : 조금이라도 먼저 들어온 정보를 저장함.
 * 	조금이라도 먼저 저장한 객체가 순차적으로 저장되는 반면,
 * 	Array List는 동기화가 구현되어 있지 않음.
 * 
 *LinkedList : List계열
 *			<-->ArrayList 는 순차적으로 데이터를 저장할 때 적합. 중간에 삽입 또는 삭제 ==> 적합하지않음.(동기화가 되지 않아서)
 * 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		//Object유형을 저장한다. 저장영역을 자동으로 확대한다.
		arrList.add("하이");
		arrList.add("반갑습니다.");
		arrList.add("^^");
		System.out.println("arrList.size() : " + arrList.size());
		
		//Iterator<> iterator() 이용해서 arrList에 저장된 요소들 한번에 출력하기
		Iterator<String> it=arrList.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		String s2=arrList.get(1);//s2의 0은 하이,1은 반갑습니다. 3은 ^^
		System.out.println(s2);
		
		List<Integer> arrList2=Arrays.asList(40,10,20,4);
		
		for(int i=0;i<arrList2.size();i++) {
			System.out.println(arrList2.get(i));
		}
		
		//Collections.sort() 메서드를 이용해서 정렬하기
		Collections.sort(arrList2);//오름차순 정렬
		//Collections.sort(arrList2, Collections.reverseOrder())//내림차순
		System.out.println("== 정렬 이후 ==");
		for(Integer val : arrList2) {
			System.out.println(val);
		}
		
		
		//arrList2.remove(0) 은 삭제안됨, err
		//List<Integer> arrList2=Arrays.asList(40,10,20,4);
		// ㄴ정적인 컬렉션으로 데이터 변경 불가.
		//ArrayList<String> arrList = new ArrayList<>();
		// 동적인 컬렉션으로 데이터 변경 가능.
		arrList.remove(0);
		System.out.println("== 0번 삭제 이후 ==");
		for(String val : arrList) {
			System.out.println(val);
		}

	}

}
