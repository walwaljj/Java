package collection.arraylist;
import java.util.*;


class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {// 자료를 제일 뒤에 저장한다.
		arrayStack.add(data);
	}
	
	
	// 제일 마지막에 넣은 자료를 삭제하는 메소드.
	public String pop() {
		int len = arrayStack.size(); // 리스트의 길이를 len에 담아주고
			if(len == 0) {//len이 비어있을때 ㄱ
				System.out.println("스택이 비었습니다.");
				return null;
			}
		
		return(arrayStack.remove(len-1)); // 리스트에 정보가 있을때 리스트의 길이가 len에 담기게되니
										// len-1을 remove에 넣어주면 해당위치(=즉 제일마지막을 가리킴.)
	}									//의 정보가 지워지게됨.
}
public class StackTest {
	

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}	

}
