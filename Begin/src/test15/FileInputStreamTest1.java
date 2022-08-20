package test15;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis=null;
	try {
		fis=new FileInputStream("input.txt");
		byte[]b=new byte[10];
		int i;
		while((i=fis.read(b))!=-1) {
			for(int j = 0; j<i; j++) {
		System.out.println((char)b[j]);
			}
		}
	}catch(IOException e) {
		System.out.println(e);
	}finally {
		try {
			fis.close();
		}catch(IOException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		}
	System.out.println("end");
	}
}
