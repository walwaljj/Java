package test13;

import java.util.*;
import java.util.function.BinaryOperator;


class Com implements BinaryOperator<String>{
//	public String apply(String s1 , String s2) {
//		return s1;
//	}
	public String apply(String s1 , String s2) {
		if(s1.getBytes().length>s2.getBytes().length) 
			return s1;
			else return s2;
		
	}
	
}
public class ReduceTest {

	public static void main(String[] args) {
		String [] greetings = {"안녕하세요오~~~", "Hello", "Good morning", "반갑습니다^^"};
		System.out.println(Arrays.stream(greetings).reduce(" ",(s1, s2)->{
			if(s1.getBytes().length > s2.getBytes().length)
				return s1;
			else return s2;
			
		}));
		
		String str = Arrays.stream(greetings).reduce(new Com()).get();
		System.out.println(str);
	}

}
