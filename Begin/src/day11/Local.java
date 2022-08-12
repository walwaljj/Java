package day11;
/*Local Inner class : 메서드 블럭 안에 클래스를 구성한 경우
 *   [1] 이름있는 로컬 이너 클래스
 *   [2] 이름없는 로컬 이너 클래스
 * 
 */
public class Local {
	String str= "멤버변수@@@";
	
	public void bar() {//메소드
		class LocalInner{//외부클래스> 메소드 >로컬이너 클래스
			
		}
	}
	
	public void sub() {//외부클래스> 메소드.
		
		double pi=3.14;//메소드의 지역변수 (local var)
		System.out.println("sub에서 출력한 str : "+str);
		System.out.println("pi: "+pi);
		
		class LocalInner{//외부클래스 > 메소드 > local inner class
			
				String lstr = "LocalInner의 멤버변수$$$";
				void foo() {// 외부클래스> 메소드 >로컬이너 클래스의 메소드
					int a=1;
					
					//str
					System.out.println("LocalInner 에서 출력str="+str);
					//lstr
					System.out.println("lstr="+lstr);
					//pi
					System.out.println("pi: "+pi);
					//pi=5.12;//err발생 : 로컬이너 클래스 안에서는 final이 아닌 지역변수 접근불가.
								//ㄴ출력은 가능하나 값 변경할 수 없다.
				}						
		}//------------------------------로컬이너 클래스끝
		/*로컬이너 클래스는 자기가 속한 메서드 안에서 객체생성해야 함.
		 * 또한 이너클래스가 구성된 후에  이너클래스의 객체 생성이 가능함.
		 * 
		 */
		LocalInner li=new LocalInner();
		li.foo();//여기까지 작성하면 출력문이 안나옴. sub가 호출되지 않아서/
		
	}//sub 끝
	public static void main(String[] args) {
		//main에서 바로 LocalInner 의 foo() 호출하기 ==> [x]
		
		Local lc=new Local();
		lc.sub();
		
	}
}
