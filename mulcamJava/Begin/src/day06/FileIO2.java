package day06;
import java.io.*;
/*
 * throws로 예외를 선언하기
 */

public class FileIO2 {

	public static void main(String[] args) {
		
		if(args.length!=1) {
			System.out.println("명령줄 인수로 읽을 파일명을 입력하세요!");
			System.out.println("ex) C:/myjava/day01/Hello.java");
			return;
		}
		
		String fileName=args[0];
		System.out.println("읽을 파일명: "+fileName);
		
		try {
			String contents=FileIO2.reading(fileName);//클레스를 붙혔기 때문에 static
			System.out.println(contents);//try와 catch로 잡게되면 지역변수가 됨 {}에의해 :함께 잡아야하는 이유!
		}catch(IOException e) {
			System.out.println("파일을 읽는 중 예외 발생:"+e.getMessage());
		}
		
	}//main()-------------
	
	
	/**파일을 읽어서 파일 내용을 문자열로 반환하는 메소드
	 * 
	 */
	
	public static String reading(String fname) //****
	throws FileNotFoundException, IOException
	{
		//파일 읽는 클레스
		FileReader fr=null;
		
		char[] data=new char[1000];
		
		fr=new FileReader(fname);//FileNotFoundException
		//파일과 ****노드 연결
		
		fr.read(data, 0, 1000);//IOException
		//파일을 읽어서 char 타입의 배열 data에 담아준다.
		
		fr.close();//IOException
		//노드 연결 끊기
		
		//파일 내용은 data 배열에 담긴다. ==> 문자열로 만들자
		String contents=new String(data);
		
		return contents;
		
	}
}
