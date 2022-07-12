package practice;

public class Students3 {
	
	static int num;
	int id ;
	String name;
	

	
	public Students3(int id) {
		this.id=id;
		num=100+id;
		
	}
	
	
	public void showInfo(String name) {
		System.out.println(name+"학생의 학번은 "+id+"이며 카드번호는 "+num+"입니다." );
		
	}

}
