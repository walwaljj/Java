package day11;
import java.util.*;
public class TreeSetTest {
/*TreeSet 
 * - 추가된 데이터들이 정렬된다.  // ㄱ -> ㅎ 순으로 정렬
 * - 데이터 중복을 허용하지 않는다.
 * - 내부적으로 이진 트리를 사용해 데이터를 저장하고 꺼낸다.
 * 
 */
	
	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("홍길동");
		tree.add("강감찬");
		tree.add("김철수");
		tree.add("이순신");
		tree.add("정약용");
		tree.add("홍길동");
		tree.add("정약용");
		
		System.out.println("tree.size():"+tree.size());
		
		
		//확장 for문으로 출력한다.
		for(String arr : tree)
			System.out.println(arr);
		
		
		

	}

}
