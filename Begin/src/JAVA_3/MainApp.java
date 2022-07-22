package JAVA_3;

import java.io.*;
import java.util.Scanner;
/** 구직자 및 구인회사가 가입하고 서로 조회하는 어플*/
public class MainApp {
	
	public static void main(String[] args) {

		Gujikja[] gujaArr = new Gujikja[20];//구직자 정보 저장공간 20할당
		
		Company[] compArr = new Company[10];//구인회사 정보 저장공간 10할당
	
		Scanner sc = new Scanner(System.in);
		String strMenuNo = "";
		
		Gujikja loginUser = null;
		Company loginCompany = null;
		
		do {
			//첫화면
			showMenu(loginUser);
			System.out.print("▷ 메뉴번호 선택 => ");
			strMenuNo = sc.nextLine(); 
			
			switch (strMenuNo) {
				case "1": 
					Gujikja guja = registerGujikja(sc);//1번입력시 구직자 가입 클래스 호출
					svaeGujikja_arr(guja, gujaArr);
					
					break;
	
				case "2": 
					loginUser = loginGujikja(sc, gujaArr); //2번입력시 구직자 로그인 클래스 호출
					break;
					
				case "3": 
					if(loginUser == null) {  //3번 입력시 로그인중이 아니면 출력
						System.out.println(">> 로그인을 한 후에 로그아웃을 할 수 있습니다.\n"); 
					}
					else {
						loginUser = null; 
						System.out.println(">> 로그아웃 되었습니다\n");
					}
					
					break;	
					
				case "4":  
					if(loginUser == null) {//4번 입력시 로그인중이 아니면 출력
						System.out.println(">> 먼저 로그인 하세요!!\n");
					}
					else {
						loginUser.showGujikInfo();
					}
					
					break;
				
				case "5": 
					if(loginUser == null) {//5번 입력시 로그인중이 아니면 출력
						System.out.println(">> 먼저 로그인 하세요!!\n");
					}
					else {
						for(int i=0; i<gujaArr.length; i++) { //5번 선택시 gujaArr[i]배열에 값이 Null이 아니라면
							if(gujaArr[i] != null)			  // gujaArr[i]의 모든 값 출력
							   gujaArr[i].showGujikInfo();
						}
					}
					
					break;
					
				case "6": 
					searchSubMenu(sc, gujaArr); //6번 입력시 검색 조회 호출
					break;
				
				case "7":  
					Company comp = registerCompany(sc);//Company 클래스 객체 생성
					saveCompArr(comp, compArr);//7번 입력시 구인회사 가입 클래스호출
				
				case "8": 
					loginCompany = loginCompany(sc, compArr); //8번 선택시 구인회사 로그인 호출
					break;
					
				case "9": // 프로그램 종료
					
					break;
					
				default: 
					System.out.println(">>> 메뉴에 없는 번호 입니다.\n");
					break;
				}
			
		} while ( !("9".equals(strMenuNo)) );
		
		sc.close();
		System.out.println("\n== 프로그램 종료 ==");
	}//------------Main---------------
		
		static void showMenu(Gujikja loginUser) {
				
				String str = "";
				//로그인 성공시
				if (loginUser != null) {
					str = "["+loginUser.name + "님 환영합니다]";
				}
				
				System.out.println("  == 메뉴"+str+" ==\n"
						         + " 1.구직자 가입  2.구직자로그인  3.로그아웃  4.나의정보조회"
		                         + "5.모든구직자정보조회 \n6.검색에 따른 조회  7.구인회사가입"  
		                         + "8.구인회사로그인  9.프로그램종료\n"); 
			}//-----------ShowMenu--------------
		
