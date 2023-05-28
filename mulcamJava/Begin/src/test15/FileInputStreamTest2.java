package test15;
import java.io.*;
public class FileInputStreamTest2 {

	public static void main(String[] args)throws IOException {
		FileReader fr = new FileReader("reader.txt");
				try(fr){
					char [] ch=new char[10];
					int i;
					while((i=fr.read(ch))!=-1) {
						for(int j=0;j<i;j++) 
						System.out.print((char)ch[j]);
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
	}

}
