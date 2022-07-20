package day13;
import java.io.*;
public class InputStreamTest2 {

	public static void main(String[] args) 
		throws IOException
		{	
			int cnt=0;
			int n=0;
			System.out.println("입력하세요=>");
			while((n=System.in.read())!= -1) {
				//ctrl+ c 를 입력할때까지 반복문을 돌라는뜻
				//System.out.println("n : "+((char)n));//문자형으로 형변환하면 아스키코드에 해당하는 문자열 반환
														//한글은 바이트단위로 깨져나옴.
				System.out.write(n);///입력받은 문자열 그대로 내보낸다. 스트림시 write를 쓰는게 좋다.
				cnt++;
			}System.out.println(cnt+"bytes 읽음");
			
			System.in.close();
			System.out.close();

		}
		

}
