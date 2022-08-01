package collection.arraylist;
import java.util.*;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return(arrayStack.remove(len-1));// 맨 뒤에있는 자료를 반환하고 배열에서 제거함.
	}
	
}
public class StackTest {

	public static void main(String[] args) {
		MyStack stack= new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
