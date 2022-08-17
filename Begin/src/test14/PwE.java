package test14;

public class PwE {
	private String Pw;
	
	public String getPw() {
		return Pw;
	}
	
	public void setPw(String Pw)throws IDFE {
		
		
		
		if(Pw==null) {
			throw new IDFE("비밀번호가 null일 수 없습니다.");
			
		}
		else if(Pw.matches("[a-zA-Z]+")) {
			throw new IDFE("문자열로만 이루어질 수 없습니다.");
		}
		else if(Pw.length()<5) {
			throw new IDFE("비밀번호를는 5자 이상으로 쓰세요");
		}
		this.Pw = Pw;
	}
	public static void main(String[] args) {
		PwE test = new PwE();
		String Pw=null;
		
		try {
			test.setPw(Pw);
		}catch(IDFE e) {
			System.out.println(e.getMessage());
		}
		
		Pw="ddddddd";
		
		try {
			test.setPw(Pw);
		}catch(IDFE e) {
			System.out.println(e.getMessage());
		}
		
		Pw="bbbb";
		try {
			test.setPw(Pw);
		}catch(IDFE e) {
			System.out.println(e.getMessage());
		}
	}

}
