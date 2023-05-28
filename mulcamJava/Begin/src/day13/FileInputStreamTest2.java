package day13;
import java.io.*;
/*FileInputStream
 * -1byte 기반 스트림
 * -Node 스트림 , 파일과 노드를 연결한다.
 * -이미지, 멀티미디어, 바이너리 파일등을 읽을 때 사용한다.
 * */
public class FileInputStreamTest2 {

	public static void main(String[] args) 
	
	throws IOException
	{	
		//[문제]아이콘을 카피해서 copy.png로 붙혀보자.--->아래 1,2주석처리하면댐
		String fileName4="icon4.png";
		String fileName3="C:\\Users\\wjdtn\\Desktop\\__\\java/copy.png";
		
		
		String fileName="src/day13/InputStreamTest.java";
		String fileName2="C:\\Users\\wjdtn\\Desktop\\__\\java/InputStreamTest_Copy.txt";//카피할 파일.
		byte [] arr = new byte[4000];
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos=new FileOutputStream(fileName2);
		int n=0;
		int cnt=0;
		int total=0;
		while((n=fis.read(arr))!=-1) {//fis값을 n에 담아준다.
									//파일의 끝에 도달하면 -1을 반환한다.
			//System.out.write(arr,0,n);==>도스콘솔에 출력하는 출력문
			//System.out.flush();//
			fos.write(arr,0,n);//이클립스에서 실행
			fos.flush();//
			cnt++;
			total+=n;
		}
		System.out.println("총 파일의 크기 : "+total+"bytes");
		System.out.println(fileName2+"에 카피완료");
		fis.close();
		fos.close();
		System.out.close();
	}

}
