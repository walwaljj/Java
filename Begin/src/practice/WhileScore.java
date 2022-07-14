package practice;
import java.util.*;
public class WhileScore {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner sc= new Scanner(System.in);
		int i;
		double j = 0;
		int count = 0;
		while((i = sc.nextInt())!=0) {
			j+=i;
			count++;		
		}
		System.out.println("입력한 수의 개수 :"+count);
		System.out.println("입력한 수의 평균 :"+(j/count));
	
	}

}
