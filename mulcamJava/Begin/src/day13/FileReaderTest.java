package day13;
/*FileReader /FileWriter()
 * -2byte (문자) 기반 스트림
 * -노드스트림(파일과 노드 연결)
 */
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) throws IOException{
		//String fname = "C:\\Users\\wjdtn\\git\\new\\Begin\\src\\day13\\FileInputStreamTest.java";
		String fname = "C:\\Users\\wjdtn\\Desktop\\__\\java\\readme.txt";
		
		
		File file = new File(fname);//파일 클레스를 쓰면 스트림을 안해도 크기반환가능,
		
		File file2=new File("C:\\\\Users\\\\wjdtn\\\\Desktop\\\\__\\\\java\\\\readme_copy.txt");
		
		long fsize = file.length();
		System.out.println("파일의 크기 : "+fsize+"bytes");
		
		FileReader fr=new FileReader(file);//file변수와 파일리더 노드연결, 2byte인데 인코드가 안맞으면 깨짐
		FileWriter fw = new FileWriter(file2);
		
		int n=0;
		while((n=fr.read())!=-1) {// n이 -1이 아닐때까지 반복문을 돌고, n을 읽어라.
			//System.out.write(n);
			//System.out.flush();
			fw.write(n);
			fw.flush();
		}
		fr.close();
	}

}
