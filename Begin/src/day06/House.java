package day06;

public class House {
	
	int room;//방 갯수를 나타내기 위해 int
	String addr;//주소는 string
	String owner;//이름 "
	
	public void showInfo() {//~유형의 일을 한다
		System.out.println("----House정보----");
		System.out.println("소유주: "+owner);
		System.out.println("방 수: "+room);
		System.out.println("주 소: "+addr);
	}
	
	public String existAt(int bunji) {
		String str=owner+"의 집은 "+addr+ " "+bunji+"번지에 위치합니다.";
		return str;//string의 경우 String으로 반환을 꼭 해주어야한다.
	}
	//어떤 유형(전세, 월세, 매매)으로 얼마에 세를 놓아요 ==> 메소드 만들기
	public void rent(String type, int money) {//어떠한 타입으로 돈을 받을것인지?
		switch(type){
			case "매매":
				System.out.println("매매가 : "+money+"만원");
				break;
			default:
				System.out.println("임대가:"+money+"만원");
		}
		//return str;//string의 경우 String으로 반환을 꼭 해주어야한다.
	}


}
	

