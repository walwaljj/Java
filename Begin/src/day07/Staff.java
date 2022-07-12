package day07;

public class Staff {
	private int no;
	private String name;
	private String dept; //부서
	
	
	
		//setter
		public void setNo(int no) {
			
			this.no=no;
		}
		public void setName(String name) {
			
			this.name=name;
		}
		
		public void setDept(String dept) {
			
			this.dept=dept;
			
		}
		
		//getter
		public int getNo(){
			
			return no;
		}
		public String getName(){
			
			return name;
		}
		
		public String getDept() {
			
			return dept;
	}
		public void showInfo() {
			System.out.println("--직원 정보입니다--");
			System.out.println("사 번 : "+no);
			System.out.println("이 름 : "+name);
			System.out.println("부 서 : "+dept);
			}

}