		static Gujikja registerGujikja(Scanner sc) {
			//구직자 가입 로직
			System.out.println("=== 구직자 가입하기 ===");
			
			System.out.print("◆  아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("◆  암호 : ");
			String passwd = sc.nextLine();
			
			
			String name =" ";
	
			
			boolean isNum=true;
			while(isNum) {
				for(int i=0;i<name.length();i++) {
					System.out.print( "◆  성명 : ");
					name = sc.nextLine();
					char ch = name.charAt(i);
					if(!(ch>='0'&&ch<='9')) { //숫자가 아닌 문자가 있다면	
						isNum=false;
					}String result=(isNum)? "숫자는 입력이 불가합니다.\n" : "";
					System.out.print(result);
				}
			}
		
			
			
			String birthday = " ";
			do {
				System.out.print("◆  생년월일(예: 19950722) : ");
				birthday = sc.nextLine();
				if(birthday.length()==8) {
					break;
				}
				else if(birthday.length()!=8) {
				System.out.println("생년월일을 8자리로 입력하세요!");
				}
					
			}while(true);
			
			String strGender = ""; 
	        
			do {
				System.out.print("◆  성별[ 남(1) / 여(2)] : ");
				strGender = sc.nextLine();
				if("1".equals(strGender) || "2".equals(strGender)) {
					break;
				}
				else {
					System.out.println(">> 성별은 1 또는 2 만 입력하세요!!\n");
				}
			} while (true);
			
			String strSchool = "";
			do {
				System.out.print("◆  학력[ 대졸이상(1) / 초대졸(2) / 고졸(3) / 고졸미만(4)] : ");
				strSchool = sc.nextLine();
				if("1".equals(strSchool) || 
				   "2".equals(strSchool) ||
				   "3".equals(strSchool) ||
				   "4".equals(strSchool) ) {
					break;
				}
				else {
					System.out.println(">> 학력은 1,2,3,4 중에 하나만 입력하세요!!\n");
				}
			} while (true);
			
			int hopeMoney = 0;
			do {
				System.out.print("◆  희망급여 : ");
				try {
					hopeMoney = Integer.parseInt(sc.nextLine());
					if(hopeMoney > 0)
						break;
					else
						System.out.println(">> 희망연봉은 0 보다 커야 합니다.\n");
				} catch(NumberFormatException e) {  //숫자가 아닌 다른 문자열 입력시
					System.out.println(">> 숫자로만 입력하세요!!\n");//숫자가아닐시 출력
				}
			} while(true);
			
			
			Gujikja guja = new Gujikja();
			guja.id = id;
			guja.passwd = passwd;
			guja.name = name;
			guja.birthday = birthday;
			guja.gender = Integer.parseInt(strGender);
			guja.school = Integer.parseInt(strSchool);
			guja.hopeMoney = hopeMoney;
			
			return guja;
			
		}//-------------registerGujikja--------------
		
		static void svaeGujikja_arr(Gujikja guja, Gujikja[] gujaArr) {
			//회원가입 로직
			boolean flag = false; 
			
			for(int i=0; i<gujaArr.length; i++) {
				if( gujaArr[i] == null ) {
					gujaArr[i] = guja;
					flag = true;
					break;
				}
			}
			
			if(flag)
				System.out.println(">> 회원가입 성공!!\n");
			else
				System.out.println(">> 회원가입 만료가 되어 더이상 신규회원 가입불가합니다.\n");	
		}//------------saveGujikjaArr-------------
		
		static Gujikja loginGujikja(Scanner sc, Gujikja[] gujaArr) {
			//구직자 로그인 로직
			Gujikja loginUser = null;
			
			System.out.print("◆  아이디 : ");
			String userid = sc.nextLine();
			
			System.out.print("◆  암호 : ");
			String passwd = sc.nextLine();
			
			boolean flag = false;
			
			for(int i=0; i<gujaArr.length; i++) {
				//유저 아이디와,비밀번호 일치시 로그인
				if( gujaArr[i] != null && 
					gujaArr[i].isExists(userid, passwd) ) {
					flag = true;
					loginUser = gujaArr[i];
					break;
				}
			}
			
			if(flag==true) 
				System.out.println(">> 로그인 성공!! <<\n");
			else
				System.out.println(">> 로그인 실패!! <<\n");
			
			return loginUser;
		}//--------------loginGujikja-----------------
		
		static void searchSubMenu(Scanner sc, Gujikja[] gujaArr) {
			//검색 로직
			String menuNo = "";
			do {
				System.out.println("  == 검색 조회 메뉴 ==\n1.이름으로 검색  2.학력으로 검색  3.연령대검색  4.처음메뉴로 돌아가기\n");
				System.out.print("▶ 메뉴번호 선택 => ");
				menuNo = sc.nextLine();
				
				switch (menuNo) {
					case "1":  //이름으로 검색 선택시 searchByName 호출
						searchByName(sc, gujaArr);
						break;
						
					case "2"://학력으로 검색 선택시 searchBySchool 호출
						searchBySchool(sc, gujaArr);
						break;
						
					case "3": //연령대검색 선택시 searchByAgeLine 호출
						searchByAgeLine(sc, gujaArr);
						break;
						
					case "4":
						
						break;
		
					default:
						System.out.println(">> 메뉴번호에 존재하지 않는 값을 입력하셨습니다\n"); //위 메뉴 번호 입력시 출력
						break;
				}
				
			} while( !("4".equals(menuNo) ) );
			
		}
		
		static void searchByName(Scanner sc, Gujikja[] gujaArr) {
			//검색.이름으로검색 로직
			System.out.print("▶검색할 성명 => ");
			String searchName = sc.nextLine(); //검색할 이름 입력
			
			boolean flag = false;
			
			for(int i=0; i<gujaArr.length; i++) {
				if(gujaArr[i] != null &&  //검색할 이름과 배열에 저장된 이름이 일치 할때까지 주소넘김
				   gujaArr[i].name.startsWith(searchName) )
				{
					flag = true;
					gujaArr[i].showGujikInfo();
				}
			}
			
			if(!flag)
				System.out.println(">> 검색하려는 "+searchName+"은 존재하지 않습니다\n"); //검색한 이름이 미존재시
			
		}
		
		static void searchBySchool(Scanner sc, Gujikja[] gujaArr) {
			//검색.학력으로 검색 로직
			System.out.print("▶검색할 학력[대졸이상(1), 초대졸(2), 고졸(3), 고졸미만(4)] => ");
			String schoolType = sc.nextLine(); 
					
			boolean flag = false;
			
			for(int i=0; i<gujaArr.length; i++) {
				if( gujaArr[i] != null &&  //검색할 학력과 배열에 저장된 학력(숫자)일치 할떄까지 주소넘김
				    String.valueOf(gujaArr[i].school).equals(schoolType) ) {
					flag = true;
					gujaArr[i].showGujikInfo();
				}
			}
			
			if(!flag)
				System.out.println(">> 검색하려는 학력의 구직자는 존재하지 않습니다\n");//검색한 학력이 미존재시 출력
			
		}
		
		static void searchByAgeLine(Scanner sc, Gujikja[] gujaArr) {
			//검색.연령대검색 로직
			boolean flag = false;
			
			do {
				System.out.print("▶검색할 연령대 => ");
				try {
					int ageLine = Integer.parseInt(sc.nextLine()); // 20
					
					if(ageLine < 0) {
						System.out.println(">> 검색할 연령대는 음수는 불가합니다!!\n");
					}
					else {
						for(int i=0; i<gujaArr.length; i++) {
							if(gujaArr[i] != null && //검색할 나이와 배열에 저장된 나이(숫자)일치 할떄까지 주소넘김
							   gujaArr[i].getAgeLine() == ageLine) {
							   flag = true;
							   gujaArr[i].showGujikInfo();
							}	
						}
						break;
					}
					
				} catch(NumberFormatException e) {
					System.out.println(">> 숫자로 입력하세요!!\n");//문자로 입력시 출력
				}
				
			} while(true);
			
			if(!flag)
				System.out.println(">> 검색하고자 한 연령대의 구직자는 없습니다.\n");//입력한 숫자가 미존재시
		}//------------searchSubMenu-------------------

		
		static Company registerCompany(Scanner sc) {
			//구인회사 가입 로직
			Company comp = null;
			
			System.out.println("=== 구인회사 가입하기 ===");
			
			System.out.print("◆  아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("◆  암호 : ");
			String passwd = sc.nextLine();
			
			System.out.print("◆  회사명 : ");
			String name = sc.nextLine();
			
			long seedMoney = 0;
			do {
				System.out.print("◆  자본금 : ");
				
				try {
					 seedMoney = Long.parseLong(sc.nextLine());
				} catch(NumberFormatException e) {
					System.out.println(">> 자본금은 숫자로만 입력하세요\n");//문자로 입력시 출력
					continue;
				}
				
				if(seedMoney > 0)
					break;
				else
					System.out.println(">> 자본금은 0 보다 커야 합니다\n"); //음수입력시
				
			} while(true);
					
			System.out.print("◆  업종명 : ");
			String jobType = sc.nextLine();
			
			comp = new Company(id, passwd, name, seedMoney, jobType);
			//객체 comp에 입력한 값 저장
			return comp;
		}
		
		
		static void saveCompArr(Company comp, Company[] compArr) { 
			//구인회사 가입 조건 만족/불만족 로직
			boolean flag = false;
			
			for(int i=0; i<compArr.length; i++) {
				if(compArr[i] == null) {//배열comArr[i]번째에 null값일경우 comp를 comparr[i]번째에
					compArr[i] = comp;
					flag = true;
					break;
				}
			}
			
			if(flag)
				System.out.println(">> 구인회사 가입 성공!!\n");
			else
				System.out.println(">> 구인회사 엔트리가 포화상태라서 신규회사 가입불가함!!\n");
		}
		
		static Company loginCompany(Scanner sc, Company[] compArr) {
			//구인회사 로그인
			Company loginComp = null;
			
			System.out.print("▶아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("▶암  호 : ");
			String passwd = sc.nextLine();
			//flag값 false로 초기화, 정보값이 다를경우 로그인 실패 출력
			
			boolean flag = false;
			
			for(int i=0; i<compArr.length; i++) {
				if(compArr[i] != null &&
				   compArr[i].isExists(id, passwd) ) {//배열compArr[i]번째에 isExists(id,passwd)값이 없거나, null값일 경우 false값 가져감
				   loginComp = compArr[i]; //isExists에 값이 있다면 loginComp에 compArr[i]번째 값 저장
				   flag = true;				//flag값 true으로 초기화
				   break; 	
				}
				
				
				
			}
			
			if(flag)
				System.out.println(">> 구인회사로 로그인 성공!!");//flag값이 true일경우 
			else
				System.out.println(">> 구인회사로 로그인 실패!!");//flag값이 false일경우
			
			return loginComp;
		}//----------------registerCompany----------------------
		
		
}