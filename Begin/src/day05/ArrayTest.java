package day05;

//import java.util.*;
/* 기본자료형 (primitive type)
 * 	- 숫자형 (정수형(0)-byte, short, int, long, 실수형(0.0)-float, double)
 *  - 문자형(\u0000) (char) 
 *  - 논리형 (boolean) true, false**
 *  
 * 
 * 참조형(reference type)- 클래스형, 인터페이스형, 배열
 *  - String(문자열-null)
 *  String s=new String("java");
 *  String s2="hello"
 *  - Date
 *  Date d=new Date()
 *  - Scanner
 *  Scanner sc=new Scanner(System.in);
 * 
 *  if, if~else,  if else if....else
 *  switch~case
 *  for, while, do~while
 *  
 *
 * */





public class ArrayTest {
	
	public static void main(String[] args) {
		System.out.println("1.------------");
		int a = 1; //기본자료형 - 정수형
		int [] b ; //참조형 - 1 차원배열

		
		/*[1]선언
		 *[2]메모리할당
		 *[3]초기화
		 */
		
		//선언 : c[] 로 선언해도된다. [3] 같이 대괄호 안에 값이 들어갈수 없다.
		int []c ;
		//메모리 할당 : new를 이용하고 배열의 크기를 정한다.
		c=new int[3];//
		
		//초기화 : index를 이용해서 데이터를 저장한다. 이때 index 는 0부터 시작.
		c[0] =10;
		c[1] =20;
		c[2] =30;
		
		System.out.println(c);//배열의 주소값을 출력하기때문에.
		
		System.out.println(c[0]);//index번호를 같이 넣어줘야한다.
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		System.out.println("2.------------");
		//[1][2] : 선언과 동시에 메모리 할당
		//[3]  : 초기화
		
		
		//선언 + 메모리할당
		double arr[]=new double[4] ; 
		
		//배열은 초기화를 하지않으면 디폴트값이 저장됨. ex double로 하고 , 데이터 저장을 안하면 0.0이나옴.
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[0]="+arr[3]);
		//초기화
		arr[0]=.897;
		arr[1]=450e-2;//450*1/100
		arr[2]=0x12;
		arr[3]='a';//아스킷 코드 출력
		
		
		try {
			for(int i=0;i<5;i++) {//반복문 바로뒤 ;하면 반복문이 ;에서끝남. 주의
			System.out.println("arr["+i+"]"+arr[i]);		
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("잡았다!");
			
		}
		//char 타입의 1차원 배열을 선언하고 문자를 저장하세요
		// j. a. v. a.
		
		char ch[]=new char[4];
		
		
		ch[0]='J';
		ch[1]='a';
		ch[2]='v';
		ch[3]='a';
		//배열의 index가 범위를 벗어나면 
		//배열의 크기를 알수있는 속성 : length
		System.out.println("ch.length="+ch.length);
		
		for(char i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}System.out.println();
		
		
		for(char i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}System.out.println();
		
		
		System.out.println("3.------------");
		//[1,2,3] 선언과 동시에 메모리를 할당하고 초기값 저장
		char [] ch2 = { 'B', 'y', 'e'};
		System.out.println("ch2.length="+ch2.length);
			for(int i=0;i<ch2.length;i++) {
				System.out.println(ch2[i]);
			}
	}
}

