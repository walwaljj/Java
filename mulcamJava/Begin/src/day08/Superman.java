package day08;
//Superman cls 는 sub cls라부름.
public class Superman extends Human{//human 을 상속함. 코드작성 하지않아도 사용가능

	int power;
	
	//메소드 오버라이딩(Override)
	/*부모로 부터 상속받은 메소드를 다시 정의해서 구현하는것
	 * 
	 * 오버라이딩의 조건
	 * [1] 부모의 메소드 이름과 동일하게 구성
	 * [2] 매개변수도 부모와 동일하게 구성
	 * [3] 반환 타입도 같아야함.
	 * [4] 접근지정자는 부모와 동일하거나 더 넓은 범위의 접근 지정자를 사용할 수 있음
	 * [5] 예외는 부모가 선언한 예외와 동일하거나 , 더 구체적인 예외를 발생 시킬수 있다.
	 * 
	 * 
	 */
	public Superman() {
		power=111;
	}
	public Superman(String n, int h, int p) {
		name=n;
		height=h;
		power=p;
	}
	
	
	
	
	public String getInfo() {//메소드의 조건을 상속받은 클레스와 똑같이 구성한다 생각하자
		//String info="이름 : " +name+"\n키 : "+height+"\n초능력 : "+power;
		//return info;
		return super.getInfo()+"\n초능력: "+power;//super 는 부모로 부터 물려받은 변수나 메소드를 참조할때 사용하는 키워드
												//this와 동일
	}
	//오버라이딩 한 메소드super.getInfo()를 오버로딩 해보기
	
	 //제목, 이름, 키 , 초능력 출력
	public String getInfo(String a) {
		
		String info=a+"\n"+super.getInfo()+"\n초능력: "+power;
		return info;
	}
	//public void getInfo()===>이미 비어있는 매개변수가 있기때문에 안됨.
	public void getInfo(String a,int up) {
		this.power +=up;
		
		//제목 이름 키 초능력 출력하는 명령문 작성하기
		String info=this.getInfo(a);
		System.out.println(info);
		
	}
	

	
	
}
