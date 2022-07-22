package JAVA_3;

/** member 클래스를 상속 받음 */
public class Company extends Member{
	/* 자본금, 업종명 field 선언 */
	protected long seedMoney;
	protected String jobType;
	
	/* 기본 생성자 생성 */
	public Company() {
		
	}
	
    /* 파라미터가 있는 생성자 생성 */
	public Company(String id, String passwd, String name, long seedMoney, String jobType) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.seedMoney = seedMoney;
		this.jobType = jobType;
	}
	
    /** 아이디, 암호, 회사명, 자본금, 업종명을 출력하는 함수 생성 */
	void showCompanyInfo() {
		String result = "";

		result += "1. 아이디 : " + super.id + "\n";
		result += "2. 암   호 : " + super.passwd + "\n";
		result += "3. 회사명 : " + super.name + "\n";
		result += "4. 자본금 : " + seedMoney + "\n";
		result += "5. 업종명 : " + jobType + "\n";
		

		System.out.println(result);
	}
}
