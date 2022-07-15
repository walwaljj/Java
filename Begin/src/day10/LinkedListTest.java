package day10;
import java.util.*;
/* LinkedList  : 인접 참조를 링크해서 체인처럼 관리하는 컬렉션
 * 				 데이터를 저장한 후 수시로 데이터를 삽입하거나 삭제 , 수정해야 할 경우 적함
 * ArrayList  : 순차적으로 데이처를 저장할 때 적합함. 검색할 때 LinkedList보다 상대적으로 빠르다.
 * 
 */
public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		//ArrayList 데이터 1만건을 저장 후 수행시간 측정
		//나노타임으로 시간 재기
		long startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,"Hello"+i);//index 0인지점에 넣겠다. ==>중간에 삽입은 link가 빠르다.
									//						>인덱스를 빼면 link가 느리다.
		}
		long endTime = System.nanoTime();
		long gapTime = endTime-startTime;
		
		System.out.println("****ArrayList 걸린시간 : "+gapTime+" ns");
		System.out.println("list1.size():"+list1.size());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,"Hello"+i);//index 0인지점에 넣겠다.
		}
		endTime = System.nanoTime();
		gapTime = endTime-startTime;
		System.out.println("****LinkedList 걸린시간 : "+gapTime+" ns");
		
		//				순차 추가,삭제		중간 삽입,삭제		검색
		/*ArrayList :  	빠르다 		|	느리다.		|	빠르다.
		 *LinkedList:   느리다		|	빠르다		|	느리다.
		 *
		 *
		 *
		 *ist1.add(0,"Hello"+i)라고 하셨는데 일단 리스트를 만들고
			그 뒤에 증가치 i가 새로 생기면서 그 자리에 "Hello"가 10000까지 들어가는 건가요?
													ㄴ
			==>반복문 시점에서 값이 저장이 되어있지 않기때문에 ,,
			arrlist ㄱ
									index 0자리
			0인 지점에 hello를 집어넣음 hello 1
									hello 2 hello 1
								... <-반복문을 돌때마다 새로운 값을 앞에 집어넣고 , 기존 값을 뒤로미룬다.
									

		 */
		for(String str : list1)
			System.out.println(str);
	}

}
