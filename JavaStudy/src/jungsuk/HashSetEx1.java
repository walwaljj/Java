package jungsuk;
import java.util.*;
public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set<Object> set = new HashSet<Object>();
		
		for(int i = 0 ; i <objArr.length ; i ++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		for(int i = 0 ;set2.size() < 6; i ++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(new Integer(num));
		}
			List<Integer> list = new LinkedList<Integer>(set2);
			Collections.sort(list);
			System.out.println(list);

	}
	

}
