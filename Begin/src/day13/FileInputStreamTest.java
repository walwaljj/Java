package day13;
/*
 * 
 */
import java.io.*;
/*FileInputStream
 * -1byte 기반 스트림
 * -Node 스트림 , 파일과 노드를 연결한다.
 * -이미지, 멀티미디어, 바이너리 파일등을 읽을 때 사용한다.
 * */
public class FileInputStreamTest {

	public static void main(String[] args) 
	
	throws IOException
	{
		String fileName="src/day13/InputStreamTest.java";
		
		FileInputStream fis = new FileInputStream(fileName);
		int n=0;
		int cnt=0;
		while((n=fis.read())!=-1) {//fis값을 n에 담아준다.
									//파일의 끝에 도달하면 -1을 반환한다.
			System.out.write(n);
			System.out.flush();
			cnt++;
		}
		System.out.println("총 파일의 크기 : "+cnt+"bytes");
		fis.close();
		System.out.close();
	}

}
