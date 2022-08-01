package collection.arraylist;
import java.util.*;
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1,"D");
		System.out.println(myList);
		
		myList.addFirst("O");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		//제일 뒤 요소c 삭제 후 삭제된 요소를 출력함.
		System.out.println(myList);
	}
}
