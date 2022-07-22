package JAVA_3;

import java.util.Calendar;

/** member 클래스를 상속 받음 */
public class Gujikja extends Member {
	/* 생일, 성별, 학력, 희망연봉 field 선언 */
	protected String birthday;
	protected int gender;
	protected int school;
	protected int hopeMoney;

	/* 파라미터가 있는 생성자 생성 */
	public Gujikja(String id, String passwd, String name, String birthday, int gender, int school, int hopeMoney) {
		this.id = id;

		this.passwd = passwd;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.school = school;
		this.hopeMoney = hopeMoney;
	}

	/* 기본 생성자 생성 */
	public Gujikja() {
	}

	/* 아이디, 암호, 성명, 생년월일, 성별, 학력, 희망연봉을 출력하는 함수 생성 */
	void showGujikInfo() {
		String result = "";
		
		result += "1. 아이디 : " + super.id + "\n";
		result += "2. 암   호 : " + super.passwd + "\n";
		result += "3. 성   명 : " + super.name + "\n";
		result += "4. 생년월일 : " + birthday.substring(0, 4) + "-" + birthday.substring(4, 6) + "-" + birthday.substring(6)
				+ "\n";

		/* 성별 */
		String strGender = "";
		if (gender == 1)
			strGender = "남";
		else
			strGender = "여";

		result += "5. 성   별 : " + strGender + "\n";

		/* 학력 */
		String strSchool = "";
		if (school == 1)
			strSchool = "대졸이상";
		else if (school == 2)
			strSchool = "초대졸";
		else if (school == 3)
			strSchool = "고졸";
		else
			strSchool = "고졸미만";

		result += "6. 학   력 : " + strSchool + "\n";
		result += "7. 희망연봉 : " + hopeMoney + "만원\n";

		System.out.println(result);
	}
	
	/* 생년월일로 연령대를 알 수 있는 함수 생성 */
	int getAgeLine() {

		Calendar currentDate = Calendar.getInstance();
		int currentYear = currentDate.get(Calendar.YEAR); // 현재의 년도만 받아옴

		int birthYear = Integer.parseInt(birthday.substring(0, 4)); // 구직자의 생년만 잘라냄

		int currentAge = currentYear - birthYear + 1; // 현재나이 계산

		return (currentAge / 10) * 10; // 소숫점으로 나올경우 버림
	}
}