package test14;

public class IDFTest {
	private String ID;
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) throws IDFE{
		if(ID==null) {
			System.out.println("아이디는 null일 수 없습니다.");
		}else if(ID.length()<8||ID.length()>20) {
			System.out.println("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		this.ID=ID;//setter, 매개변수로 받은 id= 멤버변수
	}
	public static void main(String[] args) {
		IDFTest test = new IDFTest();
		
		String ID= null;
		try {
			test.setID(ID);
		}catch(IDFE e) {
			System.out.println(e.getMessage());
		}
		
		ID="12345";
		try {
			test.setID(ID);
		}catch(IDFE e) {
			System.out.println(e.getMessage());
		}
	}

}
