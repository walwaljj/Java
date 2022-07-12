package day06;
import java.io.*;
public class ExceptionTest6 {
	public static void input()
	{
		//IOException : 컴파일 타임 예외 
		//방법 1) try chath IOException : 캐치할때 import 작성해야함.
		
		try {
		//int n=System.in.read();
		char n=(char)System.in.read();// 형변환하여 알파벳이 나옴
		System.out.println("n: "+n);
		}catch(IOException e) {
		System.out.println("입출력 에러 발생: "+e);
		}
	}
	
		//방법 2) Declare 하는 방법 : throws절을 이용
	//==> sub() 메소드를 호출한 쪽으로 예외처리를 넘긴다.
	public static void sub() throws IOException//****
	{
		int n=System.in.read();//형변환 전이라 아스키 코드로 나온다.
		System.out.println("n: "+n);
		
	}
	
	public static void main(String[] args) 
	throws IOException
	{
		System.out.println("입력하세요==>");
		//ExceptionTest6.input();//static 이 붙은 메소드는 class이름을 붙히고 호출
		ExceptionTest6.sub(); //==> err가 남, ****에서 throws를 메소드를 호출한 쪽으로 ERR를 넘겨버림
		
	}
}
