package practice;
import java.math.*;
import java.util.*;
public class Random {

	public static void main(String[]args) {
		
		//1부터 100까지 쓰여진 숫자공이 주머니에 담겨있다.
		//숫자는 같을 수도 있고, 다를 수도 있다.
		//n이 음수일때 프로그램이 종료
		//양수일때 n을 출력
		//공에 쓰여진 숫자n개를 랜덤함수, 오름차순정렬
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("공의 개수를 입력하세요.(음수=>프로그램 종료)");
		int rd=sc.nextInt();
		if(rd<=0){
			System.out.println("음수입력으로 프로그램종료");
			break;
		}else {
			System.out.println("공의 개수는 "+rd+"입니다.");
		int []arr=new int[rd];
		for(int aarr:arr) {
			double a=(int)(Math.random()*99+1);
			Arrays.sort(arr);//Arrays.sort(배열명) 오름차순 어떻게해요ㅜㅜ
			aarr=(int)a;
			System.out.print(aarr+",");
		}System.out.println("나온공들 오름차순");
		
		}
		
		
		
		}
		
	}
}
