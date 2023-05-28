package JAVA_3;
import java.util.*;
public class JavaTest {

	public static void main(String[] args) {
		final int MY_AGE = 22;
		System.out.println(MY_AGE);

		
		char ch1 = 'a';
		System.out.println((int)ch1);
		
		int ch2 = 67;
		System.out.println((char)ch2);
		
		int a=10;
		double b = 2.0;

		System.out.println((int)a+b);

		char rmf= '\uAE00';
		System.out.println(rmf);
		
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value =(myAge>25);
		System.out.println(value);
		
		System.out.println(myAge>25);
		System.out.println(myAge==teacherAge);
		
		char ch;
		ch=(myAge>teacherAge)?'t':'f';
		System.out.println(ch);
		
		
		int aa=8;
		System.out.println(aa+=10);
		System.out.println(aa-=10);

		char gender='f';
		if(gender=='f') {
			System.out.println("여성입니다.");
		}else {
			System.out.println("남성입니다.");
		}
		
		//5층건물 1층 약국 ,2층 정형외과,3층 피부과, 4층 치과 5층 헬스
		Scanner sc=new Scanner(System.in);
		
		
		String info= "";
		System.out.println("층을 눌러주세요.");
		int floor=sc.nextInt();
		switch(floor) {
		case 1:
			info ="1층은 약국입니다.";
			break;
		case 2:
			info = "2층은 정형외과입니다.";
			break;
		case 3:
			info = "3층은 피부과입니다.";
			break;
		case 4:
			info = "4층은 치과입니다.";
			break;
		case 5:
			info = "5층은 헬스클럽입니다.";
			break;
			}
		System.out.println(info);
		
		
		int e=1;
		int sum = 0;
		while(e<=50) {
			sum+=e;
			e++;
		}
		System.out.println("1부터 50까지의 합은" + sum + "입니다.");
		
		for(int i=1;i<11;i++) {
			System.out.print("안녕하세요"+i+",");
		}
		
		//구구단 3단 부터 7단까지
		System.out.println();
		for(int j=1;j<10;j++) {
		for(int i=3;i<8;i++) {
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}System.out.println();
		}
		
	}

}

