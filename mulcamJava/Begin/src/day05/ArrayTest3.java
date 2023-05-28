package day05;

public class ArrayTest3 {

	public static void main(String[] args) {
		System.out.println("1---------------");
		int a[];
		a=new int[3];
		a[0]=90;
		a[1]=80;
		a[2]=70;
		
		//선언
		int b[];
		b=a;
		/*a가 가리키는 배열을 b도 같이 가리키는 형태*/
		System.out.println(a[1]);//80
		System.out.println(b[2]);//70
		
		for(int k=0;k<b.length;k++) {
			System.out.println("b["+k+"]"+"="+b[k]);
		}
		//index의 데이터를 지정 변경할수있다.
		b[0]=100;
		System.out.println("b[0]="+b[0]);
		System.out.println("a[0]="+a[0]);// b=a 이기때문에 a역시 같이 바뀌게 된다.
		
		System.out.println("2.----------------");
		int x[]= {1,2,3,4};
		int y[]= {10,20};
		int tmp[];
		//x ,y 값을 서로 바꿔보기.
		
		tmp=x;// tmp -> x
		x=y;//x -> y
		y=tmp;// y -> tmp
		for(int i=0;i<x.length;i++) {
			System.out.println("x["+i+"]"+"="+x[i]);
		}
		for(int i=0;i<y.length;i++) {
			System.out.println("y["+i+"]"+"="+y[i]);
		}
		
		
		
		
		
		System.out.println("3.------------------");
		//참조형의 배열-String, Date, Scanner, Object(부모클레스)
		
		
		//선언
		String arr[]=null;
		System.out.println(arr);
		
		//메모리 할당
		arr=new String[4];
		System.out.println("arr[0]="+arr[0]);
		
		//초기화
		arr[0]="Hello";
		arr[1]=new String("Hi"); //new string 생략가능
		arr[2]=3+"5";//35
		arr[3]="";//빈문자열 char 타입은 ' '
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr="+arr[i]);
		}
		
		System.out.println("**************");
		///확장 for루프, 개선된 for루프, for each루프..
		/*
		 * for(형 변수 : 배열)
		 * {	
		 * 		실행문;
		 * 
		 * }
		 * 알아서 자료구조의 크기 (length)만큼 반복문 돌면서
		 * 자료구조에 저장된 값을 변수에 할당한다.
		 * 
		 */
		
		//확장 for루프
		for(String s:arr) {
			System.out.println(s.toUpperCase());
			//System.out.println("s:"+s);
		}
		
		String str[]= {"안녕하세요.","반갑습니다.","잘가세요 !"};
		for(String s:str) {
			System.out.println(s);
		}
		
		
	}

}
