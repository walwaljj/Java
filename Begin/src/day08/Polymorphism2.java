package day08;

public class Polymorphism2 {

	public static void main(String[] args) {
		System.out.println("1.-----------------");
		Super sp=new Super();
		System.out.println("sp.a="+sp.a);//10
		System.out.println("sp.b="+sp.b);//20
		sp.func();//func()****
		
		System.out.println("2.-----------------");
		Sub sb=new Sub();
		System.out.println("sb.a="+sb.a);//"func()@@@"10
		System.out.println("sb.b="+sb.b);//30
		System.out.println("sb.c="+sb.c);//40
		sb.func();
		System.out.println(sb.func(100));
		
		System.out.println("3.-----------------");
		Super ss=new Sub();
		System.out.println("ss.a="+ss.a);
		System.out.println("ss.b="+ss.b);
		//System.out.println("ss.c="+ss.c);
		ss.func();
		//System.out.println(ss.func(200));
	}

}
