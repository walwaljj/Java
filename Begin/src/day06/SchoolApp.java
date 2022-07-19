package day06;

import java.util.*;

/*학사관리 프로그램 만들기
 *객체 : 학생 , 교사, 직원, 
 *
 *------class로 구성하기
 *		학생=> Student
 *		속성 : 학번, 이름, 학급, 연락처...
 *		기능 : 학생 정보 , 공부하다.
 *
 *		선생=> Teacher
 *		속성 : 이름, 교과목, 연락처..
 *		기능 : 선생 정보 , 가르치다.
 *
 *		직원=> Staff
 *		속성 : 이름, 입사일, 연락처
 *		기능 : 직원 정보 , 근무시간.
 *
 * 
 */
public class SchoolApp {
	
	Scanner sc=new Scanner(System.in);
	static Student []stu=new Student[2];
	static int i=0;
	
	static Staff [] sta=new Staff[2];
	static int j=0;
	
	static Teacher []tea=new Teacher[2];
	static int k=0;
	
	Student student=new Student();
	Staff staff=new Staff();
	Teacher teacher=new Teacher();

	Teacher ti=new Teacher();
	Staff si=new Staff();
	Student sti=new Student();
	
	
	public static void showMenu() {
		
		System.out.println("**SchoolApp Test Ver.**");
		System.out.println("======================");
		System.out.println("[1]......등   록.......");
		System.out.println("[2]......출   력.......");
		System.out.println("[3]......검   색.......");//Hash
		System.out.println("[4]......삭   제.......");//Hash
		System.out.println("[9]......종   료.......");
		System.out.println("======================");
		System.out.println("  메뉴 번호를 입력하세요.  ");
		System.out.println("======================");
	}///1-1 끝/////
	
	public static void choice() {
		System.out.println("======================");
		System.out.println("[1]......학   생.......");
		System.out.println("[2]......교   사.......");
		System.out.println("[3]......직   원.......");
		System.out.println("[9]......이전단계.......");
		System.out.println("======================");
		System.out.println("  메뉴 번호를 입력하세요.  ");
		System.out.println("======================");
	}////1-2 끝///////////////
	
	///////1-등록
	public void registerChoice(){
		
		int num=sc.nextInt();
		
		switch(num) {
		
			case 1:
				sti.stiInfo();
				sti.showInfo();
				break;
			case 2:
				ti.tiInfo();
				ti.showInfo();
				break;
			case 3:
				si.stInfo();
				si.showInfo();
				break;
			case 9:
				break;
				default:		
			}
			if(num<4|num==9&&num!=0) {
				System.out.println("등록하신 정보를 저장하겠습니다.");
		}
		
	}//////////1-등록 끝/////
	
	public void register() {
		
		SchoolApp.printAll();
		

			
	}
	
	public void search() {
		
	}
	
	//////출력
	public static void printAll() {
		
		Student stu_=new Student();
		Staff sta_=new Staff();
		Teacher tea_=new Teacher();
		
		////출력 show	
		
				for(int i=0;i<stu.length;i++) {
					stu_.showInfo();
				}
				
				for(j=0;j<sta.length;j++) {
					sta_.showInfo();
				}
				
				for(k=0;k<tea.length;k++) {
					tea_.showInfo();
				}

		}
		
			
	///////Main시작
	public static void main(String[] args) {
		SchoolApp reg=new SchoolApp();
		Scanner sc=new Scanner(System.in);
		int num;
		do {
			SchoolApp.showMenu();
			num = sc.nextInt();
		
			if((num>=5)&(num<9)|(num==0)) {
				System.out.println("메뉴에 없는 번호입니다. 다시입력하세요");
				continue;
			}/////초기 메뉴 입력단계 끝 --------------
			
			switch(num) {
		
			case 1: 
				System.out.println("********등   록********");
				SchoolApp.choice();
				reg.registerChoice();
				break;
			case 2: //출력 
				System.out.println("********출   력********");
				SchoolApp.printAll();
				System.out.println("-------------------------");
				break;
			case 3:
				break;
			case 4:
				break;
			}
			System.out.println("메뉴로 다시 돌아갈까요?");
			System.out.println ("[1] YES     [2] NO");
			int a=sc.nextInt();
			if(a!=1)
				if(a>1)
				break;
		} while(num!=9);
		System.out.println("안녕히가세요! :)");

	}
}



	

	
	
	
	

	

	


