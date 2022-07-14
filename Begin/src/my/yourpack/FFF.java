package my.yourpack;

import my.mypack.AAA;//서로다른 패키지에 있으면 임포트해야함
//import my.mypack.*;//BBB는 접근지정자가 public 이 아니여서 불가

public class FFF {

	public static void main(String[] args) {
		
		AAA a=new AAA();
		a.funcA();
		
	//	BBB b=new BBB();  
	//	b.funcB();

	}

}
