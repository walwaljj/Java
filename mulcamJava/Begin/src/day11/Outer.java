package day11;

public class Outer {
	
			int a=1;
	 static int b=2;
	 
	 void print() {//메소드
		 Inner i = new Inner();//생성자
		 System.out.println(i.c);
		 
		 Outer.Inner oi = this.new Inner();
		 System.out.println(oi.c);
	 }//////////////////////////////메소드 끝
	 
	 class Inner{//Inner Member class = non-static
		 int c=3;
		 void sub() {
			 System.out.println("sub()`'`'");
		 }
		 
	 }/////////////////////////Inner끝 !

	 
	 
	 static class SInner{
		 		int d=4;
		 static int e=5;
		 void foo() {
			 System.out.println("foo()----");
		 }
		 
		 static void bar() {
			 System.out.println("bar()____");
		 }
		 
	 }////////////////////////SInner끝 !
	 
}////////////////////////////outer끝 !
