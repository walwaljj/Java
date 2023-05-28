package day07;

public class OverloadingTest {

	public static void main(String[] args) {
		//슈퍼맨 객체 2개 생성한뒤 getInfo() 호출해서 정보 출력하기
		
		//아쿠아맨 객체 1개 생성 후 getInfo() 호출해서 정보 출력하기
	
		
		Superman s=new Superman();
		System.out.println(s.name);
		System.out.println(s.height);
		System.out.println(s.power);

		Superman s1=new Superman();
		System.out.println(s1.getInfo());
		
		Superman s2=new Superman("왈왈");
		System.out.println(s2.getInfo());
		
		Superman s3=new Superman(22);
		String ss=s3.getInfo();
		System.out.println(ss);
				
		
		/*Superman s4=new Superman("왈와리",199,444);
		System.out.println(s4.getInfo());
		*/
		
		Aquaman a=new Aquaman();//The constructor Aquaman() is undefined 기본생성자 정의는 없다는뜻
		
		Superman a2[]=new Superman[4];
		for(int i=0;i<a2.length;i++) {
			System.out.println("**************");
			System.out.println(a2[i]);
		}
		

		

	}

}
