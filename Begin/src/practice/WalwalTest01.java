package practice;
import java.util.*;
public class WalwalTest01 {

	public static void main(String[] args) {
		
		int dan;
		int gob;
		for(gob=1;gob<=9;gob++) {
			for(dan=2;dan<=9;dan++) 
				System.out.print(dan+"x"+gob+"="+dan*gob+"\t");
			System.out.println();
			}System.out.print("\t");
			
			//1~50까지의 합.
		int sum=0;
		for(int i=1;i<=50;i++) {
			sum+=i;
			//System.out.println("1~50 까지 수의 합은 :"+sum+"입니다!");
			//나이가 , 10살부터 19 10대 일때 26살은 몇 십대
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age=sc.nextInt();
		String dae;
		if((age<=10) |(age<20))
			System.out.println("10대 입니다.");
			else if(age<30)
			System.out.println("20대 입니다.");
			else if(age<40)
			System.out.println("30대 입니다.");
			else if(age<50)
			System.out.println("40대 입니다.");
			else
				System.out.println("나이 범위를 벗어났습니다.");
			
		/*ch값이 0~ 9 값이면 "숫자입니다."를 출력
		 * 그 외 문자는 "기타문자입니다"출력
		 * 
		 */
		Scanner ch=new Scanner(System.in);
		String j=ch.next();
	//	if((j>='A')&(j<='Z')|(j>='a')&(j<='z')) {
			System.out.println("알파벳");
		//}else if(int j/1==j){
			System.out.println("숫자");
	//	}else {
			System.out.println("기타문자");
	
		}
	
			
	
	}
}


