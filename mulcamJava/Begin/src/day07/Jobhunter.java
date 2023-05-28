package day07;

public class Jobhunter {

	private String name;
	private String ph;//전화번호
	private String mail;//이메일
	
	
	
	//setter
	public void setName(String a) {
		name=a;
	}
	public void setPh(String a2) {
		ph=a2;
	}
	public void setMail(String a3) {
		mail=a3;
	}
	
	//gatter
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
	public String getPh() {
		return ph;
	}
	
	
	
	//생성자
	public Jobhunter() {
		name="정구직";
		ph="010-0000-0000";
		mail="e메일입니다.";
	}
	public Jobhunter(String name) {
		this.name=name;
		ph="011-1111-1111";
		mail="hucu@m";
	}
	public Jobhunter(String ph,String mail) {
		name="일원해";
		this.ph=ph;
		this.mail=mail;
	}
	
	public void showInfo() {
		System.out.println("======이력서======");
		System.out.println("구직자명: "+name);
		System.out.println("전화번호: "+ph);
		System.out.println("이메일 : "+mail);

		}
	
	
}

