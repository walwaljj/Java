package day13;
/*InputStreamReader
 * -2byte (문자) 기반 스트림
 * -브릿지 스트림
 * 1byte로 읽어 들인 데이터를 2byte로 조합해서 읽어들인다.
 * charset을 맞추는 기능이 있다.====>19번줄 참조!
 */
import java.io.*;
public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException{
		String fname = "C:\\Users\\wjdtn\\git\\new\\Begin\\src\\day13\\FileInputStreamTest.java";
		//String fname = "C:\\Users\\wjdtn\\Desktop\\__\\java\\readme.txt";
		File file = new File(fname);//파일 클레스를 쓰면 스트림을 안해도 크기반환가능,
		long fsize = file.length();
		System.out.println("파일의 크기 : "+fsize+"bytes");
		
		FileInputStream fis=new FileInputStream(file);//file변수와 파일리더 스트림연결, 2byte인데 인코드가 안맞으면 깨짐.
		InputStreamReader fr=new InputStreamReader(fis,"UTF-8");
		
		OutputStreamWriter ow=new OutputStreamWriter(System.out,"UTF-8");
		
		int n=0;
		while((n=fr.read())!=-1) {// n이 -1이 아닐때까지 반복문을 돌고, n을 읽어라.
			//System.out.write(n);
			//System.out.flush();
			ow.write(n);
			ow.flush();
		}
		fr.close();
	}

}
