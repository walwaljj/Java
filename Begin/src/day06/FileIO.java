package day06;
import java.io.*;
/*Exception
 * 		+----------------IOException  파일을 접속시 네트워크가 끊기는 상황
 * 								+-------------------FileNotFoundException  읽으려 하는 파일이 없을때
 * try - catch 로 발생한 예외를 처리하기
 * 
 */


public class FileIO {

	public static void main(String[] args) {
		
		if(args.length!=1) {
			System.out.println("명령줄 인수로 읽을 파일명을 입력하세요!");
			System.out.println("ex) C:/myjava/day01/Hello.java");
			return;
		}
		
		String fileName=args[0];
		System.out.println("읽을 파일명: "+fileName);
		String contents=FileIO.reading(fileName);//클레스를 붙혔기 때문에 static
		System.out.println(contents);
	}//main()-------------
	
	
	/**파일을 읽어서 파일 내용을 문자열로 반환하는 메소드
	 * 
	 */
	
	public static String reading(String fname) //****
	{
		//파일 읽는 클레스
		{
			try{
				FileReader fr=null;
				
				char[] data = new char[1000];
				
				fr = new FileReader(fname);	//FileNotFoundException 발생
				//파일과 노드 연결
				
				fr.read(data, 0, 1000);		//IOException 발생
				//파일을 읽어서 char타입 배열 data에 담아준다
				
				fr.close();
				//노드 연결 끊기
				
				//파일 내용은 data 배열에 담긴다. ==> 문자열로 만들자
				String contents = new String(data);
				
				return contents;//err가 아닌구간이 끝이날때 리턴해서 컨텐츠를 반환해줘야함.
			} catch(FileNotFoundException e) {
				System.out.println("찾을 수 없는 파일입니다.");
			} catch(IOException e) {
				System.out.println("IOException");
			}
			return " ";// contents까지 감싸고 try하면 return을 해줘야한다. 
						//err 구간(Catch)끝난 후 자료형에 대한 값(" ",null등)반환을 시켜줘야한다.
						//못 읽었을때 파일 이름을 반환하라는 뜻
		}

		
	}
}
