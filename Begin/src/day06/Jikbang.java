package day06;
//부동산 관련 앱
//객체 : 집, 중개인, 매도자, 임대인...


//추상화 : 현실세계에 존재하는 객체를 프로그램으로 표현하다
// 1 - 클래스명 정하기 
// 2-  속성 추출 : 3가지 방의 갯수, 주소, 소유주
// 3 - 기능(행위)
public class Jikbang {

	public static void main(String[] args) {
		//객체 2개를 생성해서 각각 속성값을 주고
		//메소드들을 호출해보기(showInfo(), existAt(), xxx())
		House h1=new House();//객체생성	
		House h2=new House();
		
		h1.showInfo();
		h2.showInfo();
		
		
		//속성주기
		h1.room=1;
		h1.addr="창원 12345";
		h1.owner="정오너";
		
		h2.room=1;
		h2.owner="정주인";
		h2.addr="부산 12345";
		
		h1.showInfo();
		h2.showInfo();
		
		String s1=h1.existAt(100);
		
		String s2=h2.existAt(200);
		
		System.out.println(s1);
		System.out.println(s2);
		
		h1.rent("매매",8000);//void는 앞에 변수를 안붙혀도 된다.
		
		h2.rent("전세",5000);//rent타입의 메소드는 string,int 순서로 작성하였기때문에 호출할때 자료형에 맞게 해야한다.
		
		

	}
}