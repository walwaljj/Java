package day13;

import java.io.IOException;

/*  System.in: InputStream타입
- 1byte 기반 스트림
- 노드 스트림 : 키보드와 노드 연결하는 스트림 (아무것이나 연결하는게아님!)


- public int read() :
  바이트 입력을 리턴하고 입력이 종료(Ctrl+C 또는
   Ctrl+D)되면 -1을 리턴한다.
*/

public class InputStreamTest {

	
	public static void main(String[] args) {
		
		
		int input = 0;
		int count = 0;
		System.out.println("입력하세요 ==>");
		
		try {
		while(true) {
			input = System.in.read();
			
			//키보드 입력
			System.out.println("input : "+input);//io 처리해줘야함.
			//입력값은 입력받은 순서대로 나오며 입력하면 아스키코드와 엔터값이나온다. 
			//엔터 값이 13 (\r), 10(\n)이다.
			
			count++;//바이트 카운터를 세기위해
			if(input=='x') break;
		}////while 문 종료
			System.out.println("총 "+count+"바이트 입력받음");
			}catch(IOException e) {
				e.printStackTrace();
		}
		
		
	}
}
