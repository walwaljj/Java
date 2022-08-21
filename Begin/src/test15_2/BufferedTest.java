package test15_2;
import java.io.*;
public class BufferedTest {

	public static void main(String[] args) {
		long milli=0;
		long millis=0;
		
		try(FileInputStream fis = new FileInputStream("reader.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copya.txt"))){
			milli = System.nanoTime();
			millis = System.currentTimeMillis();
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
			milli = System.nanoTime()-milli;
			millis = System.currentTimeMillis()-millis;
		}catch(IOException e ) {
			e.printStackTrace();
		}System.out.println("걸린 시간 : "+milli+" nanoTime , "+millis+" MillisTime");
	}

}
