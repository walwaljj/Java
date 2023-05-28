package day08;
//Polymorphism 다형성
public class Polymorphism {

	public static void main(String[] args) {
		
				//생성자 ㄱ
		Human h1=new Human("강철민",171);
		System.out.println(h1.getInfo());
		
		Superman s1=new Superman("이소라",170,600);
		System.out.println(s1.getInfo("===슈퍼맨정보==="));
		
		Aquaman a1=new Aquaman("인어공주",144,200);
		System.out.println(a1.getInfo());
		
		//부모 자식의 상속관계가 있을 경우
		//부모 타입 참조변수 = new 자식객체 ();
		/* 부모타입 의 변수를 선언하고 객체는 자식객체로 생성하는것이 가능하다 ==> 다형성
		 * 
		 * 이럴경우 부모타입의 참조변수로 접근할 수 있는 변수나 메소드는 제한이 있다.
		 * 
		 * 		[1] 부모로 부터 물려받은 변수나 메소드는 접근 가능하다.
		 * 		[2] 자식만 갖는 고유한 변수나 메소드는 접근할 수 없다.
		 * 		[3] 단, 오버라이딩 한 메소드가 있을 경우는 자식의 것을 우선적용한다.
		 * 
		 * */
		//부모타입 - 자식으로 가능
		Human hs = new Superman("이희재",175,300);
		System.out.println("hs,name : "+hs.name);
		System.out.println("hs.height : "+hs.height);
		//오버라이드 한 메소드로 접근ㄱ // 재정의한 메소드의 경우 hs로 호출하면 자식의 것이 우선적용 호출됨,
		System.out.println(hs.getInfo());
		///부모타입으로는 접근불가하다. 자식의 고유한 변수
		//System.out.println("hs.power : "+hs.power);//power cannot be resolved or is not a field 변수가 아닌것같다는 뜻
		

		System.out.println("s1.power : "+s1.power);
		
		
		//변수 power로 강제 접근해할때 -부모 자식의 상속 관계가 있을경우 형변환이 가능하다 변수 power로 강제 접근해할때

		//System.out.println("hs.power: "+hs.power);
		//System.out.println("hs.power: "+(Superman)hs.power);
		System.out.println("((Superman)hs).power: "+((Superman)hs).power);
		
		//자식타입 - 부모 xx
		//Superman sm=new Human(" ",.);//xx	
		//Human hm=new String(" ");//xxx
		
		
		//hs참조변수로 "@@@ 슈퍼맨 정보@@@" 제목을 갖는 getinfo() 호출해서 정보를 출력하기
		
		//String info=hs.getInfo("@@@ 슈퍼맨 정보@@@");------>슈퍼맨에 있는 getInfo 출력문을 hs가 가져오려해서 안됨.
		String info=((Superman)hs).getInfo("@@@ 슈퍼맨 정보@@@");
		System.out.println(info);
		
		
		
		
		System.out.println("뮨제입니다=========");
		//[1] 문제
		//HUMAN타입 변수 선언 ha, Aquaman 객체 생성
	//	Human ha=new Aquaman();
		Human ha=new Aquaman("갈치",120,33.2);
		//getInfo()호출하기
		System.out.println(ha.getInfo());
		
		//name,height, speed 각각 출력하기
		System.out.println("ha.name : "+ha.name);
		System.out.println("ha.height : "+ha.height);
		System.out.println("((Aquaman)ha).speed : "+((Aquaman)ha).speed);
		
		
		//[2] 문제 h1,s1,a1 ,hs, ha 객체들을 저장할 배열을 생성
	
		//저장ㅎㄴ 뒤에 for루프로 배열 출력
		Human [] arr = {h1,s1,a1,hs,ha}; // 부모타입으로 변수, 슈퍼맨, 아쿠아맨 모두 저장가능
		for(int i=0;i<arr.length;i++) {
			System.out.println("________________-");
			System.out.println(arr[i].getInfo());
			}
		
		//arr[i] : Human 계열의 객체들
		//instanceof 연산자를 이용하면 참조변수가 어떤 클래스의 객체인지 알 수 있다.
		//참조 변수 instanceof cls명 : 참조 변수가 클래스의 객체이면 true를 반환,아니라면 false를 반환한다.
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] instanceof Superman) {
				System.out.println(((Superman)arr[i]).getInfo("##슈퍼맨 정보##"));
			}else {
				System.out.println("________________-");
				System.out.println(arr[i].getInfo());
			}
		}
	}
		
	

}
