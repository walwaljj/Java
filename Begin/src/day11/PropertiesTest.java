package day11;
import java.util.*;
import java.io.*;
/*Properties : Map 계열
 * -- 시스템의 설정정보 등을   (파일명-->)xxx.properties 으로 파일에 저장을 한뒤,
 * 	  이 파일을 읽어서 해당 파일에 저장된 내용을 사용하고자 할 때 이용한다.
 * 
 */
public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		String loc = "src/day11/mysystem.properties";//상대경로는 파일이 있는 위치.프로젝트 기준
		FileReader fr=new FileReader(loc);//노드연결을 함. ==> 이 단계에서 FileNotFoundException 처리 해줘야함.
		
		
		//파일 내용을 properties 객체로 옮기기
		Properties prop=new Properties();
		prop.load(fr);//IO err처리해줘야함.
		fr.close();//노드해서 문서를 읽은 후 프로그램을 꼭 끝내줘야함. 그래야 다른파일을 읽을 수 있다.
		
		
		//properties 파일내용을 읽어서 Properties()객체로 옮겨 저장해놓는다.
		
		//void setProperties(String key, String value) : 저장함.
		
		//String getProperties(String key) : 꺼내기.
		
		String os=prop.getProperty("Os");
		System.out.println("운영체제 : "+os);
		
		String dbms=prop.getProperty("DbType");
		System.out.println("DBMS : "+dbms);
		
		System.out.println("User : "+prop.getProperty("DbUser","King"));//-->key 값에 DbUser 이 없으면 value값을 king으로 바로주려고.
		System.out.println("Password : "+prop.getProperty("DbPwd"));
		System.out.println("Msg : "+prop.getProperty("Msg","메세지는 없습니다."));
		
		prop.setProperty("Lang","Java");
		System.out.println("Lang:"+prop.getProperty("Lang"));
		
		
	}

}
