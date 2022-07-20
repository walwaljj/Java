package my.day11.a.inheritance;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Gujikja[] gujaArr = new Gujikja[5];

		gujaArr[0] = new Gujikja("hongkd", "1234", "홍길동", "19930311", 1, 1, 4000);
		gujaArr[1] = new Gujikja("eom", "9876", "엄정화", "19830311", 2, 2, 5000);
		gujaArr[2] = new Gujikja("leess", "abcd", "이순신", "20010919", 1, 2, 3000);

		Company[] compArr = new Company[4];

		compArr[0] = new Company("samsung", "1234", "삼성", 300000000000L, "제조업");
		compArr[1] = new Company("LG", "1234", "엘지", 250000000000L, "서비스업");

		Scanner sc = new Scanner(System.in);
		String strMenuNo = "";

		Gujikja loginUser = null;
		Company loginCompany = null;

		do {
			showMenu(loginUser);
			System.out.print("▷ 메뉴번호 선택 => ");
			strMenuNo = sc.nextLine();

			switch (strMenuNo) {
			case "1":
				Gujikja guja = registerGujikja(sc);
				saveGujaArr(guja, gujaArr);

				break;

			case "2":
				loginUser = loginGujikja(sc, gujaArr);
				break;

			case "3":
				if (loginUser == null) {
					System.out.println(">> 로그인을 한 후에 로그아웃을 할 수 있습니다.\n");
				} else {
					loginUser = null;
					System.out.println(">> 로그아웃 되었습니다\n");
				}

				break;

			case "4":
				if (loginUser == null) {
					System.out.println(">> 먼저 로그인 하세요!!\n");
				} else {
					loginUser.showGujikInfo();
				}

				break;

			case "5":
				if (loginUser == null) {
					System.out.println(">> 먼저 로그인 하세요!!\n");
				} else {
					for (int i = 0; i < gujaArr.length; i++) {
						if (gujaArr[i] != null)
							gujaArr[i].showGujikInfo();
					}
				}

				break;

			case "6":
				searchSubMenu(sc, gujaArr);
				break;

			case "7":
				Company comp = registerCompany(sc);
				saveCompArr(comp, compArr);

			case "8":
				loginCompany = loginCompany(sc, compArr);
				break;

			case "9":

				break;
				
			case "10":
				if (loginUser == null) {
					System.out.println(">> 먼저 로그인 하세요!!\n");
				} else {
					loginUser.showGujikInfo();
				}

				break;

			default:
				System.out.println(">>> 메뉴에 없는 번호 입니다.\n");
				break;
			}

		} while (!("9".equals(strMenuNo)));

		sc.close();
		System.out.println("\n== 프로그램 종료 ==");
	}

	static void showMenu(Gujikja loginUser) {

		String str = "";

		if (loginUser != null) {
			str = "[" + loginUser.name + "님 환영합니다]";
		}

		System.out.println("  == 메뉴" + str + " ==\n" + " 1.구직자 가입  2.구직자로그인  3.로그아웃  4.나의정보조회"
				+ "5.모든구직자정보조회 \n6.검색에 따른 조회  7.구인회사가입" + "8.구인회사로그인  9.프로그램종료\n");
	}

	static Gujikja registerGujikja(Scanner sc) {

		System.out.println("=== 구직자 가입하기 ===");

		System.out.print("◆  아이디 : ");
		String id = sc.nextLine();

		System.out.print("◆  암호 : ");
		String passwd = sc.nextLine();

		System.out.print("◆  성명 : ");
		String name = sc.nextLine();

		System.out.print("◆  생년월일(예: 19930820) : ");
		String birthday = sc.nextLine();

		String strGender = "";

		do {
			System.out.print("◆  성별[ 남(1) / 여(2)] : ");
			strGender = sc.nextLine();
			if ("1".equals(strGender) || "2".equals(strGender)) {
				break;
			} else {
				System.out.println(">> 성별은 1 또는 2 만 입력하세요!!\n");
			}
		} while (true);

		String strSchool = "";
		do {
			System.out.print("◆  학력[ 대졸이상(1) / 초대졸(2) / 고졸(3) / 고졸미만(4)] : ");
			strSchool = sc.nextLine();
			if ("1".equals(strSchool) || "2".equals(strSchool) || "3".equals(strSchool) || "4".equals(strSchool)) {
				break;
			} else {
				System.out.println(">> 학력은 1,2,3,4 중에 하나만 입력하세요!!\n");
			}
		} while (true);

		int hopeMoney = 0;
		do {
			System.out.print("◆  희망급여 : ");
			try {
				hopeMoney = Integer.parseInt(sc.nextLine());
				if (hopeMoney > 0)
					break;
				else
					System.out.println(">> 희망연봉은 0 보다 커야 합니다.\n");
			} catch (NumberFormatException e) {
				System.out.println(">> 숫자로만 입력하세요!!\n");
			}
		} while (true);

		Gujikja guja = new Gujikja();
		guja.id = id;
		guja.passwd = passwd;
		guja.name = name;
		guja.birthday = birthday;
		guja.gender = Integer.parseInt(strGender);
		guja.school = Integer.parseInt(strSchool);
		guja.hopeMoney = hopeMoney;

		return guja;
	}

	static void saveGujaArr(Gujikja guja, Gujikja[] gujaArr) {

		boolean flag = false;

		for (int i = 0; i < gujaArr.length; i++) {
			if (gujaArr[i] == null) {
				gujaArr[i] = guja;
				flag = true;
				break;
			}
		}

		if (flag)
			System.out.println(">> 회원가입 성공!!\n");
		else
			System.out.println(">> 회원가입 만료가 되어 더이상 신규회원 가입불가합니다.\n");
	}

	static Gujikja loginGujikja(Scanner sc, Gujikja[] gujaArr) {

		Gujikja loginUser = null;

		System.out.print("◆  아이디 : ");
		String userid = sc.nextLine();

		System.out.print("◆  암호 : ");
		String passwd = sc.nextLine();

		boolean flag = false;

		for (int i = 0; i < gujaArr.length; i++) {
			if (gujaArr[i] != null && gujaArr[i].isExists(userid, passwd)) {
				flag = true;
				loginUser = gujaArr[i];
				break;
			}
		}

		if (flag == true)
			System.out.println(">> 로그인 성공!! <<\n");
		else
			System.out.println(">> 로그인 실패!! <<\n");

		return loginUser;
	}

	static void searchSubMenu(Scanner sc, Gujikja[] gujaArr) {

		String menuNo = "";
		do {
			System.out.println("  == 검색 조회 메뉴 ==\n1.이름으로 검색  2.학력으로 검색  3.연령대검색  4.처음메뉴로 돌아가기\n");
			System.out.print("▶ 메뉴번호 선택 => ");
			menuNo = sc.nextLine();

			switch (menuNo) {
			case "1":
				searchByName(sc, gujaArr);
				break;

			case "2":
				searchBySchool(sc, gujaArr);
				break;

			case "3":
				searchByAgeLine(sc, gujaArr);
				break;

			case "4":

				break;

			default:
				System.out.println(">> 메뉴번호에 존재하지 않는 값을 입력하셨습니다\n");
				break;
			}

		} while (!("4".equals(menuNo)));

	}

	static void searchByName(Scanner sc, Gujikja[] gujaArr) {

		System.out.print("▶검색할 성명 => ");
		String searchName = sc.nextLine(); // 홍

		boolean flag = false;

		for (int i = 0; i < gujaArr.length; i++) {
			if (gujaArr[i] != null && gujaArr[i].name.startsWith(searchName)) {
				flag = true;
				gujaArr[i].showGujikInfo();
			}
		}

		if (!flag)
			System.out.println(">> 검색하려는 " + searchName + "은 존재하지 않습니다\n");

	}

	static void searchBySchool(Scanner sc, Gujikja[] gujaArr) {

		System.out.print("▶검색할 학력[대졸이상(1), 초대졸(2), 고졸(3), 고졸미만(4)] => ");
		String schoolType = sc.nextLine(); // "2"

		boolean flag = false;

		for (int i = 0; i < gujaArr.length; i++) {
			if (gujaArr[i] != null && String.valueOf(gujaArr[i].school).equals(schoolType)) {
				flag = true;
				gujaArr[i].showGujikInfo();
			}
		}

		if (!flag)
			System.out.println(">> 검색하려는 학력의 구직자는 존재하지 않습니다\n");

	}

	static void searchByAgeLine(Scanner sc, Gujikja[] gujaArr) {

		boolean flag = false;

		do {
			System.out.print("▶검색할 연령대 => ");
			try {
				int ageLine = Integer.parseInt(sc.nextLine()); // 20

				if (ageLine < 0) {
					System.out.println(">> 검색할 연령대는 음수는 불가합니다!!\n");
				} else {
					for (int i = 0; i < gujaArr.length; i++) {
						if (gujaArr[i] != null && gujaArr[i].getAgeLine() == ageLine) {
							flag = true;
							gujaArr[i].showGujikInfo();
						}
					}
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println(">> 숫자로 입력하세요!!\n");
			}

		} while (true);

		if (!flag)
			System.out.println(">> 검색하고자 한 연령대의 구직자는 없습니다.\n");
	}

	static Company registerCompany(Scanner sc) {
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
			} catch (NumberFormatException e) {
				System.out.println(">> 자본금은 숫자로만 입력하세요\n");
				continue;
			}

			if (seedMoney > 0)
				break;
			else
				System.out.println(">> 자본금은 0 보다 커야 합니다\n");

		} while (true);

		System.out.print("◆  업종명 : ");
		String jobType = sc.nextLine();

		comp = new Company(id, passwd, name, seedMoney, jobType);

		return comp;
	}

	static void saveCompArr(Company comp, Company[] compArr) {

		boolean flag = false;

		for (int i = 0; i < compArr.length; i++) {
			if (compArr[i] == null) {
				compArr[i] = comp;
				flag = true;
				break;
			}
		}

		if (flag)
			System.out.println(">> 구인회사 가입 성공!!\n");
		else
			System.out.println(">> 구인회사 엔트리가 포화상태라서 신규회사 가입불가함!!\n");
	}

	static Company loginCompany(Scanner sc, Company[] compArr) {

		Company loginComp = null;

		System.out.print("▶아이디 : ");
		String id = sc.nextLine();

		System.out.print("▶암  호 : ");
		String passwd = sc.nextLine();

		boolean flag = false;

		for (int i = 0; i < compArr.length; i++) {
			if (compArr[i] != null && compArr[i].isExists(id, passwd)) {
				loginComp = compArr[i];
				flag = true;
				break;
			}
		}

		if (flag)
			System.out.println(">> 구인회사로 로그인 성공!!");
		else
			System.out.println(">> 구인회사로 로그인 실패!!");

		return loginComp;
	}
}