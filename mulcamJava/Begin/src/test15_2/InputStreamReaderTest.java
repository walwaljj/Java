package test15_2;
import java.io.*;
public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(OutputStreamWriter is = new OutputStreamWriter(new FileOutputStream("reader.txt"))) {
			int i;
			String str="달리자~~";
			char a[]= {'귀','여','운','강','아','지','^','ㅠ','^'};
			is.write(a);
			is.write(str,0,2);
			is.write("~~");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
