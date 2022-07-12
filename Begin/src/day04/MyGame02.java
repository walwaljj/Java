package day04;
import java.util.*;
public class MyGame02 {
	//[문제] 반복문을 돌면서 컴퓨터와 가위바위보를 진행하세요.
	/* 당신 : 1 (가위)
	 * 컴퓨터 : 2 (바위)
	 * --------------
	 * 당신이 졌군요 .. ㅠㅠ
	 * 
	 * 이겼습니다 . !
	 * 9 를 입력하면 시스템 종료 
	 * 
	 * 메뉴에 없는 번호를 입력하면 "입력오류! 메뉴에 없는 번호입니다." 출력 후 다시 입력할 기회를 준다.
	 * 
	 */
	//사용자 정의 메소드
	public static void showMenu() {
		System.out.println("********* Game Memu **********");
		System.out.println("1. 가위	2. 바위	3. 보	9. 종료");
		System.out.println("******************************");
		System.out.println("입력하세요=>");
		System.out.println("******************************");
		//여기까지 했을때 메인이 없고 함수(메소드)만 구성했기때문에 값이없음.
	}
	
	public static String show(int num) {/// string type 은 마지막에 
		String str="";
		switch(num) {
		case 1:str="	(가위)"; 
				break;
		case 2:str="	(바위)";
				break;
		case 3:str="	(보)";
				break;
		default:str="";
		}
		return str;
	}
	//내장메소드
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){//무한루프
			MyGame02.showMenu();
			int comp=(int)(Math.random()*3+1);
			int my=sc.nextInt();
			if(my==9){
				System.out.println("bye bye~~");
				break;
			}
			if(my<1||my>3){
				System.out.println("입력오류!! 메뉴에 없는 번호입니다.");
				continue;
			}
			String msg="";
			if(my==comp) {
				msg="비겼군요!";	
			}else if((my==1&&comp==3)||(my==2&& comp==1)||(my==3&&comp==2)) {
				msg="당신이 이겼네요!";
			}else {
				msg="당신이 졌군요ㅜ";
			}
			System.out.println("당신:	" + my+MyGame02.show(my));
			System.out.println("컴퓨터	:" + comp+MyGame02.show(comp));
			System.out.println(msg);
				
	
		
		}
		
		
		//System.out.println("bye bye ;)")
		
	}

}
