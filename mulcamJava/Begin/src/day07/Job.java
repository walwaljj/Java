package day07;

public class Job {
	
	private String company;//회사이름
	private String dep;//부서이름
	private int number;//모집인원

	
	
	//setter
	public void setCompany(String b) {
		company=b;
	}
	public void setNumber(int b2) {
		number=b2;
	}
	public void setDep(String b3) {
		dep=b3;
	}
	
	//gatter
	public String getCompany() {
		return company;
	}
	public String getDep() {
		return dep;
	}
	public int getNumber() {
		return number;
	}
	
	
	
	//생성자
	public Job() {
		this("행복기업","인사팀",0);
		
	}
	
	public Job(String company) {
		this(company,"cs팀",1);
	}
	public Job(int number) {
		this("좋은회사","기술팀",number);
		
	}
	
	public Job(String company,String dep,int number) {
		this.company=company;
		this.dep=dep;
		this.number=number;
	}
	public void jobInfo(){
		System.out.println("====모집합니다!====");
		System.out.println("회사명 : "+company);
		System.out.println("부서이름: "+dep);
		System.out.println("모집인원: "+number+" 명");
		
	}
		
	
}
