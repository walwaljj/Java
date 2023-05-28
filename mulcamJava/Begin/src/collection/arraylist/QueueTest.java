package collection.arraylist;

import java.util.*;
class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);// 정보가 제일 뒤에 저장된다.
	}
	
	public String deQueue() {
		int len = arrayQueue.size();// len에 리스트의 사이즈를 담아준다.
			if(len == 0) {// len에 정보가없을때 ㄱ 출력
				System.out.println("큐가 비어있습니다.");
				return null;
			}
		
		return(arrayQueue.remove(0)); //리스트에 정보가 있다면, 제일 첫번째 정보를 지움.
	}
}
public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
